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

public class Alarm_Setting3 extends Activity {
   static String str3="10:00";
   static String r3="Tue,Wed,";
   static String n3="My Alarm";
   static String ring3="glass broken.....";
   static String vib3="";
   static String a3,b3,c3,d3,e3,f3,g3;
   static String snooze3="0 minute";
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting3);
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
					Intent i3=new Intent(Alarm_Setting3.this,Music.class);
					startService(i3);
					Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
					p++;
				}
				else if (p==1)
				{
					Intent i3=new Intent(Alarm_Setting3.this,Music.class);
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
		    str3=et_time.getText().toString();
		    n3=et_name.getText().toString();
		    ring3=et_ringtone.getText().toString();
		    snooze3=et_snooze_time.getText().toString();
		    vib3="";
		    r3="";
			 
				// TODO Auto-generated method stub
            
		 Intent i=new Intent(Alarm_Setting3.this,Main.class);
		 {
		 if (tb_vibration.isChecked())
		 {
			vib3="true";
		}
		 else {
			vib3="false";
		}
		 }
		 
		 if (snooze3.length()<=0)
		   {
		    snooze3="0 minute";	
	       }
		   if (str3.length()<=0)
			   {
			   str3="10:00";	
		       }	
		   if (n3.length()<=0)
		   {
		    n3="My Alarm";	
	       }
		   if (ring3.length()<=0)
		   {
		    ring3="glass broken.....";	
	       }
		 
			if (cb_sun.isChecked())
			{
			 	r3=r3+"Sun,";
			 	a3="true";
			}
			else 
			{
				a3="false";
			}
			
			
			if (cb_mon.isChecked())
			{
			 	r3=r3+"Mon,";
			 	b3="true";
			}
			else 
			{
				b3="false";
			}
			
			
			if (cb_tue.isChecked())
			{
			 	r3=r3+"Tue,";
			 	c3="true";
			}
			else 
			{
				c3="false";
			}
			
			
			if (cb_wed.isChecked())
			{
			 	r3=r3+"Wed,";
			 	d3="true";
			}
			else 
			{
				d3="false";
			}
			
			
			if (cb_thu.isChecked())
			{
			 	r3=r3+"Thu,";
			 	e3="true";
			}
			else 
			{
				e3="false";
			}
			
			
			if (cb_fri.isChecked())
			{
			 	r3=r3+"Fri,";
			 	f3="true";
			}
			else 
			{
				f3="false";
			}
			
			
			
			if (cb_sat.isChecked())
			{
			 	r3=r3+"Sat,";
			 	g3="true";
			}
			else 
			{
				g3="false";
			}
			
			
			if (r3=="")
			{
				r3="Tue,Wed";
					
			}	
			

			
			startActivityForResult(i, 0);
			Toast.makeText(getApplicationContext(), "Your Alarm's"+"\n"+"\n"+"Name is "+et_name.getText().toString()+"\n"+"\n"+"Time is "
					+et_time.getText().toString()+"\n"+"\n"+"Ringtone is "+et_ringtone.getText().toString()+"\n"+"\n"+"Selected Days "+r3+"\n"+"\n"+"Snooze Time is "
					+et_snooze_time.getText().toString(), Toast.LENGTH_LONG).show();
			}
			
		});
        
        
b_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Alarm_Setting3.this,Alarm_Setting3.class);
			startActivity(i);
			}
		});
        
        et_time.setText(str3);
        et_name.setText(n3);
        et_ringtone.setText(ring3);
        et_snooze_time.setText(snooze3);
        {if (vib3=="true")
        {
			tb_vibration.setChecked(true);
		}
        else {
			tb_vibration.setChecked(false);
		}}
        
        {if (a3=="true")
        {
			cb_sun.setChecked(true);
		}
        else 
        {
        	cb_sun.setChecked(false);
		}}
        
        {if (b3=="true")
        {
			cb_mon.setChecked(true);
		}
        else 
        {
        	cb_mon.setChecked(false);
		}}
        
        {if (c3=="true")
        {
			cb_tue.setChecked(true);
		}
        else 
        {
        	cb_tue.setChecked(false);
		}}
        
        {if (d3=="true")
        {
			cb_wed.setChecked(true);
		}
        else 
        {
        	cb_wed.setChecked(false);
		}}
        
        {if (e3=="true")
        {
			cb_thu.setChecked(true);
		}
        else 
        {
        	cb_thu.setChecked(false);
		}}
        
        {if (f3=="true")
        {
			cb_fri.setChecked(true);
		}
        else 
        {
        	cb_fri.setChecked(false);
		}}
        
        {if (g3=="true")
        {
			cb_sat.setChecked(true);
		}
        else 
        {
        	cb_sat.setChecked(false);
		}}
    }
}