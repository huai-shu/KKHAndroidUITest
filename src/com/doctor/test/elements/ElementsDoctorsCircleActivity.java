package com.doctor.test.elements;

import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 医生圈界面
 * @author qpgjk
 *
 */
public class ElementsDoctorsCircleActivity {

	private Solo solo;
	private TextView labelTextView;
	private TextView change_another_batch;//[换一批]控件
	private TextView right;//[找医生]控件
	private RelativeLayout praise_me_layout;//[赞过我的]一栏
	private TextView leader_broad_name;//排行榜名字
	
	public ElementsDoctorsCircleActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews(){
		labelTextView = (TextView) solo.getView("label");//App底部Tab
		change_another_batch = (TextView) solo.getView("change_another_batch");
		right = (TextView) solo.getView("right");
		praise_me_layout = (RelativeLayout) solo.getView("praise_me_layout");
		leader_broad_name = (TextView) solo.getView("leader_broad_name");
	}
	
	/**
	 * 点击App底部Tab
	 * @param index
	 */
	public void clickLabelTextView(int index){
		solo.clickOnView(solo.getView("label", index));
	}
	
	/**
	 * 点击[换一批]控件
	 */
	public void clickChange_another_batch(){
		solo.clickOnView(change_another_batch);
	}
	
	/**
	 * 点击[找医生]控件
	 */
	public void clickRight(){
		solo.clickOnView(right);
	}
	
	/**
	 * 点击[赞过我的]一栏
	 */
	public void clickPraise_me_layout(){
		solo.clickOnView(praise_me_layout);
	}
	
	/**
	 * 点击排行榜
	 */
	public void clickLeader_broad_name(){
		solo.clickOnView(leader_broad_name);
	}
}
