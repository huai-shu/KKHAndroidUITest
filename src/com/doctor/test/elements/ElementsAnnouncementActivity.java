package com.doctor.test.elements;

import android.widget.ImageView;

import com.robotium.solo.Solo;

/**
 * Announcement界面
 */
public class ElementsAnnouncementActivity {

	private Solo solo;
	private ImageView dismiss;//Announcement[关闭]控件
	
	public ElementsAnnouncementActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		
	}
	
	/**
	 * 点击[关闭]控件
	 */
	public void clickDismiss(){
		dismiss = (ImageView) solo.getView("dismiss");
		solo.clickOnView(dismiss);
	}
}
