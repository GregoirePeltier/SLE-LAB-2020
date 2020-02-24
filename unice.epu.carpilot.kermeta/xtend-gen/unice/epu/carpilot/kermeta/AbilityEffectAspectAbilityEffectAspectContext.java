package unice.epu.carpilot.kermeta;

import java.util.Map;
import unice.epu.carpilot.ecore.carpilot.AbilityEffect;
import unice.epu.carpilot.kermeta.AbilityEffectAspectAbilityEffectAspectProperties;

@SuppressWarnings("all")
public class AbilityEffectAspectAbilityEffectAspectContext {
  public final static AbilityEffectAspectAbilityEffectAspectContext INSTANCE = new AbilityEffectAspectAbilityEffectAspectContext();
  
  public static AbilityEffectAspectAbilityEffectAspectProperties getSelf(final AbilityEffect _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new unice.epu.carpilot.kermeta.AbilityEffectAspectAbilityEffectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AbilityEffect, AbilityEffectAspectAbilityEffectAspectProperties> map = new java.util.WeakHashMap<unice.epu.carpilot.ecore.carpilot.AbilityEffect, unice.epu.carpilot.kermeta.AbilityEffectAspectAbilityEffectAspectProperties>();
  
  public Map<AbilityEffect, AbilityEffectAspectAbilityEffectAspectProperties> getMap() {
    return map;
  }
}
