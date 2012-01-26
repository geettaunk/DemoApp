package com.isavvy;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends Activity {
	
//	static String video="";
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        
        Button b_1=(Button)findViewById(R.id.button1);
        Button b_2=(Button)findViewById(R.id.button2);
        Button b_3=(Button)findViewById(R.id.button4);
        Button b_ok=(Button)findViewById(R.id.button3);

        
        final VideoView vv=(VideoView)findViewById(R.id.videoView1);
        final MediaController mc=new MediaController(this);
        mc.setAnchorView(vv);
        
        Uri u=Uri.parse("sdcard/bb.3gp");
        vv.setMediaController(mc);
        vv.setVideoURI(u);
//        video ="bb.3gp";
        vv.start();
       
        
        b_1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Uri u=Uri.parse("sdcard/aa.3gp");
		        vv.setMediaController(mc);
		        vv.setVideoURI(u);
//		        video ="aa.3gp";	
		        vv.start();
		        
			}
		});
        
        b_2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Uri u=Uri.parse("sdcard/bb.3gp");
		        vv.setMediaController(mc);
		        vv.setVideoURI(u);
//		        video ="bb.3gp";
		        vv.start();
		        
			}
		});
        
       b_3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Uri u=Uri.parse("sdcard/cc.3gp");
		        vv.setMediaController(mc);
		        vv.setVideoURI(u);
//		        video ="cc.3gp";
		        vv.start();
		        
			}
		});
       
       b_ok.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i_back=new Intent( Video.this,Alarm_Setting.class);
			startActivity(i_back);
		}
	});
       
}
}