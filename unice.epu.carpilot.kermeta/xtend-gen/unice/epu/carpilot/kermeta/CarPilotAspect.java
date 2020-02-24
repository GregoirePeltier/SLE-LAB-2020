package unice.epu.carpilot.kermeta;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import unice.epu.carpilot.ecore.carpilot.Car;
import unice.epu.carpilot.ecore.carpilot.Command;
import unice.epu.carpilot.ecore.carpilot.Rule;
import unice.epu.carpilot.kermeta.CarAction;
import unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties;
import unice.epu.carpilot.kermeta.CommandAspect;
import unice.epu.carpilot.kermeta.RuleAspect;

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className = Car.class)
@SuppressWarnings("all")
public class CarPilotAspect {
  @Main
  public static void run(final Car _self) {
    final unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties _self_ = unice.epu.carpilot.kermeta.CarPilotAspectCarAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void run()
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Car){
    	unice.epu.carpilot.kermeta.CarPilotAspect._privk3_run(_self_, (unice.epu.carpilot.ecore.carpilot.Car)_self);
    };
  }
  
  public static Command getNextCommand(final Car _self) {
    final unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties _self_ = unice.epu.carpilot.kermeta.CarPilotAspectCarAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Command getNextCommand()
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Car){
    	result = unice.epu.carpilot.kermeta.CarPilotAspect._privk3_getNextCommand(_self_, (unice.epu.carpilot.ecore.carpilot.Car)_self);
    };
    return (unice.epu.carpilot.ecore.carpilot.Command)result;
  }
  
  public static CarAction applyRules(final Car _self, final CarAction action) {
    final unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties _self_ = unice.epu.carpilot.kermeta.CarPilotAspectCarAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# CarAction applyRules(CarAction)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Car){
    	result = unice.epu.carpilot.kermeta.CarPilotAspect._privk3_applyRules(_self_, (unice.epu.carpilot.ecore.carpilot.Car)_self,action);
    };
    return (unice.epu.carpilot.kermeta.CarAction)result;
  }
  
  public static boolean isAtDestination(final Car _self) {
    final unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties _self_ = unice.epu.carpilot.kermeta.CarPilotAspectCarAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isAtDestination()
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Car){
    	result = unice.epu.carpilot.kermeta.CarPilotAspect._privk3_isAtDestination(_self_, (unice.epu.carpilot.ecore.carpilot.Car)_self);
    };
    return (boolean)result;
  }
  
  public static void execute(final Car _self, final CarAction action) {
    final unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties _self_ = unice.epu.carpilot.kermeta.CarPilotAspectCarAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute(CarAction)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Car){
    	unice.epu.carpilot.kermeta.CarPilotAspect._privk3_execute(_self_, (unice.epu.carpilot.ecore.carpilot.Car)_self,action);
    };
  }
  
  private static HashSet done(final Car _self) {
    final unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties _self_ = unice.epu.carpilot.kermeta.CarPilotAspectCarAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# HashSet done()
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Car){
    	result = unice.epu.carpilot.kermeta.CarPilotAspect._privk3_done(_self_, (unice.epu.carpilot.ecore.carpilot.Car)_self);
    };
    return (java.util.HashSet)result;
  }
  
  private static void done(final Car _self, final HashSet done) {
    final unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties _self_ = unice.epu.carpilot.kermeta.CarPilotAspectCarAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void done(HashSet)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Car){
    	unice.epu.carpilot.kermeta.CarPilotAspect._privk3_done(_self_, (unice.epu.carpilot.ecore.carpilot.Car)_self,done);
    };
  }
  
  private static PolyCar polyCar(final Car _self) {
    final unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties _self_ = unice.epu.carpilot.kermeta.CarPilotAspectCarAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# PolyCar polyCar()
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Car){
    	result = unice.epu.carpilot.kermeta.CarPilotAspect._privk3_polyCar(_self_, (unice.epu.carpilot.ecore.carpilot.Car)_self);
    };
    return (fr.unice.polytech.deantoni.vrep.polycar.PolyCar)result;
  }
  
  private static void polyCar(final Car _self, final PolyCar polyCar) {
    final unice.epu.carpilot.kermeta.CarPilotAspectCarAspectProperties _self_ = unice.epu.carpilot.kermeta.CarPilotAspectCarAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void polyCar(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Car){
    	unice.epu.carpilot.kermeta.CarPilotAspect._privk3_polyCar(_self_, (unice.epu.carpilot.ecore.carpilot.Car)_self,polyCar);
    };
  }
  
  protected static void _privk3_run(final CarPilotAspectCarAspectProperties _self_, final Car _self) {
    try {
      PolyCar _polyCar = new PolyCar("127.0.0.1", 19997);
      CarPilotAspect.polyCar(_self, _polyCar);
      CarPilotAspect.polyCar(_self).start();
      Thread.sleep(1000);
      while ((!CarPilotAspect.isAtDestination(_self))) {
        {
          Command command = CarPilotAspect.getNextCommand(_self);
          CarAction action = new CarAction();
          action.currentCommand = command;
          InputOutput.<Command>println(action.currentCommand);
          CarPilotAspect.execute(_self, CarPilotAspect.applyRules(_self, action));
        }
      }
      CarPilotAspect.polyCar(_self).stopSimulation();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static Command _privk3_getNextCommand(final CarPilotAspectCarAspectProperties _self_, final Car _self) {
    EList<Command> _orders = _self.getOrders();
    for (final Command command : _orders) {
      boolean _isDone = CommandAspect.isDone(command);
      boolean _not = (!_isDone);
      if (_not) {
        return command;
      }
    }
    return null;
  }
  
  protected static CarAction _privk3_applyRules(final CarPilotAspectCarAspectProperties _self_, final Car _self, final CarAction action) {
    CarAction filtered = action;
    EList<Rule> _rules = _self.getRules();
    for (final Rule rule : _rules) {
      filtered = RuleAspect.apply(rule, CarPilotAspect.polyCar(_self), filtered);
    }
    return filtered;
  }
  
  protected static boolean _privk3_isAtDestination(final CarPilotAspectCarAspectProperties _self_, final Car _self) {
    Command _nextCommand = CarPilotAspect.getNextCommand(_self);
    return Objects.equal(_nextCommand, null);
  }
  
  protected static void _privk3_execute(final CarPilotAspectCarAspectProperties _self_, final Car _self, final CarAction action) {
    Command command = action.getNextPossibleCommand();
    CommandAspect.execute(command, CarPilotAspect.polyCar(_self));
    boolean _isDone = CommandAspect.isDone(command);
    if (_isDone) {
      CarPilotAspect.done(_self).add(command);
    }
  }
  
  protected static HashSet _privk3_done(final CarPilotAspectCarAspectProperties _self_, final Car _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDone") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.HashSet) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.done;
  }
  
  protected static void _privk3_done(final CarPilotAspectCarAspectProperties _self_, final Car _self, final HashSet done) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDone")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, done);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.done = done;
    }
  }
  
  protected static PolyCar _privk3_polyCar(final CarPilotAspectCarAspectProperties _self_, final Car _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPolyCar") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.unice.polytech.deantoni.vrep.polycar.PolyCar) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.polyCar;
  }
  
  protected static void _privk3_polyCar(final CarPilotAspectCarAspectProperties _self_, final Car _self, final PolyCar polyCar) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPolyCar")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, polyCar);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.polyCar = polyCar;
    }
  }
}
