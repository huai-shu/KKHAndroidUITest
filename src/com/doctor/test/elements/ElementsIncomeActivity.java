package com.doctor.test.elements;

import android.widget.Button;

import com.robotium.solo.Solo;

/**
 * [收入结算]控件
 * @author qpgjk
 *
 */
public class ElementsIncomeActivity {

	private Solo solo;
	private Button cash_btn;//[提现方式]控件
	
	public ElementsIncomeActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews(){
		cash_btn = (Button) solo.getView("cash_btn");
	}
	
	/**
	 * 点击[提现方式]控件
	 */
	public void clickCash_layout(){
		solo.clickOnView(cash_btn);
	}
}
