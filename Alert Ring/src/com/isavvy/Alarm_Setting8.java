package com.isavvy;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Alarm_Setting8 extends Activity {
   static String str8="05:00";
   static String r8="Sun,Mon,";
   static String n8="My Alarm";
   static String ring8="glass broken.....";
   static String vib8="";
   static String a8,b8,c8,d8,e8,f8,g8;
   static String snooze8="0 minute";
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting8);
        final EditText et_name=(EditText)findViewById(R.id.editText1);
        final EditText et_time=(EditText)findViewById(R.id.editText2);
        final EditText et_ringtone=(EditText)findViewById(R.id.editText3);
        final EditText et_snooze_time=(EditText)findViewById(R.id.editText4);
        final ToggleButton tb_vibration=(ToggleButton)findViewById(R.id.toggleButton1);
        final CheckBox cb_sun=(CheckBox)findViewById(R.id.checkBox1);
        final CheckBox cb_mon=(CheckBox)findViewById(R.id.checkBox2);
        final CheckBox cb_tue=(CheckBox)findViewById(R.id.checkBox3);
        final CheckBox cb_wed=(CheckBox)findViewById(R.id.checkBox4);
        final CheckBox cb_thu=(CheckBox)findViewById(R.id.checkBox5);
        final CheckBox cb_fri=(CheckBox)findViewById(R.id.checkBox6);
        final CheckBox cb_sat=(CheckBox)findViewById(R.id.checkBox7);
        Button b_browse=(Button)findViewById(R.id.button1);
        Button b_save=(Button)findViewById(R.id.button2);
        Button b_cancel=(Button)findViewById(R.id.button3);
        

      
        
        et_ringtone.setOnClickListener(new View.OnClickListener() {
        	int p=0;
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (p==0)
				{
					Intent i3=new Intent(Alarm_Setting8.this,Music.class);
					startService(i3);
					Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
					p++;
				}
				else if (p==1)
				{
					Intent i3=new Intent(Alarm_Setting8.this,Music.class);
					stopService(i3);
					Toast.makeText(getApplicationContext(), "Stop", Toast.LENGTH_SHORT).show();
					p--;
				}
				
			}
		});
        
        b_browse.setOnClickListener(new View.OnClickListener() {
        	
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("content://media/external/images/media/"));
			startActivity(i);
				
				
			}
		});
        
        b_save.setOnClickListener(new View.OnClickListener() {	
        	
			@Override
			public void onClick(View v) {
		    str8=et_time.getText().toString();
		    n8=et_name.getText().toString();
		    ring8=et_ringtone.getText().toString();
		    snooze8=et_snooze_time.getText().toString();
		    vib8="";
		    r8="";
			 
				// TODO Auto-generated method stub
            
		 Intent i=new Intent(Alarm_Setting8.this,Main.class);
		 {
		 if (tb_vibration.isChecked())
		 {
			vib8="true";
		}
		 else {
			vib8="false";
		}
		 }
		 
		 if (snooze8.length()<=0)
		   {
		    snooze8="0 minute";	
	       }
		   if (str8.length()<=0)
			   {
			   str8="05:00";	
		       }	
		   if (n8.length()<=0)
		   {
		    n8="My Alarm";	
	       }
		   if (ring8.length()<=0)
		   {
		    ring8="glass broken.....";	
	       }
		 
			if (cb_sun.isChecked())
			{
			 	r8=r8+"Sun,";
			 	a8="true";
			}
			else 
			{
				a8="false";
			}
			
			
			if (cb_mon.isChecked())
			{
			 	r8=r8+"Mon,";
			 	b8="true";
			}
			else 
			{
				b8="false";
			}
			
			
			if (cb_tue.isChecked())
			{
			 	r8=r8+"Tue,";
			 	c8="true";
			}
			else 
			{
				c8="false";
			}
			
			
			if (cb_wed.isChecked())
			{
			 	r8=r8+"Wed,";
			 	d8="true";
			}
			else 
			{
				d8="false";
			}
			
			
			if (cb_thu.isChecked())
			{
			 	r8=r8+"Thu,";
			 	e8="true";
			}
			else 
			{
				e8="false";
			}
			
			
			if (cb_fri.isChecked())
			{
			 	r8=r8+"Fri,";
			 	f8="true";
			}
			else 
			{
				f8="false";
			}
			
			
			
			if (cb_sat.isChecked())
			{
			 	r8=r8+"Sat,";
			 	g8="true";
			}
			else 
			{
				g8="false";
			}
			
			
			if (r8=="")
			{
				r8="Sun,Mon,";
					
			}	
			

			
			startActivityForResult(i, 0);
			Toast.makeText(getApplicationContext(), "Your Alarm's"+"\n"+"\n"+"Name is "+et_name.getText().toString()+"\n"+"\n"+"Time is "
					+et_time.getText().toString()+"\n"+"\n"+"Ringtone is "+et_ringtone.getText().toString()+"\n"+"\n"+"Selected Days "+r8+"\n"+"\n"+"Snooze Time is "
					+et_snooze_time.getText().toString(), Toast.LENGTH_LONG).show();
			}
			
		});
        
        
b_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Alarm_Setting8.this,Alarm_Setting8.class);
			startActivity(i);
			}
		});
        
        et_time.setText(str8);
        et_name.setText(n8);
        et_ringtone.setText(ring8);
        et_snooze_time.setText(snooze8);
        {if (vib8=="true")
        {
			tb_vibration.setChecked(true);
		}
        else {
			tb_vibration.setChecked(false);
		}}
        
        {if (a8=="true")
        {
			cb_sun.setChecked(true);
		}
        else 
        {
        	cb_sun.setChecked(false);
		}}
        
        {if (b8=="true")
        {
			cb_mon.setChecked(true);
		}
        else 
        {
        	cb_mon.setChecked(false);
		}}
        
        {if (c8=="true")
        {
			cb_tue.setChecked(true);
		}
        else 
        {
        	cb_tue.setChecked(false);
		}}
        
        {if (d8=="true")
        {
			cb_wed.setChecked(true);
		}
        else 
        {
        	cb_wed.setChecked(false);
		}}
        
        {if (e8=="true")
        {
			cb_thu.setChecked(true);
		}
        else 
        {
        	cb_thu.setChecked(false);
		}}
        
        {if (f8=="true")
        {
			cb_fri.setChecked(true);
		}
        else 
        {
        	cb_fri.setChecked(false);
		}}
        
        {if (g8=="true")
        {
			cb_sat.setChecked(true);
		}
        else 
        {
        	cb_sat.setChecked(false);
		}}
    }
}