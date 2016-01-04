package com.doctor.test.elements;

import android.widget.LinearLayout;

import com.robotium.solo.Solo;

/**
 * [患者黑名单]界面
 * @author qpgjk
 *
 */
public class ElementsBlockedPatientsActivity {

	private Solo solo;
	
	public ElementsBlockedPatientsActivity(Solo solo){
		this.solo = solo;
	}

	/**
	 * 点击黑名单患者
	 * @param index
	 */
	public void clickLinearLayout(int index){
		solo.clickOnView(solo.getView(LinearLayout.class, index));
	}
}
