package com.doctor.test.elements;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * [患者资料]界面
 * @author qpgjk
 *
 */
public class ElementsPatientDataActivity {

	private Solo solo; 
	private TextView remark_name_showTextView;
	private ImageView leftImageView;
	private RelativeLayout tags_layoutRelativeLayout;
	//private TextView text_showTextView; 
	private LinearLayout remark_llLinearLayout;
	private TextView remark_editTextView;
	private TextView remark_name_addTextView;
	private ImageView rightImageView;//右上角[...]
	private Button send_message_btn;//[发送消息]控件
	private ImageView avatar;//患者头像
	private RelativeLayout album_layout;//[历史图片]一栏
	private ImageView remark_name_edit;//[编辑]控件
	
	public ElementsPatientDataActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		remark_name_showTextView = (TextView) solo.getView("remark_name_show");//患者资料姓名控件
		leftImageView = (ImageView) solo.getView("left");//返回控件
		tags_layoutRelativeLayout = (RelativeLayout) solo.getView("tags_layout");//标签一栏
		//text_showTextView = (TextView) solo.getView("text_show");//标签
		remark_llLinearLayout = (LinearLayout) solo.getView("remark_ll");//备注一栏
		remark_editTextView = (TextView) solo.getView("remark_edit");//备注内容
		remark_name_addTextView = (TextView) solo.getView("remark_name_add");//备注名控件
		avatar = (ImageView) solo.getView("avatar");
		album_layout = (RelativeLayout) solo.getView("album_layout");
		remark_name_edit = (ImageView) solo.getView("remark_name_edit");
	}
	
	/**
	 * 获得患者资料姓名控件
	 * @return
	 */
	public TextView getRemark_name_showTextView(){
		return remark_name_showTextView;
	}
	
	/**
	 * 获得患者资料姓名文字
	 * @return
	 */
	public String getTextRemark_name_showTextView(){
		return ((TextView)solo.getView("remark_name_show")).getText().toString();
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
		solo.clickOnView(solo.getView("left"));
	}
	
	/**
	 * 获得标签一栏
	 * @return
	 */
	public RelativeLayout getTags_layoutRelativeLayout(){
		return tags_layoutRelativeLayout;
	}
	
	/**
	 * 点击标签一栏
	 */
	public void clickTags_layoutRelativeLayout(){
		solo.clickOnView(tags_layoutRelativeLayout);
	}
	
	/**
	 * 获得标签控件
	 * @return
	 */
	public TextView getText_showTextView(){
		return (TextView) solo.getView("text_show");
	}
	
	/**
	 * 获得标签控件
	 * @param index
	 * @return
	 */
	public TextView getText_showTextView(int index){
		return (TextView) solo.getView("text_show", index);
	}
	
	/**
	 * 获得标签名字
	 * @param index
	 * @return
	 */
	public String getTextText_showTextView(int index){
		return getText_showTextView(index).getText().toString();
	}
	
	/**
	 * 获得备注一栏控件
	 * @return
	 */
	public LinearLayout getRemark_llLinearLayout(){
		return remark_llLinearLayout;
	}
	
	/**
	 * 点击备注一栏
	 */
	public void clickRemark_llLinearLayout(){
		solo.clickOnView(remark_llLinearLayout);
	}
	
	/**
	 * 获得备注内容控件
	 * @return
	 */
	public TextView getRemark_editTextView(){
		return remark_editTextView;
	}
	
	/**
	 * 获得备注内容
	 * @return
	 */
	public String getTextRemark_editTextView(){
		return ((TextView) solo.getView("remark_edit")).getText().toString();
	}
	
	/**
	 * 获得备注名控件
	 * @return
	 */
	public TextView getRemark_name_addTextView(){
		return remark_name_addTextView;
	}
	
	/**
	 * 点击备注名控件
	 */
	public void clickRemark_name_addTextView(){
		solo.clickOnView(remark_name_addTextView);
	}
	
	/**
	 * 点击右上角[...]
	 */
	public void clickRightImageView(){
		solo.clickOnView(solo.getView("right"));
	}
	
	/**
	 * 点击[发送消息]控件
	 */
	public void clickSend_message_btn(){
		solo.clickOnView(solo.getView("send_message_btn"));
	}
	
	/**
	 * 点击患者头像
	 */
	public void clickAvatar(){
		solo.clickOnView(avatar);
	}
	
	/**
	 * 点击[历史图片]一栏
	 */
	public void clickAlbum_layout(){
		solo.clickOnView(album_layout);
	}
	
	/**
	 * 点击[编辑]控件
	 */
	public void clickRemark_name_edit(){
		solo.clickOnView(remark_name_edit);
	}
}
