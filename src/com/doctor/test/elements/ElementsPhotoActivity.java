package com.doctor.test.elements;

import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;

/**
 * 选择系统照片界面
 * @author qpgjk
 *
 */
public class ElementsPhotoActivity {

	private Solo solo;
	private ImageView imageView1;//图片控件
	private TextView right;//发送控件
	
	public ElementsPhotoActivity(Solo solo){
		this.solo = solo;
	}
	
	/**
	 * 选择图片
	 */
	public void clickImageView1(int index){
		solo.clickOnView(solo.getView("imageView1", index));
	}
	
	/**
	 * 点击[发送]控件
	 */
	public void clickRight(){
		solo.clickOnView(solo.getView("right"));
	}
}
