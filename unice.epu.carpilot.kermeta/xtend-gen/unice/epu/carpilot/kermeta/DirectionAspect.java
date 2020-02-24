package unice.epu.carpilot.kermeta;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import unice.epu.carpilot.ecore.carpilot.Direction;
import unice.epu.carpilot.kermeta.DirectionAspectDirectionAspectProperties;

@Aspect(className = Direction.class)
@SuppressWarnings("all")
public class DirectionAspect {
  public static void go(final Direction _self) {
    final unice.epu.carpilot.kermeta.DirectionAspectDirectionAspectProperties _self_ = unice.epu.carpilot.kermeta.DirectionAspectDirectionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void go()
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Direction){
    	unice.epu.carpilot.kermeta.DirectionAspect._privk3_go(_self_, (unice.epu.carpilot.ecore.carpilot.Direction)_self);
    };
  }
  
  protected static void _privk3_go(final DirectionAspectDirectionAspectProperties _self_, final Direction _self) {
  }
}
