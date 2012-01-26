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

public class Alarm_Setting6 extends Activity {
   static String str6="07:00";
   static String r6="Fri,Sat,";
   static String n6="My Alarm";
   static String ring6="glass broken.....";
   static String vib6="";
   static String a6,b6,c6,d6,e6,f6,g6;
   static String snooze6="0 minute";
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting6);
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
					Intent i3=new Intent(Alarm_Setting6.this,Music.class);
					startService(i3);
					Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
					p++;
				}
				else if (p==1)
				{
					Intent i3=new Intent(Alarm_Setting6.this,Music.class);
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
		    str6=et_time.getText().toString();
		    n6=et_name.getText().toString();
		    ring6=et_ringtone.getText().toString();
		    snooze6=et_snooze_time.getText().toString();
		    vib6="";
		    r6="";
			 
				// TODO Auto-generated method stub
            
		 Intent i=new Intent(Alarm_Setting6.this,Main.class);
		 {
		 if (tb_vibration.isChecked())
		 {
			vib6="true";
		}
		 else {
			vib6="false";
		}
		 }
		 
		 if (snooze6.length()<=0)
		   {
		    snooze6="0 minute";	
	       }
		   if (str6.length()<=0)
			   {
			   str6="07:00";	
		       }	
		   if (n6.length()<=0)
		   {
		    n6="My Alarm";	
	       }
		   if (ring6.length()<=0)
		   {
		    ring6="glass broken.....";	
	       }
		 
			if (cb_sun.isChecked())
			{
			 	r6=r6+"Sun,";
			 	a6="true";
			}
			else 
			{
				a6="false";
			}
			
			
			if (cb_mon.isChecked())
			{
			 	r6=r6+"Mon,";
			 	b6="true";
			}
			else 
			{
				b6="false";
			}
			
			
			if (cb_tue.isChecked())
			{
			 	r6=r6+"Tue,";
			 	c6="true";
			}
			else 
			{
				c6="false";
			}
			
			
			if (cb_wed.isChecked())
			{
			 	r6=r6+"Wed,";
			 	d6="true";
			}
			else 
			{
				d6="false";
			}
			
			
			if (cb_thu.isChecked())
			{
			 	r6=r6+"Thu,";
			 	e6="true";
			}
			else 
			{
				e6="false";
			}
			
			
			if (cb_fri.isChecked())
			{
			 	r6=r6+"Fri,";
			 	f6="true";
			}
			else 
			{
				f6="false";
			}
			
			
			
			if (cb_sat.isChecked())
			{
			 	r6=r6+"Sat,";
			 	g6="true";
			}
			else 
			{
				g6="false";
			}
			
			
			if (r6=="")
			{
				r6="Fri,Sat,";
					
			}	
			

			
			startActivityForResult(i, 0);
			Toast.makeText(getApplicationContext(), "Your Alarm's"+"\n"+"\n"+"Name is "+et_name.getText().toString()+"\n"+"\n"+"Time is "
					+et_time.getText().toString()+"\n"+"\n"+"Ringtone is "+et_ringtone.getText().toString()+"\n"+"\n"+"Selected Days "+r6+"\n"+"\n"+"Snooze Time is "
					+et_snooze_time.getText().toString(), Toast.LENGTH_LONG).show();
			}
			
		});
        
        
b_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Alarm_Setting6.this,Alarm_Setting6.class);
			startActivity(i);
			}
		});
        
        et_time.setText(str6);
        et_name.setText(n6);
        et_ringtone.setText(ring6);
        et_snooze_time.setText(snooze6);
        {if (vib6=="true")
        {
			tb_vibration.setChecked(true);
		}
        else {
			tb_vibration.setChecked(false);
		}}
        
        {if (a6=="true")
        {
			cb_sun.setChecked(true);
		}
        else 
        {
        	cb_sun.setChecked(false);
		}}
        
        {if (b6=="true")
        {
			cb_mon.setChecked(true);
		}
        else 
        {
        	cb_mon.setChecked(false);
		}}
        
        {if (c6=="true")
        {
			cb_tue.setChecked(true);
		}
        else 
        {
        	cb_tue.setChecked(false);
		}}
        
        {if (d6=="true")
        {
			cb_wed.setChecked(true);
		}
        else 
        {
        	cb_wed.setChecked(false);
		}}
        
        {if (e6=="true")
        {
			cb_thu.setChecked(true);
		}
        else 
        {
        	cb_thu.setChecked(false);
		}}
        
        {if (f6=="true")
        {
			cb_fri.setChecked(true);
		}
        else 
        {
        	cb_fri.setChecked(false);
		}}
        
        {if (g6=="true")
        {
			cb_sat.setChecked(true);
		}
        else 
        {
        	cb_sat.setChecked(false);
		}}
    }
}