package com.networkrequestframework;

import com.loopj.android.http.AsyncHttpClient;
import com.networkrequestframework.ApiHttpClient;

import android.app.Application;


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
