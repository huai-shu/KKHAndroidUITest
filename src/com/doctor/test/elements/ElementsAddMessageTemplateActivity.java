package com.doctor.test.elements;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 新增常用语界面
 * @author qpgjk
 *
 */
public class ElementsAddMessageTemplateActivity {
 
	private Solo solo;
	private ImageView leftImageView;//返回控件
	private EditText editEditText;//常用语输入框
	private TextView rightTextView;//确定控件
	
	public ElementsAddMessageTemplateActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews(){
		leftImageView = (ImageView) solo.getView("left");//返回控件
		editEditText = (EditText) solo.getView("edit");//常用语输入框
		rightTextView = (TextView) solo.getView("right");//确定控件
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得常用语输入框
	 * @return
	 */
	public EditText getEditEditText(){
		return editEditText;
	}
	
	/**
	 * 获得确定控件
	 * @return
	 */
	public TextView getRightTextView(){
		return rightTextView;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
	
	/**
	 * 输入常用语内容
	 * @param text
	 */
	public void EnterEditEditText(String text){
		solo.enterText((EditText) solo.getView("edit"), text);
	}
	
	/**
	 * 点击确定控件
	 */
	public void clickRightTextView(){
		solo.clickOnView(solo.getView("right"));
	}
	
	/**
	 * 清空常用语输入框
	 */
	public void clearEditEditText(){
		solo.clearEditText((EditText) solo.getView("edit"));
	}
}
