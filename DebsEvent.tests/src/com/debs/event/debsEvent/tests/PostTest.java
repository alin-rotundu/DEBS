/**
 */
package com.debs.event.debsEvent.tests;

import com.debs.event.debsEvent.DebsEventFactory;
import com.debs.event.debsEvent.Post;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PostTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PostTest.class);
	}

	/**
	 * Constructs a new Post test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Post test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Post getFixture() {
		return (Post)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(DebsEventFactory.eINSTANCE.createPost());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PostTest
