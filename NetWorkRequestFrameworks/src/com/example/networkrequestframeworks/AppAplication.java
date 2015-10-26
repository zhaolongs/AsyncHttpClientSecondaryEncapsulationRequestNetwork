package com.example.networkrequestframeworks;

import android.app.Application;

import com.loopj.android.http.AsyncHttpClient;


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
