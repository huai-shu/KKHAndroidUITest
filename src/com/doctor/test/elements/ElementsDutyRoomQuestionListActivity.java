package com.doctor.test.elements;

import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [值班室]抢到的问题界面
 * @author qpgjk
 *
 */
public class ElementsDutyRoomQuestionListActivity {

	private Solo solo;
	private TextView msg_show;//问题内容
	
	public ElementsDutyRoomQuestionListActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		msg_show = (TextView) solo.getView("msg_show");
	}
	
	/**
	 * 点击问题
	 */
	public void clickMsg_show(){
		solo.clickOnView(msg_show);
	}
}
