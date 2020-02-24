package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.Rule;
import unice.epu.carpilot.kermeta.RuleAspectRuleAspectProperties;

@SuppressWarnings("all")
public class RuleAspectRuleAspectContext {
  public final static RuleAspectRuleAspectContext INSTANCE = new RuleAspectRuleAspectContext();
  
  public static RuleAspectRuleAspectProperties getSelf(final Rule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.RuleAspectRuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Rule, RuleAspectRuleAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.Rule, unice.epu.carpilot.kermeta.RuleAspectRuleAspectProperties>();
  
  public Map<Rule, RuleAspectRuleAspectProperties> getMap() {
    return map;
  }
}
