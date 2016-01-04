package com.doctor.test.elements;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [值班室]聊天界面
 * @author qpgjk
 *
 */
public class ElementsDutyRoomMessageSendActivity {
	private Solo solo;
	private ImageView leftImageView;
	private TextView titleTextView;
	private EditText postTextEditText;
	private Button btnSendButton;
	private ImageView input_recImageView;
	private Button speakButton;
	private TextView more_templateTextView;
	private ImageView input_attachImageView;
	private TextView more_photoTextView;
	private TextView more_cameraTextView;
	private ImageView image;//图片控件
	//private TextView add_transfer;//[转诊]控件

	public ElementsDutyRoomMessageSendActivity(Solo solo){
		this.solo = solo;
		initViews();
	}


	public void initViews() {
		solo.sleep(1500);
		leftImageView = (ImageView) solo.getView("left");//返回控件
		titleTextView = (TextView) solo.getView("title");//聊天室标题控件
		postTextEditText = (EditText) solo.getView("postText");//消息输入框
		btnSendButton = (Button) solo.getView("btnSend");//发送控件
		input_recImageView = (ImageView) solo.getView("input_rec");//语音控件
		speakButton = (Button) solo.getView("speak");//按住说话控件
		more_templateTextView = (TextView) solo.getView("more_template");//常用语控件
		input_attachImageView = (ImageView) solo.getView("input_attach");//聊天室【+】号
		more_photoTextView = (TextView) solo.getView("more_photo");//照片控件
		more_cameraTextView = (TextView) solo.getView("more_camera");//拍照控件
		//add_transfer = (TextView) solo.getView("add_transfer");//[转诊]控件
	}

	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得聊天室标题控件
	 * @return
	 */
	public TextView getTitleTextView(){
		return titleTextView;
	}
	
	/**
	 * 获得消息输入框
	 * @return
	 */
	public EditText getPostTextEditText(){
		return postTextEditText;
	}
	
	/**
	 * 获得发送控件
	 * @return
	 */
	public Button getBtnSendButton(){
		return btnSendButton;
	}
	
	/**
	 * 获得语音控件
	 * @return
	 */
	public ImageView getInput_recImageView(){
		return input_recImageView;
	}
	
	/**
	 * 获得按住说话控件
	 * @return
	 */
	public Button getSpeakButton(){
		return speakButton;
	}
	
	/**
	 * 获得常用语控件
	 * @return
	 */
	public TextView getMore_templateTextView(){
		return more_templateTextView;
	}
	
	/**
	 * 获得聊天室【+】号
	 * @return
	 */
	public ImageView getInput_attachImageView(){
		return input_attachImageView;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(solo.getView("left"));
	}
	
	/**
	 * 获得聊天室的标题
	 * @return
	 */
	public String getTitleTextViewString(){
		return titleTextView.getText().toString();
	}
	
	/**
	 * 消息输入框中输入聊天消息
	 * @param text
	 */
	public void EnterPostTextEditText(String text){
		solo.enterText(postTextEditText, text);
	}
	
	/**
	 * 点击发送控件
	 */
	public void clickBtnSendButton(){
		solo.clickOnView(btnSendButton);
	}
	
	/**
	 * 点击语音控件
	 */
	public void clickInput_recImageView(){
		solo.clickOnView(input_recImageView);
	}
	
	/**
	 * 长按[按住说话]控件
	 * @param time
	 */
	public void clickLongSpeakButton(int time){
		solo.clickLongOnView(speakButton, time);
	}
	
	public void clickLongSpeakButton(){
		solo.clickOnView(speakButton);
	}
	
	/**
	 * 点击[常用语]控件
	 */
	public void clickMore_templateTextView(){
		solo.clickOnView(more_templateTextView);
	}
	 
	/**
	 * 点击聊天室【+】号
	 */
	public void clickInput_attachImageView(){
		solo.clickOnView(input_attachImageView);
	}
	
	/**
	 * 点击聊天室顶部一栏
	 */
	public void clickTitle_layoutImageView(){
		solo.clickOnView(solo.getView("title_layout"));
	}
	
	/**
	 * 获得照片控件
	 * @return
	 */
	public TextView getMore_photoTextView(){
		return more_photoTextView;
	}
	
	/**
	 * 点击照片控件
	 */
	public void clickMore_photoTextView(){
		solo.clickOnView(more_photoTextView);
	}
	
	/**
	 * 获得拍照控件
	 * @return
	 */
	public TextView getMore_cameraTextView(){
		return more_cameraTextView;
	}
	
	/**
	 * 点击拍照控件
	 */
	public void clickMore_cameraTextView(){
		solo.clickOnView(more_cameraTextView);
	}
	
	/**
	 * 点击图片
	 * @param index
	 */
	public void clickImage(int index){
		solo.clickOnView(solo.getView("image", index));
	}
	
	/**
	 * 点击[转诊]控件
	 */
/*	public void clickAdd_transfer(){
		solo.clickOnView(add_transfer);
	}*/
}
