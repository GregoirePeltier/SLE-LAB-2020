package unice.epu.carpilot.kermeta;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar;
import unice.epu.carpilot.ecore.carpilot.ColorCondition;
import unice.epu.carpilot.ecore.carpilot.Condition;
import unice.epu.carpilot.ecore.carpilot.DistanceCondition;
import unice.epu.carpilot.ecore.carpilot.Rule;
import unice.epu.carpilot.ecore.carpilot.RuleEffect;
import unice.epu.carpilot.kermeta.CarAction;
import unice.epu.carpilot.kermeta.ColorConditionAspect;
import unice.epu.carpilot.kermeta.DistanceConditionAspect;
import unice.epu.carpilot.kermeta.RuleAspectRuleAspectProperties;
import unice.epu.carpilot.kermeta.RuleEffectAspect;

@Aspect(className = Rule.class)
@SuppressWarnings("all")
public class RuleAspect {
  public static CarAction apply(final Rule _self, final PolyCar car, final CarAction action) {
    final unice.epu.carpilot.kermeta.RuleAspectRuleAspectProperties _self_ = unice.epu.carpilot.kermeta.RuleAspectRuleAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto unice.epu.carpilot.kermeta.RuleAspect#CarAction apply(PolyCar,CarAction) from unice.epu.carpilot.kermeta.PersistingRuleAspect
    		if (_self instanceof unice.epu.carpilot.ecore.carpilot.PersistingRule){
    			result = unice.epu.carpilot.kermeta.PersistingRuleAspect.apply((unice.epu.carpilot.ecore.carpilot.PersistingRule)_self,car,action);
    		} else
    		// EndInjectInto unice.epu.carpilot.kermeta.RuleAspect#CarAction apply(PolyCar,CarAction) from unice.epu.carpilot.kermeta.PersistingRuleAspect
    // #DispatchPointCut_before# CarAction apply(PolyCar,CarAction)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Rule){
    	result = unice.epu.carpilot.kermeta.RuleAspect._privk3_apply(_self_, (unice.epu.carpilot.ecore.carpilot.Rule)_self,car,action);
    };
    return (unice.epu.carpilot.kermeta.CarAction)result;
  }
  
  public static boolean isConditionTrue(final Rule _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.RuleAspectRuleAspectProperties _self_ = unice.epu.carpilot.kermeta.RuleAspectRuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isConditionTrue(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Rule){
    	result = unice.epu.carpilot.kermeta.RuleAspect._privk3_isConditionTrue(_self_, (unice.epu.carpilot.ecore.carpilot.Rule)_self,car);
    };
    return (boolean)result;
  }
  
  protected static CarAction _privk3_apply(final RuleAspectRuleAspectProperties _self_, final Rule _self, final PolyCar car, final CarAction action) {
    RuleEffect effect = _self.getEffect();
    boolean _isConditionTrue = RuleAspect.isConditionTrue(_self, car);
    if (_isConditionTrue) {
      return RuleEffectAspect.apply(effect, action);
    }
    return RuleEffectAspect.reverse(effect, action);
  }
  
  protected static boolean _privk3_isConditionTrue(final RuleAspectRuleAspectProperties _self_, final Rule _self, final PolyCar car) {
    Condition _condition = _self.getCondition();
    if ((_condition instanceof ColorCondition)) {
      Condition _condition_1 = _self.getCondition();
      return ColorConditionAspect.isTrue(((ColorCondition) _condition_1), car);
    }
    Condition _condition_2 = _self.getCondition();
    if ((_condition_2 instanceof DistanceCondition)) {
      Condition _condition_3 = _self.getCondition();
      return DistanceConditionAspect.isTrue(((DistanceCondition) _condition_3), car);
    }
    return false;
  }
}
