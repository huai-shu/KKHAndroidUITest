package com.doctor.test;

import com.doctor.test.elements.ElementsAboutUsActivity;
import com.doctor.test.elements.ElementsAddBankActivity;
import com.doctor.test.elements.ElementsAddMessageTemplateActivity;
import com.doctor.test.elements.ElementsAddPatientInLabelActivity;
import com.doctor.test.elements.ElementsAddPatientLabelActivity;
import com.doctor.test.elements.ElementsAlipayActivity;
import com.doctor.test.elements.ElementsAnnouncementActivity;
import com.doctor.test.elements.ElementsAppointTimeActivity;
import com.doctor.test.elements.ElementsArticleDetailActivity;
import com.doctor.test.elements.ElementsArticleEditActivity;
import com.doctor.test.elements.ElementsArticlePreviewActivity;
import com.doctor.test.elements.ElementsBlockedPatientsActivity;
import com.doctor.test.elements.ElementsCashEditActivity;
import com.doctor.test.elements.ElementsCashWayActivity;
import com.doctor.test.elements.ElementsChangeForAppointActivity;
import com.doctor.test.elements.ElementsChangeForMessageActivity;
import com.doctor.test.elements.ElementsChangeForPhoneActivity;
import com.doctor.test.elements.ElementsChangeForPrescribeActivity;
import com.doctor.test.elements.ElementsChangePriceActivity;
import com.doctor.test.elements.ElementsChooseTransferDoctorActivity;
import com.doctor.test.elements.ElementsChooseTransferInfoActivity;
import com.doctor.test.elements.ElementsDoctorHomepageActivity;
import com.doctor.test.elements.ElementsDoctorList;
import com.doctor.test.elements.ElementsDoctorsCircleActivity;
import com.doctor.test.elements.ElementsDraftsActivity;
import com.doctor.test.elements.ElementsDutyRoomAccountActivity;
import com.doctor.test.elements.ElementsDutyRoomActivity;
import com.doctor.test.elements.ElementsDutyRoomMessageSendActivity;
import com.doctor.test.elements.ElementsDutyRoomQuestionListActivity;
import com.doctor.test.elements.ElementsDutyRoomQuestionPondActivity;
import com.doctor.test.elements.ElementsEditPatientLabelActivity;
import com.doctor.test.elements.ElementsFeatureActivity;
import com.doctor.test.elements.ElementsFindDoctorsActivity;
import com.doctor.test.elements.ElementsGroupAddActivity;
import com.doctor.test.elements.ElementsGroupActivity;
import com.doctor.test.elements.ElementsGroupChooseLabelActivity;
import com.doctor.test.elements.ElementsHistoryPhotoActivity;
import com.doctor.test.elements.ElementsIncomeActivity;
import com.doctor.test.elements.ElementsLabelPatientDataActivity;
import com.doctor.test.elements.ElementsLeaderbroadActivity;
import com.doctor.test.elements.ElementsLoginActivity;
import com.doctor.test.elements.ElementsMeActivity;
import com.doctor.test.elements.ElementsMePraiseActivity;
import com.doctor.test.elements.ElementsMessageActivity;
import com.doctor.test.elements.ElementsMessageSendActivity;
import com.doctor.test.elements.ElementsMessageTemplateActivity;
import com.doctor.test.elements.ElementsMoreActivity;
import com.doctor.test.elements.ElementsMyAppleActivity;
import com.doctor.test.elements.ElementsMyArticleActivity;
import com.doctor.test.elements.ElementsMyCardActivity;
import com.doctor.test.elements.ElementsMyGreetingActivity;
import com.doctor.test.elements.ElementsNewfeatureActivity;
import com.doctor.test.elements.ElementsOutpatientTypeActivity;
import com.doctor.test.elements.ElementsPatientDataActivity;
import com.doctor.test.elements.ElementsPatientLabelActivity;
import com.doctor.test.elements.ElementsPatientRemarkActivity;
import com.doctor.test.elements.ElementsPatientSettingActivity;
import com.doctor.test.elements.ElementsPatientsActivity;
import com.doctor.test.elements.ElementsPhotoActivity;
import com.doctor.test.elements.ElementsPraiseMeActivity;
import com.doctor.test.elements.ElementsRemarkNameActivity;
import com.doctor.test.elements.ElementsSearchMessageActivity;
import com.doctor.test.elements.ElementsSettingActivity;
import com.doctor.test.elements.ElementsTransferStateActivity;
import com.doctor.test.elements.ElementsVisitTimeActivity;
import com.doctor.test.elements.ElementsWeekActivity;
import com.doctor.test.elements.ElementsWorkExperienceActivity;
import com.doctor.test.elements.ElementspatientTransferDataActivity;
import com.robotium.solo.Solo;

public class UIHelper {
	private Solo solo = null;
	private ElementsLoginActivity elementsLoginActivity;//登录界面
	private ElementsMessageActivity elementsMessageActivity;//消息界面
	private ElementsMessageSendActivity elementsMessageSendActivity;//聊天室界面
	private ElementsGroupActivity elementsGroupActivity;//群发界面
	private ElementsGroupAddActivity elementsGroupAddActivity;//[新建群发]界面
	private ElementsSearchMessageActivity elementsSearchMessageActivity;//搜索消息界面
	private ElementsMessageTemplateActivity elementsMessageTemplateActivity;//我的常用语界面
	private ElementsAddMessageTemplateActivity elementsAddMessageTemplateActivity;//新增常用语界面
	private ElementsDoctorsCircleActivity elementsDocotrsCircleActivity;//医生圈界面
	private ElementsMeActivity elementsMeActivity;//我界面
	private ElementsMyCardActivity elementsMyCardActivity;//我的名片界面
	private ElementsVisitTimeActivity elementsVisitTimeActivity;//出诊时间界面
	private ElementsWeekActivity elementsWeekActivity;//出诊时间星期界面
	private ElementsOutpatientTypeActivity elementsOutpatientTypeActivity;//门诊内容界面
	private ElementsFeatureActivity elementsFeatureActivity;//专长界面
	private ElementsWorkExperienceActivity elementsWorkExperienceActivity;//从业经历界面
	private ElementsSettingActivity elementsSettingActivity;//设置界面
	private ElementsChangeForMessageActivity elementsChangeForMessageActivity;//控制图文咨询界面
	private ElementsChangeForPhoneActivity elementsChangeForPhoneActivity;//控制电话咨询界面
	private ElementsChangeForPrescribeActivity elementsChangeForPrescribeActivity;//控制配药服务
	private ElementsChangeForAppointActivity elementsChangeForAppointActivity;//控制加号服务界面
	private ElementsAppointTimeActivity elementsAppointTimeActivity;//加号时段界面
	private ElementsPatientLabelActivity elementsPatientLabelActivity;//患者标签界面 
	private ElementsAddPatientLabelActivity elementsAddPatientLabelActivity;//新建标签界面
	private ElementsEditPatientLabelActivity elementsEditPatientLabelActivity;//编辑标签界面
	private ElementsAddPatientInLabelActivity elementsAddPatientInLabelActivity;//在标签中[添加患者]界面界面
	private ElementsLabelPatientDataActivity elementsLabelPatientDataActivity;//标签的[患者资料]界面
	private ElementsMoreActivity elementsMoreActivity;//[更多]界面 
	private ElementsMyAppleActivity elementsMyAppleActivity;//[我的苹果]界面
	private ElementsPatientDataActivity elementsPatientDataActivity;//[患者资料]界面
	private ElementsPatientRemarkActivity elementsPatientRemarkActivity;//患者备注界面
	private ElementsRemarkNameActivity elementsRemarkNameActivity;//[备注名]界面
	private ElementsMyArticleActivity elementsMyArticleActivity;//[我的文章]界面 
	private ElementsArticleDetailActivity elementsArticleDetailActivity;//[文章]详情界面
	private ElementsPatientSettingActivity elementsPatientSettingActivity;//[患者设置]界面
	private ElementsPatientsActivity elementsPatientsActivity;//[患者]界面 
	private ElementsPhotoActivity elementsPhotoActivity;//选择系统照片界面
	private ElementsHistoryPhotoActivity elementsHistoryPhotoActivity;//[历史图片]界面
	private ElementsBlockedPatientsActivity elementsBlockedPatientsActivity;//[患者黑名单]界面
	private ElementsFindDoctorsActivity elementsFindDocotrsActivity;//[找医生]界面
	private ElementsDoctorHomepageActivity elementsDocotrHomepageActivity;//[医生主页]界面
	private ElementsPraiseMeActivity elementsPraiseMeActivity;//[赞过我的]界面
	private ElementsMePraiseActivity elementsMePraiseActivity;//[我赞过的]界面
	private ElementsDoctorList elementsDoctorList;//[医生列表]界面
	private ElementsLeaderbroadActivity elementsLeaderbroadActivity;//[排行榜]界面
	private ElementsDraftsActivity elementsDraftsActivity;//草稿列表
	private ElementsIncomeActivity elementsIncomeActivity;//[收入结算]界面
	private ElementsCashWayActivity elementsCashWayActivity;//[提现方式]界面
	private ElementsAlipayActivity elementsAlipayActivity;//[添加支付宝]界面
	private ElementsAddBankActivity elementsAddBankActivity;//[添加银行卡]界面
	private ElementsCashEditActivity elementsCashEditActivity;//支付[编辑]界面
	private ElementsChangePriceActivity elementsChangePriceActivity;//[调整收费]界面
	private ElementsNewfeatureActivity elementsNewfeatureActivity;//[新功能介绍]界面
	private ElementsAboutUsActivity elementsAboutUsActivity;//[关于我们]界面
	private ElementsGroupChooseLabelActivity elementsGroupChooseLabelActivity;//选择患者标签界面
	private ElementsArticlePreviewActivity elementsArticlePreviewActivity;//[文章预览]界面
	private ElementsArticleEditActivity elementsArticleEditActivity;//[编辑文章]界面
	private ElementspatientTransferDataActivity elementspatientTransferDataActivity;//[患者转诊资料]界面
	private ElementsChooseTransferDoctorActivity elementsChooseTransferDoctorActivity;//[选择转诊医生]界面
	private ElementsChooseTransferInfoActivity elementsChooseTransferInfoActivity;//[转诊详情信息]界面
	private ElementsTransferStateActivity elementsTransferStateActivity;//[转诊状态]界面
	private ElementsMyGreetingActivity elementsMyGreetingActivity;//[我的欢迎语]界面
	private ElementsAnnouncementActivity elementsAnnouncementActivity;//[Announcement]界面
	private ElementsDutyRoomActivity elementsDutyRoomActivity;//[值班室]界面
	private ElementsDutyRoomMessageSendActivity elementsDutyRoomMessageSendActivity;//[值班室]聊天界面
	private ElementsDutyRoomQuestionListActivity elementsDutyRoomQuestionListActivity;//[值班室]抢到的问题界面
	private ElementsDutyRoomQuestionPondActivity elementsDutyRoomQuestionPondActivity;//[值班室]问题池界面
	private ElementsDutyRoomAccountActivity elementsDutyRoomAccountActivity;//[值班室]账单
	
	public UIHelper(Solo solo){
		this.solo = solo;
	}

	public Solo getSolo() {
		return solo;
	}

	/**
	 * 登录界面的对象
	 * @Method:getElementsLoginActivity
	 * @Parameter type:UIHelper
	 * @return
	 * @Return:ElementsLoginActivity
	 */
	public ElementsLoginActivity getElementsLoginActivity() {
		if (elementsLoginActivity != null) {
			return elementsLoginActivity;
		} else {
			elementsLoginActivity = new ElementsLoginActivity(solo);
			return elementsLoginActivity;
		}
	}
	/**
	 * 消息首页的对象
	 * @Method:getElementsMessageActivity
	 * @Parameter type:UIHelper
	 * @return
	 * @Return:ElementsMessageActivity
	 */
	public ElementsMessageActivity getElementsMessageActivity(){
			elementsMessageActivity = new ElementsMessageActivity(solo);
			return elementsMessageActivity;
		
	}
	/**
	 * 群发界面
	 * @Method:getElementsGroupSendActivity
	 * @Parameter type:UIHelper
	 * @return
	 * @Return:ElementsGroupSendActivity
	 */
	public ElementsGroupActivity getElementsGroupActivity(){
			elementsGroupActivity = new ElementsGroupActivity(solo);
			return elementsGroupActivity;
	}
	/**
	 * [新建群发]界面
	 * @Method:getElementsGroupMessageSendActivity
	 * @Parameter type:UIHelper
	 * @return
	 * @Return:ElementsGroupMessageSendActivity
	 */
	public ElementsGroupAddActivity getElementsGroupAddActivity(){
			elementsGroupAddActivity = new ElementsGroupAddActivity(solo);
			return elementsGroupAddActivity;
	}

	/**
	 * 搜索消息界面的对象
	 * @Method:getElementsSearchMessageActivity
	 * @Parameter type:UIHelper
	 * @return
	 * @Return:ElementsSearchMessageActivity
	 */
	public ElementsSearchMessageActivity getElementsSearchMessageActivity(){
		if (elementsSearchMessageActivity != null) {
			return elementsSearchMessageActivity;
		}else {
			elementsSearchMessageActivity = new ElementsSearchMessageActivity(solo);
			return elementsSearchMessageActivity;
		}
	}
	
	/**
	 * 聊天室界面
	 * @return
	 */
	public ElementsMessageSendActivity getElementsMessageSendActivity(){
			elementsMessageSendActivity = new ElementsMessageSendActivity(solo);
			return elementsMessageSendActivity;
	}
	
	/**
	 * 我的常用语界面
	 * @return
	 */
	public ElementsMessageTemplateActivity getElementsMessageTemplateActivity(){
		if(elementsMessageTemplateActivity != null){
			return elementsMessageTemplateActivity;
		}else {
			elementsMessageTemplateActivity = new ElementsMessageTemplateActivity(solo);
			return elementsMessageTemplateActivity;
		}
	}
	
	/**
	 *新增常用语界面 
	 * @return
	 */
	public ElementsAddMessageTemplateActivity getElementsAddMessageTemplateActivity(){
		if(elementsAddMessageTemplateActivity != null){
			return elementsAddMessageTemplateActivity;
		}else {
			elementsAddMessageTemplateActivity = new ElementsAddMessageTemplateActivity(solo);
			return elementsAddMessageTemplateActivity;
		}
	}
	
	/**
	 * 医生圈界面
	 * @return
	 */
	public ElementsDoctorsCircleActivity getElementsDocotrsCircleActivity(){
		if(elementsDocotrsCircleActivity !=null){
			return elementsDocotrsCircleActivity;
		}else {
			elementsDocotrsCircleActivity = new ElementsDoctorsCircleActivity(solo);
			return elementsDocotrsCircleActivity;
		}
	}
	
	/**
	 * 我界面
	 * @return
	 */
	public ElementsMeActivity getElementsMeActivity(){
			elementsMeActivity = new ElementsMeActivity(solo);
			return elementsMeActivity;
	}
	
	/**
	 * 我的名片界面
	 * @return
	 */
	public ElementsMyCardActivity getElementsMyCardActivity(){
		if(elementsMyCardActivity != null){
			return elementsMyCardActivity;
		}else {
			elementsMyCardActivity = new ElementsMyCardActivity(solo);
			return elementsMyCardActivity;
		}
	}
	
	/**
	 * 出诊时间界面
	 * @return
	 */
	public ElementsVisitTimeActivity getElementsVisitTimeActivity(){
		if(elementsVisitTimeActivity !=null){
			return elementsVisitTimeActivity;
		}else {
			elementsVisitTimeActivity = new ElementsVisitTimeActivity(solo);
			return elementsVisitTimeActivity;
		}
	}
	
	/**
	 * 出诊时间星期界面
	 * @return
	 */
	public ElementsWeekActivity getElementsWeekActivity(){
		if(elementsWeekActivity != null){
			return elementsWeekActivity;
		}else {
			elementsWeekActivity = new ElementsWeekActivity(solo);
			return elementsWeekActivity;
		}
	}
	
	/**
	 * 门诊内容界面
	 * @return
	 */
	public ElementsOutpatientTypeActivity getElementsOutpatientTypeActivity(){
		if(elementsOutpatientTypeActivity != null){
			return elementsOutpatientTypeActivity;
		}else {
			elementsOutpatientTypeActivity = new ElementsOutpatientTypeActivity(solo);
			return elementsOutpatientTypeActivity;
		}
	}
	
	/**
	 * 专长界面
	 * @return
	 */
	public ElementsFeatureActivity getElementsFeatureActivity(){
		if(elementsFeatureActivity != null){
			return elementsFeatureActivity;
		}else {
			elementsFeatureActivity = new ElementsFeatureActivity(solo);
			return elementsFeatureActivity;
		}
	}
	
	/**
	 * 从业经历界面
	 * @return
	 */
	public ElementsWorkExperienceActivity getElementsWorkExperienceActivity(){
		if(elementsWorkExperienceActivity != null){
			return elementsWorkExperienceActivity;
		}else {
			elementsWorkExperienceActivity = new ElementsWorkExperienceActivity(solo);
			return elementsWorkExperienceActivity;
		}
	}
	
	/**
	 * 设置界面
	 * @return
	 */
	public ElementsSettingActivity getElementsSettingActivity(){
			elementsSettingActivity = new ElementsSettingActivity(solo);
			return elementsSettingActivity;
	}
	
	/**
	 * 控制图文咨询界面
	 * @return
	 */
	public ElementsChangeForMessageActivity getElementsChangeForMessageActivity(){
			elementsChangeForMessageActivity = new ElementsChangeForMessageActivity(solo);
			return elementsChangeForMessageActivity;
	}
	
	/**
	 * 控制电话咨询界面
	 * @return
	 */
	public ElementsChangeForPhoneActivity getElementsChangeForPhoneActivity(){
			elementsChangeForPhoneActivity = new ElementsChangeForPhoneActivity(solo);
			return elementsChangeForPhoneActivity;
	}
	
	/**
	 * 控制配药服务界面
	 * @return
	 */
	public ElementsChangeForPrescribeActivity getElementsChangeForPrescribeActivity(){
			elementsChangeForPrescribeActivity = new ElementsChangeForPrescribeActivity(solo);
			return elementsChangeForPrescribeActivity;
	}
	
	/**
	 * 控制加号服务界面
	 * @return
	 */
	public ElementsChangeForAppointActivity getElementsChangeForAppointActivity(){
			elementsChangeForAppointActivity = new ElementsChangeForAppointActivity(solo);
			return elementsChangeForAppointActivity;
	}
	
	/**
	 * 加号时段界面
	 * @return
	 */
	public ElementsAppointTimeActivity getElementsAppointTimeActivity(){
		if(elementsAppointTimeActivity != null){
			return elementsAppointTimeActivity;
		}else {
			elementsAppointTimeActivity = new ElementsAppointTimeActivity(solo);
			return elementsAppointTimeActivity;
		}
	}
	
	/**
	 * 患者标签界面
	 * @return
	 */
	public ElementsPatientLabelActivity getElementsPatientLabelActivity(){
		if(elementsPatientLabelActivity != null){
			return elementsPatientLabelActivity;
		}else {
			elementsPatientLabelActivity = new ElementsPatientLabelActivity(solo);
			return elementsPatientLabelActivity;
		}
	}
	
	/**
	 * 新建标签界面/编辑标签名字界面
	 * @return
	 */
	public ElementsAddPatientLabelActivity getElementsAddPatientLabelActivity(){
		if(elementsAddPatientLabelActivity != null){
			return elementsAddPatientLabelActivity;
		}else {
			elementsAddPatientLabelActivity = new ElementsAddPatientLabelActivity(solo);
			return elementsAddPatientLabelActivity;
		}
	}
	
	/**
	 * 编辑标签界面
	 * @return
	 */
	public ElementsEditPatientLabelActivity getElementsEditPatientLabelActivity(){
		if(elementsEditPatientLabelActivity != null){
			return elementsEditPatientLabelActivity;
		}else {
			elementsEditPatientLabelActivity = new ElementsEditPatientLabelActivity(solo);
			return elementsEditPatientLabelActivity;
		}
	}
	
	/**
	 * 标签[添加患者]界面
	 * @return
	 */
	public ElementsAddPatientInLabelActivity getElementsAddPatientInLabelActivity(){
		if(elementsAddPatientInLabelActivity != null){
			return elementsAddPatientInLabelActivity;
		}else {
			elementsAddPatientInLabelActivity = new ElementsAddPatientInLabelActivity(solo);
			return elementsAddPatientInLabelActivity;
		}
	}
	
	/**
	 * 标签的[患者资料]界面
	 * @return
	 */
	public ElementsLabelPatientDataActivity getElementsLabelPatientDataActivity(){
		if(elementsLabelPatientDataActivity != null){
			return elementsLabelPatientDataActivity;
		}else {
			elementsLabelPatientDataActivity = new ElementsLabelPatientDataActivity(solo);
			return elementsLabelPatientDataActivity;
		}
	}
	
	/**
	 * [更多]界面
	 * @return
	 */
	public ElementsMoreActivity getElementsMoreActivity(){
		if(elementsMoreActivity != null){
			return elementsMoreActivity;
		}else {
			elementsMoreActivity = new ElementsMoreActivity(solo);
			return elementsMoreActivity;
		}
	}
	
	/**
	 * [我的苹果]界面
	 * @return
	 */
	public ElementsMyAppleActivity getElementsMyAppleActivity(){
		if(elementsMyAppleActivity != null){
			return elementsMyAppleActivity;
		}else {
			elementsMyAppleActivity = new ElementsMyAppleActivity(solo);
			return elementsMyAppleActivity;
		}
	}
	
	/**
	 * [患者资料]界面
	 * @return
	 */
	public ElementsPatientDataActivity getElementsPatientDataActivity(){
			elementsPatientDataActivity = new ElementsPatientDataActivity(solo);
			return elementsPatientDataActivity;
	}
	
	/**
	 * [患者备注]界面
	 * @return
	 */
	public ElementsPatientRemarkActivity getElementsPatientRemarkActivity(){
		if(elementsPatientRemarkActivity != null){
			return elementsPatientRemarkActivity;
		}else {
			elementsPatientRemarkActivity = new ElementsPatientRemarkActivity(solo);
			return elementsPatientRemarkActivity;
		}
	}
	
	/**
	 * [备注名]界面
	 * @return
	 */
	public ElementsRemarkNameActivity getElementsRemarkNameActivity(){
			elementsRemarkNameActivity = new ElementsRemarkNameActivity(solo);
			return elementsRemarkNameActivity;
	}
	
	/**
	 * [我的文章]界面
	 * @return
	 */
	public ElementsMyArticleActivity getElementsMyArticleActivity(){
			elementsMyArticleActivity = new ElementsMyArticleActivity(solo);
			return elementsMyArticleActivity;
	}
	
	/**
	 * [文章]详情界面
	 * @return
	 */
	public ElementsArticleDetailActivity getElementsArticleDetailActivity(){
		if(elementsArticleDetailActivity !=null){
			return elementsArticleDetailActivity;
		}else {
			elementsArticleDetailActivity = new ElementsArticleDetailActivity(solo);
			return elementsArticleDetailActivity;
		}
	}
	
	/**
	 * [患者设置]界面
	 * @return
	 */
	public ElementsPatientSettingActivity getElementsPatientSettingActivity(){
			elementsPatientSettingActivity = new ElementsPatientSettingActivity(solo);
			return elementsPatientSettingActivity;
	}
	
	/**
	 * [患者]界面
	 * @return
	 */
	public ElementsPatientsActivity getElementsPatientsActivity(){
		if(elementsPatientsActivity != null){
			return elementsPatientsActivity;
		}else{
			elementsPatientsActivity = new ElementsPatientsActivity(solo);
			return elementsPatientsActivity;
		}
	}
	
	/**
	 * 选择系统照片界面
	 * @return
	 */
	public ElementsPhotoActivity getElementsPhotoActivity(){
		if(elementsPhotoActivity != null){
			return elementsPhotoActivity;
		}else{
			elementsPhotoActivity = new ElementsPhotoActivity(solo);
			return elementsPhotoActivity;
		}
	}
	
	/**
	 * [历史图片]界面
	 * @return
	 */
	public ElementsHistoryPhotoActivity getElementsHistoryPhotoActivity(){
		elementsHistoryPhotoActivity = new ElementsHistoryPhotoActivity(solo);
		return elementsHistoryPhotoActivity;
	}
	
	/**
	 * [患者黑名单]界面
	 * @return
	 */
	public ElementsBlockedPatientsActivity getBlockedPatientsActivity(){
		elementsBlockedPatientsActivity = new ElementsBlockedPatientsActivity(solo);
		return elementsBlockedPatientsActivity;
	}
	
	/**
	 * [找医生]界面
	 * @return
	 */
	public ElementsFindDoctorsActivity getElementsFindDocotrsActivity(){
		elementsFindDocotrsActivity = new ElementsFindDoctorsActivity(solo);
		return elementsFindDocotrsActivity;
	}
	
	/**
	 * 医生主页界面
	 * @return
	 */
	public ElementsDoctorHomepageActivity getElementsDocotrHomepageActivity(){
		elementsDocotrHomepageActivity = new ElementsDoctorHomepageActivity(solo);
		return elementsDocotrHomepageActivity;
	}
	
	/**
	 * [赞过我的]界面
	 * @return
	 */
	public ElementsPraiseMeActivity getElementsPraiseMeActivity(){
		elementsPraiseMeActivity = new ElementsPraiseMeActivity(solo);
		return elementsPraiseMeActivity;
	}
	
	/**
	 * [我赞过的]界面
	 * @return
	 */
	public ElementsMePraiseActivity getElementsMePraiseActivity(){
		elementsMePraiseActivity = new ElementsMePraiseActivity(solo);
		return elementsMePraiseActivity;
	}
	
	/**
	 * [医生列表]界面
	 * @return
	 */
	public ElementsDoctorList getElementsDoctorList(){
		elementsDoctorList = new ElementsDoctorList(solo);
		return elementsDoctorList;
	}
	
	/**
	 * [排行榜]界面
	 * @return
	 */
	public ElementsLeaderbroadActivity getElementsLeaderbroadActivity(){
		elementsLeaderbroadActivity = new ElementsLeaderbroadActivity(solo);
		return elementsLeaderbroadActivity;
	}
	
	/**
	 * 草稿列表
	 * @return
	 */
	public ElementsDraftsActivity getElementsDraftsActivity(){
		elementsDraftsActivity = new ElementsDraftsActivity(solo);
		return elementsDraftsActivity;
	}
	
	/**
	 * [收入结算]界面
	 * @return
	 */
	public ElementsIncomeActivity getElementsIncomeActivity(){
		elementsIncomeActivity = new ElementsIncomeActivity(solo);
		return elementsIncomeActivity;
	}
	
	/**
	 * [提现方式]界面
	 * @return
	 */
	public ElementsCashWayActivity getElementsCashWayActivity(){
		elementsCashWayActivity = new ElementsCashWayActivity(solo);
		return elementsCashWayActivity;
	}
	
	/**
	 * [添加支付宝]界面
	 * @return
	 */
	public ElementsAlipayActivity getElementsAlipayActivity(){
		elementsAlipayActivity = new ElementsAlipayActivity(solo);
		return elementsAlipayActivity;
	}
	
	/**
	 * [添加银行卡]界面
	 * @return
	 */
	public ElementsAddBankActivity getElementsAddBankActivity(){
		elementsAddBankActivity = new ElementsAddBankActivity(solo);
		return elementsAddBankActivity;
	}
	
	/**
	 * 支付[编辑]界面
	 * @return
	 */
	public ElementsCashEditActivity getElementsCashEditActivity(){
		elementsCashEditActivity = new ElementsCashEditActivity(solo);
		return elementsCashEditActivity;
	}
	
	/**
	 * [调整收费]界面
	 * @return
	 */
	public ElementsChangePriceActivity getElementsChangePriceActivity(){
		elementsChangePriceActivity = new ElementsChangePriceActivity(solo);
		return elementsChangePriceActivity;
	}
	
	/**
	 * [新功能介绍]界面
	 * @return
	 */
	public ElementsNewfeatureActivity getElementsNewfeatureActivity(){
		elementsNewfeatureActivity = new ElementsNewfeatureActivity(solo);
		return elementsNewfeatureActivity;
	}
	
	/**
	 * [关于我们]界面
	 * @return
	 */
	public ElementsAboutUsActivity getElementsAboutUsActivity(){
		elementsAboutUsActivity = new ElementsAboutUsActivity(solo);
		return elementsAboutUsActivity;
	}
	
	/**
	 * 选择患者标签界面
	 * @return
	 */
	public ElementsGroupChooseLabelActivity geteLementsGroupChooseLabelActivity(){
		elementsGroupChooseLabelActivity = new ElementsGroupChooseLabelActivity(solo);
		return elementsGroupChooseLabelActivity;
	}
	
	/**
	 * [文章预览]界面
	 * @return
	 */
	public ElementsArticlePreviewActivity getElementsArticlePreviewActivity(){
		elementsArticlePreviewActivity = new ElementsArticlePreviewActivity(solo);
		return elementsArticlePreviewActivity;
	}
	
	/**
	 * [编辑文章]界面
	 * @return
	 */
	public ElementsArticleEditActivity getElementsArticleEditActivity(){
		elementsArticleEditActivity = new ElementsArticleEditActivity(solo);
		return elementsArticleEditActivity;
	}
	
	/**
	 * [患者转诊资料]界面
	 * @return
	 */
	public ElementspatientTransferDataActivity getElementspatientTransferDataActivity(){
		elementspatientTransferDataActivity = new ElementspatientTransferDataActivity(solo);
		return elementspatientTransferDataActivity;
	}
	
	/**
	 * [选择转诊医生]界面
	 * @return
	 */
	public ElementsChooseTransferDoctorActivity getElementsChooseTransferDoctorActivity(){
		elementsChooseTransferDoctorActivity = new ElementsChooseTransferDoctorActivity(solo);
		return elementsChooseTransferDoctorActivity;
	}
	
	/**
	 * [转诊详情信息]界面
	 * @return
	 */
	public ElementsChooseTransferInfoActivity getElementsChooseTransferInfoActivity(){
		elementsChooseTransferInfoActivity = new ElementsChooseTransferInfoActivity(solo);
		return elementsChooseTransferInfoActivity;
	}
	
	/**
	 * [转诊状态]界面
	 * @return
	 */
	public ElementsTransferStateActivity getElementsTransferStateActivity(){
		elementsTransferStateActivity = new ElementsTransferStateActivity(solo);
		return elementsTransferStateActivity;
	}
	
	/**
	 * [我的欢迎语]界面
	 * @return
	 */
	public ElementsMyGreetingActivity getElementsMyGreetingActivity(){
		elementsMyGreetingActivity = new ElementsMyGreetingActivity(solo);
		return elementsMyGreetingActivity;
	}
	
	/**
	 * [Announcement]界面
	 * @return
	 */
	public ElementsAnnouncementActivity getElementsAnnouncementActivity(){
		elementsAnnouncementActivity = new ElementsAnnouncementActivity(solo);
		return elementsAnnouncementActivity;
	}
	
	/**
	 * [值班室]界面
	 * @return
	 */
	public ElementsDutyRoomActivity getElementsDutyRoomActivity(){
		elementsDutyRoomActivity = new ElementsDutyRoomActivity(solo);
		return elementsDutyRoomActivity;
	}
	
	/**
	 * [值班室]聊天界面
	 * @param solo
	 * @return
	 */
	public ElementsDutyRoomMessageSendActivity getElementsDutyRoomMessageSendActivity(){
		elementsDutyRoomMessageSendActivity = new ElementsDutyRoomMessageSendActivity(solo);
		return elementsDutyRoomMessageSendActivity;
	}
	
	/**
	 * [值班室]抢到的问题界面
	 * @return
	 */
	public ElementsDutyRoomQuestionListActivity getElementsDutyRoomQuestionListActivity(){
		elementsDutyRoomQuestionListActivity = new ElementsDutyRoomQuestionListActivity(solo);
		return elementsDutyRoomQuestionListActivity;
	}
	
	/**
	 * [值班室]问题池界面
	 * @return
	 */
	public ElementsDutyRoomQuestionPondActivity getElementsDutyRoomQuestionPondActivity(){
		elementsDutyRoomQuestionPondActivity = new ElementsDutyRoomQuestionPondActivity(solo);
		return elementsDutyRoomQuestionPondActivity;
	}
	
	public ElementsDutyRoomAccountActivity getElementsDutyRoomAccountActivity(){
		elementsDutyRoomAccountActivity = new ElementsDutyRoomAccountActivity(solo);
		return elementsDutyRoomAccountActivity;
	}
}