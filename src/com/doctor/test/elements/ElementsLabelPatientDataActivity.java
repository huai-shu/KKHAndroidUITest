package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [患者资料]界面
 * @author qpgjk
 *
 */
public class ElementsLabelPatientDataActivity {

	private Solo solo;
	private TextView titleTextView;
	private ImageView leftImageView;
	
	public ElementsLabelPatientDataActivity(Solo solo){
		this.solo = solo;
		initView();
	}

	 public void initView() {
		 titleTextView = (TextView) solo.getView("title");//[患者资料]界面Title控件
		 leftImageView = (ImageView) solo.getView("left");//返回控件
	}
	 
	 /**
	  * 获得[患者资料]界面Title控件
	  * @return
	  */
	 public TextView getTitleTextView(){
		 return titleTextView;
	 }
	 
	 /**
	  * 获得返回控件
	  * @return
	  */
	 public ImageView getLeftImageView(){
		 return leftImageView;
	 }
	 
	 /**
	  * 获得[患者资料]界面Title文字
	  * @return
	  */
	 public String getTextTitleTextView(){
		 return getTitleTextView().getText().toString();
	 }
	 
	 /**
	  * 点击[返回]控件
	  */
	 public void clickLeftImageView(){
		 solo.clickOnView(leftImageView);
	 }
}


