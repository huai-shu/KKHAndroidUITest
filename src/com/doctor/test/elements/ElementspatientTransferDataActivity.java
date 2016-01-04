package com.doctor.test.elements;

import android.widget.Button;

import com.robotium.solo.Solo;

/**
 * [患者转诊资料]界面
 * @author qpgjk
 *
 */
public class ElementspatientTransferDataActivity {
	
	private Solo solo;
	private Button btn_1;//[选择转诊医生]控件
	
	public ElementspatientTransferDataActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		btn_1= (Button) solo.getView("btn_1");
	}
	
	/**
	 * 点击[选择转诊医生]
	 */
	public void clickBtn_1(){
		solo.clickOnView(btn_1);
	}
}
