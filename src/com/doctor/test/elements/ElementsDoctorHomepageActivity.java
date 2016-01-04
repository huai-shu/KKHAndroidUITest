package com.doctor.test.elements;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 医生主页界面
 * @author qpgjk
 *
 */
public class ElementsDoctorHomepageActivity {

	private Solo solo;
	private TextView name;//医生姓名
	private LinearLayout like_layout;//[赞]控件
	private RelativeLayout header_layout;//医生资料一栏
	private TextView right;//[送苹果]控件
	
	public ElementsDoctorHomepageActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		name = (TextView) solo.getView("name");
		like_layout = (LinearLayout) solo.getView("like_layout");
		header_layout = (RelativeLayout) solo.getView("header_layout");
		right = (TextView) solo.getView("right");
	}
	 
	/**
	 * 获取医生姓名
	 * @return
	 */
	public String getDoctor_name(){
		return name.getText().toString();
	}
	
	/**
	 * 点赞
	 */
	public void clickLike_layout(){
		solo.clickOnView(like_layout);
	}
	
	/**
	 * 点击医生资料一栏
	 */
	public void clickHeader_layout(){
		solo.clickOnView(header_layout);
	}
	
	/**
	 * 点击[送苹果]控件
	 */
	public void clickRight(){
		solo.clickOnView(right);
	}
}
