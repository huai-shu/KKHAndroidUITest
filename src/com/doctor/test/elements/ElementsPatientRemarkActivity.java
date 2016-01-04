package com.doctor.test.elements;

import android.widget.EditText;
import android.widget.ImageView;

import com.robotium.solo.Solo;

/**
 * 患者备注界面
 * @author qpgjk
 *
 */
public class ElementsPatientRemarkActivity {
	
	private Solo solo;
	private EditText editEditText;
	private ImageView leftImageView;
	
	public ElementsPatientRemarkActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		editEditText = (EditText) solo.getView("edit");//患者备注输入框
		leftImageView = (ImageView) solo.getView("left");//返回控件
	}

	/**
	 * 获得患者备注输入框
	 * @return
	 */
	public EditText getEditEditText(){
		return editEditText;
	}
	
	/**
	 * 输入备注内容
	 * @param text
	 */
	public void enterEditEditText(String text){
		solo.enterText(editEditText, text);
	}
	
	/**
	 * 清空备注内容
	 */
	public void clearEditEditText(){
		solo.clearEditText(editEditText);
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getImageView(){
		return leftImageView;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
}
