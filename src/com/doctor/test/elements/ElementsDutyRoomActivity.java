package com.doctor.test.elements;

import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [值班室]界面
 * @author qpgjk
 *
 */
public class ElementsDutyRoomActivity {

	private Solo solo;
	private TextView duty_status_show;//值班控件
	private TextView question_desc;//问题内容
	private TextView right;//[抢到的问题]控件
	
	public ElementsDutyRoomActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		duty_status_show = (TextView) solo.getView("duty_status_show");
		question_desc = (TextView) solo.getView("question_desc");
		right = (TextView) solo.getView("right");
	}
	
	/**
	 * 点击[值班]控件
	 */
	public void clickDuty_status_show(){
		solo.clickOnView(duty_status_show);
	}

	
	/**
	 * 获得问题内容
	 * @return
	 */
	public String getQuestion_desc(){
		return question_desc.getText().toString();
	}
	
	/**
	 * 点击[抢到的问题]控件
	 */
	public void clickRight(){
		solo.clickOnView(right);
	}
}
