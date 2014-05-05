/**
 */
package org.openhab.binding.tinkerforge.internal.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Voltage Current Sub Ids</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getVoltageCurrentSubIds()
 * @model
 * @generated
 */
public enum VoltageCurrentSubIds implements Enumerator
{
  /**
   * The '<em><b>VCDEVICEVOLTAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VCDEVICEVOLTAGE_VALUE
   * @generated
   * @ordered
   */
  VCDEVICEVOLTAGE(0, "VCDEVICEVOLTAGE", "VCDEVICEVOLTAGE"),

  /**
   * The '<em><b>VCDEVICECURRENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VCDEVICECURRENT_VALUE
   * @generated
   * @ordered
   */
  VCDEVICECURRENT(0, "VCDEVICECURRENT", "VCDEVICECURRENT"),

  /**
   * The '<em><b>VCDEVICEPOWER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VCDEVICEPOWER_VALUE
   * @generated
   * @ordered
   */
  VCDEVICEPOWER(0, "VCDEVICEPOWER", "VCDEVICEPOWER");

  /**
   * The '<em><b>VCDEVICEVOLTAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VCDEVICEVOLTAGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VCDEVICEVOLTAGE
   * @model
   * @generated
   * @ordered
   */
  public static final int VCDEVICEVOLTAGE_VALUE = 0;

  /**
   * The '<em><b>VCDEVICECURRENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VCDEVICECURRENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VCDEVICECURRENT
   * @model
   * @generated
   * @ordered
   */
  public static final int VCDEVICECURRENT_VALUE = 0;

  /**
   * The '<em><b>VCDEVICEPOWER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VCDEVICEPOWER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VCDEVICEPOWER
   * @model
   * @generated
   * @ordered
   */
  public static final int VCDEVICEPOWER_VALUE = 0;

  /**
   * An array of all the '<em><b>Voltage Current Sub Ids</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final VoltageCurrentSubIds[] VALUES_ARRAY =
    new VoltageCurrentSubIds[]
    {
      VCDEVICEVOLTAGE,
      VCDEVICECURRENT,
      VCDEVICEPOWER,
    };

  /**
   * A public read-only list of all the '<em><b>Voltage Current Sub Ids</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<VoltageCurrentSubIds> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Voltage Current Sub Ids</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VoltageCurrentSubIds get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VoltageCurrentSubIds result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Voltage Current Sub Ids</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VoltageCurrentSubIds getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      VoltageCurrentSubIds result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Voltage Current Sub Ids</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VoltageCurrentSubIds get(int value)
  {
    switch (value)
    {
      case VCDEVICEVOLTAGE_VALUE: return VCDEVICEVOLTAGE;
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
  private VoltageCurrentSubIds(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //VoltageCurrentSubIds
