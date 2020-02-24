package unice.epu.carpilot.kermeta;

import com.google.common.base.Objects;
import coppelia.FloatWA;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar;
import org.eclipse.xtext.xbase.lib.InputOutput;
import unice.epu.carpilot.ecore.carpilot.AnalogOperand;
import unice.epu.carpilot.ecore.carpilot.DistanceCondition;
import unice.epu.carpilot.ecore.carpilot.Sensor;
import unice.epu.carpilot.kermeta.ConditionAspect;
import unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectProperties;

@Aspect(className = DistanceCondition.class)
@SuppressWarnings("all")
public class DistanceConditionAspect extends ConditionAspect {
  @OverrideAspectMethod
  public static boolean isTrue(final DistanceCondition _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectProperties _self_ = unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isTrue(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.DistanceCondition){
    	result = unice.epu.carpilot.kermeta.DistanceConditionAspect._privk3_isTrue(_self_, (unice.epu.carpilot.ecore.carpilot.DistanceCondition)_self,car);
    };
    return (boolean)result;
  }
  
  public static Float getValue(final DistanceCondition _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectProperties _self_ = unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Float getValue(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.DistanceCondition){
    	result = unice.epu.carpilot.kermeta.DistanceConditionAspect._privk3_getValue(_self_, (unice.epu.carpilot.ecore.carpilot.DistanceCondition)_self,car);
    };
    return (java.lang.Float)result;
  }
  
  public static float distance(final DistanceCondition _self, final FloatWA vector) {
    final unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectProperties _self_ = unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# float distance(FloatWA)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.DistanceCondition){
    	result = unice.epu.carpilot.kermeta.DistanceConditionAspect._privk3_distance(_self_, (unice.epu.carpilot.ecore.carpilot.DistanceCondition)_self,vector);
    };
    return (float)result;
  }
  
  public static boolean compare(final DistanceCondition _self, final float a, final float b) {
    final unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectProperties _self_ = unice.epu.carpilot.kermeta.DistanceConditionAspectDistanceConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean compare(float,float)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.DistanceCondition){
    	result = unice.epu.carpilot.kermeta.DistanceConditionAspect._privk3_compare(_self_, (unice.epu.carpilot.ecore.carpilot.DistanceCondition)_self,a,b);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_isTrue(final DistanceConditionAspectDistanceConditionAspectProperties _self_, final DistanceCondition _self, final PolyCar car) {
    Float value = DistanceConditionAspect.getValue(_self, car);
    InputOutput.<String>println("Read value");
    InputOutput.<Float>println(value);
    boolean _equals = Objects.equal(value, null);
    if (_equals) {
      return false;
    }
    return DistanceConditionAspect.compare(_self, (value).floatValue(), _self.getDistance());
  }
  
  protected static Float _privk3_getValue(final DistanceConditionAspectDistanceConditionAspectProperties _self_, final DistanceCondition _self, final PolyCar car) {
    FloatWA vector = null;
    Sensor _sensor = _self.getSensor();
    if (_sensor != null) {
      switch (_sensor) {
        case DISTANCE_LEFT:
          boolean _checkLeftProximitySensor = car.checkLeftProximitySensor();
          boolean _not = (!_checkLeftProximitySensor);
          if (_not) {
            return null;
          }
          vector = car.leftMapDetectedObject;
          break;
        case DISTANCE_RIGHT:
          boolean _checkRightProximitySensor = car.checkRightProximitySensor();
          boolean _not_1 = (!_checkRightProximitySensor);
          if (_not_1) {
            return null;
          }
          vector = car.rightMapDetectedObject;
          break;
        case FRONT:
          boolean _checkMiddleProximitySensor = car.checkMiddleProximitySensor();
          boolean _not_2 = (!_checkMiddleProximitySensor);
          if (_not_2) {
            return null;
          }
          vector = car.middleDetectedObjectPoint;
          break;
        default:
          break;
      }
    }
    int _length = vector.getLength();
    boolean _equals = (_length == 0);
    if (_equals) {
      return null;
    }
    return Float.valueOf(DistanceConditionAspect.distance(_self, vector));
  }
  
  protected static float _privk3_distance(final DistanceConditionAspectDistanceConditionAspectProperties _self_, final DistanceCondition _self, final FloatWA vector) {
    float _get = vector.getArray()[0];
    float _get_1 = vector.getArray()[1];
    float _plus = (_get + _get_1);
    float _get_2 = vector.getArray()[2];
    float _plus_1 = (_plus + _get_2);
    float _floatValue = Double.valueOf(Math.sqrt(_plus_1)).floatValue();
    return (_floatValue * 100);
  }
  
  protected static boolean _privk3_compare(final DistanceConditionAspectDistanceConditionAspectProperties _self_, final DistanceCondition _self, final float a, final float b) {
    AnalogOperand _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case EQUALS:
          return (a == b);
        case GREATER:
          return (a > b);
        case GREATER_EQUALS:
          return (a >= b);
        case LOWER:
          return (a < b);
        case LOWER_EQUALS:
          return (a <= b);
        case NOTEQUALS:
          return (a != b);
        default:
          break;
      }
    }
    return false;
  }
}
