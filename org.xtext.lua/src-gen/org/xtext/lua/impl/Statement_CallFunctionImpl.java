/**
 */
package org.xtext.lua.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.lua.Expression;
import org.xtext.lua.Functioncall_Arguments;
import org.xtext.lua.LuaPackage;
import org.xtext.lua.Statement_CallFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Call Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lua.impl.Statement_CallFunctionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.xtext.lua.impl.Statement_CallFunctionImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Statement_CallFunctionImpl extends Statement_FunctioncallOrAssignmentImpl implements Statement_CallFunction
{
  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected Expression object;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected Functioncall_Arguments arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Statement_CallFunctionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LuaPackage.Literals.STATEMENT_CALL_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObject(Expression newObject, NotificationChain msgs)
  {
    Expression oldObject = object;
    object = newObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LuaPackage.STATEMENT_CALL_FUNCTION__OBJECT, oldObject, newObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(Expression newObject)
  {
    if (newObject != object)
    {
      NotificationChain msgs = null;
      if (object != null)
        msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LuaPackage.STATEMENT_CALL_FUNCTION__OBJECT, null, msgs);
      if (newObject != null)
        msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LuaPackage.STATEMENT_CALL_FUNCTION__OBJECT, null, msgs);
      msgs = basicSetObject(newObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuaPackage.STATEMENT_CALL_FUNCTION__OBJECT, newObject, newObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functioncall_Arguments getArguments()
  {
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArguments(Functioncall_Arguments newArguments, NotificationChain msgs)
  {
    Functioncall_Arguments oldArguments = arguments;
    arguments = newArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LuaPackage.STATEMENT_CALL_FUNCTION__ARGUMENTS, oldArguments, newArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArguments(Functioncall_Arguments newArguments)
  {
    if (newArguments != arguments)
    {
      NotificationChain msgs = null;
      if (arguments != null)
        msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LuaPackage.STATEMENT_CALL_FUNCTION__ARGUMENTS, null, msgs);
      if (newArguments != null)
        msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LuaPackage.STATEMENT_CALL_FUNCTION__ARGUMENTS, null, msgs);
      msgs = basicSetArguments(newArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuaPackage.STATEMENT_CALL_FUNCTION__ARGUMENTS, newArguments, newArguments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LuaPackage.STATEMENT_CALL_FUNCTION__OBJECT:
        return basicSetObject(null, msgs);
      case LuaPackage.STATEMENT_CALL_FUNCTION__ARGUMENTS:
        return basicSetArguments(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LuaPackage.STATEMENT_CALL_FUNCTION__OBJECT:
        return getObject();
      case LuaPackage.STATEMENT_CALL_FUNCTION__ARGUMENTS:
        return getArguments();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LuaPackage.STATEMENT_CALL_FUNCTION__OBJECT:
        setObject((Expression)newValue);
        return;
      case LuaPackage.STATEMENT_CALL_FUNCTION__ARGUMENTS:
        setArguments((Functioncall_Arguments)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LuaPackage.STATEMENT_CALL_FUNCTION__OBJECT:
        setObject((Expression)null);
        return;
      case LuaPackage.STATEMENT_CALL_FUNCTION__ARGUMENTS:
        setArguments((Functioncall_Arguments)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LuaPackage.STATEMENT_CALL_FUNCTION__OBJECT:
        return object != null;
      case LuaPackage.STATEMENT_CALL_FUNCTION__ARGUMENTS:
        return arguments != null;
    }
    return super.eIsSet(featureID);
  }

} //Statement_CallFunctionImpl
