/**
 * 
 */
package com.doctor.test.setting;

import com.doctor.test.BasicTestCase;

/**
 * @author qpgjk
 *
 */
public class Exit extends BasicTestCase {

	/* (non-Javadoc)
	 * @see com.doctor.test.BasicTestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see com.doctor.test.BasicTestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * 退出登录
	 */
	public void testExit() {
		uiHelper.getElementsMessageActivity().clickLabelTextView(4);
		uiHelper.getSolo().clickOnText("更多");
		uiHelper.getElementsMoreActivity().clickBtnLogoffButton();
		uiHelper.getSolo().clickOnButton("确定");
		uiHelper.getSolo().sleep(3000);
		assertEquals("登录", uiHelper.getElementsLoginActivity().getTextTitleTextView());
	}
}
