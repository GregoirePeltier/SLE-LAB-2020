package unice.epu.carpilot.kermeta

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import unice.epu.carpilot.ecore.carpilot.AbilityEffect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=AbilityEffect)
class AbilityEffectAspect extends RuleEffectAspect{
		@OverrideAspectMethod
	public def CarAction apply(CarAction action){
				print("reversing ability ");
		println(_self.direction);
		
		action.setAbility(_self.direction,!_self.disable);
		return action
	}
	@OverrideAspectMethod
	public def CarAction reverse(CarAction action){

		action.setAbility(_self.direction, _self.disable);
		return action;
	}
	
}