package unice.epu.carpilot.kermeta

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import unice.epu.carpilot.ecore.carpilot.Command
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar
import fr.unice.polytech.deantoni.vrep.polycar.utils.Pixel

@Aspect(className=Command)
class CommandAspect {
	
	CommandStage commandStage = CommandStage.NOTSTARTED;
	
	public def void execute(PolyCar car){
		switch(_self.direction)
		{
			case LEFT:
				_self.turnLeft(car)
			case RIGHT:
				_self.turnRight(car)
			case FORWARD:
				_self.forward(car)
				
			case STOP:
				_self.stop(car)
		}
	}
	public def void stop(PolyCar car){
		car.goStraight(0);
		car.goCurved(0,0);
	}
	public def void forward(PolyCar car){
		var left = car.readVeryLeftSensor();
		var right = car.readVeryRightSensor();
		if(_self.commandStage == CommandStage.NOTSTARTED && (left.isBlack() || right.isBlack()) )
		{_self.commandStage = CommandStage.STARTED;}
		else if(_self.commandStage==CommandStage.STARTED && (!left.isBlack()&& !right.isBlack()))
		{_self.commandStage = CommandStage.DONE;}
		_self.straight(car);
	}
	public def void straight(PolyCar car){
		var left = car.readLeftSensor();
		var right = car.readRightSensor();
		var middle = car.readMiddleSensor();
		if(left.isBlack && !right.isBlack()){
			car.goCurved(0,2);
		}
		else if(!left.isBlack() && right.isBlack()){
			car.goCurved(2,0);
		}
		else if (!middle.isBlack()){
			_self.stop(car)
		}
		else{
			car.goStraight(10);	
		}
		
		
	}
	public def void turnLeft(PolyCar car){
		/////////ADD THE CORRECT WORKING STAGES TO DETECT THE RIGHT POSITION TO TURN AND TURN/////////
		var veryLeft = car.readVeryLeftSensor();
		if(veryLeft.isBlack()){
			
			car.goCurved(0,10);
			_self.commandStage = CommandStage.STARTED;
		}
		else{
			_self.straight(car);
			if(_self.commandStage == CommandStage.STARTED && !car.readVeryRightSensor().isBlack()){
				_self.commandStage = CommandStage.DONE;
			}
		}
	}
	public def void turnRight(PolyCar car){
		
		var veryRight = car.readVeryRightSensor();
		if(veryRight.isBlack()){
			print("pixel black for write ");
			println(veryRight);
			print(veryRight.R);print(";");print(veryRight.G);print(";");println(veryRight.B);
			car.goCurved(10,0);
			_self.commandStage = CommandStage.STARTED;
		}
		else{
			_self.straight(car)
			if(_self.commandStage == CommandStage.STARTED && !car.readVeryLeftSensor().isBlack()){
				_self.commandStage = CommandStage.DONE;
			}
		}
	}
	public def boolean isDone(){
		return _self.commandStage == CommandStage.DONE;
	}	

}

	public enum CommandStage{
		NOTSTARTED,
		STARTED,
		DONE
	}
	
	

