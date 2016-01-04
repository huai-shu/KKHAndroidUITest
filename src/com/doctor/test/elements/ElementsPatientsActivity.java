package com.doctor.test.elements;

import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [患者]界面
 * @author qpgjk
 *
 */
public class ElementsPatientsActivity {

	private Solo solo;
	private TextView patient_name;//患者姓名
	
	public ElementsPatientsActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	private void initViews() {
		patient_name = (TextView) solo.getView("patient_name");
	}

	/**
	 * 选择患者
	 * @param index
	 */
	public void clickRelativeLayout(int index){
		solo.clickOnView(solo.getView(RelativeLayout.class, index));
	}
	
	/**
	 * 点击患者
	 * @param index
	 */
	public void clickPatient_name(int index){
		solo.clickOnView(solo.getView("patient_name", index));
	}
	
}
