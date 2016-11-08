/**
 */
package com.debs.model.event.debsEvent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.debs.model.event.debsEvent.Post#getPostId <em>Post Id</em>}</li>
 *   <li>{@link com.debs.model.event.debsEvent.Post#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @see com.debs.model.event.debsEvent.DebsEventPackage#getPost()
 * @model
 * @generated
 */
public interface Post extends Event {
	/**
	 * Returns the value of the '<em><b>Post Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Id</em>' attribute.
	 * @see #setPostId(long)
	 * @see com.debs.model.event.debsEvent.DebsEventPackage#getPost_PostId()
	 * @model
	 * @generated
	 */
	long getPostId();

	/**
	 * Sets the value of the '{@link com.debs.model.event.debsEvent.Post#getPostId <em>Post Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Id</em>' attribute.
	 * @see #getPostId()
	 * @generated
	 */
	void setPostId(long value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' attribute.
	 * @see #setPost(String)
	 * @see com.debs.model.event.debsEvent.DebsEventPackage#getPost_Post()
	 * @model
	 * @generated
	 */
	String getPost();

	/**
	 * Sets the value of the '{@link com.debs.model.event.debsEvent.Post#getPost <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' attribute.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(String value);

} // Post
