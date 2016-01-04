package com.doctor.test.elements;

import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [新功能介绍]界面
 * @author qpgjk
 *
 */
public class ElementsNewfeatureActivity {

	private Solo solo;
	private TextView title;//标题
	
	public ElementsNewfeatureActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		title = (TextView) solo.getView("title");
	}
	
	/**
	 * 获得标题
	 * @return
	 */
	public String getStringTitle(){
		return title.getText().toString();
	}
}
