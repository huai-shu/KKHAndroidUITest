package com.doctor.test.elements;

import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;

/**
 * [调整收费]界面
 * @author qpgjk
 *
 */
public class ElementsChangePriceActivity {

	private Solo solo;
	private EditText fee;//价格输入框
	private Button save;//[确定]控件
	
	public ElementsChangePriceActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		fee = (EditText) solo.getView("fee");
		save = (Button) solo.getView("save");
	}
	
	/**
	 * 清空价格输入框
	 */
	public void clearFee(){
		solo.clearEditText(fee);
	}
	
	/**
	 * 在输入框中输入价格
	 * @param text
	 */
	public void enterFee(String text){
		solo.enterText(fee, text);
	}
	
	/**
	 * 点击[确定]控件
	 */
	public void clickSave(){
		solo.clickOnView(save);
	}
}
