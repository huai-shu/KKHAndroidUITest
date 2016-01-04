package com.doctor.test.elements;

import android.widget.Button;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [值班室]问题池界面
 * @author qpgjk
 *
 */
public class ElementsDutyRoomQuestionPondActivity {

	private Solo solo;
	private TextView grab_show;//[抢]控件
	private Button dutyroom_off_work_btn;//[下班啦！]控件
	
	public ElementsDutyRoomQuestionPondActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		grab_show = (TextView) solo.getView("grab_show");
		dutyroom_off_work_btn = (Button) solo.getView("dutyroom_off_work_btn");
	}
	
	/**
	 * 点击[抢]控件
	 */
	public void clickGrab_show(){
		solo.clickOnView(grab_show);
	}
	
	/**
	 * 点击[下班啦！]
	 */
	public void clickDutyroom_off_work_btn(){
		solo.clickOnView(dutyroom_off_work_btn);
	}
}

