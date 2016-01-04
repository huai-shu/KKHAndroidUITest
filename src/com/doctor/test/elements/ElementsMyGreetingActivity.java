package com.doctor.test.elements;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.robotium.solo.Solo;

/**
 * [我的欢迎语]界面
 * @author qpgjk
 *
 */
public class ElementsMyGreetingActivity {

	private Solo solo;
	private RelativeLayout text_rl;//[文字]一栏控件
	private RelativeLayout voice_rl;//[语音]一栏控件
	private EditText greeting_text_edit;;//[文字]欢迎语输入框
	private Button speak_btn;//[按住录音]控件
	
	public ElementsMyGreetingActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		text_rl = (RelativeLayout) solo.getView("text_rl");
		voice_rl = (RelativeLayout) solo.getView("voice_rl");
		greeting_text_edit = (EditText) solo.getView("greeting_text_edit");
		speak_btn = (Button) solo.getView("speak_btn");
	}
	
	/**
	 * 点击[文字]控件
	 */
	public void clickText_rl(){
		solo.clickOnView(text_rl);
	}
	
	/**
	 * 点击[语音]一栏控件
	 */
	public void clickVoice_rl(){
		solo.clickOnView(voice_rl);
	}
	
	/**
	 * 清空欢迎文字
	 */
	public void clearGreeting_text_edit(){
		solo.clearEditText(greeting_text_edit);
	}
	
	/**
	 * 输入欢迎文字
	 * @param text
	 */
	public void enterGreeting_text_edit(String text){
		solo.enterText(greeting_text_edit, text);
	}
	
	/**
	 * 长按[按住录音]
	 * @param time
	 */
	public void clickLongSpeak_btn(int time){
		solo.clickLongOnView(speak_btn, time);
	}
}
