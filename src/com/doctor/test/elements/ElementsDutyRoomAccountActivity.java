package com.doctor.test.elements;

import android.widget.Button;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [值班室]账单
 * @author qpgjk
 *
 */
public class ElementsDutyRoomAccountActivity {

	private Solo solo;
	private Button i_know;//[知道了]控件
	private TextView questions_num_show;//[问题回复]个数
	
	public ElementsDutyRoomAccountActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		i_know = (Button) solo.getView("i_know");
		questions_num_show = (TextView) solo.getView("questions_num_show");
	}
	
	/**
	 * 点击[知道了]控件
	 */
	public void clickI_know(){
		solo.clickOnView(i_know);
	}
	
	/**
	 * 获得回答问题个数
	 * @return
	 */
	public String getQuestions_num_show(){
		return questions_num_show.getText().toString();
	}
}
