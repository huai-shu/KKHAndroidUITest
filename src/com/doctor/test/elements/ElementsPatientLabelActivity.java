package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 患者标签界面
 * @author qpgjk
 *
 */
public class ElementsPatientLabelActivity {
	
	private Solo solo;
	private ImageView leftImageView;
	private TextView tag_nameTextView;
	//private TextView tag_friendship_countTextView;
	private TextView rightTextView;
	
	public ElementsPatientLabelActivity(Solo solo){
		this.solo = solo;
		initView();
	}
	
	public void initView(){
		leftImageView = (ImageView) solo.getView("left"); //返回控件
		tag_nameTextView = (TextView) solo.getView("tag_name");//标签名称
		//tag_friendship_countTextView = (TextView) solo.getView("tag_friendship_count");//标签人数控件
		rightTextView = (TextView) solo.getView("right");//保存控件
	}	
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得标签名称控件
	 * @return
	 */
	public TextView getTag_nameTextView(){
		return tag_nameTextView;
	}
	
	/**
	 * 获得标签名称名称控件
	 * @param index
	 * @return
	 */
	public TextView getTag_nameTextView(int index){
		return (TextView) solo.getView("tag_name", index);
	}
	
	/**
	 * 获得标签人数控件 
	 * @return
	 */
	public TextView getTag_friendship_countTextView(){
		return (TextView) solo.getView("tag_friendship_count");
	}
	
	/**
	 * 获得标签人数控件 
	 * @return
	 */
	public TextView getTag_friendship_countTextView(int index){
		return (TextView) solo.getView("tag_friendship_count", index);
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
	
	/**
	 * 获得标签名称文字
	 * @param index
	 * @return
	 */
	public String getTextTag_nameTextView(int index){
		return getTag_nameTextView(index).getText().toString();
	}
	
	/**
	 * 点击患者标签
	 * @param index
	 */
	public void clickTag_nameTextView(int index){
		solo.clickOnView(getTag_nameTextView(index));
	}
	
	/**
	 * 获得标签人数文字
	 * @return
	 */
	public String getTextTag_friendship_countTextView(int index){
		return getTag_friendship_countTextView(index).getText().toString();
	}
	
	/**
	 * 获得保存控件
	 * @return
	 */
	public TextView getRightTextView(){
		return rightTextView;
	}
	
	/**
	 * 点击保存控件
	 */
	public void clickRightTextView(){
		solo.clickOnView(rightTextView);
	}
}
