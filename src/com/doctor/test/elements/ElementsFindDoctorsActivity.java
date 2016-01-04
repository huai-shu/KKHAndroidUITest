package com.doctor.test.elements;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.robotium.solo.Solo;

/**
 * [找医生]界面
 * @author qpgjk
 *
 */
public class ElementsFindDoctorsActivity {

	private Solo solo;
	private LinearLayout find_doctor_layout;//搜索医生框
	private RelativeLayout find_doctor_from_contacts_rl;//[从通讯录匹配]控件
	private RelativeLayout find_doctor_from_hospital_and_department_rl;//[按医院科室找]
	
	public ElementsFindDoctorsActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		find_doctor_layout = (LinearLayout) solo.getView("find_doctor_layout");
		find_doctor_from_contacts_rl = (RelativeLayout) solo.getView("find_doctor_from_contacts_rl");
		find_doctor_from_hospital_and_department_rl = (RelativeLayout) solo.getView("find_doctor_from_hospital_and_department_rl");
	}
	
	/**
	 * 点击[搜索医生]控件
	 */
	public void clickFind_doctor_layout(){
		solo.clickOnView(find_doctor_layout);
	}
	
	/**
	 * 点击[从通讯录匹配]
	 */
	public void clickFind_doctor_from_contacts_rl(){
		solo.clickOnView(find_doctor_from_contacts_rl);
	}
	
	/**
	 * 点击[按医院科室找]
	 */
	public void clickFind_doctor_from_hospital_and_department_rl(){
		solo.clickOnView(find_doctor_from_hospital_and_department_rl);
	}
}
