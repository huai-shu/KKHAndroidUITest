package com.doctor.test.elements;

import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 门诊内容界面
 * @author qpgjk
 *
 */
public class ElementsOutpatientTypeActivity {

	private Solo solo;
	private TextView categoryTextView;
	
	public ElementsOutpatientTypeActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	
	public void initViews(){
		categoryTextView = (TextView) solo.getView("category");//门诊类型控件
	}
	
	/**
	 * 获得门诊类型控件
	 * @return
	 */
	public TextView getCategoryTextView(){
		return categoryTextView;
	}
	
	/**
	 * 点击门诊类型控件
	 * @param text
	 */
	public void clickCategoryTextView(String text){
		solo.clickOnText(text);
	}
}
