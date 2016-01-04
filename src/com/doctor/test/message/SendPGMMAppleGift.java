/**
 * 
 */
package com.doctor.test.message;

import com.doctor.test.BasicTestCase;

/**
 * @author qpgjk
 *
 */
public class SendPGMMAppleGift extends BasicTestCase {

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
	 * 给苹果妹妹送礼物
	 */
	public void testSendPPMMAppleGift() {
		if (uiHelper.getSolo().searchText("苹果妹妹")) {
			uiHelper.getSolo().clickOnText("苹果妹妹");
		} else {
			assertTrue("苹果妹妹没有显示", false);
		}
		uiHelper.getElementsMessageSendActivity().clickInput_attachImageView();
		uiHelper.getElementsMessageSendActivity().clickSend_gift_or_transfer();
		uiHelper.getSolo().clickOnText("×10", 1);
		uiHelper.getSolo().sleep(time);
		if (uiHelper.getSolo().searchText("啊哦，苹果数好像不够了，让患者送您吧~")) {
			assertTrue("苹果数不够导致用例失败", false);
		}else {
			uiHelper.getSolo().clickOnButton("赠送");
		}
		assertTrue("给苹果妹妹送苹果失败", uiHelper.getSolo().searchText("赏你10个苹果"));
	}
}
