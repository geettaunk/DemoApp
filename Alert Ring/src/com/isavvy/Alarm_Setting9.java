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

public class Alarm_Setting9 extends Activity {
   static String str9="04:00";
   static String r9="Mon,Tue,";
   static String n9="My Alarm";
   static String ring9="glass broken.....";
   static String vib9="";
   static String a9,b9,c9,d9,e9,f9,g9;
   static String snooze9="0 minute";
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting9);
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
					Intent i3=new Intent(Alarm_Setting9.this,Music.class);
					startService(i3);
					Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
					p++;
				}
				else if (p==1)
				{
					Intent i3=new Intent(Alarm_Setting9.this,Music.class);
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
		    str9=et_time.getText().toString();
		    n9=et_name.getText().toString();
		    ring9=et_ringtone.getText().toString();
		    snooze9=et_snooze_time.getText().toString();
		    vib9="";
		    r9="";
			 
				// TODO Auto-generated method stub
            
		 Intent i=new Intent(Alarm_Setting9.this,Main.class);
		 {
		 if (tb_vibration.isChecked())
		 {
			vib9="true";
		}
		 else {
			vib9="false";
		}
		 }
		 
		 if (snooze9.length()<=0)
		   {
		    snooze9="0 minute";	
	       }
		   if (str9.length()<=0)
			   {
			   str9="04:00";	
		       }	
		   if (n9.length()<=0)
		   {
		    n9="My Alarm";	
	       }
		   if (ring9.length()<=0)
		   {
		    ring9="glass broken.....";	
	       }
		 
			if (cb_sun.isChecked())
			{
			 	r9=r9+"Sun,";
			 	a9="true";
			}
			else 
			{
				a9="false";
			}
			
			
			if (cb_mon.isChecked())
			{
			 	r9=r9+"Mon,";
			 	b9="true";
			}
			else 
			{
				b9="false";
			}
			
			
			if (cb_tue.isChecked())
			{
			 	r9=r9+"Tue,";
			 	c9="true";
			}
			else 
			{
				c9="false";
			}
			
			
			if (cb_wed.isChecked())
			{
			 	r9=r9+"Wed,";
			 	d9="true";
			}
			else 
			{
				d9="false";
			}
			
			
			if (cb_thu.isChecked())
			{
			 	r9=r9+"Thu,";
			 	e9="true";
			}
			else 
			{
				e9="false";
			}
			
			
			if (cb_fri.isChecked())
			{
			 	r9=r9+"Fri,";
			 	f9="true";
			}
			else 
			{
				f9="false";
			}
			
			
			
			if (cb_sat.isChecked())
			{
			 	r9=r9+"Sat,";
			 	g9="true";
			}
			else 
			{
				g9="false";
			}
			
			
			if (r9=="")
			{
				r9="Mon,Tue,";
					
			}	
			

			
			startActivityForResult(i, 0);
			Toast.makeText(getApplicationContext(), "Your Alarm's"+"\n"+"\n"+"Name is "+et_name.getText().toString()+"\n"+"\n"+"Time is "
					+et_time.getText().toString()+"\n"+"\n"+"Ringtone is "+et_ringtone.getText().toString()+"\n"+"\n"+"Selected Days "+r9+"\n"+"\n"+"Snooze Time is "
					+et_snooze_time.getText().toString(), Toast.LENGTH_LONG).show();
			}
			
		});
        
        
b_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Alarm_Setting9.this,Alarm_Setting9.class);
			startActivity(i);
			}
		});
        
        et_time.setText(str9);
        et_name.setText(n9);
        et_ringtone.setText(ring9);
        et_snooze_time.setText(snooze9);
        {if (vib9=="true")
        {
			tb_vibration.setChecked(true);
		}
        else {
			tb_vibration.setChecked(false);
		}}
        
        {if (a9=="true")
        {
			cb_sun.setChecked(true);
		}
        else 
        {
        	cb_sun.setChecked(false);
		}}
        
        {if (b9=="true")
        {
			cb_mon.setChecked(true);
		}
        else 
        {
        	cb_mon.setChecked(false);
		}}
        
        {if (c9=="true")
        {
			cb_tue.setChecked(true);
		}
        else 
        {
        	cb_tue.setChecked(false);
		}}
        
        {if (d9=="true")
        {
			cb_wed.setChecked(true);
		}
        else 
        {
        	cb_wed.setChecked(false);
		}}
        
        {if (e9=="true")
        {
			cb_thu.setChecked(true);
		}
        else 
        {
        	cb_thu.setChecked(false);
		}}
        
        {if (f9=="true")
        {
			cb_fri.setChecked(true);
		}
        else 
        {
        	cb_fri.setChecked(false);
		}}
        
        {if (g9=="true")
        {
			cb_sat.setChecked(true);
		}
        else 
        {
        	cb_sat.setChecked(false);
		}}
    }
}