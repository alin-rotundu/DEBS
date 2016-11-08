/**
 */
package com.debs.model.event.debsEvent.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.debs.model.event.debsEvent.Comment;
import com.debs.model.event.debsEvent.DebsEventPackage;
import com.debs.model.event.debsEvent.Post;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.debs.model.event.debsEvent.impl.CommentImpl#getCommentId <em>Comment Id</em>}</li>
 *   <li>{@link com.debs.model.event.debsEvent.impl.CommentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.debs.model.event.debsEvent.impl.CommentImpl#getCommentReplied <em>Comment Replied</em>}</li>
 *   <li>{@link com.debs.model.event.debsEvent.impl.CommentImpl#getPostCommented <em>Post Commented</em>}</li>
 *   <li>{@link com.debs.model.event.debsEvent.impl.CommentImpl#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends EventImpl implements Comment {
	/**
	 * The default value of the '{@link #getCommentId() <em>Comment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentId()
	 * @generated
	 * @ordered
	 */
	protected static final long COMMENT_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCommentId() <em>Comment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentId()
	 * @generated
	 * @ordered
	 */
	protected long commentId = COMMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentReplied() <em>Comment Replied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentReplied()
	 * @generated
	 * @ordered
	 */
	protected static final long COMMENT_REPLIED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCommentReplied() <em>Comment Replied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentReplied()
	 * @generated
	 * @ordered
	 */
	protected long commentReplied = COMMENT_REPLIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostCommented() <em>Post Commented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCommented()
	 * @generated
	 * @ordered
	 */
	protected static final long POST_COMMENTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPostCommented() <em>Post Commented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCommented()
	 * @generated
	 * @ordered
	 */
	protected long postCommented = POST_COMMENTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected Post post;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DebsEventPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCommentId() {
		return commentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentId(long newCommentId) {
		long oldCommentId = commentId;
		commentId = newCommentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DebsEventPackage.COMMENT__COMMENT_ID, oldCommentId, commentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DebsEventPackage.COMMENT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCommentReplied() {
		return commentReplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentReplied(long newCommentReplied) {
		long oldCommentReplied = commentReplied;
		commentReplied = newCommentReplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DebsEventPackage.COMMENT__COMMENT_REPLIED, oldCommentReplied, commentReplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPostCommented() {
		return postCommented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCommented(long newPostCommented) {
		long oldPostCommented = postCommented;
		postCommented = newPostCommented;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DebsEventPackage.COMMENT__POST_COMMENTED, oldPostCommented, postCommented));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post getPost() {
		if (post != null && post.eIsProxy()) {
			InternalEObject oldPost = (InternalEObject)post;
			post = (Post)eResolveProxy(oldPost);
			if (post != oldPost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DebsEventPackage.COMMENT__POST, oldPost, post));
			}
		}
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post basicGetPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(Post newPost) {
		Post oldPost = post;
		post = newPost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DebsEventPackage.COMMENT__POST, oldPost, post));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DebsEventPackage.COMMENT__COMMENT_ID:
				return new Long(getCommentId());
			case DebsEventPackage.COMMENT__COMMENT:
				return getComment();
			case DebsEventPackage.COMMENT__COMMENT_REPLIED:
				return new Long(getCommentReplied());
			case DebsEventPackage.COMMENT__POST_COMMENTED:
				return new Long(getPostCommented());
			case DebsEventPackage.COMMENT__POST:
				if (resolve) return getPost();
				return basicGetPost();
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
			case DebsEventPackage.COMMENT__COMMENT_ID:
				setCommentId(((Long)newValue).longValue());
				return;
			case DebsEventPackage.COMMENT__COMMENT:
				setComment((String)newValue);
				return;
			case DebsEventPackage.COMMENT__COMMENT_REPLIED:
				setCommentReplied(((Long)newValue).longValue());
				return;
			case DebsEventPackage.COMMENT__POST_COMMENTED:
				setPostCommented(((Long)newValue).longValue());
				return;
			case DebsEventPackage.COMMENT__POST:
				setPost((Post)newValue);
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
			case DebsEventPackage.COMMENT__COMMENT_ID:
				setCommentId(COMMENT_ID_EDEFAULT);
				return;
			case DebsEventPackage.COMMENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DebsEventPackage.COMMENT__COMMENT_REPLIED:
				setCommentReplied(COMMENT_REPLIED_EDEFAULT);
				return;
			case DebsEventPackage.COMMENT__POST_COMMENTED:
				setPostCommented(POST_COMMENTED_EDEFAULT);
				return;
			case DebsEventPackage.COMMENT__POST:
				setPost((Post)null);
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
			case DebsEventPackage.COMMENT__COMMENT_ID:
				return commentId != COMMENT_ID_EDEFAULT;
			case DebsEventPackage.COMMENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case DebsEventPackage.COMMENT__COMMENT_REPLIED:
				return commentReplied != COMMENT_REPLIED_EDEFAULT;
			case DebsEventPackage.COMMENT__POST_COMMENTED:
				return postCommented != POST_COMMENTED_EDEFAULT;
			case DebsEventPackage.COMMENT__POST:
				return post != null;
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
		result.append(" (commentId: ");
		result.append(commentId);
		result.append(", comment: ");
		result.append(comment);
		result.append(", commentReplied: ");
		result.append(commentReplied);
		result.append(", postCommented: ");
		result.append(postCommented);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
