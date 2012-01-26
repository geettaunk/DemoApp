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

public class Alarm_Setting10 extends Activity {
   static String str10="03:00";
   static String r10="Tue,Wed,";
   static String n10="My Alarm";
   static String ring10="glass broken.....";
   static String vib10="";
   static String a10,b10,c10,d10,e10,f10,g10;
   static String snooze10="0 minute";
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting10);
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
					Intent i3=new Intent(Alarm_Setting10.this,Music.class);
					startService(i3);
					Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
					p++;
				}
				else if (p==1)
				{
					Intent i3=new Intent(Alarm_Setting10.this,Music.class);
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
		    str10=et_time.getText().toString();
		    n10=et_name.getText().toString();
		    ring10=et_ringtone.getText().toString();
		    snooze10=et_snooze_time.getText().toString();
		    vib10="";
		    r10="";
			 
				// TODO Auto-generated method stub
            
		 Intent i=new Intent(Alarm_Setting10.this,Main.class);
		 {
		 if (tb_vibration.isChecked())
		 {
			vib10="true";
		}
		 else {
			vib10="false";
		}
		 }
		 
		 if (snooze10.length()<=0)
		   {
		    snooze10="0 minute";	
	       }
		   if (str10.length()<=0)
			   {
			   str10="03:00";	
		       }	
		   if (n10.length()<=0)
		   {
		    n10="My Alarm";	
	       }
		   if (ring10.length()<=0)
		   {
		    ring10="glass broken.....";	
	       }
		 
			if (cb_sun.isChecked())
			{
			 	r10=r10+"Sun,";
			 	a10="true";
			}
			else 
			{
				a10="false";
			}
			
			
			if (cb_mon.isChecked())
			{
			 	r10=r10+"Mon,";
			 	b10="true";
			}
			else 
			{
				b10="false";
			}
			
			
			if (cb_tue.isChecked())
			{
			 	r10=r10+"Tue,";
			 	c10="true";
			}
			else 
			{
				c10="false";
			}
			
			
			if (cb_wed.isChecked())
			{
			 	r10=r10+"Wed,";
			 	d10="true";
			}
			else 
			{
				d10="false";
			}
			
			
			if (cb_thu.isChecked())
			{
			 	r10=r10+"Thu,";
			 	e10="true";
			}
			else 
			{
				e10="false";
			}
			
			
			if (cb_fri.isChecked())
			{
			 	r10=r10+"Fri,";
			 	f10="true";
			}
			else 
			{
				f10="false";
			}
			
			
			
			if (cb_sat.isChecked())
			{
			 	r10=r10+"Sat,";
			 	g10="true";
			}
			else 
			{
				g10="false";
			}
			
			
			if (r10=="")
			{
				r10="Tue,Wed,";
					
			}	
			

			
			startActivityForResult(i, 0);
			Toast.makeText(getApplicationContext(), "Your Alarm's"+"\n"+"\n"+"Name is "+et_name.getText().toString()+"\n"+"\n"+"Time is "
					+et_time.getText().toString()+"\n"+"\n"+"Ringtone is "+et_ringtone.getText().toString()+"\n"+"\n"+"Selected Days "+r10+"\n"+"\n"+"Snooze Time is "
					+et_snooze_time.getText().toString(), Toast.LENGTH_LONG).show();
			}
			
		});
        
        
b_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Alarm_Setting10.this,Alarm_Setting10.class);
			startActivity(i);
			}
		});
        
        et_time.setText(str10);
        et_name.setText(n10);
        et_ringtone.setText(ring10);
        et_snooze_time.setText(snooze10);
        {if (vib10=="true")
        {
			tb_vibration.setChecked(true);
		}
        else {
			tb_vibration.setChecked(false);
		}}
        
        {if (a10=="true")
        {
			cb_sun.setChecked(true);
		}
        else 
        {
        	cb_sun.setChecked(false);
		}}
        
        {if (b10=="true")
        {
			cb_mon.setChecked(true);
		}
        else 
        {
        	cb_mon.setChecked(false);
		}}
        
        {if (c10=="true")
        {
			cb_tue.setChecked(true);
		}
        else 
        {
        	cb_tue.setChecked(false);
		}}
        
        {if (d10=="true")
        {
			cb_wed.setChecked(true);
		}
        else 
        {
        	cb_wed.setChecked(false);
		}}
        
        {if (e10=="true")
        {
			cb_thu.setChecked(true);
		}
        else 
        {
        	cb_thu.setChecked(false);
		}}
        
        {if (f10=="true")
        {
			cb_fri.setChecked(true);
		}
        else 
        {
        	cb_fri.setChecked(false);
		}}
        
        {if (g10=="true")
        {
			cb_sat.setChecked(true);
		}
        else 
        {
        	cb_sat.setChecked(false);
		}}
    }
}