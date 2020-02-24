package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.Car;
import unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties;

@SuppressWarnings("all")
public class CarPilotAspectCarAspectContext {
  public final static CarPilotAspectCarAspectContext INSTANCE = new CarPilotAspectCarAspectContext();
  
  public static CarPilotAspectCarAspectProperties getSelf(final Car _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Car, CarPilotAspectCarAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.Car, unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties>();
  
  public Map<Car, CarPilotAspectCarAspectProperties> getMap() {
    return map;
  }
}
