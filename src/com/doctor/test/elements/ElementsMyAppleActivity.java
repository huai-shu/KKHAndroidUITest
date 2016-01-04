package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class ElementsMyAppleActivity {

	private Solo solo;
	private TextView titleTextView;
	private RelativeLayout next_level_layoutRelativeLayout;
	private ImageView leftImageView;
	
	public ElementsMyAppleActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		titleTextView = (TextView) solo.getView("title");//[我的苹果]界面Title控件
		next_level_layoutRelativeLayout = (RelativeLayout) solo.getView("next_level_layout");//[我的苹果]界面下个等级
		leftImageView = (ImageView) solo.getView("left");//返回控件
	}
	
	/**
	 * 获得[我的苹果]界面Title控件
	 * @return
	 */
	public TextView getTitleTextView(){
		return titleTextView;
	}
	
	/**
	 * 获得[我的苹果]界面下个等级
	 * @return
	 */
	public RelativeLayout getNext_level_layoutRelativeLayout(){
		return next_level_layoutRelativeLayout;
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得[我的苹果]界面Title文字
	 * @return
	 */
	public String getTextTitleTextView(){
		return titleTextView.getText().toString();
	}
	
	/**
	 * 点击下一个等级
	 */
	public void clickNext_level_layoutRelativeLayout(){
		solo.clickOnView(next_level_layoutRelativeLayout);
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
}
