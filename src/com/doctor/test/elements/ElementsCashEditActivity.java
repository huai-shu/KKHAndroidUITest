package com.doctor.test.elements;

import android.widget.ImageView;

import com.robotium.solo.Solo;

/**
 * 支付[编辑]界面
 * @author qpgjk
 *
 */
public class ElementsCashEditActivity {

	private Solo solo;
	private ImageView delete_img;//删除控件
	
	public ElementsCashEditActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		delete_img = (ImageView) solo.getView("delete_img");
	}
	
	/**
	 * 点击[删除]控件
	 */
	public void clickDelete(int index){
		solo.clickOnView(solo.getView("delete_img", index));
	}
}
