/**
 * 
 */
package com.doctor.test.message;

import com.doctor.test.BasicTestCase;

/**
 * @author qpgjk
 *
 */
public class SendPGMMVoiceMessage extends BasicTestCase {

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
	 * 给苹果妹妹发送语音消息
	 */
	public void testSendPPMMVoiceMessage() {
		int number = (int) (Math.random()*60+1);
		if (uiHelper.getSolo().searchText("苹果妹妹")) {
			uiHelper.getSolo().clickOnText("苹果妹妹");
		} else {
			assertTrue("苹果妹妹没有显示", false);
		}
		uiHelper.getElementsMessageSendActivity().clickInput_recImageView();
		uiHelper.getElementsMessageSendActivity().clickLongSpeakButton(number*1000);
		assertTrue("语音发送失败", uiHelper.getSolo().searchText(number + "",true));
	}

}
