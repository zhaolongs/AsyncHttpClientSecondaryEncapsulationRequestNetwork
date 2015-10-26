# AsyncHttpClientSecondaryEncapsulationRequestNetwork
依赖AsyncHttpClient网络请求框架,进行了二次封装，解决多次调用网络请求的多次创建对象，优化代码的编写规范


使用方法  

首先Copy本项目中的相关的类到相应的Android项目工程中

在AppAplication   进行框架的初始化操作

public class AppAplication  extends Application{

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		init();
	}

	private void init() {
	
		AsyncHttpClient client = new AsyncHttpClient();
		ApiHttpClient.setHttpClient(client);
	}
}


其次修改  class ApiHttpClient 中的url信息

public class ApiHttpClient {

    public final static String HOST = "www.oschina.net";
    private static String API_URL = "http://www.oschina.net/%s";
    
    public final static String HOST_LOCAL = "192.168.21.31";
    private static String API_URL_LOCAL = "http://192.168.21.31:8080/%s";
    
    // public final static String HOST = "192.168.1.46";
    // private static String API_URL = "http://192.168.1.46/%s";




在需要请求网络数据的模块中设置


       ApiHttpClient.get(url, handler);


	AsyncHttpResponseHandler handler = new AsyncHttpResponseHandler() {

//数据请求成功调用此方法
		@Override
		public void onSuccess(int arg0, Header[] arg1, byte[] arg2) {
			// TODO Auto-generated method stub

		}
//数据请求失败调用此方法
		@Override
		public void onFailure(int arg0, Header[] arg1, byte[] arg2, Throwable arg3) {
			// TODO Auto-generated method stub

//		}
//




