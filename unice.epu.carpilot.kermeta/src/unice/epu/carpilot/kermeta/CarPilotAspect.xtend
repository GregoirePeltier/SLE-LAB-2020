package unice.epu.carpilot.kermeta;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import java.io.PrintWriter
import java.util.ArrayList
import unice.epu.carpilot.ecore.carpilot.Car
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import unice.epu.carpilot.ecore.carpilot.Command
import unice.epu.carpilot.ecore.carpilot.Direction
import unice.epu.carpilot.ecore.carpilot.Rule
import static extension unice.epu.carpilot.kermeta.CommandAspect.*;
import java.util.HashSet
import java.util.HashMap
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.common.util.EList
import java.lang.reflect.InvocationTargetException
import org.eclipse.emf.common.notify.Notification

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=Car)
class CarPilotAspect {
	var HashSet done = new HashSet();
	var PolyCar polyCar;
	@Main
	public def void run(){
				_self.polyCar = new PolyCar("127.0.0.1",19997);
				_self.polyCar.start();
				Thread.sleep(1000);
				while(!_self.isAtDestination()){
					var command = _self.getNextCommand();
					
					var action = new CarAction();
					action.currentCommand = command
					println(action.currentCommand);
					_self.execute(_self.applyRules(action));
				}
				_self.polyCar.stopSimulation();
	}
	
	public def Command getNextCommand(){
		for (Command command : _self.getOrders()) {
			if(!command.isDone()){
				return command;
			}
			
		}
		return null;
	}
	public def CarAction applyRules(CarAction action){
		var filtered = action;
		for(Rule rule: _self.getRules()){
			filtered = RuleAspect.apply(rule,_self.polyCar,filtered);
		}
		return filtered;
	}
	public def  boolean isAtDestination(){
		return _self.nextCommand==null;
	}
	public def void execute(CarAction action){
		var command = action.nextPossibleCommand;
		
		CommandAspect.execute(command,_self.polyCar)
		if (command.isDone()){
			_self.done.add(command);
		}
	}
}

class CarAction{
	var abilities = new HashMap<Direction,Boolean>();
	public var Command currentCommand;
	
	new() {
		abilities.put(Direction.RIGHT,true);
		abilities.put(Direction.LEFT,true);
		abilities.put(Direction.FORWARD,true);
		abilities.put(Direction.BACKWARD,true);
		abilities.put(Direction.STOP,true);
	}
	def setAbility(Direction direction,boolean value) {
		abilities.put(direction,value);
	}
	def Command getNextPossibleCommand() {
		if(abilities.get(currentCommand.direction))
		{
			return currentCommand;
		}
		var validDirection = Direction.FORWARD;
		var i = 0;
		var directions = new ArrayList(abilities.keySet());
		while(!abilities.get(validDirection)){
			validDirection = directions.get(i);
		}	
		
		var command = new KernelCommand();
		command.direction = validDirection;
		return command; 
	}	
}
class KernelCommand implements Command{
	Direction direction;
	override getDirection() {
		return direction
	}
	
	override setDirection(Direction value) {
		direction = value;
	}
	
	override eAllContents() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eClass() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eContainer() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eContainingFeature() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eContainmentFeature() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eContents() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eCrossReferences() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eGet(EStructuralFeature feature) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eGet(EStructuralFeature feature, boolean resolve) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eIsProxy() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eIsSet(EStructuralFeature feature) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eResource() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eSet(EStructuralFeature feature, Object newValue) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eUnset(EStructuralFeature feature) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eAdapters() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eDeliver() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eNotify(Notification notification) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override eSetDeliver(boolean deliver) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}