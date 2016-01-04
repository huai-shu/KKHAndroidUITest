package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 出诊时间界面
 * @author qpgjk
 *
 */
public class ElementsVisitTimeActivity {

	private Solo solo;
	private ImageView leftImageView;
	private TextView weekday_showTextView;
	
	public ElementsVisitTimeActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews(){
		leftImageView = (ImageView) solo.getView("left");//返回控件
		weekday_showTextView = (TextView) solo.getView("weekday_show");//星期控件
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得星期控件
	 * @return
	 */
	public TextView getWeekday_showTextView(){
		return weekday_showTextView;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
	
	/**
	 * 点击星期控件
	 * @param text
	 */
	public void clickWeekday_show(String text){
		solo.clickOnText(text);
	}
}
