package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.DistanceCondition;
import unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectProperties;

@SuppressWarnings("all")
public class DistanceConditionAspectDistanceConditionAspectContext {
  public final static DistanceConditionAspectDistanceConditionAspectContext INSTANCE = new DistanceConditionAspectDistanceConditionAspectContext();
  
  public static DistanceConditionAspectDistanceConditionAspectProperties getSelf(final DistanceCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DistanceCondition, DistanceConditionAspectDistanceConditionAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.DistanceCondition, unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectProperties>();
  
  public Map<DistanceCondition, DistanceConditionAspectDistanceConditionAspectProperties> getMap() {
    return map;
  }
}
