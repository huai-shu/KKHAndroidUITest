package com.doctor.test.elements;

import android.view.View;
import android.widget.ImageView;

import com.robotium.solo.Solo;

/**
 * [患者设置]界面
 * @author qpgjk
 *
 */
public class ElementsPatientSettingActivity {

	private Solo solo;
	private View virtual_sbv;//陌生患者开关控件
	private ImageView leftImageView;//返回控件
	private View top_sbv;//置顶会话控件
	private View block_sbv;//加入黑名单控件
	
	public ElementsPatientSettingActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews() {
		top_sbv = solo.getView("top_sbv");
		block_sbv = solo.getView("block_sbv");
	}

	/**
	 * 点击陌生患者开关控件
	 */
	public void clickVirtual_sbv(){
		solo.clickOnView(solo.getView("virtual_sbv"));
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickleft(){
		solo.clickOnView(solo.getView("left"));
	}
	
	/**
	 * 点击置顶会话控件
	 */
	public void clickTop_sbv(){
		solo.clickOnView(top_sbv);
	}
	
	/**
	 * 点击[加入黑名单]控件
	 */
	public void clickBlock_sbv(){
		solo.clickOnView(block_sbv);
	}
}
