package unice.epu.carpilot.kermeta;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar;
import unice.epu.carpilot.ecore.carpilot.Condition;
import unice.epu.carpilot.kermeta.ConditionAspectConditionAspectProperties;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public abstract class ConditionAspect {
  @Abstract
  public static boolean isTrue(final Condition _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.ConditionAspectConditionAspectProperties _self_ = unice.epu.carpilot.kermeta.ConditionAspectConditionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto unice.epu.carpilot.kermeta.ConditionAspect#boolean isTrue(PolyCar) from unice.epu.carpilot.kermeta.ColorConditionAspect
    		if (_self instanceof unice.epu.carpilot.ecore.carpilot.ColorCondition){
    			result = unice.epu.carpilot.kermeta.ColorConditionAspect.isTrue((unice.epu.carpilot.ecore.carpilot.ColorCondition)_self,car);
    		} else
    		// EndInjectInto unice.epu.carpilot.kermeta.ConditionAspect#boolean isTrue(PolyCar) from unice.epu.carpilot.kermeta.ColorConditionAspect
    	// BeginInjectInto unice.epu.carpilot.kermeta.ConditionAspect#boolean isTrue(PolyCar) from unice.epu.carpilot.kermeta.DistanceConditionAspect
    		if (_self instanceof unice.epu.carpilot.ecore.carpilot.DistanceCondition){
    			result = unice.epu.carpilot.kermeta.DistanceConditionAspect.isTrue((unice.epu.carpilot.ecore.carpilot.DistanceCondition)_self,car);
    		} else
    		// EndInjectInto unice.epu.carpilot.kermeta.ConditionAspect#boolean isTrue(PolyCar) from unice.epu.carpilot.kermeta.DistanceConditionAspect
    // #DispatchPointCut_before# boolean isTrue(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Condition){
    	result = unice.epu.carpilot.kermeta.ConditionAspect._privk3_isTrue(_self_, (unice.epu.carpilot.ecore.carpilot.Condition)_self,car);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_isTrue(final ConditionAspectConditionAspectProperties _self_, final Condition _self, final PolyCar car) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
