package com.isavvy;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class Home extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        NotificationManager nm=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        Notification n=new Notification(R.drawable.icon, "Welcome", System.currentTimeMillis());
        Intent i=new Intent(Home.this,Home.class);
        PendingIntent pi=PendingIntent.getActivity(this, 0, i, 0);
        n.flags=Notification.FLAG_AUTO_CANCEL;
        n.setLatestEventInfo(getApplicationContext(), "Hello", "Friend", pi);
        nm.notify(1, n);
        
    }
}