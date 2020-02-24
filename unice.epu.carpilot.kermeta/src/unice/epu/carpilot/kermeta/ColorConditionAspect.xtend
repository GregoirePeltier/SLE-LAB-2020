package unice.epu.carpilot.kermeta

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import unice.epu.carpilot.ecore.carpilot.ColorCondition
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar
import unice.epu.carpilot.ecore.carpilot.Camera
import fr.unice.polytech.deantoni.vrep.polycar.utils.Pixel
import unice.epu.carpilot.ecore.carpilot.Color
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=ColorCondition)
class ColorConditionAspect extends ConditionAspect{
	public def Pixel getPixel(PolyCar car){
		switch(_self.camera){
			case Camera.VERY_RIGHT:
			return car.readVeryRightSensor()
			case Camera.VERY_LEFT:
			return car.readVeryLeftSensor()
			case Camera.LEFT:
			return car.readLeftSensor()
			case Camera.RIGHT:
			return car.readRightSensor()
			case Camera.CENTER:
			return car.readMiddleSensor()
		}
		
	}
	
	@OverrideAspectMethod
	public def boolean isTrue(PolyCar car){
		var pixel = _self.getPixel(car);
		
		return _self.checkColor(pixel);
	}
	public def boolean checkColor(Pixel pixel){
		if(_self.color == Color.RED)
		{
			return pixel.isRed();
		}
		if(_self.color ==Color.BLUE){
			return pixel.isBlue();
		}
		if(_self.color == Color.ORANGE){
			return pixel.isOrange();
		}
		if(_self.color == Color.BUILDING){
			return !pixel.isOrange() && !pixel.isBlue() && !pixel.isRed() && !pixel.isBlack();
		}
		return false 
	}
}