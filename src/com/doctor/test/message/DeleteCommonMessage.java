/**
 * 
 */
package com.doctor.test.message;

import com.doctor.test.BasicTestCase;

/**
 * @author qpgjk
 *
 */
public class DeleteCommonMessage extends BasicTestCase {

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
	 * 删除常用语
	 */
	public void testDeleteCommonMessage() {
		if (uiHelper.getSolo().searchText("苹果妹妹")) {
			uiHelper.getSolo().clickOnText("苹果妹妹");
		} else {
			assertTrue("苹果妹妹没有显示", false);
		}
		uiHelper.getElementsMessageSendActivity().clickInput_attachImageView();
		uiHelper.getElementsMessageSendActivity().clickMore_templateTextView();
		String text = uiHelper.getElementsMessageTemplateActivity().getText();
		uiHelper.getSolo().clickLongInList(0);
		uiHelper.getSolo().clickOnText("删除");
		assertFalse("删除常用语失败", uiHelper.getSolo().searchText(text));
	}
}
