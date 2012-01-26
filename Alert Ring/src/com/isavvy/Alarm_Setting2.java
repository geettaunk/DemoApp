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

public class Alarm_Setting2 extends Activity {
   static String str2="11:00";
   static String r2="Mon,Tue,";
   static String n2="My Alarm";
   static String ring2="glass broken.....";
   static String vib2="";
   static String a2,b2,c2,d2,e2,f2,g2;
   static String snooze2="0 minute";
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting2);
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
					Intent i3=new Intent(Alarm_Setting2.this,Music.class);
					startService(i3);
					Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
					p++;
				}
				else if (p==1)
				{
					Intent i3=new Intent(Alarm_Setting2.this,Music.class);
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
		    str2=et_time.getText().toString();
		    n2=et_name.getText().toString();
		    ring2=et_ringtone.getText().toString();
		    snooze2=et_snooze_time.getText().toString();
		    vib2="";
		    r2="";
			 
				// TODO Auto-generated method stub
            
		 Intent i=new Intent(Alarm_Setting2.this,Main.class);
		 {
		 if (tb_vibration.isChecked())
		 {
			vib2="true";
		}
		 else {
			vib2="false";
		}
		 }
		 
		 if (snooze2.length()<=0)
		   {
		    snooze2="0 minute";	
	       }
		   if (str2.length()<=0)
			   {
			    str2="11:00";	
		       }	
		   if (n2.length()<=0)
		   {
		    n2="My Alarm";	
	       }
		   if (ring2.length()<=0)
		   {
		    ring2="glass broken.....";	
	       }
		 
			if (cb_sun.isChecked())
			{
			 	r2=r2+"Sun,";
			 	a2="true";
			}
			else 
			{
				a2="false";
			}
			
			
			if (cb_mon.isChecked())
			{
			 	r2=r2+"Mon,";
			 	b2="true";
			}
			else 
			{
				b2="false";
			}
			
			
			if (cb_tue.isChecked())
			{
			 	r2=r2+"Tue,";
			 	c2="true";
			}
			else 
			{
				c2="false";
			}
			
			
			if (cb_wed.isChecked())
			{
			 	r2=r2+"Wed,";
			 	d2="true";
			}
			else 
			{
				d2="false";
			}
			
			
			if (cb_thu.isChecked())
			{
			 	r2=r2+"Thu,";
			 	e2="true";
			}
			else 
			{
				e2="false";
			}
			
			
			if (cb_fri.isChecked())
			{
			 	r2=r2+"Fri,";
			 	f2="true";
			}
			else 
			{
				f2="false";
			}
			
			
			
			if (cb_sat.isChecked())
			{
			 	r2=r2+"Sat,";
			 	g2="true";
			}
			else 
			{
				g2="false";
			}
			
			
			if (r2=="")
			{
				r2="Mon,Tue,";
					
			}	
			

			
			startActivityForResult(i, 0);
			Toast.makeText(getApplicationContext(), "Your Alarm's"+"\n"+"\n"+"Name is "+et_name.getText().toString()+"\n"+"\n"+"Time is "
					+et_time.getText().toString()+"\n"+"\n"+"Ringtone is "+et_ringtone.getText().toString()+"\n"+"\n"+"Selected Days "+r2+"\n"+"\n"+"Snooze Time is "
					+et_snooze_time.getText().toString(), Toast.LENGTH_LONG).show();
			}
			
		});
        
b_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Alarm_Setting2.this,Alarm_Setting2.class);
			startActivity(i);
			}
		});
        
        et_time.setText(str2);
        et_name.setText(n2);
        et_ringtone.setText(ring2);
        et_snooze_time.setText(snooze2);
        {if (vib2=="true")
        {
			tb_vibration.setChecked(true);
		}
        else {
			tb_vibration.setChecked(false);
		}}
        
        {if (a2=="true")
        {
			cb_sun.setChecked(true);
		}
        else 
        {
        	cb_sun.setChecked(false);
		}}
        
        {if (b2=="true")
        {
			cb_mon.setChecked(true);
		}
        else 
        {
        	cb_mon.setChecked(false);
		}}
        
        {if (c2=="true")
        {
			cb_tue.setChecked(true);
		}
        else 
        {
        	cb_tue.setChecked(false);
		}}
        
        {if (d2=="true")
        {
			cb_wed.setChecked(true);
		}
        else 
        {
        	cb_wed.setChecked(false);
		}}
        
        {if (e2=="true")
        {
			cb_thu.setChecked(true);
		}
        else 
        {
        	cb_thu.setChecked(false);
		}}
        
        {if (f2=="true")
        {
			cb_fri.setChecked(true);
		}
        else 
        {
        	cb_fri.setChecked(false);
		}}
        
        {if (g2=="true")
        {
			cb_sat.setChecked(true);
		}
        else 
        {
        	cb_sat.setChecked(false);
		}}
    }
}