/*
 * generated by Xtext 2.14.0
 */
package unice.epu.carpilot.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import unice.epu.carpilot.ecore.carpilot.AbilityEffect;
import unice.epu.carpilot.ecore.carpilot.Car;
import unice.epu.carpilot.ecore.carpilot.CarpilotPackage;
import unice.epu.carpilot.ecore.carpilot.ColorCondition;
import unice.epu.carpilot.ecore.carpilot.Command;
import unice.epu.carpilot.ecore.carpilot.CommandEffect;
import unice.epu.carpilot.ecore.carpilot.DistanceCondition;
import unice.epu.carpilot.ecore.carpilot.PersistingRule;
import unice.epu.carpilot.ecore.carpilot.Rule;
import unice.epu.carpilot.xtext.services.CarpilotGrammarAccess;

@SuppressWarnings("all")
public class CarpilotSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CarpilotGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CarpilotPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CarpilotPackage.ABILITY_EFFECT:
				sequence_AbilityEffect(context, (AbilityEffect) semanticObject); 
				return; 
			case CarpilotPackage.CAR:
				sequence_Car(context, (Car) semanticObject); 
				return; 
			case CarpilotPackage.COLOR_CONDITION:
				sequence_ColorCondition(context, (ColorCondition) semanticObject); 
				return; 
			case CarpilotPackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case CarpilotPackage.COMMAND_EFFECT:
				sequence_CommandEffect(context, (CommandEffect) semanticObject); 
				return; 
			case CarpilotPackage.DISTANCE_CONDITION:
				sequence_DistanceCondition(context, (DistanceCondition) semanticObject); 
				return; 
			case CarpilotPackage.PERSISTING_RULE:
				sequence_PersistingRule(context, (PersistingRule) semanticObject); 
				return; 
			case CarpilotPackage.RULE:
				sequence_DirectRule(context, (Rule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     RuleEffect returns AbilityEffect
	 *     AbilityEffect returns AbilityEffect
	 *
	 * Constraint:
	 *     (disable?='not'? direction=Direction)
	 */
	protected void sequence_AbilityEffect(ISerializationContext context, AbilityEffect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Car returns Car
	 *
	 * Constraint:
	 *     (name=EString? (rules+=Rule rules+=Rule*)? orders+=Command orders+=Command*)
	 */
	protected void sequence_Car(ISerializationContext context, Car semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns ColorCondition
	 *     ColorCondition returns ColorCondition
	 *
	 * Constraint:
	 *     ((color=Color camera=Camera) | (camera=Camera color=Color))
	 */
	protected void sequence_ColorCondition(ISerializationContext context, ColorCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleEffect returns CommandEffect
	 *     CommandEffect returns CommandEffect
	 *
	 * Constraint:
	 *     command=Command
	 */
	protected void sequence_CommandEffect(ISerializationContext context, CommandEffect semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CarpilotPackage.Literals.COMMAND_EFFECT__COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CarpilotPackage.Literals.COMMAND_EFFECT__COMMAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommandEffectAccess().getCommandCommandParserRuleCall_0(), semanticObject.getCommand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     direction=Direction?
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *     DirectRule returns Rule
	 *
	 * Constraint:
	 *     (condition=Condition effect=RuleEffect)
	 */
	protected void sequence_DirectRule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CarpilotPackage.Literals.RULE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CarpilotPackage.Literals.RULE__CONDITION));
			if (transientValues.isValueTransient(semanticObject, CarpilotPackage.Literals.RULE__EFFECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CarpilotPackage.Literals.RULE__EFFECT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDirectRuleAccess().getConditionConditionParserRuleCall_0_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getDirectRuleAccess().getEffectRuleEffectParserRuleCall_2_0(), semanticObject.getEffect());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns DistanceCondition
	 *     DistanceCondition returns DistanceCondition
	 *
	 * Constraint:
	 *     (sensor=Sensor operator=AnalogOperand distance=Float)
	 */
	protected void sequence_DistanceCondition(ISerializationContext context, DistanceCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CarpilotPackage.Literals.DISTANCE_CONDITION__SENSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CarpilotPackage.Literals.DISTANCE_CONDITION__SENSOR));
			if (transientValues.isValueTransient(semanticObject, CarpilotPackage.Literals.DISTANCE_CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CarpilotPackage.Literals.DISTANCE_CONDITION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, CarpilotPackage.Literals.DISTANCE_CONDITION__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CarpilotPackage.Literals.DISTANCE_CONDITION__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDistanceConditionAccess().getSensorSensorEnumRuleCall_0_0(), semanticObject.getSensor());
		feeder.accept(grammarAccess.getDistanceConditionAccess().getOperatorAnalogOperandEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getDistanceConditionAccess().getDistanceFloatParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns PersistingRule
	 *     PersistingRule returns PersistingRule
	 *
	 * Constraint:
	 *     (condition=Condition effect=RuleEffect stop=Condition)
	 */
	protected void sequence_PersistingRule(ISerializationContext context, PersistingRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CarpilotPackage.Literals.RULE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CarpilotPackage.Literals.RULE__CONDITION));
			if (transientValues.isValueTransient(semanticObject, CarpilotPackage.Literals.RULE__EFFECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CarpilotPackage.Literals.RULE__EFFECT));
			if (transientValues.isValueTransient(semanticObject, CarpilotPackage.Literals.PERSISTING_RULE__STOP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CarpilotPackage.Literals.PERSISTING_RULE__STOP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPersistingRuleAccess().getConditionConditionParserRuleCall_0_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getPersistingRuleAccess().getEffectRuleEffectParserRuleCall_2_0(), semanticObject.getEffect());
		feeder.accept(grammarAccess.getPersistingRuleAccess().getStopConditionParserRuleCall_4_0(), semanticObject.getStop());
		feeder.finish();
	}
	
	
}
