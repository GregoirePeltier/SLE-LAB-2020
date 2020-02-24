package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.Direction;
import unice.epu.carpilot.kermeta.DirectionAspectDirectionAspectProperties;

@SuppressWarnings("all")
public class DirectionAspectDirectionAspectContext {
  public final static DirectionAspectDirectionAspectContext INSTANCE = new DirectionAspectDirectionAspectContext();
  
  public static DirectionAspectDirectionAspectProperties getSelf(final Direction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.DirectionAspectDirectionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Direction, DirectionAspectDirectionAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.Direction, unice.epu.carpilot.kermeta.DirectionAspectDirectionAspectProperties>();
  
  public Map<Direction, DirectionAspectDirectionAspectProperties> getMap() {
    return map;
  }
}
