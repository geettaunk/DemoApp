package com.isavvy;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Alarm_Setting extends Activity {
	
    TextView tv_time; 
	EditText et_time;
	static String comp;
	static String comp1;
	
	Calendar c;
	int hr;
	int min;
	
	static final int pt=0;
	
	String r1="";
	int t2;
	
//   static	String temp="";
	
   static String str="12:00";
   static String r="Sun,Mon,";
   static String n="My Alarm";
   static String ring="glass broken.....";
   static String vib="";
   static String a1,b1,c1,d1,e1,f1,g1;
   static String snooze="0 minute";
   
  
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting1);
        
        tv_time=(TextView)findViewById(R.id.textView7);
        final EditText et_name=(EditText)findViewById(R.id.editText1);
        et_time=(EditText)findViewById(R.id.editText2);
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
        
        final AlertDialog.Builder ad=new AlertDialog.Builder(this);
       
        
 
      
//        final String v=Video.video.toString();
//        if (v!=null)
//        {
//     	   et_ringtone.setText(v);
// 	    }
//        else 
//        {
//            et_ringtone.setText("glass broken.....");
//        }
        
        et_ringtone.setOnClickListener(new View.OnClickListener() {
        	
			
			@Override
			public void onClick(View arg0) {
				int p=0;
				// TODO Auto-generated method stub
				
				if (p==0)
				{
					Intent i3=new Intent(Alarm_Setting.this,Music.class);
					startService(i3);
					
					Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_SHORT).show();
					
					p++;
				}
				else if (p==1)
				{
					Intent i3=new Intent(Alarm_Setting.this,Music.class);
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
			
			
				
				ad.setTitle("Alarm Ringtone!");
				ad.setMessage("Select Ringtone type");
				ad.setIcon(R.drawable.icon);
				
				ad.setPositiveButton("Audio", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Intent i=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("content://media/external/images/media/"));
						startActivity(i);	
					}
				});
				
	            ad.setNeutralButton("Video", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
//						Intent i=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("content://media/external/images/media/"));
//						startActivity(i);
						Intent i_video=new Intent(Alarm_Setting.this,Video.class);
						startActivity(i_video);
					}
				});
				
				ad.setNegativeButton("Cancel", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Intent i_neutral=new Intent(Alarm_Setting.this,Alarm_Setting.class);
						startActivity(i_neutral);
							
					}
				});
				
			
				
				ad.show();
			}
		});
        
        
        
        
        
        
        
        b_save.setOnClickListener(new View.OnClickListener() {	
        	
			@Override
			public void onClick(View v) {
				
			    comp1=et_time.getText().toString();
				str=et_time.getText().toString();
		        n=et_name.getText().toString();
		        ring=et_ringtone.getText().toString();
		        snooze=et_snooze_time.getText().toString();
		        vib="";
		        r="";
			 
				// TODO Auto-generated method stub
            
		   
		  Intent i=new Intent(Alarm_Setting.this,Main.class);
		       {
		   if (tb_vibration.isChecked())
		       {
			        vib="true";
		        }
		   else {
			         vib="false";
		         }
		        }
		   
		 
		   if (snooze.length()<=0)
		        {
		          snooze="0 minute";	
	             }
		   if (str.length()<=0)
			    {
			      str="12:00";	
		         }	
		   if (n.length()<=0)
		         {
		          n="My Alarm";	
	             }
		   if (ring.length()<=0)
		         {
		          ring="glass broken.....";	
	              }
		 
		   if (cb_sun.isChecked())
			      {
			 	    r=r+"Sun,";
			 	    a1="true";
			       }
		   else 
			       {
				   a1="false";
			       }
			
			
			if (cb_mon.isChecked())
			{
			 	r=r+"Mon,";
			 	b1="true";
			}
			else 
			{
				b1="false";
			}
			
			
			if (cb_tue.isChecked())
			{
			 	r=r+"Tue,";
			 	c1="true";
			}
			else 
			{
				c1="false";
			}
			
			
			if (cb_wed.isChecked())
			{
			 	r=r+"Wed,";
			 	d1="true";
			}
			else 
			{
				d1="false";
			}
			
			
			if (cb_thu.isChecked())
			{
			 	r=r+"Thu,";
			 	e1="true";
			}
			else 
			{
				e1="false";
			}
			
			
			if (cb_fri.isChecked())
			{
			 	r=r+"Fri,";
			 	f1="true";
			}
			else 
			{
				f1="false";
			}
			
			
			
			if (cb_sat.isChecked())
			{
			 	r=r+"Sat,";
			 	g1="true";
			}
			else 
			{
				g1="false";
			}
			
			
			if (r=="")
			{
				r="Sun,Mon,";
					
			}	
			

			
	startActivityForResult(i, 0);
	
	Toast.makeText(getApplicationContext(),"Your Alarm's"+"\n"+"\n"+"Name is "
			        +et_name.getText().toString()+"\n"+"\n"+"Time is "
					+et_time.getText().toString()+"\n"+"\n"+"Ringtone is "
					+et_ringtone.getText().toString()+"\n"+"\n"+"Selected Days "
					+r+"\n"+"\n"+"Snooze Time is "+et_snooze_time.getText()
					.toString(), Toast.LENGTH_LONG).show();
			}
			
		});
        
        
        
        
        
        
        
        b_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				Intent i=new Intent(Alarm_Setting.this,Alarm_Setting.class);
			    startActivity(i);
			
			}
		});

        
        et_time.setText(str);
        et_name.setText(n);
        et_ringtone.setText(ring);
        et_snooze_time.setText(snooze);
        
        {
        	if (vib=="true")
        {
			tb_vibration.setChecked(true);
		}
        
        	else 
        	{
			tb_vibration.setChecked(false);
		     }
        }
        
        {if (a1=="true")
        {
			cb_sun.setChecked(true);
		}
        else 
        {
        	cb_sun.setChecked(false);
		}
        }
        
        {if (b1=="true")
        {
			cb_mon.setChecked(true);
		}
        else 
        {
        	cb_mon.setChecked(false);
		}
        }
        
        {if (c1=="true")
        {
			cb_tue.setChecked(true);
		}
        else 
        {
        	cb_tue.setChecked(false);
		}
        }
        
        {if (d1=="true")
        {
			cb_wed.setChecked(true);
		}
        else 
        {
        	cb_wed.setChecked(false);
		}
        }
        
        {if (e1=="true")
        {
			cb_thu.setChecked(true);
		}
        else 
        {
        	cb_thu.setChecked(false);
		}
        }
        
        {if (f1=="true")
        {
			cb_fri.setChecked(true);
		}
        else 
        {
        	cb_fri.setChecked(false);
		}
        }
        
        {if (g1=="true")
        {
			cb_sat.setChecked(true);
		}
        else 
        {
        	cb_sat.setChecked(false);
		}
        
       }
        
        
        
        
    
       et_time.setOnClickListener(new View.OnClickListener() {
    	 
			
			@Override
			public void onClick(View v) {
				
			 // TODO Auto-generated method stub
			
				showDialog(pt);
				
			}
		});
       
        
        c=Calendar.getInstance();
        
        hr= c.get(Calendar.HOUR_OF_DAY);
        min=c.get(Calendar.MINUTE);
        
    
        update();
      
    }
    
    private void update() {
    	 
		// TODO Auto-generated method stub
    	 tv_time.setText(new StringBuilder().append(pad(hr)).append(":").append(pad(min)));
    	 comp=tv_time.getText().toString();	
    	
    	
	   
     }
    
       
    private String pad(int c) {
        	// TODO Auto-generated method stub
       
    	if (c>=10)
        {
        	return String.valueOf(c);
        }
        else {
        	return "0"+String.valueOf(c);
        }
  
      }
        
     
    TimePickerDialog.OnTimeSetListener tpl=new TimePickerDialog.OnTimeSetListener() {
			
			@Override
			
			public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
				

				// TODO Auto-generated method stub
			
				hr=hourOfDay;
			    min=minute;
			    
		 et_time.setText(new StringBuilder().append(pad(hr)).append(":").append(pad(min)));

	  
		 
		
//			  update();
			
			}	
			
	};
		
		protected Dialog onCreateDialog(int id) {
	        switch (id)
	         {
	         case pt:
		
		      return new TimePickerDialog(this,tpl, hr, min, true);
             }
           return null;
           
    
		}
		
    }