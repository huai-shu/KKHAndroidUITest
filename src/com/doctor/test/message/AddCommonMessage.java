/**
 * 
 */
package com.doctor.test.message;

import com.doctor.test.BasicTestCase;

/**
 * @author qpgjk
 *
 */
public class AddCommonMessage extends BasicTestCase {

	/* (non-Javadoc)
	 * @see com.doctor.test.BasicTestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see com.doctor.test.BasicTestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * 新增常用语
	 */
	public void testAddCommonMessage() {
		Double number = Math.random();
		if (uiHelper.getSolo().searchText("苹果妹妹")) {
			uiHelper.getSolo().clickOnText("苹果妹妹");
		} else {
			assertTrue("苹果妹妹没有显示", false);
		}
		uiHelper.getElementsMessageSendActivity().clickInput_attachImageView();
		uiHelper.getElementsMessageSendActivity().clickMore_templateTextView();
		uiHelper.getElementsMessageTemplateActivity().clickBtn_new_templateButton();
		uiHelper.getElementsAddMessageTemplateActivity().EnterEditEditText("这是一条测试的常用语" + number);
		uiHelper.getElementsAddMessageTemplateActivity().clickRightTextView();
		assertTrue("新增常用语失败", uiHelper.getSolo().searchText("这是一条测试的常用语" + number));
	}
}
