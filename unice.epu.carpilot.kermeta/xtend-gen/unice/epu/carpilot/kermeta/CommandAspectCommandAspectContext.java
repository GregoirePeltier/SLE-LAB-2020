package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.Command;
import unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties;

@SuppressWarnings("all")
public class CommandAspectCommandAspectContext {
  public final static CommandAspectCommandAspectContext INSTANCE = new CommandAspectCommandAspectContext();
  
  public static CommandAspectCommandAspectProperties getSelf(final Command _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Command, CommandAspectCommandAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.Command, unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties>();
  
  public Map<Command, CommandAspectCommandAspectProperties> getMap() {
    return map;
  }
}
