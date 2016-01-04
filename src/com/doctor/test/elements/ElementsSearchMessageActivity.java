package com.doctor.test.elements;

import android.widget.EditText;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 搜索消息界面
 * @author qpgjk
 *
 */
public class ElementsSearchMessageActivity {
	private Solo solo;
	private EditText editTextView;
	private TextView name_show;
	public ElementsSearchMessageActivity(Solo solo){
		this.solo = solo;
		initViews();
	}
	/**
	 * 初始化控件
	 * @Method:initViews
	 * @Parameter type:ElementsSearchActivity
	 * @Return:void
	 */
	public void initViews(){
		editTextView = (EditText)solo.getView("search_edit");
	}
	/**
	 * 获得搜索文本框
	 * @Method:getEditText
	 * @Parameter type:ElementsSearchActivity
	 * @return
	 * @Return:EditText
	 */
	public EditText getEditText(){
		return editTextView;
	}
	/**
	 * 清空搜索文本框
	 * @Method:clearEditText
	 * @Parameter type:ElementsSearchMessageActivity
	 * @Return:void
	 */
	public void clearEditText(){
		solo.clearEditText(editTextView);
	}
	/**
	 * 输入搜索文本
	 * @Method:enterEditText
	 * @Parameter type:ElementsSearchActivity
	 * @param text
	 * @Return:void
	 */
	public void enterEditText(String text){
		solo.enterText(editTextView, text);
	}
	/**
	 * 点击列表中的某一行
	 * @Method:clickInList
	 * @Parameter type:ElementsSearchActivity
	 * @param line
	 * @param index
	 * @Return:void
	 */
	public void clickInList(int line, int index){
		solo.clickInList(line, index);
	}
	
	/**
	 * 获得第一个搜索结果患者的姓名
	 * @return
	 */
	public String getName_show() {
		name_show = (TextView) solo.getView("name_show");
		return name_show.getText().toString();
	}

}
