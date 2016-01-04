/**
 * 
 */
package com.doctor.test.login;

import com.doctor.test.BasicTestCase;

/**
 * @author qpgjk
 *
 */
public class LoginSucceed extends BasicTestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * 登录成功
	 */
	public void testLoginSucceed() {
		uiHelper.getElementsLoginActivity().enterNameEditText(phoneString);
		uiHelper.getElementsLoginActivity().enterPasswordEditText(passwordString);
		uiHelper.getElementsLoginActivity().clickonLoginButton();
		uiHelper.getSolo().sleep(time);
		if(uiHelper.getSolo().searchText("以后再说")) {
			uiHelper.getSolo().clickOnText("以后再说");
		}
		if (uiHelper.getSolo().searchButton("进入APP")) {
			uiHelper.getSolo().clickOnButton("进入APP");
		}
		if(!uiHelper.getSolo().searchText("消息")){
			uiHelper.getElementsAnnouncementActivity().clickDismiss();
		}
		assertTrue("登录失败！", uiHelper.getSolo().searchText("^消息$"));
	}

}
