/**
 * generated by Xtext 2.14.0
 */
package unice.epu.carpilot.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import unice.epu.carpilot.xtext.CarpilotRuntimeModule;
import unice.epu.carpilot.xtext.CarpilotStandaloneSetup;
import unice.epu.carpilot.xtext.ide.CarpilotIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class CarpilotIdeSetup extends CarpilotStandaloneSetup {
  @Override
  public Injector createInjector() {
    CarpilotRuntimeModule _carpilotRuntimeModule = new CarpilotRuntimeModule();
    CarpilotIdeModule _carpilotIdeModule = new CarpilotIdeModule();
    return Guice.createInjector(Modules2.mixin(_carpilotRuntimeModule, _carpilotIdeModule));
  }
}
