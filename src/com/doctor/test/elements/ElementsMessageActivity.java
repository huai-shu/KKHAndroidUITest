package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 【消息】界面
 * @author qpgjk
 *
 */
public class ElementsMessageActivity {

	private Solo solo;
	private ImageView search_btn;
	private ImageView right_img;
	private TextView nameTextView;
	private TextView labelTextView;

	public ElementsMessageActivity(Solo solo) {
		// TODO Auto-generated constructor stub
		this.solo = solo;
		initViews();
	}
	/**
	 * 初始化当前界面所有控件
	 * @Method:initViews
	 * @Parameter type:ElementsMessageActivity
	 * @Return:void
	 */
	private void initViews() {
		solo.sleep(1500);
		search_btn = (ImageView) solo.getView("search_btn");// 搜索
		right_img = (ImageView) solo.getView("right_img");// 群发
//		nameTextView = (TextView) solo.getView("name");//会话标题
		labelTextView = (TextView) solo.getView("label");//App底部Tab
	}

	/**
	 * 获得搜索控件
	 * @Method:getSearch_btn
	 * @Parameter type:ElementsMessageActivity
	 * @return
	 * @Return:ImageView
	 */
	public ImageView getSearch_btn() {
		return search_btn;
	}
	
	/**
	 * 获得对应index的会话标题
	 * @param index
	 * @return
	 */
	public TextView getNameTextView(int index){
		nameTextView = (TextView) solo.getView("name", index);
		return nameTextView;
	}

	/**
	 * 点击搜索控件
	 * @Method:clickSearch_btn
	 * @Parameter type:ElementsMessageActivity
	 * @Return:void
	 */
	public void clickOnSearch_btn() {
		solo.clickOnView(search_btn);
	}
	
	/**
	 * 获得群发控件
	 * @Method:getRight_img
	 * @Parameter type:ElementsMessageActivity
	 * @return
	 * @Return:ImageView
	 */
	public ImageView getRight_img() {
		return right_img;
	}

	/**
	 * 获得App底部Tab
	 * @return
	 */
	public TextView labelTextView(){
		return labelTextView;
	}
	
	/**
	 * 点击群发控件
	 * @Method:clickRight_img
	 * @Parameter type:ElementsMessageActivity
	 * @Return:void
	 */
	public void clickRight_img() {
		solo.clickOnView(right_img);
	}
	/**
	 * 点击Banner
	 * @Method:clickOnBanner
	 * @Parameter type:ElementsMessageActivity
	 * @Return:void
	 */
	public void clickOnBanner(){
		solo.clickOnView(solo.getView("banner_ll"));
	}
	/**
	 * 点击列表
	 * @Method:clickInList
	 * @Parameter type:ElementsMessageActivity
	 * @param line
	 * @param index
	 * @Return:void
	 */
	public void clickInList(int line, int index){
		solo.clickInList(line, index);
	}
	
	/**
	 * 点击App底部Tab
	 * @param index
	 */
	public void clickLabelTextView(int index){
		solo.clickOnView(solo.getView("label", index));
	}
	
}
