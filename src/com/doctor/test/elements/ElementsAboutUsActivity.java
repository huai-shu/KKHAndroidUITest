package com.doctor.test.elements;

import android.widget.LinearLayout;

import com.robotium.solo.Solo;

/**
 * [关于我们]界面
 * @author qpgjk
 *
 */
public class ElementsAboutUsActivity {

	private Solo solo;
	private LinearLayout legal;//[免责声明]控件
	
	public ElementsAboutUsActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public  void initViews() {
		legal = (LinearLayout) solo.getView("legal");
	}
	
	/**
	 * 点击[免责声明]
	 */
	public void clickLegal(){
		solo.clickOnView(legal);
	}
}
