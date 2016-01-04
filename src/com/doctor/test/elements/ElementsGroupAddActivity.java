package com.doctor.test.elements;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.robotium.solo.Solo;

/**
 * [新建群发]界面
 * @author qpgjk
 *
 */
public class ElementsGroupAddActivity {

	private Solo solo;	
	private EditText title_edit;//[消息]输入框
	private Button sent_btn;//[发送]控件
	private ImageView placeholder_img;//添加图片控件
	private EditText article_msg_edit;//[文章]输入框

	public ElementsGroupAddActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	/**
	 * 初始化
	 * @Method:initViews
	 * @Parameter type:ElementsGroupMessageSendActivity
	 * @Return:void
	 */
	private void initViews() {
		title_edit = (EditText) solo.getView("title_edit");
		sent_btn = (Button) solo.getView("sent_btn");
		placeholder_img = (ImageView) solo.getView("placeholder_img");
		article_msg_edit = (EditText) solo.getView("article_msg_edit");
	}
	
	/**
	 * 清空[消息]/标题输入框
	 */
	public void clearTitle_edit(){
		solo.clearEditText(title_edit);
	}
	
	/**
	 * [消息]输入框输入内容
	 * @param text
	 */
	public void enterTitle_edit(String text){
		solo.enterText(title_edit, text);
	}
	
	/**
	 * 点击[发送]控件
	 */
	public void clickSent_btn(){
		solo.clickOnView(sent_btn);
	}
	
	/**
	 * 选择群发类型
	 * @param index
	 */
	public void clickLabel(int index){
		solo.clickOnView(solo.getView("label", index));
	}
	
	/**
	 * 点击添加图片控件
	 */
	public void clickPlaceholder_img(){
		solo.clickOnView(placeholder_img);
	}
	
	/**
	 * 清空[文章]内容输入框
	 */
	public void clearArticle_msg_edit(){
		solo.clearEditText(article_msg_edit);
	}
	
	/**
	 * 输入[文章]内容
	 * @param text
	 */
	public void enterArticle_msg_edit(String text){
		solo.enterText(article_msg_edit, text);
	}
	
}
