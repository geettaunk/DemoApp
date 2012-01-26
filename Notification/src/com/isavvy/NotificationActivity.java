package com.isavvy;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public class NotificationActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        AlertDialog.Builder ad=new AlertDialog.Builder(this);
        ad.setIcon(R.drawable.icon);
        ad.setTitle("Hello");
        ad.setMessage("Are You Sure?");

        ad.setPositiveButton("Yes", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Intent i=new Intent(NotificationActivity.this,Second.class);
				startActivity(i);
				
			}
		});
        ad.setNegativeButton("No", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Intent i=new Intent(NotificationActivity.this,Third.class);
				startActivity(i);
			}
		});
        ad.setNeutralButton("Cancel", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
			
			}
		});
        ad.show();
    }
}