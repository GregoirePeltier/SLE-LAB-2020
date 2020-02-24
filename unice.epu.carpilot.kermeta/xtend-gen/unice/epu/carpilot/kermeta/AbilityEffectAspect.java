package unice.epu.carpilot.kermeta;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.InputOutput;
import unice.epu.carpilot.ecore.carpilot.AbilityEffect;
import unice.epu.carpilot.ecore.carpilot.Direction;
import unice.epu.carpilot.kermeta.AbilityEffectAspectAbilityEffectAspectProperties;
import unice.epu.carpilot.kermeta.CarAction;
import unice.epu.carpilot.kermeta.RuleEffectAspect;

@Aspect(className = AbilityEffect.class)
@SuppressWarnings("all")
public class AbilityEffectAspect extends RuleEffectAspect {
  @OverrideAspectMethod
  public static CarAction apply(final AbilityEffect _self, final CarAction action) {
    final unice.epu.carpilot.kermeta.AbilityEffectAspectAbilityEffectAspectProperties _self_ = unice.epu.carpilot.kermeta.AbilityEffectAspectAbilityEffectAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# CarAction apply(CarAction)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.AbilityEffect){
    	result = unice.epu.carpilot.kermeta.AbilityEffectAspect._privk3_apply(_self_, (unice.epu.carpilot.ecore.carpilot.AbilityEffect)_self,action);
    };
    return (unice.epu.carpilot.kermeta.CarAction)result;
  }
  
  @OverrideAspectMethod
  public static CarAction reverse(final AbilityEffect _self, final CarAction action) {
    final unice.epu.carpilot.kermeta.AbilityEffectAspectAbilityEffectAspectProperties _self_ = unice.epu.carpilot.kermeta.AbilityEffectAspectAbilityEffectAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# CarAction reverse(CarAction)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.AbilityEffect){
    	result = unice.epu.carpilot.kermeta.AbilityEffectAspect._privk3_reverse(_self_, (unice.epu.carpilot.ecore.carpilot.AbilityEffect)_self,action);
    };
    return (unice.epu.carpilot.kermeta.CarAction)result;
  }
  
  protected static CarAction _privk3_apply(final AbilityEffectAspectAbilityEffectAspectProperties _self_, final AbilityEffect _self, final CarAction action) {
    InputOutput.<String>print("reversing ability ");
    InputOutput.<Direction>println(_self.getDirection());
    Direction _direction = _self.getDirection();
    boolean _isDisable = _self.isDisable();
    boolean _not = (!_isDisable);
    action.setAbility(_direction, _not);
    return action;
  }
  
  protected static CarAction _privk3_reverse(final AbilityEffectAspectAbilityEffectAspectProperties _self_, final AbilityEffect _self, final CarAction action) {
    action.setAbility(_self.getDirection(), _self.isDisable());
    return action;
  }
}
