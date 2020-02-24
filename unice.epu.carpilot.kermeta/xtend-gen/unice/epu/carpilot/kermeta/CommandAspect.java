package unice.epu.carpilot.kermeta;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar;
import fr.unice.polytech.deantoni.vrep.polycar.utils.Pixel;
import org.eclipse.xtext.xbase.lib.InputOutput;
import unice.epu.carpilot.ecore.carpilot.Command;
import unice.epu.carpilot.ecore.carpilot.Direction;
import unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties;
import unice.epu.carpilot.kermeta.CommandStage;

@Aspect(className = Command.class)
@SuppressWarnings("all")
public class CommandAspect {
  public static void execute(final Command _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandAspectCommandAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Command){
    	unice.epu.carpilot.kermeta.CommandAspect._privk3_execute(_self_, (unice.epu.carpilot.ecore.carpilot.Command)_self,car);
    };
  }
  
  public static void stop(final Command _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandAspectCommandAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void stop(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Command){
    	unice.epu.carpilot.kermeta.CommandAspect._privk3_stop(_self_, (unice.epu.carpilot.ecore.carpilot.Command)_self,car);
    };
  }
  
  public static void forward(final Command _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandAspectCommandAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void forward(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Command){
    	unice.epu.carpilot.kermeta.CommandAspect._privk3_forward(_self_, (unice.epu.carpilot.ecore.carpilot.Command)_self,car);
    };
  }
  
  public static void straight(final Command _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandAspectCommandAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void straight(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Command){
    	unice.epu.carpilot.kermeta.CommandAspect._privk3_straight(_self_, (unice.epu.carpilot.ecore.carpilot.Command)_self,car);
    };
  }
  
  public static void turnLeft(final Command _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandAspectCommandAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void turnLeft(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Command){
    	unice.epu.carpilot.kermeta.CommandAspect._privk3_turnLeft(_self_, (unice.epu.carpilot.ecore.carpilot.Command)_self,car);
    };
  }
  
  public static void turnRight(final Command _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandAspectCommandAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void turnRight(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Command){
    	unice.epu.carpilot.kermeta.CommandAspect._privk3_turnRight(_self_, (unice.epu.carpilot.ecore.carpilot.Command)_self,car);
    };
  }
  
  public static boolean isDone(final Command _self) {
    final unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandAspectCommandAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isDone()
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Command){
    	result = unice.epu.carpilot.kermeta.CommandAspect._privk3_isDone(_self_, (unice.epu.carpilot.ecore.carpilot.Command)_self);
    };
    return (boolean)result;
  }
  
  private static CommandStage commandStage(final Command _self) {
    final unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandAspectCommandAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# CommandStage commandStage()
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Command){
    	result = unice.epu.carpilot.kermeta.CommandAspect._privk3_commandStage(_self_, (unice.epu.carpilot.ecore.carpilot.Command)_self);
    };
    return (unice.epu.carpilot.kermeta.CommandStage)result;
  }
  
  private static void commandStage(final Command _self, final CommandStage commandStage) {
    final unice.epu.carpilot.kermeta.CommandAspectCommandAspectProperties _self_ = unice.epu.carpilot.kermeta.CommandAspectCommandAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void commandStage(CommandStage)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.Command){
    	unice.epu.carpilot.kermeta.CommandAspect._privk3_commandStage(_self_, (unice.epu.carpilot.ecore.carpilot.Command)_self,commandStage);
    };
  }
  
  protected static void _privk3_execute(final CommandAspectCommandAspectProperties _self_, final Command _self, final PolyCar car) {
    Direction _direction = _self.getDirection();
    if (_direction != null) {
      switch (_direction) {
        case LEFT:
          CommandAspect.turnLeft(_self, car);
          break;
        case RIGHT:
          CommandAspect.turnRight(_self, car);
          break;
        case FORWARD:
          CommandAspect.forward(_self, car);
          break;
        case STOP:
          CommandAspect.stop(_self, car);
          break;
        default:
          break;
      }
    }
  }
  
  protected static void _privk3_stop(final CommandAspectCommandAspectProperties _self_, final Command _self, final PolyCar car) {
    car.goStraight(0);
    car.goCurved(0, 0);
  }
  
  protected static void _privk3_forward(final CommandAspectCommandAspectProperties _self_, final Command _self, final PolyCar car) {
    Pixel left = car.readVeryLeftSensor();
    Pixel right = car.readVeryRightSensor();
    if ((Objects.equal(CommandAspect.commandStage(_self), CommandStage.NOTSTARTED) && (left.isBlack() || right.isBlack()))) {
      CommandAspect.commandStage(_self, CommandStage.STARTED);
    } else {
      if ((Objects.equal(CommandAspect.commandStage(_self), CommandStage.STARTED) && ((!left.isBlack()) && (!right.isBlack())))) {
        CommandAspect.commandStage(_self, CommandStage.DONE);
      }
    }
    CommandAspect.straight(_self, car);
  }
  
  protected static void _privk3_straight(final CommandAspectCommandAspectProperties _self_, final Command _self, final PolyCar car) {
    Pixel left = car.readLeftSensor();
    Pixel right = car.readRightSensor();
    Pixel middle = car.readMiddleSensor();
    if ((left.isBlack() && (!right.isBlack()))) {
      car.goCurved(0, 2);
    } else {
      if (((!left.isBlack()) && right.isBlack())) {
        car.goCurved(2, 0);
      } else {
        boolean _isBlack = middle.isBlack();
        boolean _not = (!_isBlack);
        if (_not) {
          CommandAspect.stop(_self, car);
        } else {
          car.goStraight(10);
        }
      }
    }
  }
  
  protected static void _privk3_turnLeft(final CommandAspectCommandAspectProperties _self_, final Command _self, final PolyCar car) {
    Pixel veryLeft = car.readVeryLeftSensor();
    boolean _isBlack = veryLeft.isBlack();
    if (_isBlack) {
      car.goCurved(0, 10);
      CommandAspect.commandStage(_self, CommandStage.STARTED);
    } else {
      CommandAspect.straight(_self, car);
      if ((Objects.equal(CommandAspect.commandStage(_self), CommandStage.STARTED) && (!car.readVeryRightSensor().isBlack()))) {
        CommandAspect.commandStage(_self, CommandStage.DONE);
      }
    }
  }
  
  protected static void _privk3_turnRight(final CommandAspectCommandAspectProperties _self_, final Command _self, final PolyCar car) {
    Pixel veryRight = car.readVeryRightSensor();
    boolean _isBlack = veryRight.isBlack();
    if (_isBlack) {
      InputOutput.<String>print("pixel black for write ");
      InputOutput.<Pixel>println(veryRight);
      InputOutput.<Integer>print(Integer.valueOf(veryRight.R));
      InputOutput.<String>print(";");
      InputOutput.<Integer>print(Integer.valueOf(veryRight.G));
      InputOutput.<String>print(";");
      InputOutput.<Integer>println(Integer.valueOf(veryRight.B));
      car.goCurved(10, 0);
      CommandAspect.commandStage(_self, CommandStage.STARTED);
    } else {
      CommandAspect.straight(_self, car);
      if ((Objects.equal(CommandAspect.commandStage(_self), CommandStage.STARTED) && (!car.readVeryLeftSensor().isBlack()))) {
        CommandAspect.commandStage(_self, CommandStage.DONE);
      }
    }
  }
  
  protected static boolean _privk3_isDone(final CommandAspectCommandAspectProperties _self_, final Command _self) {
    CommandStage _commandStage = CommandAspect.commandStage(_self);
    return Objects.equal(_commandStage, CommandStage.DONE);
  }
  
  protected static CommandStage _privk3_commandStage(final CommandAspectCommandAspectProperties _self_, final Command _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCommandStage") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (unice.epu.carpilot.kermeta.CommandStage) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.commandStage;
  }
  
  protected static void _privk3_commandStage(final CommandAspectCommandAspectProperties _self_, final Command _self, final CommandStage commandStage) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCommandStage")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, commandStage);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.commandStage = commandStage;
    }
  }
}
