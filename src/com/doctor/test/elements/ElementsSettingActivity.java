package com.doctor.test.elements;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 设置界面
 * @author qpgjk
 *
 */
public class ElementsSettingActivity {
	
	private Solo solo;
	private TextView charge_for_prescribeTextView;
	private TextView charge_for_messageTextView;
	private TextView charge_for_phoneTextView;
	private TextView charge_for_appointTextView;
	private TextView conv_serviceTextView;
	private LinearLayout contact_cc_layout;//[联系客服]控件
	private TextView call_service;//拨打客服电话控件
	private TextView wechat_service;//微信客服控件
	private LinearLayout more_layout;//[更多]控件
	private RelativeLayout consult_by_message_layout;//[图文咨询]控件
	
	public ElementsSettingActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews(){
		charge_for_prescribeTextView = (TextView) solo.getView("charge_for_prescribe");//[配药服务]状态控件
		charge_for_messageTextView = (TextView) solo.getView("charge_for_message");//[图文咨询]状态控件
		charge_for_phoneTextView = (TextView) solo.getView("charge_for_phone");//[电话咨询]状态控件
		charge_for_appointTextView = (TextView) solo.getView("charge_for_appoint");//[加号服务]状态控件
		//conv_serviceTextView = (TextView) solo.getView("conv_service");//[App客服]控件
		contact_cc_layout = (LinearLayout) solo.getView("contact_cc_layout");
		//wechat_service = (TextView) solo.getView("wechat_service");
		more_layout = (LinearLayout) solo.getView("more_layout");
		consult_by_message_layout = (RelativeLayout) solo.getView("consult_by_message_layout");//[图文咨询]控件
	}

	/**
	 * 获得[配药服务]状态控件
	 * @return
	 */
	public TextView getCharge_for_prescribeTextView(){
		return charge_for_prescribeTextView;
	}
	
	/**
	 * 获得[电话咨询]状态控件
	 * @return
	 */
	public TextView getCharge_for_phoneTextView(){
		return charge_for_phoneTextView;
	}
	
	/**
	 * 获得[图文咨询]状态控件
	 * @return
	 */
	public TextView getCharge_for_messageTextView(){
		return charge_for_messageTextView;
	}
	
	/**
	 * 获得[加号服务]状态控件
	 * @return
	 */
	public TextView getCharge_for_appointTextView(){
		return (TextView) solo.getView("charge_for_appoint");
	}
	
	/**
	 * 获得[App客服]控件
	 * @return
	 */
	public TextView getConv_serviceTextView(){
		return conv_serviceTextView;
	}
	
	/**
	 * 获得[配药服务]状态控制文字
	 * @return
	 */
	public String getTextCharge_for_prescribeTextView(){
		return charge_for_prescribeTextView.getText().toString();
	}
	
	/**
	 * 获得[图文咨询]状态控件文字
	 * @return
	 */
	public String getTextCharge_for_messageTextView(){
		return charge_for_messageTextView.getText().toString();
	}
	
	/**
	 * 获得[电话咨询]状态控件文字
	 * @return
	 */
	public String getTextCharge_for_phoneTextView(){
		return charge_for_phoneTextView.getText().toString();
	}
	
	/**
	 * 获得[加号服务]状态控件文字
	 * @return
	 */
	public String getTextCharge_for_appointTextView(){
		return charge_for_appointTextView.getText().toString();
	}
	
	/**
	 * 点击[App客服]控件
	 */
	public void clickConv_serviceTextView(){
		solo.clickOnView(solo.getView("conv_service"));
	}
	
	/**
	 * 点击App底部Tab
	 * @param index
	 */
	public void clickLabelTextView(int index){
		solo.clickOnView(solo.getView("label", index));
	}
	
	/**
	 * 点击[联系客服]
	 */
	public void clickContact_cc_layout(){
		solo.clickOnView(contact_cc_layout);
	}
	
	/**
	 * 点击拨打客服电话400-063-0086
	 */
	public void clickCall_service(){
		solo.clickOnView(solo.getView("call_service"));
	}
	
	/**
	 * 点击[微信客服]
	 */
	public void clickWechat_service(){
		solo.clickOnView(solo.getView("wechat_service"));
	}
	
	/**
	 * 点击[更多]控件
	 */
	public void clickMore_layout(){
		solo.clickOnView(more_layout);
	}
	
	/**
	 * 点击[图文咨询]控件
	 */
	public void clickConsult_by_message_layout(){
		solo.clickOnView(consult_by_message_layout);
	}
}
