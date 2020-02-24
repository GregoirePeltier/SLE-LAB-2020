/*
 * generated by Xtext 2.14.0
 */
package unice.epu.carpilot.xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import unice.epu.carpilot.xtext.CarpilotRuntimeModule
import unice.epu.carpilot.xtext.CarpilotStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class CarpilotIdeSetup extends CarpilotStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new CarpilotRuntimeModule, new CarpilotIdeModule))
	}
	
}
