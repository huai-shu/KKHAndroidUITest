package com.doctor.test.elements;

import android.widget.RelativeLayout;

import com.robotium.solo.Solo;

/**
 * [选择转诊医生]界面
 * @author qpgjk
 *
 */
public class ElementsChooseTransferDoctorActivity {

	private Solo solo;
	private RelativeLayout out_layout;//[推荐医生]列表
	
	public ElementsChooseTransferDoctorActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		out_layout = (RelativeLayout) solo.getView("out_layout");
	}
	
	/**
	 * 选择[推荐医生]列表中的医生
	 * @param index
	 */
	public void clickOut_layout(int index){
		solo.clickOnView(solo.getView("out_layout", index));
	}
}
