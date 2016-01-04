package com.doctor.test.elements;

import android.widget.ImageView;
import com.robotium.solo.Solo;

/**
 * [我的文章]界面
 * @author qpgjk
 *
 */
public class ElementsMyArticleActivity {
 
	private Solo solo;
	private ImageView article_img;
	private ImageView leftImageView;
	private ImageView more_selected_img;//文章更多[。。。]控件
	
	public ElementsMyArticleActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		article_img = (ImageView) solo.getView("article_img");//文章列表
		leftImageView = (ImageView) solo.getView("left");//返回控件
		more_selected_img = (ImageView) solo.getView("more_selected_img");
	}
	
	/**
	 * 获得文章图片控件列表
	 * @return
	 */
	public ImageView getOut_layoutRelativeLayout(){
		return article_img;
	}
	
	/**
	 * 获得文章图片控件
	 * @param index
	 * @return
	 */
	public ImageView getArticle_img(int index){
		return (ImageView) solo.getView("article_img", index);
	}
	
	/**
	 * 点击文章列表
	 * @param index
	 */
	public void clickArticle_img(int index){
		solo.clickOnView(getArticle_img(index));
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
	
	/**
	 * 点击[...]控件
	 */
	public void clickMore_selected_img(int index){
		solo.clickOnView(solo.getView("more_selected_img", index));
	}
}
