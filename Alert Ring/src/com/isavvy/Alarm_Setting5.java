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

public class Alarm_Setting5 extends Activity {
   static String str5="08:00";
   static String r5="Thu,Fri,";
   static String n5="My Alarm";
   static String ring5="glass broken.....";
   static String vib5="";
   static String a5,b5,c5,d5,e5,f5,g5;
   static String snooze5="0 minute";
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting5);
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
					Intent i3=new Intent(Alarm_Setting5.this,Music.class);
					startService(i3);
					Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
					p++;
				}
				else if (p==1)
				{
					Intent i3=new Intent(Alarm_Setting5.this,Music.class);
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
		    str5=et_time.getText().toString();
		    n5=et_name.getText().toString();
		    ring5=et_ringtone.getText().toString();
		    snooze5=et_snooze_time.getText().toString();
		    vib5="";
		    r5="";
			 
				// TODO Auto-generated method stub
            
		 Intent i=new Intent(Alarm_Setting5.this,Main.class);
		 {
		 if (tb_vibration.isChecked())
		 {
			vib5="true";
		}
		 else {
			vib5="false";
		}
		 }
		 
		 if (snooze5.length()<=0)
		   {
		    snooze5="0 minute";	
	       }
		   if (str5.length()<=0)
			   {
			   str5="08:00";	
		       }	
		   if (n5.length()<=0)
		   {
		    n5="My Alarm";	
	       }
		   if (ring5.length()<=0)
		   {
		    ring5="glass broken.....";	
	       }
		 
			if (cb_sun.isChecked())
			{
			 	r5=r5+"Sun,";
			 	a5="true";
			}
			else 
			{
				a5="false";
			}
			
			
			if (cb_mon.isChecked())
			{
			 	r5=r5+"Mon,";
			 	b5="true";
			}
			else 
			{
				b5="false";
			}
			
			
			if (cb_tue.isChecked())
			{
			 	r5=r5+"Tue,";
			 	c5="true";
			}
			else 
			{
				c5="false";
			}
			
			
			if (cb_wed.isChecked())
			{
			 	r5=r5+"Wed,";
			 	d5="true";
			}
			else 
			{
				d5="false";
			}
			
			
			if (cb_thu.isChecked())
			{
			 	r5=r5+"Thu,";
			 	e5="true";
			}
			else 
			{
				e5="false";
			}
			
			
			if (cb_fri.isChecked())
			{
			 	r5=r5+"Fri,";
			 	f5="true";
			}
			else 
			{
				f5="false";
			}
			
			
			
			if (cb_sat.isChecked())
			{
			 	r5=r5+"Sat,";
			 	g5="true";
			}
			else 
			{
				g5="false";
			}
			
			
			if (r5=="")
			{
				r5="Thu,Fri,";
					
			}	
			

			
			startActivityForResult(i, 0);
			Toast.makeText(getApplicationContext(), "Your Alarm's"+"\n"+"\n"+"Name is "+et_name.getText().toString()+"\n"+"\n"+"Time is "
					+et_time.getText().toString()+"\n"+"\n"+"Ringtone is "+et_ringtone.getText().toString()+"\n"+"\n"+"Selected Days "+r5+"\n"+"\n"+"Snooze Time is "
					+et_snooze_time.getText().toString(), Toast.LENGTH_LONG).show();
			}
			
		});
        
        
b_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Alarm_Setting5.this,Alarm_Setting5.class);
			startActivity(i);
			}
		});
        
        et_time.setText(str5);
        et_name.setText(n5);
        et_ringtone.setText(ring5);
        et_snooze_time.setText(snooze5);
        {if (vib5=="true")
        {
			tb_vibration.setChecked(true);
		}
        else {
			tb_vibration.setChecked(false);
		}}
        
        {if (a5=="true")
        {
			cb_sun.setChecked(true);
		}
        else 
        {
        	cb_sun.setChecked(false);
		}}
        
        {if (b5=="true")
        {
			cb_mon.setChecked(true);
		}
        else 
        {
        	cb_mon.setChecked(false);
		}}
        
        {if (c5=="true")
        {
			cb_tue.setChecked(true);
		}
        else 
        {
        	cb_tue.setChecked(false);
		}}
        
        {if (d5=="true")
        {
			cb_wed.setChecked(true);
		}
        else 
        {
        	cb_wed.setChecked(false);
		}}
        
        {if (e5=="true")
        {
			cb_thu.setChecked(true);
		}
        else 
        {
        	cb_thu.setChecked(false);
		}}
        
        {if (f5=="true")
        {
			cb_fri.setChecked(true);
		}
        else 
        {
        	cb_fri.setChecked(false);
		}}
        
        {if (g5=="true")
        {
			cb_sat.setChecked(true);
		}
        else 
        {
        	cb_sat.setChecked(false);
		}}
    }
}