package com.doctor.test.elements;

import android.widget.ImageView;
import com.robotium.solo.Solo;

/**
 * 【选择患者】界面
 * 
 * @author qpgjk
 * 
 */
public class ElementsGroupChooseLabelActivity {

	private Solo solo;
	private ImageView left;

	public ElementsGroupChooseLabelActivity(Solo solo) {
		this.solo = solo;
		initViews();
	}

	private void initViews() {
		left = (ImageView) solo.getView("left");// 返回控件
		
	}

	/**
	 * 获得返回控件
	 * @Method:getLeft
	 * @Parameter type:ElementsGroupSendChoosePatientActivity
	 * @return
	 * @Return:ImageView
	 */
	public ImageView getLeft() {
		return left;
	}

	/**
	 * 点击返回控件
	 * @Method:clickLeft
	 * @Parameter type:ElementsGroupSendChoosePatientActivity
	 * @Return:void
	 */
	public void clickLeft() {
		solo.clickOnView(left);
	}

	/**
	 * 点击标签列表对应标签
	 * @Method:clickTag_name
	 * @Parameter type:ElementsGroupSendChoosePatientActivity
	 * @param arg1
	 * @Return:void
	 */
	public void clickTag_name(int arg1) {
		solo.clickOnView(solo.getView("tag_name", arg1));
	}
}
