package unice.epu.carpilot.kermeta

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import unice.epu.carpilot.ecore.carpilot.Condition
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar

@Aspect(className=Condition)
abstract class ConditionAspect {
	abstract public def boolean isTrue(PolyCar car);
}