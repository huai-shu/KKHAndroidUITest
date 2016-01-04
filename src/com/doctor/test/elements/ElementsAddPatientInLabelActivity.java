package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 在标签中[添加患者]界面
 * @author qpgjk
 *
 */
public class ElementsAddPatientInLabelActivity { 
	
	private Solo solo;
	private ImageView leftImageView;
	private RelativeLayout out_layoutRelativeLayout;
	private TextView text_showTextView;
	private TextView rightTextView;

	public ElementsAddPatientInLabelActivity(Solo solo){
		this.solo = solo;
		initView();
	}

	public void initView() {
		leftImageView = (ImageView) solo.getView("left");//返回控件
		out_layoutRelativeLayout = (RelativeLayout) solo.getView("out_layout");//患者列表控件
		text_showTextView = (TextView) solo.getView("text_show");//[从陌生患者导入]控件
		rightTextView = (TextView) solo.getView("right");//[确定]控件
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftImageView(){
		return leftImageView;
	}
	
	/**
	 * 获得患者列表控件
	 * @return
	 */
	public RelativeLayout getOut_layoutRelativeLayout(){
		return out_layoutRelativeLayout;
	}
	
	/**
	 * 获得患者列表控件
	 * @return
	 */
	public RelativeLayout getOut_layoutRelativeLayout(int index){
		return (RelativeLayout) solo.getView("out_layout", index);
	}
	
	/**
	 * 获得[从陌生患者导入]控件
	 * @return
	 */
	public TextView getText_showTextView(){
		return text_showTextView;
	}
	
	/**
	 * 获得[确定]控件
	 * @return
	 */
	public TextView getRightTextView(){
		return rightTextView;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftImageView(){
		solo.clickOnView(leftImageView);
	}
	
	/**
	 * 点击患者列表控件
	 */
	public void clickOut_layoutRelativeLayout(int index){
		solo.clickOnView(getOut_layoutRelativeLayout(index));
	}
	
	/**
	 * 点击[从陌生患者导入]控件
	 */
	public void clickText_showTextView(){
		solo.clickOnView(text_showTextView);
	}
	
	/**
	 * 点击[确定]控件
	 */
	public void clickRightTextView(){
		solo.clickOnView(rightTextView);
	}
}
