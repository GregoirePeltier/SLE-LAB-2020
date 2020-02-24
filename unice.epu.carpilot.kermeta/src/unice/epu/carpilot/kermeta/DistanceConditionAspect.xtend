package unice.epu.carpilot.kermeta

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import unice.epu.carpilot.ecore.carpilot.DistanceCondition
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar
import unice.epu.carpilot.ecore.carpilot.Sensor
import coppelia.FloatWA
import java.util.Comparator
import com.google.common.collect.Comparators
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=DistanceCondition)
class DistanceConditionAspect extends ConditionAspect{
	
	@OverrideAspectMethod
	public def boolean isTrue(PolyCar car){
		
		var Float value = _self.getValue(car);
		println("Read value");
		println(value);
				
		if(value == null)
			return false
			
		return _self.compare(value, _self.distance);
	}
	public def Float getValue(PolyCar car){
		var FloatWA vector;
		switch(_self.sensor){
			case Sensor.DISTANCE_LEFT:
			{
				if(!car.checkLeftProximitySensor())return null;
				vector=car.leftMapDetectedObject;
			}
			case Sensor.DISTANCE_RIGHT:
			{
				if(!car.checkRightProximitySensor())return null;
				vector = car.rightMapDetectedObject;
			}
			case Sensor.FRONT:
			{
				
				if(!car.checkMiddleProximitySensor())return null;
				vector = car.middleDetectedObjectPoint;
			}
		}
		if(vector.length==0)
			return null;

		
		return _self.distance(vector)
	}
	public def float distance(FloatWA vector){
		return Math.sqrt(vector.array.get(0) +vector.array.get(1) + vector.array.get(2) ).floatValue()*100;
	}
	public def boolean compare(float a, float b){
		switch(_self.operator){
			case EQUALS:
			{
				return a==b
			}				
			case GREATER:
				return a>b
			case GREATER_EQUALS:
				return a>=b
			case LOWER:
				return a<b
			case LOWER_EQUALS:
				return a<=b
			case NOTEQUALS:
				return a!=b	
		}
	}
}