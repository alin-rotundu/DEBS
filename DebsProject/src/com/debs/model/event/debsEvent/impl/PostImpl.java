/**
 */
package com.debs.model.event.debsEvent.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.debs.model.event.debsEvent.DebsEventPackage;
import com.debs.model.event.debsEvent.Post;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.debs.model.event.debsEvent.impl.PostImpl#getPostId <em>Post Id</em>}</li>
 *   <li>{@link com.debs.model.event.debsEvent.impl.PostImpl#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostImpl extends EventImpl implements Post {
	/**
	 * The default value of the '{@link #getPostId() <em>Post Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostId()
	 * @generated
	 * @ordered
	 */
	protected static final long POST_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPostId() <em>Post Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostId()
	 * @generated
	 * @ordered
	 */
	protected long postId = POST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPost() <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected String post = POST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DebsEventPackage.Literals.POST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPostId() {
		return postId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostId(long newPostId) {
		long oldPostId = postId;
		postId = newPostId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DebsEventPackage.POST__POST_ID, oldPostId, postId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(String newPost) {
		String oldPost = post;
		post = newPost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DebsEventPackage.POST__POST, oldPost, post));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DebsEventPackage.POST__POST_ID:
				return new Long(getPostId());
			case DebsEventPackage.POST__POST:
				return getPost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DebsEventPackage.POST__POST_ID:
				setPostId(((Long)newValue).longValue());
				return;
			case DebsEventPackage.POST__POST:
				setPost((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case DebsEventPackage.POST__POST_ID:
				setPostId(POST_ID_EDEFAULT);
				return;
			case DebsEventPackage.POST__POST:
				setPost(POST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DebsEventPackage.POST__POST_ID:
				return postId != POST_ID_EDEFAULT;
			case DebsEventPackage.POST__POST:
				return POST_EDEFAULT == null ? post != null : !POST_EDEFAULT.equals(post);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (postId: ");
		result.append(postId);
		result.append(", post: ");
		result.append(post);
		result.append(')');
		return result.toString();
	}

} //PostImpl
