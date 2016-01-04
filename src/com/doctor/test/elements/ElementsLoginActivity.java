package com.doctor.test.elements;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 【登录】界面
 * @author qpgjk
 *
 */
public class ElementsLoginActivity {
	private Solo solo;
	private EditText nameEditText,passwordEditText;
	private Button loginButton,btnSendButton;
	private TextView userAgreeTextView;
	private TextView titleTextView;
	
	public ElementsLoginActivity(Solo solo) {
		this.solo = solo;
		initViews();
	}
	/**
	 * 初始化当前界面所有控件
	 * @Method:initViews
	 * @Parameter type:ElementsLoginActivity
	 * @Return:void
	 */
	public void initViews(){
		solo.sleep(1500);
		nameEditText = (EditText)solo.getView("phone_num");//手机号
		passwordEditText = (EditText)solo.getView("pwd");//密码
		loginButton = (Button)solo.getView("btnLogin");//登录
		btnSendButton = (Button)solo.getView("btnSend");//验证码
		userAgreeTextView = (TextView)solo.getView("user_agree");//用户协议	
		titleTextView = (TextView) solo.getView("title");//[登录]界面Title
	}
	/**
	 * 获得用户名文本框
	 * @Method:getNamEditText
	 * @Parameter type:ElementsLoginActivity
	 * @return
	 * @Return:EditText
	 */
	public EditText getNameEditText(){
		return nameEditText;
	}
	
	/**
	 * 获得登录界面Title控件
	 * @return
	 */
	public TextView getTitleTextView(){
		return titleTextView;
	}
	
	/**
	 * 输入手机号
	 * @Method:enterNameEditText
	 * @Parameter type:ElementsLoginActivity
	 * @param phone
	 * @Return:void
	 */
	public void enterNameEditText(String phone){
		solo.enterText(nameEditText, phone);
	}
	/**
	 * 清除手机号
	 * @Method:clearNameEditText
	 * @Parameter type:ElementsLoginActivity
	 * @Return:void
	 */
	public void clearNameEditText(){
		solo.clearEditText(nameEditText);
	}
	/**
	 * 获得密码文本框
	 * @Method:getPasswordEditText
	 * @Parameter type:ElementsLoginActivity
	 * @return
	 * @Return:EditText
	 */
	public EditText getPasswordEditText(){
		return passwordEditText;
	}
	/**
	 * 输入密码
	 * @Method:enterPasswordEditText
	 * @Parameter type:ElementsLoginActivity
	 * @param password
	 * @Return:void
	 */
	public void enterPasswordEditText(String password){
		solo.enterText(passwordEditText, password);
	}
	/**
	 * 清除验证码
	 * @Method:clearPasswordEditText
	 * @Parameter type:ElementsLoginActivity
	 * @Return:void
	 */
	public void clearPasswordEditText(){
		solo.clearEditText(passwordEditText);
	}
	/**
	 * 获得登录按钮
	 * @Method:getLoginButton
	 * @Parameter type:ElementsLoginActivity
	 * @return
	 * @Return:Button
	 */
	public Button getLoginButton(){
		return loginButton;
	}
	/**
	 * 点击登录按钮
	 * @Method:clickonButton
	 * @Parameter type:ElementsLoginActivity
	 * @Return:void
	 */
	public void clickonLoginButton(){
		solo.clickOnView(loginButton);
	}
	/**
	 * 获得发送验证码按钮
	 * @Method:getBtnButton
	 * @Parameter type:ElementsLoginActivity
	 * @return
	 * @Return:Button
	 */
	public Button getSendButton(){
		return btnSendButton;
	}
	/**
	 * 点击获取验证码按钮
	 * @Method:clickOnSendButton
	 * @Parameter type:ElementsLoginActivity
	 * @Return:void
	 */
	public void clickOnSendButton(){
		solo.clickOnView(btnSendButton);
	}
	/**
	 * 获得用户协议文本
	 * @Method:getUserArgeeTextView
	 * @Parameter type:ElementsLoginActivity
	 * @return
	 * @Return:TextView
	 */
	public TextView getUserArgeeTextView(){
		return userAgreeTextView;
	}
	/**
	 * 点击用户协议文本
	 * @Method:clickOnUserArgee
	 * @Parameter type:ElementsLoginActivity
	 * @Return:void
	 */
	public void clickOnUserArgee(){
		solo.clickOnView(userAgreeTextView);
	}
	/**
	 * 定义通用的的登录方法
	 * @Method:doLoginWaitAccount
	 * @Parameter type:ElementsLoginActivity
	 * @param account
	 * @Return:void
	 */
	public void doLoginWaitAccount(String [] account){
		clearNameEditText();
		clearPasswordEditText();
		enterNameEditText(account [0]);
		enterPasswordEditText(account [1]);
		clickonLoginButton();		
	}

	/**
	 * 获得登录界面Title文字
	 * @return
	 */
	public String getTextTitleTextView(){
		return getTitleTextView().getText().toString();
	}
}
