package com.doctor.test.elements;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.robotium.solo.Solo;

/**
 * 编辑标签界面
 * @author qpgjk
 *
 */
public class ElementsEditPatientLabelActivity {
	
	private Solo solo;
	private ImageView leftImageView;
	private LinearLayout tag_name_llLinearLayout;
	private ImageView avatar_patientImageView;
	private ImageView deleteImageView;
	private LinearLayout tag_delete_llLinearLayout;
	private Button positiveButton;
	
	public ElementsEditPatientLabelActivity(Solo solo){
		this.solo = solo;
		initView();
	}
	
	public void initView(){
		leftImageView = (ImageView) solo.getView("left"); //返回控件
		tag_name_llLinearLayout = (LinearLayout) solo.getView("tag_name_ll");//标签名字控件
		avatar_patientImageView = (ImageView) solo.getView("avatar_patient");//标签患者列表的控件
		deleteImageView = (ImageView) solo.getView("delete");//患者头像上的删除控件
		tag_delete_llLinearLayout = (LinearLayout) solo.getView("tag_delete_ll");//[删除标签]控件
		//positiveButton = (Button) solo.getView("positiveButton");//是否删除[确定]控件
	}	
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得标签名字控件
	 * @return
	 */
	public LinearLayout getTag_name_llLinearLayout(){
		return tag_name_llLinearLayout;
	}
	
	/**
	 * 获得添加患者控件
	 * @return
	 */
	public ImageView getAvatar_patientImageView(){
		return avatar_patientImageView;
	}
	
	/**
	 * 获得患者头像上的删除控件
	 * @return
	 */
	public ImageView getDeleteImageView(){
		return deleteImageView;
	}
	 
	/**
	 * 获得[删除标签]控件
	 * @return
	 */
	public LinearLayout getTag_delete_llLinearLayout(){
		return tag_delete_llLinearLayout;
	}
	
	/**
	 * 获得是否删除[确定]控件
	 * @return
	 */
	public Button getPositiveButton(){
		return positiveButton;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}

	/**
	 * 点击标签名字控件
	 */
	public void clickTag_name_llLinearLayout(){
		solo.clickOnView(tag_name_llLinearLayout);
	}

	/**
	 * 点击添加患者控件
	 */
	public void clickAvatar_patientImageView(){
		solo.clickOnView(avatar_patientImageView);
	}
	
	/**
	 * 点击标签患者的控件
	 * @param index
	 */
	public void clickAvatar_patientImageView(int index){
		solo.clickOnView(solo.getView("avatar_patient", index));
	}
	
	/**
	 * 点击患者头像上的删除控件
	 */
	public void clickDeleteImageView(int index){
		solo.clickOnView(solo.getView("delete", index));
	}
	
	/**
	 * 点击[删除标签]控件
	 */
	public void clickTag_delete_llLinearLayout(){
		solo.clickOnView(tag_delete_llLinearLayout);
	}
	
	/**
	 * 点击是否删除[确定]控件
	 */
	public void clickPositiveButton(){
		solo.clickOnView(solo.getView("positiveButton"));
	}
}
