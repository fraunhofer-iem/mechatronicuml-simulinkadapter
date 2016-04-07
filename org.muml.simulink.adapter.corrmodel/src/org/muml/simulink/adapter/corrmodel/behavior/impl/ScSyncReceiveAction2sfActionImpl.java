/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.core.expressions.TextualExpression;
import org.muml.pim.realtimestatechart.Action;
import org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage;
import org.muml.simulink.adapter.corrmodel.behavior.Behavior_modelPackage;
import org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceiveAction2sfAction;
import org.muml.simulink.adapter.corrmodel.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sc Sync Receive Action2sf Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceiveAction2sfActionImpl#getScAction <em>Sc Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceiveAction2sfActionImpl#getScActionExpr <em>Sc Action Expr</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.impl.ScSyncReceiveAction2sfActionImpl#getSfAction <em>Sf Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScSyncReceiveAction2sfActionImpl extends AbstractContainerCorrespondenceNodeImpl implements ScSyncReceiveAction2sfAction {
	/**
	 * The cached value of the '{@link #getScAction() <em>Sc Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScAction()
	 * @generated
	 * @ordered
	 */
	protected Action scAction;

	/**
	 * The cached value of the '{@link #getScActionExpr() <em>Sc Action Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScActionExpr()
	 * @generated
	 * @ordered
	 */
	protected TextualExpression scActionExpr;

	/**
	 * The cached value of the '{@link #getSfAction() <em>Sf Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfAction()
	 * @generated
	 * @ordered
	 */
	protected org.muml.simulink.stateflow.Action sfAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScSyncReceiveAction2sfActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SC_SYNC_RECEIVE_ACTION2SF_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getScAction() {
		if (scAction != null && scAction.eIsProxy()) {
			InternalEObject oldScAction = (InternalEObject)scAction;
			scAction = (Action)eResolveProxy(oldScAction);
			if (scAction != oldScAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION, oldScAction, scAction));
			}
		}
		return scAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetScAction() {
		return scAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScAction(Action newScAction) {
		Action oldScAction = scAction;
		scAction = newScAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION, oldScAction, scAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualExpression getScActionExpr() {
		if (scActionExpr != null && scActionExpr.eIsProxy()) {
			InternalEObject oldScActionExpr = (InternalEObject)scActionExpr;
			scActionExpr = (TextualExpression)eResolveProxy(oldScActionExpr);
			if (scActionExpr != oldScActionExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION_EXPR, oldScActionExpr, scActionExpr));
			}
		}
		return scActionExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualExpression basicGetScActionExpr() {
		return scActionExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScActionExpr(TextualExpression newScActionExpr) {
		TextualExpression oldScActionExpr = scActionExpr;
		scActionExpr = newScActionExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION_EXPR, oldScActionExpr, scActionExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.simulink.stateflow.Action getSfAction() {
		if (sfAction != null && ((EObject)sfAction).eIsProxy()) {
			InternalEObject oldSfAction = (InternalEObject)sfAction;
			sfAction = (org.muml.simulink.stateflow.Action)eResolveProxy(oldSfAction);
			if (sfAction != oldSfAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SF_ACTION, oldSfAction, sfAction));
			}
		}
		return sfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.simulink.stateflow.Action basicGetSfAction() {
		return sfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfAction(org.muml.simulink.stateflow.Action newSfAction) {
		org.muml.simulink.stateflow.Action oldSfAction = sfAction;
		sfAction = newSfAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SF_ACTION, oldSfAction, sfAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION:
				if (resolve) return getScAction();
				return basicGetScAction();
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION_EXPR:
				if (resolve) return getScActionExpr();
				return basicGetScActionExpr();
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SF_ACTION:
				if (resolve) return getSfAction();
				return basicGetSfAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION:
				setScAction((Action)newValue);
				return;
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION_EXPR:
				setScActionExpr((TextualExpression)newValue);
				return;
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SF_ACTION:
				setSfAction((org.muml.simulink.stateflow.Action)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION:
				setScAction((Action)null);
				return;
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION_EXPR:
				setScActionExpr((TextualExpression)null);
				return;
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SF_ACTION:
				setSfAction((org.muml.simulink.stateflow.Action)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION:
				return scAction != null;
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SC_ACTION_EXPR:
				return scActionExpr != null;
			case BehaviorPackage.SC_SYNC_RECEIVE_ACTION2SF_ACTION__SF_ACTION:
				return sfAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ScSyncReceiveAction2sfActionImpl
