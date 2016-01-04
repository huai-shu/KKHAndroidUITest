package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 出诊时间星期界面
 * @author qpgjk
 *
 */
public class ElementsWeekActivity {
	
	private Solo solo;
	private ImageView leftImageView;
	private TextView timesLotTextView;
	private TextView categoryTextView;
	
	public ElementsWeekActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews(){
		leftImageView = (ImageView) solo.getView("left");//返回控件
		timesLotTextView = (TextView) solo.getView("timesLot");//时间控件
		categoryTextView = (TextView) solo.getView("category");//门诊类型控件
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 返回时间控件
	 * @return
	 */
	public TextView getTimesLotTextView(){
		return timesLotTextView;
	}
	
	/**
	 * 获得门诊类型控件
	 * @return
	 */
	public TextView getCategoryTextView(){
		return categoryTextView;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
	
	/**
	 * 点击时间控件
	 * @param text
	 */
	public void clickTimesLotTextView(String text){
		solo.clickOnText(text);
	}
	
	/**
	 * 点击门诊类型控件
	 * @param index
	 */
	public void clickCategoryTextView(int index){
		solo.clickOnView(solo.getView("category", index));
	}
}
