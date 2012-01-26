package com.isavvy;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class Music extends Service {
	MediaPlayer mp;

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
	mp = MediaPlayer.create(this, R.raw.glass);
		
		super.onCreate();
	}
	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
	
		mp.start();
		
		super.onStart(intent, startId);
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
	
		mp.stop();

		super.onDestroy();
	}

}
