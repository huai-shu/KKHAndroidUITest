package com.doctor.test.elements;

import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;

/**
 * [添加支付宝]界面
 * @author qpgjk
 *
 */
public class ElementsAlipayActivity {

	private Solo solo;
	private EditText account_id;//支付宝[账号]输入框
	private Button add;//[添加]控件
	
	public ElementsAlipayActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		account_id = (EditText) solo.getView("account_id");
		add = (Button) solo.getView("add");
	}
	
	/**
	 * 输入支付宝账号
	 * @param text
	 */
	public void enterRaccount_id(String text){
		solo.enterText(account_id, text);
	}
	
	/**
	 * 点击[添加]控件
	 */
	public void clickAdd(){
		solo.clickOnView(add);
	}
}
