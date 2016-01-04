package com.doctor.test.elements;

import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [转诊状态]界面
 * @author qpgjk
 *
 */
public class ElementsTransferStateActivity {

	private Solo solo;
	private TextView title;//标题
	
	public ElementsTransferStateActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		title = (TextView) solo.getView("title");
	}
	
	/**
	 * 获得标题名称
	 * @return
	 */
	public String  getTitle(){
		return title.getText().toString();
	}
}
