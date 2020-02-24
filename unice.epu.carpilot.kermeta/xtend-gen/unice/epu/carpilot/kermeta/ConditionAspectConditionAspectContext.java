package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.Condition;
import unice.epu.carpilot.kermeta.ConditionAspectConditionAspectProperties;

@SuppressWarnings("all")
public class ConditionAspectConditionAspectContext {
  public final static ConditionAspectConditionAspectContext INSTANCE = new ConditionAspectConditionAspectContext();
  
  public static ConditionAspectConditionAspectProperties getSelf(final Condition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.ConditionAspectConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Condition, ConditionAspectConditionAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.Condition, unice.epu.carpilot.kermeta.ConditionAspectConditionAspectProperties>();
  
  public Map<Condition, ConditionAspectConditionAspectProperties> getMap() {
    return map;
  }
}
