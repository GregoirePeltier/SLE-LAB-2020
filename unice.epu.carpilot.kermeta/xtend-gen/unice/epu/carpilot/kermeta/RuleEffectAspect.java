package unice.epu.carpilot.kermeta;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import unice.epu.carpilot.ecore.carpilot.RuleEffect;
import unice.epu.carpilot.kermeta.CarAction;
import unice.epu.carpilot.kermeta.RuleEffectAspectRuleEffectAspectProperties;

@Aspect(className = RuleEffect.class)
@SuppressWarnings("all")
public abstract class RuleEffectAspect {
  @Abstract
  public static CarAction apply(final RuleEffect _self, final CarAction action) {
    final unice.epu.carpilot.kermeta.RuleEffectAspectRuleEffectAspectProperties _self_ = unice.epu.carpilot.kermeta.RuleEffectAspectRuleEffectAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto unice.epu.carpilot.kermeta.RuleEffectAspect#CarAction apply(CarAction) from unice.epu.carpilot.kermeta.AbilityEffectAspect
    		if (_self instanceof unice.epu.carpilot.ecore.carpilot.AbilityEffect){
    			result = unice.epu.carpilot.kermeta.AbilityEffectAspect.apply((unice.epu.carpilot.ecore.carpilot.AbilityEffect)_self,action);
    		} else
    		// EndInjectInto unice.epu.carpilot.kermeta.RuleEffectAspect#CarAction apply(CarAction) from unice.epu.carpilot.kermeta.AbilityEffectAspect
    	// BeginInjectInto unice.epu.carpilot.kermeta.RuleEffectAspect#CarAction apply(CarAction) from unice.epu.carpilot.kermeta.CommandEffectAspect
    		if (_self instanceof unice.epu.carpilot.ecore.carpilot.CommandEffect){
    			result = unice.epu.carpilot.kermeta.CommandEffectAspect.apply((unice.epu.carpilot.ecore.carpilot.CommandEffect)_self,action);
    		} else
    		// EndInjectInto unice.epu.carpilot.kermeta.RuleEffectAspect#CarAction apply(CarAction) from unice.epu.carpilot.kermeta.CommandEffectAspect
    // #DispatchPointCut_before# CarAction apply(CarAction)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.RuleEffect){
    	result = unice.epu.carpilot.kermeta.RuleEffectAspect._privk3_apply(_self_, (unice.epu.carpilot.ecore.carpilot.RuleEffect)_self,action);
    };
    return (unice.epu.carpilot.kermeta.CarAction)result;
  }
  
  @Abstract
  public static CarAction reverse(final RuleEffect _self, final CarAction action) {
    final unice.epu.carpilot.kermeta.RuleEffectAspectRuleEffectAspectProperties _self_ = unice.epu.carpilot.kermeta.RuleEffectAspectRuleEffectAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto unice.epu.carpilot.kermeta.RuleEffectAspect#CarAction reverse(CarAction) from unice.epu.carpilot.kermeta.AbilityEffectAspect
    		if (_self instanceof unice.epu.carpilot.ecore.carpilot.AbilityEffect){
    			result = unice.epu.carpilot.kermeta.AbilityEffectAspect.reverse((unice.epu.carpilot.ecore.carpilot.AbilityEffect)_self,action);
    		} else
    		// EndInjectInto unice.epu.carpilot.kermeta.RuleEffectAspect#CarAction reverse(CarAction) from unice.epu.carpilot.kermeta.AbilityEffectAspect
    	// BeginInjectInto unice.epu.carpilot.kermeta.RuleEffectAspect#CarAction reverse(CarAction) from unice.epu.carpilot.kermeta.CommandEffectAspect
    		if (_self instanceof unice.epu.carpilot.ecore.carpilot.CommandEffect){
    			result = unice.epu.carpilot.kermeta.CommandEffectAspect.reverse((unice.epu.carpilot.ecore.carpilot.CommandEffect)_self,action);
    		} else
    		// EndInjectInto unice.epu.carpilot.kermeta.RuleEffectAspect#CarAction reverse(CarAction) from unice.epu.carpilot.kermeta.CommandEffectAspect
    // #DispatchPointCut_before# CarAction reverse(CarAction)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.RuleEffect){
    	result = unice.epu.carpilot.kermeta.RuleEffectAspect._privk3_reverse(_self_, (unice.epu.carpilot.ecore.carpilot.RuleEffect)_self,action);
    };
    return (unice.epu.carpilot.kermeta.CarAction)result;
  }
  
  protected static CarAction _privk3_apply(final RuleEffectAspectRuleEffectAspectProperties _self_, final RuleEffect _self, final CarAction action) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static CarAction _privk3_reverse(final RuleEffectAspectRuleEffectAspectProperties _self_, final RuleEffect _self, final CarAction action) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
