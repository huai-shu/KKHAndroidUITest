package com.doctor.test.elements;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 控制图文咨询界面
 * @author qpgjk
 *
 */
public class ElementsChangeForMessageActivity {
	
	private Solo solo;
	private View wiperSwitch1View;
	private ImageView leftImageView;
	private RelativeLayout virtual_parent_price_rl;//[陌生患者收费价格]控件
	private TextView price_show;//收费价格
	private RelativeLayout greeting_rl;//[我的欢迎语]控件
	private TextView greeting_type_show;//[我的欢迎语]类型
	
	public ElementsChangeForMessageActivity(Solo solo){
		this.solo = solo;
		initView();
	}
	
	public void initView(){
		wiperSwitch1View = solo.getView("wiperSwitch1");//[开通图文咨询]开关控件
		leftImageView = (ImageView) solo.getView("left"); //返回控件
		virtual_parent_price_rl = (RelativeLayout) solo.getView("virtual_parent_price_rl");
		price_show = (TextView) solo.getView("price_show");
		greeting_rl = (RelativeLayout) solo.getView("greeting_rl");
		greeting_type_show = (TextView) solo.getView("greeting_type_show");
	}
	
	/**
	 * 获得[开通图文咨询]开关控件
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
	 * 点击[开通图文咨询]开关控件
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
	 * 点击[陌生患者收费价格]
	 */
	public void clickIrtual_parent_price_rl(){
		solo.clickOnView(virtual_parent_price_rl);
	}
	
	/**
	 * 获取收费价格
	 */
	public String getPrice_show(){
		return price_show.getText().toString();
	}
	
	/**
	 * 点击[我的欢迎语]控件
	 */
	public void clickGreeting_rl(){
		solo.clickOnView(greeting_rl);
	}
	
	/**
	 * 获得[我的欢迎语]类型
	 * @return
	 */
	public String getGreeting_type_show(){
		return greeting_type_show.getText().toString();
	}
}

