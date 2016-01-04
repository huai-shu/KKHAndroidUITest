package com.doctor.test.elements;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 新建标签界面/编辑标签名字界面
 * @author qpgjk
 *
 */
public class ElementsAddPatientLabelActivity {
	
	private Solo solo;
	private ImageView leftImageView; 
	private EditText tag_editEditText;
	private TextView rightTextView;
	
	public ElementsAddPatientLabelActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		leftImageView = (ImageView) solo.getView("left");//返回控件
		tag_editEditText = (EditText) solo.getView("tag_edit");//标签输入框
		rightTextView = (TextView) solo.getView("right");//确定控件
	}

	/**
	 * 获得返回控件
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得标签输入框
	 * @return
	 */
	public EditText getTag_editEditText(){
		return tag_editEditText;
	}
	
	/**
	 * 获得[确定]控件
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
	 * 输入标签名称
	 * @param text
	 */
	public void enterTag_editEditText(String text){
		solo.enterText(tag_editEditText, text);
	}
	
	/**
	 * 清除标签输入框内容
	 */
	public void clearTag_editEditText(){
		solo.clearEditText(tag_editEditText);
	}
	
	/**
	 * 点击[确定]控件
	 */
	public void clickRightTextView(){
		solo.clickOnView(rightTextView);
	}
	
}
