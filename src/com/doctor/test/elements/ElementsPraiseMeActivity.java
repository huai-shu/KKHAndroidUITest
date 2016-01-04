package com.doctor.test.elements;

import android.widget.TextView;

import com.robotium.solo.Solo;

public class ElementsPraiseMeActivity {

	private Solo solo;
	private TextView right;//[我赞过的]控件
	
	public ElementsPraiseMeActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		right = (TextView) solo.getView("right");
	}
	
	/**
	 * 点击[我赞过的]控件
	 */
	public void clickRight(){
		solo.clickOnView(right);
	}
}
