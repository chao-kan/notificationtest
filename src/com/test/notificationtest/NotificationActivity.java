package com.test.notificationtest;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

public class NotificationActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification_layout);
		
		NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
		manager.cancel(1);   //����������1��ӦMainActivity.java�е�manager.notify(1,notification)�е�id 1
	}
}
