package com.doctor.test.elements;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 控件加号服务界面
 * @author qpgjk
 *
 */
public class ElementsChangeForAppointActivity {
	
	private Solo solo;
	private View wiperSwitch1View;
	private ImageView leftImageView;
	private TextView appoint_fee;//预约加号价格控件
	private EditText condition;//[加号条件]输入框
	private EditText message_template;//[给患者留言]输入框
	private LinearLayout appoint_set;//[加号时段及名额]控件
	
	public ElementsChangeForAppointActivity(Solo solo){
		this.solo = solo;
		initView();
	}
	
	public void initView(){
		wiperSwitch1View = solo.getView("wiperSwitch1");//[开通预约加号]开关控件
		leftImageView = (ImageView) solo.getView("left"); //返回控件
		appoint_fee = (TextView) solo.getView("appoint_fee");
		condition = (EditText) solo.getView("condition");
		message_template = (EditText) solo.getView("message_template");
		appoint_set = (LinearLayout) solo.getView("appoint_set");
	}
	
	/**
	 * 获得[开通预约加号]开关控件
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
	 * 点击[开通预约加号]开关控件
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
	 * 点击[收费价格]一栏
	 */
	public void clickAppoint_fee(){
		solo.clickOnView(appoint_fee);
	}
	
	/**
	 * 清空[加号条件]输入框
	 */
	public void clearCondition(){
		solo.clearEditText(condition);
	}
	
	/**
	 * 输入加号条件
	 * @param text
	 */
	public void enterCondition(String text){
		solo.enterText(condition, text);
	}
	
	/**
	 * 获得加号条件内容
	 * @return
	 */
	public String getCondition(){
		return condition.getText().toString();
	}
	
	/**
	 * 清空[给患者留言]
	 */
	public void clearMessage_template(){
		solo.clearEditText(message_template);
	}
	
	/**
	 * 输入给患者留言
	 * @param text
	 */
	public void enterMessage_template(String text){
		solo.enterText(message_template, text);
	}
	
	/**
	 * 获得[给患者留言]内容
	 * @return
	 */
	public String getMessage_template(){
		return message_template.getText().toString();
	}
	
	/**
	 * 点击[加号时段及名额]一栏
	 */
	public void clickAppoint_set(){
		solo.clickOnView(appoint_set);
	}
}

