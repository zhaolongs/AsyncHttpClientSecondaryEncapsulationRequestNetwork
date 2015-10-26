package com.example.networkrequestframeworks;


import java.io.InputStream;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.ResponseHandlerInterface;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	private String partUrl = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
//
//	public void getData(View view){
//
//		ApiHttpClient.get("", handler);
//	}
//
//
//
//	AsyncHttpResponseHandler handler = new AsyncHttpResponseHandler() {
//
//		@Override
//		public void onSuccess(int arg0, Header[] arg1, byte[] arg2) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void onFailure(int arg0, Header[] arg1, byte[] arg2, Throwable arg3) {
//			// TODO Auto-generated method stub
//
//		}
//
//	}
//}











