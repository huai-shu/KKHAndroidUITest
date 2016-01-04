package com.doctor.test.elements;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.robotium.solo.Solo;

/**
 * 控制电话咨询界面
 * @author qpgjk
 *
 */
public class ElementsChangeForPhoneActivity {
	
	private Solo solo;
	private View wiperSwitch1View;
	private ImageView leftImageView;
	private LinearLayout price_layout;//[价格]控件
	
	public ElementsChangeForPhoneActivity(Solo solo){
		this.solo = solo;
		initView();
	}
	
	public void initView(){
		wiperSwitch1View = solo.getView("wiperSwitch1");//[开通电话咨询]开关控件
		leftImageView = (ImageView) solo.getView("left"); //返回控件
		price_layout = (LinearLayout) solo.getView("price_layout");
	}
	
	/**
	 * 获得[开通电话咨询]开关控件
	 * @return
	 */
	public View getWiperSwitch1View(){
		return wiperSwitch1View;
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 点击[开通电话咨询]开关控件
	 */
	public void clickWiperSwitch1View(){
		solo.clickOnView(wiperSwitch1View);
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
	
	/**
	 * 点击[价格]一栏
	 */
	public void clickPrice_layout(){
		solo.clickOnView(price_layout);
	}
}
