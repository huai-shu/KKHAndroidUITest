/**
 * 
 */
package com.doctor.test.message;

import com.doctor.test.BasicTestCase;

/**
 * @author qpgjk
 *
 */
public class SendPGMMTextMessage extends BasicTestCase {

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
	 * 给苹果妹妹发送文本消息
	 */
	public void testSendPPMMTextMessage() {
		Double number = Math.random();
		if (uiHelper.getSolo().searchText("苹果妹妹")) {
			uiHelper.getSolo().clickOnText("苹果妹妹");
		} else {
			assertTrue("苹果妹妹没有显示", false);
		}
		uiHelper.getElementsMessageSendActivity().EnterPostTextEditText("这是一段发给苹果妹妹的测试内容，测试文本消息是否发送成功" + number);
		uiHelper.getElementsMessageSendActivity().clickBtnSendButton();
		assertTrue("消息发送失败", uiHelper.getSolo().searchText("这是一段发给苹果妹妹的测试内容，测试文本消息是否发送成功" + number));
	}
}
