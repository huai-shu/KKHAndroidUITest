package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [排行榜]界面
 * @author qpgjk
 *
 */
public class ElementsLeaderbroadActivity {

	private Solo solo;
	private TextView doctor_name_one;//第一名的姓名
	private ImageView ri_one;
	
	public ElementsLeaderbroadActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		doctor_name_one = (TextView) solo.getView("doctor_name_one");
		ri_one = (ImageView) solo.getView("ri_one");
	}
	
	/**
	 * 获得第一名的姓名
	 * @return
	 */
	public String getDoctor_name_one(){
		return doctor_name_one.getText().toString();
	}
	
	/**
	 * 点击第一名
	 */
	public void clickRi_one(){
		solo.clickOnView(ri_one);
	}
}
