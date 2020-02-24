package unice.epu.carpilot.kermeta

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import unice.epu.carpilot.ecore.carpilot.PersistingRule
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar
import static extension unice.epu.carpilot.kermeta.RuleEffectAspect.*;
import static extension unice.epu.carpilot.kermeta.ConditionAspect.*;


@Aspect(className=PersistingRule)
class PersistingRuleAspect extends RuleAspect{
	var boolean triggered = false;
	@OverrideAspectMethod
	public def CarAction apply(PolyCar car, CarAction action) {
		var effect = _self.getEffect();
		
		if (_self.isConditionTrue(car)) {
			_self.triggered = true;
		}
		if(_self.stop.isTrue(car))
		{
			_self.triggered = false;
		}
		if(_self.triggered){
			return effect.apply(action);
		}
		return effect.reverse(action);
	
	}
}