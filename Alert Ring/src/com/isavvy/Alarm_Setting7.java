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

public class Alarm_Setting7 extends Activity {
   static String str7="06:00";
   static String r7="Sat,Sun,";
   static String n7="My Alarm";
   static String ring7="glass broken.....";
   static String vib7="";
   static String a7,b7,c7,d7,e7,f7,g7;
   static String snooze7="0 minute";
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting7);
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
					Intent i3=new Intent(Alarm_Setting7.this,Music.class);
					startService(i3);
					Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
					p++;
				}
				else if (p==1)
				{
					Intent i3=new Intent(Alarm_Setting7.this,Music.class);
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
		    str7=et_time.getText().toString();
		    n7=et_name.getText().toString();
		    ring7=et_ringtone.getText().toString();
		    snooze7=et_snooze_time.getText().toString();
		    vib7="";
		    r7="";
			 
				// TODO Auto-generated method stub
            
		 Intent i=new Intent(Alarm_Setting7.this,Main.class);
		 {
		 if (tb_vibration.isChecked())
		 {
			vib7="true";
		}
		 else {
			vib7="false";
		}
		 }
		 
		 if (snooze7.length()<=0)
		   {
		    snooze7="0 minute";	
	       }
		   if (str7.length()<=0)
			   {
			   str7="06:00";	
		       }	
		   if (n7.length()<=0)
		   {
		    n7="My Alarm";	
	       }
		   if (ring7.length()<=0)
		   {
		    ring7="glass broken.....";	
	       }
		 
			if (cb_sun.isChecked())
			{
			 	r7=r7+"Sun,";
			 	a7="true";
			}
			else 
			{
				a7="false";
			}
			
			
			if (cb_mon.isChecked())
			{
			 	r7=r7+"Mon,";
			 	b7="true";
			}
			else 
			{
				b7="false";
			}
			
			
			if (cb_tue.isChecked())
			{
			 	r7=r7+"Tue,";
			 	c7="true";
			}
			else 
			{
				c7="false";
			}
			
			
			if (cb_wed.isChecked())
			{
			 	r7=r7+"Wed,";
			 	d7="true";
			}
			else 
			{
				d7="false";
			}
			
			
			if (cb_thu.isChecked())
			{
			 	r7=r7+"Thu,";
			 	e7="true";
			}
			else 
			{
				e7="false";
			}
			
			
			if (cb_fri.isChecked())
			{
			 	r7=r7+"Fri,";
			 	f7="true";
			}
			else 
			{
				f7="false";
			}
			
			
			
			if (cb_sat.isChecked())
			{
			 	r7=r7+"Sat,";
			 	g7="true";
			}
			else 
			{
				g7="false";
			}
			
			
			if (r7=="")
			{
				r7="Sat,Sun,";
					
			}	
			

			
			startActivityForResult(i, 0);
			Toast.makeText(getApplicationContext(), "Your Alarm's"+"\n"+"\n"+"Name is "+et_name.getText().toString()+"\n"+"\n"+"Time is "
					+et_time.getText().toString()+"\n"+"\n"+"Ringtone is "+et_ringtone.getText().toString()+"\n"+"\n"+"Selected Days "+r7+"\n"+"\n"+"Snooze Time is "
					+et_snooze_time.getText().toString(), Toast.LENGTH_LONG).show();
			}
			
		});
        
        
b_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Alarm_Setting7.this,Alarm_Setting7.class);
			startActivity(i);
			}
		});
        
        et_time.setText(str7);
        et_name.setText(n7);
        et_ringtone.setText(ring7);
        et_snooze_time.setText(snooze7);
        {if (vib7=="true")
        {
			tb_vibration.setChecked(true);
		}
        else {
			tb_vibration.setChecked(false);
		}}
        
        {if (a7=="true")
        {
			cb_sun.setChecked(true);
		}
        else 
        {
        	cb_sun.setChecked(false);
		}}
        
        {if (b7=="true")
        {
			cb_mon.setChecked(true);
		}
        else 
        {
        	cb_mon.setChecked(false);
		}}
        
        {if (c7=="true")
        {
			cb_tue.setChecked(true);
		}
        else 
        {
        	cb_tue.setChecked(false);
		}}
        
        {if (d7=="true")
        {
			cb_wed.setChecked(true);
		}
        else 
        {
        	cb_wed.setChecked(false);
		}}
        
        {if (e7=="true")
        {
			cb_thu.setChecked(true);
		}
        else 
        {
        	cb_thu.setChecked(false);
		}}
        
        {if (f7=="true")
        {
			cb_fri.setChecked(true);
		}
        else 
        {
        	cb_fri.setChecked(false);
		}}
        
        {if (g7=="true")
        {
			cb_sat.setChecked(true);
		}
        else 
        {
        	cb_sat.setChecked(false);
		}}
    }
}