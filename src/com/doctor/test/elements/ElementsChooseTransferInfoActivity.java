package com.doctor.test.elements;

import android.widget.Button;

import com.robotium.solo.Solo;

/**
 * [转诊详情信息]界面
 * @author qpgjk
 *
 */
public class ElementsChooseTransferInfoActivity {

	private Solo solo;
	private Button transfer_btn;//[转给这个医生]控件
	
	public ElementsChooseTransferInfoActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		transfer_btn = (Button) solo.getView("transfer_btn");
	}
	
	/**
	 * 点击[转给这个医生]控件
	 */
	public void clickTransfer_btn(){
		solo.clickOnView(transfer_btn);
	}
	
}
