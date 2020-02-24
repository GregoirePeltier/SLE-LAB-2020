package unice.epu.carpilot.kermeta

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import unice.epu.carpilot.ecore.carpilot.CommandEffect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=CommandEffect)
class CommandEffectAspect extends RuleEffectAspect{
	
	@OverrideAspectMethod
	public def CarAction apply(CarAction action){
		action.currentCommand = _self.command;
		return action
	}
	@OverrideAspectMethod
	public def CarAction reverse(CarAction action){
		return action
	}
	
	
	
}