package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.ColorCondition;
import unice.epu.carpilot.kermeta.ColorConditionAspectColorConditionAspectProperties;

@SuppressWarnings("all")
public class ColorConditionAspectColorConditionAspectContext {
  public final static ColorConditionAspectColorConditionAspectContext INSTANCE = new ColorConditionAspectColorConditionAspectContext();
  
  public static ColorConditionAspectColorConditionAspectProperties getSelf(final ColorCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.ColorConditionAspectColorConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ColorCondition, ColorConditionAspectColorConditionAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.ColorCondition, unice.epu.carpilot.kermeta.ColorConditionAspectColorConditionAspectProperties>();
  
  public Map<ColorCondition, ColorConditionAspectColorConditionAspectProperties> getMap() {
    return map;
  }
}
