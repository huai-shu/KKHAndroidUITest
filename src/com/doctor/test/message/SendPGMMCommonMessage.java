/**
 * 
 */
package com.doctor.test.message;

import com.doctor.test.BasicTestCase;

/**
 * @author qpgjk
 *
 */
public class SendPGMMCommonMessage extends BasicTestCase {

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
	 * 给患者发常用语
	 */
	public void testSendPPMMCommonMessage() {
		if (uiHelper.getSolo().searchText("苹果妹妹")) {
			uiHelper.getSolo().clickOnText("苹果妹妹");
		} else {
			assertTrue("苹果妹妹没有显示", false);
		}
		uiHelper.getElementsMessageSendActivity().clickInput_attachImageView();
		uiHelper.getElementsMessageSendActivity().clickMore_templateTextView();
		String text = uiHelper.getElementsMessageTemplateActivity().getText();
		uiHelper.getSolo().clickInList(0);
		uiHelper.getElementsMessageSendActivity().clickBtnSendButton();
		assertTrue("发送常用语失败", uiHelper.getSolo().searchText(text));
	}
}
