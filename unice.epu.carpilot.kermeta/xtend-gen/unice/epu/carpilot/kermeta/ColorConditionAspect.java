package unice.epu.carpilot.kermeta;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.unice.polytech.deantoni.vrep.polycar.PolyCar;
import fr.unice.polytech.deantoni.vrep.polycar.utils.Pixel;
import unice.epu.carpilot.ecore.carpilot.Camera;
import unice.epu.carpilot.ecore.carpilot.Color;
import unice.epu.carpilot.ecore.carpilot.ColorCondition;
import unice.epu.carpilot.kermeta.ColorConditionAspectColorConditionAspectProperties;
import unice.epu.carpilot.kermeta.ConditionAspect;

@Aspect(className = ColorCondition.class)
@SuppressWarnings("all")
public class ColorConditionAspect extends ConditionAspect {
  public static Pixel getPixel(final ColorCondition _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.ColorConditionAspectColorConditionAspectProperties _self_ = unice.epu.carpilot.kermeta.ColorConditionAspectColorConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Pixel getPixel(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.ColorCondition){
    	result = unice.epu.carpilot.kermeta.ColorConditionAspect._privk3_getPixel(_self_, (unice.epu.carpilot.ecore.carpilot.ColorCondition)_self,car);
    };
    return (fr.unice.polytech.deantoni.vrep.polycar.utils.Pixel)result;
  }
  
  @OverrideAspectMethod
  public static boolean isTrue(final ColorCondition _self, final PolyCar car) {
    final unice.epu.carpilot.kermeta.ColorConditionAspectColorConditionAspectProperties _self_ = unice.epu.carpilot.kermeta.ColorConditionAspectColorConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isTrue(PolyCar)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.ColorCondition){
    	result = unice.epu.carpilot.kermeta.ColorConditionAspect._privk3_isTrue(_self_, (unice.epu.carpilot.ecore.carpilot.ColorCondition)_self,car);
    };
    return (boolean)result;
  }
  
  public static boolean checkColor(final ColorCondition _self, final Pixel pixel) {
    final unice.epu.carpilot.kermeta.ColorConditionAspectColorConditionAspectProperties _self_ = unice.epu.carpilot.kermeta.ColorConditionAspectColorConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean checkColor(Pixel)
    if (_self instanceof unice.epu.carpilot.ecore.carpilot.ColorCondition){
    	result = unice.epu.carpilot.kermeta.ColorConditionAspect._privk3_checkColor(_self_, (unice.epu.carpilot.ecore.carpilot.ColorCondition)_self,pixel);
    };
    return (boolean)result;
  }
  
  protected static Pixel _privk3_getPixel(final ColorConditionAspectColorConditionAspectProperties _self_, final ColorCondition _self, final PolyCar car) {
    Camera _camera = _self.getCamera();
    if (_camera != null) {
      switch (_camera) {
        case VERY_RIGHT:
          return car.readVeryRightSensor();
        case VERY_LEFT:
          return car.readVeryLeftSensor();
        case LEFT:
          return car.readLeftSensor();
        case RIGHT:
          return car.readRightSensor();
        case CENTER:
          return car.readMiddleSensor();
        default:
          break;
      }
    }
    return null;
  }
  
  protected static boolean _privk3_isTrue(final ColorConditionAspectColorConditionAspectProperties _self_, final ColorCondition _self, final PolyCar car) {
    Pixel pixel = ColorConditionAspect.getPixel(_self, car);
    return ColorConditionAspect.checkColor(_self, pixel);
  }
  
  protected static boolean _privk3_checkColor(final ColorConditionAspectColorConditionAspectProperties _self_, final ColorCondition _self, final Pixel pixel) {
    Color _color = _self.getColor();
    boolean _equals = Objects.equal(_color, Color.RED);
    if (_equals) {
      return pixel.isRed();
    }
    Color _color_1 = _self.getColor();
    boolean _equals_1 = Objects.equal(_color_1, Color.BLUE);
    if (_equals_1) {
      return pixel.isBlue();
    }
    Color _color_2 = _self.getColor();
    boolean _equals_2 = Objects.equal(_color_2, Color.ORANGE);
    if (_equals_2) {
      return pixel.isOrange();
    }
    Color _color_3 = _self.getColor();
    boolean _equals_3 = Objects.equal(_color_3, Color.BUILDING);
    if (_equals_3) {
      return ((((!pixel.isOrange()) && (!pixel.isBlue())) && (!pixel.isRed())) && (!pixel.isBlack()));
    }
    return false;
  }
}
