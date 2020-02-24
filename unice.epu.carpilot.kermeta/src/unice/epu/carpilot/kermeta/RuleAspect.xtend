package unice.epu.carpilot.kermeta

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import unice.epu.carpilot.ecore.carpilot.Rule
import unice.epu.carpilot.ecore.carpilot.Command
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar
import unice.epu.carpilot.ecore.carpilot.ColorCondition
import static extension unice.epu.carpilot.kermeta.RuleEffectAspect.*;
import unice.epu.carpilot.ecore.carpilot.StaticEffect
import unice.epu.carpilot.ecore.carpilot.MatchingEffect
import unice.epu.carpilot.ecore.carpilot.DistanceCondition

@Aspect(className=Rule)
class RuleAspect {
	public def CarAction apply(PolyCar car, CarAction action) {
		var effect = _self.getEffect();
		if (_self.isConditionTrue(car)) {
			return effect.apply(action);
		}

		return effect.reverse(action);
	}
	public def boolean isConditionTrue(PolyCar car){
		if(_self.condition instanceof ColorCondition)	
			{return ColorConditionAspect.isTrue(_self.getCondition() as ColorCondition, car);}
		if (_self.condition instanceof DistanceCondition)
			{
				return DistanceConditionAspect.isTrue(_self.getCondition() as DistanceCondition,car);
			}
	}
}
