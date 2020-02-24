package unice.epu.carpilot.kermeta

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import unice.epu.carpilot.ecore.carpilot.RuleEffect
import unice.epu.carpilot.ecore.carpilot.Command

@Aspect(className=RuleEffect)
abstract class RuleEffectAspect {
	 abstract public def CarAction apply(CarAction action);
	 abstract public def CarAction reverse(CarAction action);
}