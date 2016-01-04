package com.doctor.test.elements;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [更多]界面
 * @author qpgjk
 *
 */
public class ElementsMoreActivity {

	private Solo solo;
	private Button btnLogoffButton;
	private LinearLayout blocked_patients_ll;
	private TextView phone_num_show;//[当前账号]
	private LinearLayout new_feature_layout;//[新功能介绍]控件
	private LinearLayout faq_layout;//[常见问题]控件
	private LinearLayout about_us_layout;//[关于我们]控件
	private LinearLayout download_message_layout;//[下载聊天记录]控件
	
	public ElementsMoreActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		btnLogoffButton = (Button) solo.getView("btnLogoff");//[退出登录]控件
		blocked_patients_ll = (LinearLayout) solo.getView("blocked_patients_ll");//[患者黑名单]一栏控件
		phone_num_show = (TextView) solo.getView("phone_num_show");
		new_feature_layout = (LinearLayout) solo.getView("new_feature_layout");
		faq_layout = (LinearLayout) solo.getView("faq_layout");
		about_us_layout = (LinearLayout) solo.getView("about_us_layout");
		download_message_layout = (LinearLayout) solo.getView("download_message_layout");
	}
	
	/**
	 * 获得[退出登录]控件
	 * @return
	 */
	public Button getBtnLogoffButton(){
		return btnLogoffButton;
	}
	
	/**
	 * 点击[退出登录]控件
	 */
	public void clickBtnLogoffButton(){
		solo.clickOnView(btnLogoffButton);
	}
	
	/**
	 * 点击[患者黑名单]一栏
	 */
	public void clickBlocked_patients_ll(){
		solo.clickOnView(blocked_patients_ll);
	}
	
	/**
	 * 获得当前账号
	 * @return
	 */
	public String getStringPhone_num_show(){
		return phone_num_show.getText().toString();
	}
	
	/**
	 * 点击[新功能介绍]
	 */
	public void clickNew_feature_layout(){
		solo.clickOnView(new_feature_layout);
	}
	
	/**
	 * 点击[常见问题]
	 */
	public void clickFaq_layout(){
		solo.clickOnView(faq_layout);
	}
	
	/**
	 * 点击[关于我们]控件
	 */
	public void clickAbout_us_layout(){
		solo.clickOnView(about_us_layout);
	}
	
	/**
	 * 点击[下载聊天记录]控件
	 */
	public void clickUpload_message_layout(){
		solo.clickOnView(download_message_layout);
	}
}
