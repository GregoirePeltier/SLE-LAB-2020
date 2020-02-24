package unice.epu.carpilot.kermeta;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import unice.epu.carpilot.ecore.carpilot.CommandEffect;
import unice.epu.carpilot.kermeta.CarAction;
import unice.epu.carpilot.kermeta.CommandEffectAspectCommandEffectAspectProperties;
import unice.epu.carpilot.kermeta.RuleEffectAspect;

@Aspect(className = CommandEffect.class)
@SuppressWarnings("all")
public class CommandEffectAspect extends RuleEffectAspect {
  @OverrideAspectMethod
  public static CarAction apply(final CommandEffect _self, final CarAction action) {
    final unice.epu.carpilot.kermeta.CommandEffectAspectCommandEffectAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandEffectAspectCommandEffectAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# CarAction apply(CarAction)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.CommandEffect){
    	result = unice.epu.carpilot.kermeta.CommandEffectAspect._privk3_apply(_self_, (unice.epu.carpilot.ecore.carpilot.CommandEffect)_self,action);
    };
    return (unice.epu.carpilot.kermeta.CarAction)result;
  }
  
  @OverrideAspectMethod
  public static CarAction reverse(final CommandEffect _self, final CarAction action) {
    final unice.epu.carpilot.kermeta.CommandEffectAspectCommandEffectAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandEffectAspectCommandEffectAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# CarAction reverse(CarAction)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.CommandEffect){
    	result = unice.epu.carpilot.kermeta.CommandEffectAspect._privk3_reverse(_self_, (unice.epu.carpilot.ecore.carpilot.CommandEffect)_self,action);
    };
    return (unice.epu.carpilot.kermeta.CarAction)result;
  }
  
  protected static CarAction _privk3_apply(final CommandEffectAspectCommandEffectAspectProperties _self_, final CommandEffect _self, final CarAction action) {
    action.currentCommand = _self.getCommand();
    return action;
  }
  
  protected static CarAction _privk3_reverse(final CommandEffectAspectCommandEffectAspectProperties _self_, final CommandEffect _self, final CarAction action) {
    return action;
  }
}
