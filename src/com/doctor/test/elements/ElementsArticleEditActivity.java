package com.doctor.test.elements;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [编辑文章]界面
 * @author qpgjk
 *
 */
public class ElementsArticleEditActivity {

	private Solo solo;	
	private EditText title_edit;//[消息]输入框
	private ImageView placeholder_img;//添加图片控件
	private EditText article_msg_edit;//[文章]输入框
	private TextView right;//[保存]/[预览]控件

	public ElementsArticleEditActivity(Solo solo){
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
		placeholder_img = (ImageView) solo.getView("placeholder_img");
		article_msg_edit = (EditText) solo.getView("article_msg_edit");
		right = (TextView) solo.getView("right");
	}
	
	/**
	 * 清空[消息]输入框
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
	
	/**
	 * 点击[预览]控件
	 */
	public void clickRight(){
		solo.clickOnView(right);
	}
}
