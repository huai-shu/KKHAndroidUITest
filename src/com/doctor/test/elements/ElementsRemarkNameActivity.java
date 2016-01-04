package com.doctor.test.elements;

import android.widget.EditText;
import android.widget.ImageView;
import com.robotium.solo.Solo;

/**
 * 备注名界面
 * @author qpgjk
 *
 */
public class ElementsRemarkNameActivity {

	private Solo solo;
	private EditText editorEditText;
	private ImageView leftTextView;
	
	public ElementsRemarkNameActivity(Solo solo){
		this.solo = solo;
		initViews();
	}

	public void initViews() {
		editorEditText = (EditText) solo.getView("editor");//备注名输入框控件
		leftTextView = (ImageView) solo.getView("left");//返回控件
	}
	
	/**
	 * 获得患者备注名输入框控件
	 * @return
	 */
	public EditText getEditorEditText(){
		return editorEditText;
	}
	
	/**
	 * 输入备注名
	 * @param text
	 */
	public void enterEditorEditText(String text){
		solo.enterText(editorEditText, text);
	}
	
	/**
	 * 清除备注名
	 */
	public void clearEditorEditText(){
		solo.clearEditText(editorEditText);
	}
	
	/**
	 * 获得返回控件
	 * @return
	 */
	public ImageView getLeftTextView(){
		return leftTextView;
	}
	
	/**
	 * 点击返回控件
	 */
	public void clickLeftTextView(){
		solo.clickOnView(leftTextView);
	}
}
