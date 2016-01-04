package com.doctor.test.elements;

import android.widget.EditText;
import android.widget.ImageView;

import com.robotium.solo.Solo;

/**
 * 专长界面
 * @author qpgjk
 *
 */
public class ElementsFeatureActivity {
	
	private Solo solo;
	private ImageView leftImageView; 
	private EditText editEditText;
	
	public ElementsFeatureActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews(){
		leftImageView = (ImageView) solo.getView("left");//返回控件
		editEditText = (EditText) solo.getView("edit");//专长输入框
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得专长输入框
	 * @return
	 */
	public EditText getEditEditText(){
		return editEditText;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
	
	/**
	 * 清空专长输入框
	 */
	public void clearEditEditText(){
		solo.clearEditText(editEditText);
	}
	
	/**
	 * 输入专长内容
	 * @param text
	 */
	public void enterEditEditText(String text){
		solo.enterText(editEditText, text);
	}
}
