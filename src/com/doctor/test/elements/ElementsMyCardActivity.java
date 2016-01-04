package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;
/**
 * 我的名片界面
 * @author qpgjk
 *
 */
public class ElementsMyCardActivity {

	private Solo solo;
	private ImageView leftImageView;
	private TextView rightTextView;
	private RelativeLayout clinic_layoutRelativeLayout;
	private ImageView indicator3ImageView;
	private RelativeLayout bio_layoutRelativeLayout;
	private TextView featureTextView;
	private TextView bioTextView;
	private TextView title;//标题控件
	private TextView doctor_name;//医生姓名
	private TextView approved_show;//认证状态
	private TextView avatar_text;//[上传头像]控件
	private TextView share_card_btn;//[分享]控件
	private ImageView qr_code;//我的二维码
	private RelativeLayout doctor_header_layout;//医生资料一栏
	
	public ElementsMyCardActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews(){
		leftImageView = (ImageView) solo.getView("left");//返回控件
		rightTextView = (TextView) solo.getView("right");//编辑/保存控件
		clinic_layoutRelativeLayout = (RelativeLayout) solo.getView("clinic_layout");//出诊时间一栏
		indicator3ImageView = (ImageView) solo.getView("indicator3");//专长一栏
		bio_layoutRelativeLayout = (RelativeLayout) solo.getView("bio_layout");//从业经历一栏
		featureTextView = (TextView) solo.getView("feature");//专长内容
		bioTextView = (TextView) solo.getView("bio");//从业经历内容
		title = (TextView) solo.getView("title");
		doctor_name = (TextView) solo.getView("doctor_name");
		approved_show = (TextView) solo.getView("approved_show");
		avatar_text = (TextView) solo.getView("avatar_text");
		share_card_btn = (TextView) solo.getView("share_card_btn");
		qr_code = (ImageView) solo.getView("qr_code");
		doctor_header_layout = (RelativeLayout) solo.getView("doctor_header_layout");
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得编辑/保存控件
	 * @return
	 */
	public TextView getRightTextView(){
		return rightTextView;
	}
	
	/**
	 * 获得出诊时间一栏
	 * @return
	 */
	public RelativeLayout getRlinic_layoutRelativeLayout(){
		return clinic_layoutRelativeLayout;
	}
	
	/**
	 * 获得专长一栏
	 * @return
	 */
	public ImageView getIndicator3ImageView(){
		return indicator3ImageView;
	}
	
	/**
	 * 获得从业经历一栏
	 * @return
	 */
	public RelativeLayout getBio_layoutRelativeLayout(){
		return bio_layoutRelativeLayout;
	}
	
	/**
	 * 获得专长内容
	 * @return
	 */
	public TextView getFeatureTextView(){
		return (TextView) solo.getView("feature");
	}
	
	/**
	 * 获得从业经历内容
	 * @return
	 */
	public TextView getRioTextView(){
		return (TextView) solo.getView("bio");
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
	
	/**
	 * 点击编辑/保存控件
	 */
	public void clickRightTextView(){
		solo.clickOnView(rightTextView);
	}
	
	/**
	 * 点击出诊时间一栏
	 */
	public void clickClinic_layoutRelativeLayout(){
		solo.clickOnView(clinic_layoutRelativeLayout);
	}
	
	/**
	 * 点击专长一栏
	 */
	public void clickIndicator3ImageView(){
		solo.clickOnView(indicator3ImageView);
	}
	
	/**
	 * 点击从业经历一栏
	 */
	public void clickbio_layoutRelativeLayout(){
		solo.clickOnView(bio_layoutRelativeLayout);
	}
	
	/**
	 * 获得[医生名片]界面标题
	 * @return
	 */
	public String getTitle(int index){
		return ((TextView) solo.getView("title" , index)).getText().toString();
	}
	
	/**
	 * 获得医生姓名
	 * @return
	 */
	public String getDoctor_name(){
		return doctor_name.getText().toString();
	}
	
	/**
	 * 获得认证状态
	 * @return
	 */
	public String getApproved_show(){
		return approved_show.getText().toString();
	}
	
	/**
	 * 点击[上传头像]
	 */
	public void clickAvatar_text(){
		solo.clickOnView(avatar_text);
	}
	
	/**
	 * 点击[分享]控件
	 */
	public void clickShare_card_btn(){
		solo.clickOnView(share_card_btn);
	}
	
	/**
	 * 长按我的二维码
	 */
	public void clickLongQr_code(){
		solo.clickLongOnView(qr_code);
	}
	
	/**
	 * 点击医生资料一栏
	 */
	public void clickDoctor_header_layout(){
		solo.clickOnView(doctor_header_layout);
	}
}
