package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.CommandEffect;
import unice.epu.carpilot.kermeta.CommandEffectAspectCommandEffectAspectProperties;

@SuppressWarnings("all")
public class CommandEffectAspectCommandEffectAspectContext {
  public final static CommandEffectAspectCommandEffectAspectContext INSTANCE = new CommandEffectAspectCommandEffectAspectContext();
  
  public static CommandEffectAspectCommandEffectAspectProperties getSelf(final CommandEffect _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.CommandEffectAspectCommandEffectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CommandEffect, CommandEffectAspectCommandEffectAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.CommandEffect, unice.epu.carpilot.kermeta.CommandEffectAspectCommandEffectAspectProperties>();
  
  public Map<CommandEffect, CommandEffectAspectCommandEffectAspectProperties> getMap() {
    return map;
  }
}
