package unice.epu.carpilot.kermeta;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import unice.epu.carpilot.ecore.carpilot.Command;
import unice.epu.carpilot.ecore.carpilot.Direction;

@SuppressWarnings("all")
public class KernelCommand implements Command {
  private Direction direction;
  
  @Override
  public Direction getDirection() {
    return this.direction;
  }
  
  @Override
  public void setDirection(final Direction value) {
    this.direction = value;
  }
  
  @Override
  public TreeIterator<EObject> eAllContents() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public EClass eClass() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public EObject eContainer() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public EStructuralFeature eContainingFeature() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public EReference eContainmentFeature() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public EList<EObject> eContents() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public EList<EObject> eCrossReferences() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public Object eGet(final EStructuralFeature feature) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public Object eGet(final EStructuralFeature feature, final boolean resolve) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public Object eInvoke(final EOperation operation, final EList<?> arguments) throws InvocationTargetException {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public boolean eIsProxy() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public boolean eIsSet(final EStructuralFeature feature) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public Resource eResource() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public void eSet(final EStructuralFeature feature, final Object newValue) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public void eUnset(final EStructuralFeature feature) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public EList<Adapter> eAdapters() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public boolean eDeliver() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public void eNotify(final Notification notification) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public void eSetDeliver(final boolean deliver) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
