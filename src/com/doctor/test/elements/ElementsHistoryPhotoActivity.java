package com.doctor.test.elements;

import android.widget.ImageView;

import com.robotium.solo.Solo;

/**
 * [历史图片]界面
 * @author qpgjk
 *
 */
public class ElementsHistoryPhotoActivity {

	private Solo solo;
	private ImageView image;//图片控件
	
	public ElementsHistoryPhotoActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		image = (ImageView) solo.getView("image");
	}
	
	/**
	 * 点击图片
	 */
	public void clickImage(){
		solo.clickOnView(image);
	}
}
