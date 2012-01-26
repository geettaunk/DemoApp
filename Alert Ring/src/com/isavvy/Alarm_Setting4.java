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

public class Alarm_Setting4 extends Activity {
   static String str4="09:00";
   static String r4="Wed,Thu,";
   static String n4="My Alarm";
   static String ring4="glass broken.....";
   static String vib4="";
   static String a4,b4,c4,d4,e4,f4,g4;
   static String snooze4="0 minute";
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting4);
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
					Intent i3=new Intent(Alarm_Setting4.this,Music.class);
					startService(i3);
					Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
					p++;
				}
				else if (p==1)
				{
					Intent i3=new Intent(Alarm_Setting4.this,Music.class);
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
		    str4=et_time.getText().toString();
		    n4=et_name.getText().toString();
		    ring4=et_ringtone.getText().toString();
		    snooze4=et_snooze_time.getText().toString();
		    vib4="";
		    r4="";
			 
				// TODO Auto-generated method stub
            
		 Intent i=new Intent(Alarm_Setting4.this,Main.class);
		 {
		 if (tb_vibration.isChecked())
		 {
			vib4="true";
		}
		 else {
			vib4="false";
		}
		 }
		 
		 if (snooze4.length()<=0)
		   {
		    snooze4="0 minute";	
	       }
		   if (str4.length()<=0)
			   {
			   str4="09:00";	
		       }	
		   if (n4.length()<=0)
		   {
		    n4="My Alarm";	
	       }
		   if (ring4.length()<=0)
		   {
		    ring4="glass broken.....";	
	       }
		 
			if (cb_sun.isChecked())
			{
			 	r4=r4+"Sun,";
			 	a4="true";
			}
			else 
			{
				a4="false";
			}
			
			
			if (cb_mon.isChecked())
			{
			 	r4=r4+"Mon,";
			 	b4="true";
			}
			else 
			{
				b4="false";
			}
			
			
			if (cb_tue.isChecked())
			{
			 	r4=r4+"Tue,";
			 	c4="true";
			}
			else 
			{
				c4="false";
			}
			
			
			if (cb_wed.isChecked())
			{
			 	r4=r4+"Wed,";
			 	d4="true";
			}
			else 
			{
				d4="false";
			}
			
			
			if (cb_thu.isChecked())
			{
			 	r4=r4+"Thu,";
			 	e4="true";
			}
			else 
			{
				e4="false";
			}
			
			
			if (cb_fri.isChecked())
			{
			 	r4=r4+"Fri,";
			 	f4="true";
			}
			else 
			{
				f4="false";
			}
			
			
			
			if (cb_sat.isChecked())
			{
			 	r4=r4+"Sat,";
			 	g4="true";
			}
			else 
			{
				g4="false";
			}
			
			
			if (r4=="")
			{
				r4="Wed,Thu";
					
			}	
			

			
			startActivityForResult(i, 0);
			Toast.makeText(getApplicationContext(), "Your Alarm's"+"\n"+"\n"+"Name is "+et_name.getText().toString()+"\n"+"\n"+"Time is "
					+et_time.getText().toString()+"\n"+"\n"+"Ringtone is "+et_ringtone.getText().toString()+"\n"+"\n"+"Selected Days "+r4+"\n"+"\n"+"Snooze Time is "
					+et_snooze_time.getText().toString(), Toast.LENGTH_LONG).show();
			}
			
		});
        
        
b_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Alarm_Setting4.this,Alarm_Setting4.class);
			startActivity(i);
			}
		});
        
        et_time.setText(str4);
        et_name.setText(n4);
        et_ringtone.setText(ring4);
        et_snooze_time.setText(snooze4);
        {if (vib4=="true")
        {
			tb_vibration.setChecked(true);
		}
        else {
			tb_vibration.setChecked(false);
		}}
        
        {if (a4=="true")
        {
			cb_sun.setChecked(true);
		}
        else 
        {
        	cb_sun.setChecked(false);
		}}
        
        {if (b4=="true")
        {
			cb_mon.setChecked(true);
		}
        else 
        {
        	cb_mon.setChecked(false);
		}}
        
        {if (c4=="true")
        {
			cb_tue.setChecked(true);
		}
        else 
        {
        	cb_tue.setChecked(false);
		}}
        
        {if (d4=="true")
        {
			cb_wed.setChecked(true);
		}
        else 
        {
        	cb_wed.setChecked(false);
		}}
        
        {if (e4=="true")
        {
			cb_thu.setChecked(true);
		}
        else 
        {
        	cb_thu.setChecked(false);
		}}
        
        {if (f4=="true")
        {
			cb_fri.setChecked(true);
		}
        else 
        {
        	cb_fri.setChecked(false);
		}}
        
        {if (g4=="true")
        {
			cb_sat.setChecked(true);
		}
        else 
        {
        	cb_sat.setChecked(false);
		}}
    }
}