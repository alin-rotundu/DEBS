/**
 */
package com.debs.model.event.debsEvent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.debs.model.event.debsEvent.Comment#getCommentId <em>Comment Id</em>}</li>
 *   <li>{@link com.debs.model.event.debsEvent.Comment#getComment <em>Comment</em>}</li>
 *   <li>{@link com.debs.model.event.debsEvent.Comment#getCommentReplied <em>Comment Replied</em>}</li>
 *   <li>{@link com.debs.model.event.debsEvent.Comment#getPostCommented <em>Post Commented</em>}</li>
 *   <li>{@link com.debs.model.event.debsEvent.Comment#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @see com.debs.model.event.debsEvent.DebsEventPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Event {
	/**
	 * Returns the value of the '<em><b>Comment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Id</em>' attribute.
	 * @see #setCommentId(long)
	 * @see com.debs.model.event.debsEvent.DebsEventPackage#getComment_CommentId()
	 * @model
	 * @generated
	 */
	long getCommentId();

	/**
	 * Sets the value of the '{@link com.debs.model.event.debsEvent.Comment#getCommentId <em>Comment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Id</em>' attribute.
	 * @see #getCommentId()
	 * @generated
	 */
	void setCommentId(long value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see com.debs.model.event.debsEvent.DebsEventPackage#getComment_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link com.debs.model.event.debsEvent.Comment#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Comment Replied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Replied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Replied</em>' attribute.
	 * @see #setCommentReplied(long)
	 * @see com.debs.model.event.debsEvent.DebsEventPackage#getComment_CommentReplied()
	 * @model
	 * @generated
	 */
	long getCommentReplied();

	/**
	 * Sets the value of the '{@link com.debs.model.event.debsEvent.Comment#getCommentReplied <em>Comment Replied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Replied</em>' attribute.
	 * @see #getCommentReplied()
	 * @generated
	 */
	void setCommentReplied(long value);

	/**
	 * Returns the value of the '<em><b>Post Commented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Commented</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Commented</em>' attribute.
	 * @see #setPostCommented(long)
	 * @see com.debs.model.event.debsEvent.DebsEventPackage#getComment_PostCommented()
	 * @model
	 * @generated
	 */
	long getPostCommented();

	/**
	 * Sets the value of the '{@link com.debs.model.event.debsEvent.Comment#getPostCommented <em>Post Commented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Commented</em>' attribute.
	 * @see #getPostCommented()
	 * @generated
	 */
	void setPostCommented(long value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' reference.
	 * @see #setPost(Post)
	 * @see com.debs.model.event.debsEvent.DebsEventPackage#getComment_Post()
	 * @model
	 * @generated
	 */
	Post getPost();

	/**
	 * Sets the value of the '{@link com.debs.model.event.debsEvent.Comment#getPost <em>Post</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(Post value);

} // Comment
