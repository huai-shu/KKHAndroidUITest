package com.doctor.test.elements;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [文章预览]界面
 * @author qpgjk
 *
 */
public class ElementsArticlePreviewActivity {

	private Solo solo;
	private LinearLayout tag_layout;//选择患者
	private Button submit_btn;//[发布]控件
	private TextView right;//分享控件
	
	public ElementsArticlePreviewActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		tag_layout = (LinearLayout) solo.getView("tag_layout");
		submit_btn = (Button) solo.getView("submit_btn");
		right = (TextView) solo.getView("right");
	}
	
	/**
	 * 点击选择患者一栏
	 */
	public void clickTag_layout(){
		solo.clickOnView(tag_layout);
	}
	
	/**
	 * 点击[发布]控件
	 */
	public void clickSubmit_btn(){
		solo.clickOnView(submit_btn);
	}
	
	/**
	 * 点击[分享]控件
	 */
	public void clickright(){
		solo.clickOnView(right);
	}
}
