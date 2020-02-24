package unice.epu.carpilot.kermeta;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar;
import unice.epu.carpilot.ecore.carpilot.PersistingRule;
import unice.epu.carpilot.ecore.carpilot.RuleEffect;
import unice.epu.carpilot.kermeta.CarAction;
import unice.epu.carpilot.kermeta.ConditionAspect;
import unice.epu.carpilot.kermeta.PersistingRuleAspectPersistingRuleAspectProperties;
import unice.epu.carpilot.kermeta.RuleAspect;
import unice.epu.carpilot.kermeta.RuleEffectAspect;

@Aspect(className = PersistingRule.class)
@SuppressWarnings("all")
public class PersistingRuleAspect extends RuleAspect {
  @OverrideAspectMethod
  public static CarAction apply(final PersistingRule _self, final PolyCar car, final CarAction action) {
    final unice.epu.carpilot.kermeta.PersistingRuleAspectPersistingRuleAspectProperties _self_ = unice.epu.carpilot.kermeta.PersistingRuleAspectPersistingRuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# CarAction apply(PolyCar,CarAction)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.PersistingRule){
    	result = unice.epu.carpilot.kermeta.PersistingRuleAspect._privk3_apply(_self_, (unice.epu.carpilot.ecore.carpilot.PersistingRule)_self,car,action);
    };
    return (unice.epu.carpilot.kermeta.CarAction)result;
  }
  
  private static boolean triggered(final PersistingRule _self) {
    final unice.epu.carpilot.kermeta.PersistingRuleAspectPersistingRuleAspectProperties _self_ = unice.epu.carpilot.kermeta.PersistingRuleAspectPersistingRuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean triggered()
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.PersistingRule){
    	result = unice.epu.carpilot.kermeta.PersistingRuleAspect._privk3_triggered(_self_, (unice.epu.carpilot.ecore.carpilot.PersistingRule)_self);
    };
    return (boolean)result;
  }
  
  private static void triggered(final PersistingRule _self, final boolean triggered) {
    final unice.epu.carpilot.kermeta.PersistingRuleAspectPersistingRuleAspectProperties _self_ = unice.epu.carpilot.kermeta.PersistingRuleAspectPersistingRuleAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void triggered(boolean)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.PersistingRule){
    	unice.epu.carpilot.kermeta.PersistingRuleAspect._privk3_triggered(_self_, (unice.epu.carpilot.ecore.carpilot.PersistingRule)_self,triggered);
    };
  }
  
  private static CarAction super_apply(final PersistingRule _self, final PolyCar car, final CarAction action) {
    final unice.epu.carpilot.kermeta.RuleAspectRuleAspectProperties _self_ = unice.epu.carpilot.kermeta.RuleAspectRuleAspectContext.getSelf(_self);
    return  unice.epu.carpilot.kermeta.RuleAspect._privk3_apply(_self_, _self,car,action);
  }
  
  protected static CarAction _privk3_apply(final PersistingRuleAspectPersistingRuleAspectProperties _self_, final PersistingRule _self, final PolyCar car, final CarAction action) {
    RuleEffect effect = _self.getEffect();
    boolean _isConditionTrue = RuleAspect.isConditionTrue(_self, car);
    if (_isConditionTrue) {
      PersistingRuleAspect.triggered(_self, true);
    }
    boolean _isTrue = ConditionAspect.isTrue(_self.getStop(), car);
    if (_isTrue) {
      PersistingRuleAspect.triggered(_self, false);
    }
    boolean _triggered = PersistingRuleAspect.triggered(_self);
    if (_triggered) {
      return RuleEffectAspect.apply(effect, action);
    }
    return RuleEffectAspect.reverse(effect, action);
  }
  
  protected static boolean _privk3_triggered(final PersistingRuleAspectPersistingRuleAspectProperties _self_, final PersistingRule _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isTriggered") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.triggered;
  }
  
  protected static void _privk3_triggered(final PersistingRuleAspectPersistingRuleAspectProperties _self_, final PersistingRule _self, final boolean triggered) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTriggered")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, triggered);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.triggered = triggered;
    }
  }
}
