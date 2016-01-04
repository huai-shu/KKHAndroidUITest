package com.doctor.test.elements;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.robotium.solo.Solo;

/**
 * 加号时段界面
 * @author qpgjk
 *
 */
public class ElementsAppointTimeActivity {
	
	private Solo solo;
	private Button edit_clinic_timeButton;
	private ImageView leftImageView;
	
	public ElementsAppointTimeActivity(Solo solo){
		this.solo = solo;
		initView();
	}
	
	public void initView(){
		edit_clinic_timeButton = (Button) solo.getView("edit_clinic_time");//[编辑出诊时间]控件
		leftImageView = (ImageView) solo.getView("left"); //返回控件
	}
	
	/**
	 * 获得编辑出诊时间控件
	 * @return
	 */
	public View getEdit_clinic_timeButton(){
		return edit_clinic_timeButton;
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 点击[编辑出诊时间]控件
	 */
	public void clickEdit_clinic_timeButton(){
		solo.clickOnView(edit_clinic_timeButton);
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}


}
