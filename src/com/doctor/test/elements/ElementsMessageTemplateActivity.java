package com.doctor.test.elements;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 【我的常用语】界面
 * @author qpgjk
 *
 */
public class ElementsMessageTemplateActivity {
	private Solo solo;
	private ImageView leftImageView;
	private Button btn_new_templateButton;
	private TextView right;
	private TextView text;
	
	public ElementsMessageTemplateActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews(){
		solo.sleep(1500);
		leftImageView = (ImageView) solo.getView("left");//返回控件
		btn_new_templateButton = (Button) solo.getView("btn_new_template");//新增常用语控件
	}

	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得新增常用语控件
	 * @return
	 */
	public Button getBtn_new_templateButton(){
		return btn_new_templateButton;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
	
	/**
	 * 点击[新增常用语]控件
	 */
	public void clickBtn_new_templateButton(){
		solo.clickOnView(btn_new_templateButton);
	}
	
	/**
	 * 点击[编辑]控件
	 */
	public void clickRight(){
		right = (TextView) solo.getView("right");
		solo.clickOnView(right);
	}
	
	/**
	 * 获得第一个常用语
	 * @return
	 */
	public String getText(){
		text = (TextView) solo.getView("text", 0);
		return text.getText().toString();
	}
}
