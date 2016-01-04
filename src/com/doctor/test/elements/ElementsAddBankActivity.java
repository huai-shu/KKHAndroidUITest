package com.doctor.test.elements;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.robotium.solo.Solo;

/**
 * [添加银行卡]界面
 * @author qpgjk
 *
 */
public class ElementsAddBankActivity {

	private Solo solo;
	private EditText account_id;//银行卡号输入框
	private RelativeLayout selection_bank_layout;//选择发卡银行控件
	private EditText holder_name;//持卡人姓名输入框
	private EditText branch_name;//开户银行输入框
	private Button add;//[添加]控件
	
	public ElementsAddBankActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		account_id = (EditText) solo.getView("account_id");
		selection_bank_layout = (RelativeLayout) solo.getView("selection_bank_layout");
		holder_name = (EditText) solo.getView("holder_name");
		branch_name = (EditText) solo.getView("branch_name");
		add = (Button) solo.getView("add");
	}
	
	/**
	 * 输入银行卡卡号
	 * @param text
	 */
	public void enterAccount_id(String text){
		solo.enterText(account_id, text);
	}
	
	/**
	 * 点击[选择发卡银行]
	 */
	public void clickSelection_bank_layout(){
		solo.clickOnView(selection_bank_layout);
	}
	
	/**
	 * 输入持卡人姓名
	 */
	public void enterHolder_name(String text){
		solo.enterText(holder_name, text);
	}
	
	/**
	 * 输入开户城市
	 * @param text
	 */
	public void enterBranch_name(String text){
		solo.enterText(branch_name, text);
	}
	
	/**
	 * 点击[添加]控件
	 */
	public void clickAdd(){
		solo.clickOnView(add);
	}
}
