package com.doctor.test.elements;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 我界面
 * @author qpgjk
 *
 */
public class ElementsMeActivity {

	private Solo solo;
	private TextView labelTextView;
	private RelativeLayout doctor_header_layoutRelativeLayout;
	private RelativeLayout my_green_apple_rlRelativeLayout;
	private RelativeLayout my_patients_rl;//[我的患者]控件
	private RelativeLayout my_earning_layout;//[我的收入]控件
	private TextView my_apple_count_show;//苹果数
	private LinearLayout my_articles_layout;//[我的文章]控件
	
	public ElementsMeActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews(){
		labelTextView = (TextView) solo.getView("label");//App底部Tab
		doctor_header_layoutRelativeLayout = (RelativeLayout) solo.getView("doctor_header_layout");//医生信息一栏
		my_green_apple_rlRelativeLayout = (RelativeLayout) solo.getView("my_green_apple_rl");//我的苹果控件
		my_earning_layout = (RelativeLayout) solo.getView("my_earning_layout");
		my_apple_count_show = (TextView) solo.getView("my_apple_count_show");//苹果数
		my_articles_layout = (LinearLayout) solo.getView("my_articles_layout");
	}
	
	/**
	 * 获得App底部Tab
	 * @return
	 */
	public TextView getLabelTextView(){
		return labelTextView;
	}
	
	/**
	 * 获得医生信息一栏
	 * @return
	 */
	public RelativeLayout getDoctor_header_layoutRelativeLayout(){
		return doctor_header_layoutRelativeLayout;
	}
	
	/**
	 * 获得[我的苹果]控件
	 * @return
	 */
	public RelativeLayout getMy_green_apple_rlRelativeLayout(){
		return my_green_apple_rlRelativeLayout;
	}
	
	/**
	 * 点击App底部Tab
	 * @param index
	 */
	public void clickLabelTextView(int index){
		solo.clickOnView(solo.getView("label", index));
	}
	
	/**
	 * 点击医生信息一栏
	 */
	public void clickDoctor_header_layoutRelativeLayout(){
		solo.clickOnView(doctor_header_layoutRelativeLayout);
	}
	
	/**
	 * 点击[我的苹果]控件
	 */
	public void clickMy_green_apple_rlRelativeLayout(){
		solo.clickOnView(my_green_apple_rlRelativeLayout);
	}
	
	/**
	 * 点击[我的患者]控件
	 */
	public void clickMy_patients_rl(){
		solo.clickOnView(solo.getView("my_patients_rl"));
	}
	
	/**
	 * 点击[我的收入]控件
	 */
	public void clickMy_earning_layout(){
		solo.clickOnView(my_earning_layout);
	}
	
	/**
	 * 获得苹果数
	 * @return
	 */
	public String getMy_apple_count_show(){
		return my_apple_count_show.getText().toString();
	}
	
	/**
	 * 点击[我的文章]控件
	 */
	public void clickMy_articles_layout(){
		solo.clickOnView(my_articles_layout);
	}
}
