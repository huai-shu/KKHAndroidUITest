/**
 * 
 */
package com.doctor.test.message;

import com.doctor.test.BasicTestCase;

/**
 * @author qpgjk
 *
 */
public class SearchPGMM extends BasicTestCase {

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

	public void testSearchPGMM() {
		uiHelper.getElementsMessageActivity().clickOnSearch_btn();
		uiHelper.getElementsSearchMessageActivity().enterEditText("苹果妹妹");
		uiHelper.getSolo().sleep(time);
		if(!(uiHelper.getElementsSearchMessageActivity().getName_show()).equals("苹果妹妹")) {
			assertTrue("搜索苹果妹妹失败", false);
		}
	}
}
