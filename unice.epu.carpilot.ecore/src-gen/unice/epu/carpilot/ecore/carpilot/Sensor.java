/**
 */
package unice.epu.carpilot.ecore.carpilot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getSensor()
 * @model
 * @generated
 */
public enum Sensor implements Enumerator {
	/**
	 * The '<em><b>Front</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	FRONT(0, "front", "front"),

	/**
	 * The '<em><b>Distance left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_LEFT(1, "distance_left", "distance_left"),

	/**
	 * The '<em><b>Distance right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_RIGHT(2, "distance_right", "distance_right");

	/**
	 * The '<em><b>Front</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Front</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRONT
	 * @model name="front"
	 * @generated
	 * @ordered
	 */
	public static final int FRONT_VALUE = 0;

	/**
	 * The '<em><b>Distance left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distance left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_LEFT
	 * @model name="distance_left"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_LEFT_VALUE = 1;

	/**
	 * The '<em><b>Distance right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distance right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_RIGHT
	 * @model name="distance_right"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_RIGHT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sensor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Sensor[] VALUES_ARRAY = new Sensor[] { FRONT, DISTANCE_LEFT, DISTANCE_RIGHT, };

	/**
	 * A public read-only list of all the '<em><b>Sensor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Sensor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sensor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sensor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sensor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sensor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sensor get(int value) {
		switch (value) {
		case FRONT_VALUE:
			return FRONT;
		case DISTANCE_LEFT_VALUE:
			return DISTANCE_LEFT;
		case DISTANCE_RIGHT_VALUE:
			return DISTANCE_RIGHT;
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
	private Sensor(int value, String name, String literal) {
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

} //Sensor
