package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.RuleEffect;
import unice.epu.carpilot.kermeta.RuleEffectAspectRuleEffectAspectProperties;

@SuppressWarnings("all")
public class RuleEffectAspectRuleEffectAspectContext {
  public final static RuleEffectAspectRuleEffectAspectContext INSTANCE = new RuleEffectAspectRuleEffectAspectContext();
  
  public static RuleEffectAspectRuleEffectAspectProperties getSelf(final RuleEffect _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.RuleEffectAspectRuleEffectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<RuleEffect, RuleEffectAspectRuleEffectAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.RuleEffect, unice.epu.carpilot.kermeta.RuleEffectAspectRuleEffectAspectProperties>();
  
  public Map<RuleEffect, RuleEffectAspectRuleEffectAspectProperties> getMap() {
    return map;
  }
}
