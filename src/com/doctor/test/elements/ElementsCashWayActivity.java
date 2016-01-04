package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [提现方式]界面
 * @author qpgjk
 *
 */
public class ElementsCashWayActivity {

	private Solo solo;
	private RelativeLayout alipay_add_rl;//[支付宝账号]控件
	private RelativeLayout bank_card_add_rl;//[银行卡]控件
	private ImageView left;//返回控件
	private TextView right;//编辑控件
	
	public ElementsCashWayActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		alipay_add_rl = (RelativeLayout) solo.getView("alipay_add_rl");
		bank_card_add_rl = (RelativeLayout) solo.getView("bank_card_add_rl");
		left = (ImageView) solo.getView("left");
		right = (TextView) solo.getView("right");
	}
	
	/**
	 * 点击[添加支付宝账号]
	 */
	public void clickAdd_alipay_layout(){
		solo.clickOnView(alipay_add_rl);
	}
	
	/**
	 * 点击[添加银行卡]控件
	 */
	public void clickAdd_bank_layout(){
		solo.clickOnView(bank_card_add_rl);
	}
	
	/**
	 * 点击[返回]控件
	 */
	public void clickLeft(){
		solo.clickOnView(left);
	}
	
	/**
	 * 点击[编辑]控件
	 */
	public void clickRight(){
		solo.clickOnView(right);
	}
}
