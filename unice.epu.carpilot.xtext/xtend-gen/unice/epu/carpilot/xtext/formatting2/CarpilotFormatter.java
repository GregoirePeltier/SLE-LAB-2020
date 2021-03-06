/**
 * generated by Xtext 2.14.0
 */
package unice.epu.carpilot.xtext.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import unice.epu.carpilot.ecore.carpilot.Car;
import unice.epu.carpilot.ecore.carpilot.Command;
import unice.epu.carpilot.ecore.carpilot.Condition;
import unice.epu.carpilot.ecore.carpilot.Rule;
import unice.epu.carpilot.ecore.carpilot.RuleEffect;
import unice.epu.carpilot.xtext.services.CarpilotGrammarAccess;

@SuppressWarnings("all")
public class CarpilotFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private CarpilotGrammarAccess _carpilotGrammarAccess;
  
  protected void _format(final Car car, @Extension final IFormattableDocument document) {
    EList<Rule> _rules = car.getRules();
    for (final Rule rule : _rules) {
      document.<Rule>format(rule);
    }
    EList<Command> _orders = car.getOrders();
    for (final Command command : _orders) {
      document.<Command>format(command);
    }
  }
  
  protected void _format(final Rule rule, @Extension final IFormattableDocument document) {
    document.<Condition>format(rule.getCondition());
    document.<RuleEffect>format(rule.getEffect());
  }
  
  public void format(final Object car, final IFormattableDocument document) {
    if (car instanceof XtextResource) {
      _format((XtextResource)car, document);
      return;
    } else if (car instanceof Car) {
      _format((Car)car, document);
      return;
    } else if (car instanceof Rule) {
      _format((Rule)car, document);
      return;
    } else if (car instanceof EObject) {
      _format((EObject)car, document);
      return;
    } else if (car == null) {
      _format((Void)null, document);
      return;
    } else if (car != null) {
      _format(car, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(car, document).toString());
    }
  }
}
