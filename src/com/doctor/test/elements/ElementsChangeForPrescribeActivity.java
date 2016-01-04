package com.doctor.test.elements;

import android.view.View;
import android.widget.ImageView;

import com.robotium.solo.Solo;

/**
 * 控制配药服务界面
 * @author qpgjk
 *
 */
public class ElementsChangeForPrescribeActivity {
	
	private Solo solo;
	private View wiperSwitch1View;
	private ImageView leftImageView;
	
	public ElementsChangeForPrescribeActivity(Solo solo){
		this.solo = solo;
		initView();
	}
	
	public void initView(){
		wiperSwitch1View = solo.getView("wiperSwitch1");//[开通配药服务]开关控件
		leftImageView = (ImageView) solo.getView("left"); //返回控件
	}
	
	/**
	 * 获得[开通配药服务]开关控件
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
	 * 点击[开通配药服务]开关控件
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
}
