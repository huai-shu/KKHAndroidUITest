package com.doctor.test.elements;

import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 【群发】界面
 * @author qpgjk
 *
 */
public class ElementsGroupActivity {

	private Solo solo;
	private TextView add_broadcast_show;//[新建群发]控件
	
	public ElementsGroupActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	/**
	 * 初始化
	 * @Method:initViews
	 * @Parameter type:ElementsGroupSendActivity
	 * @Return:void
	 */
	public void initViews(){
		add_broadcast_show = (TextView) solo.getView("add_broadcast_show");
	}
	
	/**
	 * 点击[新建群发]控件
	 */
	public void clickAdd_broadcast_show(){
		solo.clickOnView(add_broadcast_show);
	}
}
