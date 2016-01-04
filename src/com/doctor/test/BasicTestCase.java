package com.doctor.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

@SuppressWarnings("rawtypes")
abstract public class BasicTestCase extends ActivityInstrumentationTestCase2{
	
	public int time = 3000;
	public String phoneString = "18721744119";
	public String passwordString = "1234";
	
	private static String launchString = "com.kkh.activity.SplashScreenActivity";
	private static Class<?> launchClass ;
	private Solo solo;
	protected UIHelper uiHelper;
	static{
		try {
			launchClass = Class.forName(launchString);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public BasicTestCase() {
		super(launchClass);
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		try {
			super.setUp();
			init();
		} catch (Throwable th) {
			// TODO: handle exception
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new SetUpException(th);
		}
	}
	protected void init() {
		solo = new Solo(getInstrumentation(), getActivity());
		uiHelper = new UIHelper(solo);
	}

	/**
	 * 在setUp、runTest、tearDown抛出了自定义异常，这里统一进行捕获然后，确保tearDown方法被执行，用来释放资源
	 * 
	 * @throws Throwable
	 */
	@Override
	public void runBare() throws Throwable {
		try {
			super.runBare();
		} catch (SetUpException ste) {
			this.tearDown();
			throw ste;
		} catch (RunTestException rte) {
			this.tearDown();
			throw rte;
		} catch (TearDownException tde) {
			this.tearDown();
			throw tde;
		}
	}

	/**
	 * 复写runTest,捕获异常进行截图处理
	 * 
	 * @throws Throwable
	 */
	@Override
	public void runTest() throws Throwable {
		// TODO Auto-generated method stub
		try {
			super.runTest();
		} catch (Throwable th) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new RunTestException(th);
		}
		
		/*int retryTimes = 3;
		while(retryTimes > 0){
			try {
				Log.d("Robotium", "super");
				super.runTest();
				break;
			} catch (Throwable th) {
				if(retryTimes > 1){
					Log.d("Robotium", "fail,重跑--"+retryTimes);
					retryTimes--;
					this.tearDown();
					this.setUp();
					continue;
				}else{
					throw new RunTestException(th);
				}
			}
		}*/
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		try {
			solo.finishOpenedActivities();
			uiHelper = null;
			super.tearDown();
		} catch (Throwable th) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new TearDownException(th);
		}
	}
	/**
	 * 三个自定义的异常类，对应setUp时发生的异常，runTest发生的异常，tearDown发生的异常
	 * 
	 * 
	 *
	 */
	class SetUpException extends Exception{
		private static final long serialVersionUID = 1L;
		
		public SetUpException(Throwable e) {
			// TODO Auto-generated constructor stub
			super("Error in BasicTestCase.setUp()!", e);
		}
	}
	class RunTestException extends Exception {
		private static final long serialVersionUID = 2L;

		public RunTestException(Throwable e) {
			super("Error in BasicTestCase.runTest()", e);
		}
	}

	class TearDownException extends Exception {
		private static final long serialVersionUID = 3L;

		public TearDownException(Throwable e) {
			super("Error in MultiTestCase.tearDown()", e);
		}
	}
	
}
