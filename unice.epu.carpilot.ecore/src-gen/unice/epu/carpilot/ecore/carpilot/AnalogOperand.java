/**
 */
package unice.epu.carpilot.ecore.carpilot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Analog Operand</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getAnalogOperand()
 * @model
 * @generated
 */
public enum AnalogOperand implements Enumerator {
	/**
	 * The '<em><b>Greater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(0, "greater", "greater"),

	/**
	 * The '<em><b>Greater Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_EQUALS(1, "greaterEquals", "greaterEquals"),

	/**
	 * The '<em><b>Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS(2, "equals", "equals"),

	/**
	 * The '<em><b>Notequals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTEQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	NOTEQUALS(4, "notequals", "notequals"),

	/**
	 * The '<em><b>Lower Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_EQUALS(4, "lowerEquals", "lowerEquals"),

	/**
	 * The '<em><b>Lower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER(5, "lower", "lower");

	/**
	 * The '<em><b>Greater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model name="greater"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 0;

	/**
	 * The '<em><b>Greater Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_EQUALS
	 * @model name="greaterEquals"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_EQUALS_VALUE = 1;

	/**
	 * The '<em><b>Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUALS
	 * @model name="equals"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_VALUE = 2;

	/**
	 * The '<em><b>Notequals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Notequals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTEQUALS
	 * @model name="notequals"
	 * @generated
	 * @ordered
	 */
	public static final int NOTEQUALS_VALUE = 4;

	/**
	 * The '<em><b>Lower Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lower Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_EQUALS
	 * @model name="lowerEquals"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_EQUALS_VALUE = 4;

	/**
	 * The '<em><b>Lower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lower</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER
	 * @model name="lower"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Analog Operand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AnalogOperand[] VALUES_ARRAY = new AnalogOperand[] { GREATER, GREATER_EQUALS, EQUALS,
			NOTEQUALS, LOWER_EQUALS, LOWER, };

	/**
	 * A public read-only list of all the '<em><b>Analog Operand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AnalogOperand> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Analog Operand</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AnalogOperand get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnalogOperand result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Analog Operand</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AnalogOperand getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AnalogOperand result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Analog Operand</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AnalogOperand get(int value) {
		switch (value) {
		case GREATER_VALUE:
			return GREATER;
		case GREATER_EQUALS_VALUE:
			return GREATER_EQUALS;
		case EQUALS_VALUE:
			return EQUALS;
		case NOTEQUALS_VALUE:
			return NOTEQUALS;
		case LOWER_VALUE:
			return LOWER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AnalogOperand(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //AnalogOperand
