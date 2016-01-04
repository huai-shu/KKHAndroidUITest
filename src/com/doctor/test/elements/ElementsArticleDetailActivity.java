package com.doctor.test.elements;

import android.widget.ImageView;

import com.robotium.solo.Solo;

/**
 * 文章详情界面
 * @author qpgjk
 *
 */
public class ElementsArticleDetailActivity {

	private Solo solo;
	private ImageView leftImageView;
	
	public ElementsArticleDetailActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		leftImageView = (ImageView) solo.getView("left");//返回控件
	}
	
	/**
	 * 获得返回空
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
}
