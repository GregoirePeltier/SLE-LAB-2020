package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.PersistingRule;
import unice.epu.carpilot.kermeta.PersistingRuleAspectPersistingRuleAspectProperties;

@SuppressWarnings("all")
public class PersistingRuleAspectPersistingRuleAspectContext {
  public final static PersistingRuleAspectPersistingRuleAspectContext INSTANCE = new PersistingRuleAspectPersistingRuleAspectContext();
  
  public static PersistingRuleAspectPersistingRuleAspectProperties getSelf(final PersistingRule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.PersistingRuleAspectPersistingRuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PersistingRule, PersistingRuleAspectPersistingRuleAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.PersistingRule, unice.epu.carpilot.kermeta.PersistingRuleAspectPersistingRuleAspectProperties>();
  
  public Map<PersistingRule, PersistingRuleAspectPersistingRuleAspectProperties> getMap() {
    return map;
  }
}
