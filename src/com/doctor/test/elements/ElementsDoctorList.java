package com.doctor.test.elements;

import com.robotium.solo.Solo;

/**
 * [医生列表]界面
 * @author qpgjk
 *
 */
public class ElementsDoctorList {

	private Solo solo;
	
	public ElementsDoctorList(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		
	}
	
	/**
	 * 点击行数
	 * @param line
	 * @param index
	 */
	public void clickInList(int line, int index){
		solo.clickInList(line, index);
	}
}
