package com.isavvy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class Main extends Activity {
	TextView tv_time_1;
	
	static String tb_all1="";
	static String tb_alarm1="";
	static String tb_alarm2="";
	static String tb_alarm3="";
	static String tb_alarm4="";
	static String tb_alarm5="";
	static String tb_alarm6="";
	static String tb_alarm7="";
	static String tb_alarm8="";
	static String tb_alarm9="";
	static String tb_alarm10="";
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final TextView tv_alarm_1=(TextView)findViewById(R.id.tv_alarm1);
        final TextView tv_alarm_2=(TextView)findViewById(R.id.tv_alarm2);
        final TextView tv_alarm_3=(TextView)findViewById(R.id.tv_alarm3);
        final TextView tv_alarm_4=(TextView)findViewById(R.id.tv_alarm4);
        final TextView tv_alarm_5=(TextView)findViewById(R.id.tv_alarm5);
        final TextView tv_alarm_6=(TextView)findViewById(R.id.tv_alarm6);
        final TextView tv_alarm_7=(TextView)findViewById(R.id.tv_alarm7);
        final TextView tv_alarm_8=(TextView)findViewById(R.id.tv_alarm8);
        final TextView tv_alarm_9=(TextView)findViewById(R.id.tv_alarm9);
        final TextView tv_alarm_10=(TextView)findViewById(R.id.tv_alarm10);
        final TextView tv_day_1=(TextView)findViewById(R.id.tv_day1);
        final TextView tv_day_2=(TextView)findViewById(R.id.tv_day2);
        final TextView tv_day_3=(TextView)findViewById(R.id.tv_day3);
        final TextView tv_day_4=(TextView)findViewById(R.id.tv_day4);
        final TextView tv_day_5=(TextView)findViewById(R.id.tv_day5);
        final TextView tv_day_6=(TextView)findViewById(R.id.tv_day6);
        final TextView tv_day_7=(TextView)findViewById(R.id.tv_day7);
        final TextView tv_day_8=(TextView)findViewById(R.id.tv_day8);
        final TextView tv_day_9=(TextView)findViewById(R.id.tv_day9);
        final TextView tv_day_10=(TextView)findViewById(R.id.tv_day10);
         tv_time_1=(TextView)findViewById(R.id.tv_time1);
        final TextView tv_time_2=(TextView)findViewById(R.id.tv_time2);
        final TextView tv_time_3=(TextView)findViewById(R.id.tv_time3);
        final TextView tv_time_4=(TextView)findViewById(R.id.tv_time4);
        final TextView tv_time_5=(TextView)findViewById(R.id.tv_time5);
        final TextView tv_time_6=(TextView)findViewById(R.id.tv_time6);
        final TextView tv_time_7=(TextView)findViewById(R.id.tv_time7);
        final TextView tv_time_8=(TextView)findViewById(R.id.tv_time8);
        final TextView tv_time_9=(TextView)findViewById(R.id.tv_time9);
        final TextView tv_time_10=(TextView)findViewById(R.id.tv_time10);
        final ToggleButton tb_All=(ToggleButton)findViewById(R.id.tb_all);
        final ToggleButton tb1=(ToggleButton)findViewById(R.id.tb1);
        final ToggleButton tb2=(ToggleButton)findViewById(R.id.tb2);
        final ToggleButton tb3=(ToggleButton)findViewById(R.id.tb3);
        final ToggleButton tb4=(ToggleButton)findViewById(R.id.tb4);
        final ToggleButton tb5=(ToggleButton)findViewById(R.id.tb5);
        final ToggleButton tb6=(ToggleButton)findViewById(R.id.tb6);
        final ToggleButton tb7=(ToggleButton)findViewById(R.id.tb7);
        final ToggleButton tb8=(ToggleButton)findViewById(R.id.tb8);
        final ToggleButton tb9=(ToggleButton)findViewById(R.id.tb9);
        final ToggleButton tb10=(ToggleButton)findViewById(R.id.tb10);
        final Button b_1=(Button)findViewById(R.id.b1);
        final Button b_2=(Button)findViewById(R.id.b2);
        final Button b_3=(Button)findViewById(R.id.b3);
        final Button b_4=(Button)findViewById(R.id.b4);
        final Button b_5=(Button)findViewById(R.id.b5);
        final Button b_6=(Button)findViewById(R.id.b6);
        final Button b_7=(Button)findViewById(R.id.b7);
        final Button b_8=(Button)findViewById(R.id.b8);
        final Button b_9=(Button)findViewById(R.id.b9);
        final Button b_10=(Button)findViewById(R.id.b10);
        
       	
        
        if (Alarm_Setting.comp1!=null || Alarm_Setting.comp!=null)
        {
     	   if (Alarm_Setting.comp1.toString().equals(Alarm_Setting.comp.toString()))
            {
            	Intent i=new Intent(Main.this,Music.class);
        	    startService(i);
            	Toast.makeText(Main.this,"Alarm", Toast.LENGTH_SHORT).show();
            }
 	   }
        
          
        
   
        String t1=Alarm_Setting.str;
        String d1=Alarm_Setting.r;
        tv_time_1.setText(t1);
        tv_day_1.setText(d1);
        
        String t2=Alarm_Setting2.str2;
        String d2=Alarm_Setting2.r2;
        tv_time_2.setText(t2);
        tv_day_2.setText(d2);
        
        String t3=Alarm_Setting3.str3;
        String d3=Alarm_Setting3.r3;
        tv_time_3.setText(t3);
        tv_day_3.setText(d3);
   
        String t4=Alarm_Setting4.str4;
        String d4=Alarm_Setting4.r4;
        tv_time_4.setText(t4);
        tv_day_4.setText(d4);
        
        String t5=Alarm_Setting5.str5;
        String d5=Alarm_Setting5.r5;
        tv_time_5.setText(t5);
        tv_day_5.setText(d5);
        
        String t6=Alarm_Setting6.str6;
        String d6=Alarm_Setting6.r6;
        tv_time_6.setText(t6);
        tv_day_6.setText(d6);
        
        String t7=Alarm_Setting7.str7;
        String d7=Alarm_Setting7.r7;
        tv_time_7.setText(t7);
        tv_day_7.setText(d7);
        
        String t8=Alarm_Setting8.str8;
        String d8=Alarm_Setting8.r8;
        tv_time_8.setText(t8);
        tv_day_8.setText(d8);
        
        String t9=Alarm_Setting9.str9;
        String d9=Alarm_Setting9.r9;
        tv_time_9.setText(t9);
        tv_day_9.setText(d9);
        
        String t10=Alarm_Setting10.str10;
        String d10=Alarm_Setting10.r10;
        tv_time_10.setText(t10);
        tv_day_10.setText(d10);
        
        
        tv_alarm_1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String name1=Alarm_Setting.n;
			Toast.makeText(getApplicationContext(), name1, Toast.LENGTH_SHORT).show();
			}
		});
        
       tv_alarm_2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String name2=Alarm_Setting2.n2;
			Toast.makeText(getApplicationContext(), name2, Toast.LENGTH_SHORT).show();
			}
		});
       
       tv_alarm_3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String name3=Alarm_Setting3.n3;
			Toast.makeText(getApplicationContext(), name3, Toast.LENGTH_SHORT).show();
			}
		});
       
       tv_alarm_4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String name4=Alarm_Setting4.n4;
			Toast.makeText(getApplicationContext(), name4, Toast.LENGTH_SHORT).show();
			}
		});
       
       tv_alarm_5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String name5=Alarm_Setting5.n5;
			Toast.makeText(getApplicationContext(), name5, Toast.LENGTH_SHORT).show();
			}
		});
       
       
       tv_alarm_6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String name6=Alarm_Setting6.n6;
			Toast.makeText(getApplicationContext(), name6, Toast.LENGTH_SHORT).show();
			}
		});
       
       tv_alarm_7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String name7=Alarm_Setting7.n7;
			Toast.makeText(getApplicationContext(), name7, Toast.LENGTH_SHORT).show();
			}
		});
       
       tv_alarm_8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String name8=Alarm_Setting8.n8;
			Toast.makeText(getApplicationContext(), name8, Toast.LENGTH_SHORT).show();
			}
		});
       
       
       tv_alarm_9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String name9=Alarm_Setting9.n9;
			Toast.makeText(getApplicationContext(), name9, Toast.LENGTH_SHORT).show();
			}
		});
       
       
       tv_alarm_10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String name10=Alarm_Setting10.n10;
			Toast.makeText(getApplicationContext(), name10, Toast.LENGTH_SHORT).show();
			}
		});
        
        tb_All.setOnCheckedChangeListener(new OnCheckedChangeListener() {
        	
		
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			tb_all1="";
			
			// TODO Auto-generated method stub
			
			
			
			if (tb_All.isChecked())
			{
				tb1.setChecked(true);
				tb2.setChecked(true);
				tb3.setChecked(true);
				tb4.setChecked(true);
				tb5.setChecked(true);
				tb6.setChecked(true);
				tb7.setChecked(true);
				tb8.setChecked(true);
				tb9.setChecked(true);
				tb10.setChecked(true);
				tb_all1="true";
				
				Toast.makeText(getApplicationContext(), "All Alarms are ON", Toast.LENGTH_SHORT).show();
			}
			else
			{
			 tb1.setChecked(false);
			 tb2.setChecked(false);
			 tb3.setChecked(false);
			 tb4.setChecked(false);
			 tb5.setChecked(false);
			 tb6.setChecked(false);
			 tb7.setChecked(false);
			 tb8.setChecked(false);
			 tb9.setChecked(false);
			 tb10.setChecked(false);
			 tb_all1="false";
			 Toast.makeText(getApplicationContext(), "All Alarms are OFF", Toast.LENGTH_SHORT).show();
			}
		
		}
	});
      
        
      b_1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
			Intent i=new Intent(Main.this,Alarm_Setting.class);
			
			startActivity(i);
			}
		});
          
     
        b_2.setOnClickListener(new View.OnClickListener() {
        
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent i2=new Intent(Main.this,Alarm_Setting2.class);
			startActivity(i2);
			}
		});
         b_3.setOnClickListener(new View.OnClickListener() {
        	 
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent i3=new Intent(Main.this,Alarm_Setting3.class);
			startActivity(i3);
			}
		});
         b_4.setOnClickListener(new View.OnClickListener() {
        	 
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 			Intent i4=new Intent(Main.this,Alarm_Setting4.class);
 			startActivity(i4);
 			}
 		});
         b_5.setOnClickListener(new View.OnClickListener() {
        	 
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 			Intent i5=new Intent(Main.this,Alarm_Setting5.class);
 			startActivity(i5);
 			}
 		});
         b_6.setOnClickListener(new View.OnClickListener() {
        	
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 			Intent i6=new Intent(Main.this,Alarm_Setting6.class);
 			startActivity(i6);
 			}
 		});
         b_7.setOnClickListener(new View.OnClickListener() {
        	 
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 			Intent i7=new Intent(Main.this,Alarm_Setting7.class);
 			startActivity(i7);
 			}
 		});
         b_8.setOnClickListener(new View.OnClickListener() {
        	
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 			Intent i8=new Intent(Main.this,Alarm_Setting8.class);
 			startActivity(i8);
 			}
 		});
         b_9.setOnClickListener(new View.OnClickListener() {
        	 
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 			Intent i9=new Intent(Main.this,Alarm_Setting9.class);
 			startActivity(i9);
 			}
 		});
         b_10.setOnClickListener(new View.OnClickListener() {
        	 
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 			Intent i10=new Intent(Main.this,Alarm_Setting10.class);
 			startActivity(i10);
 			}
 		});
         tb1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				tb_alarm1="";
				// TODO Auto-generated method stub
				if (tb1.isChecked())
				{
					tb_alarm1="true";
				}
				else {
					tb_alarm1="false";
				}
			
				
			}
		});
         tb2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
 			
 			@Override
 			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
 				tb_alarm2="";
 				// TODO Auto-generated method stub
 				if (tb2.isChecked())
				{
					tb_alarm2="true";
				}
				else {
					tb_alarm2="false";
				}
 			
 				
 			}
 		});
         tb3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
 			
 			@Override
 			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
 				tb_alarm3="";
 				// TODO Auto-generated method stub
 				if (tb3.isChecked())
				{
					tb_alarm3="true";
				}
				else {
					tb_alarm3="false";
				}
 			
 				
 			}
 		});
         tb4.setOnCheckedChangeListener(new OnCheckedChangeListener() {
 			
 			@Override
 			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
 				tb_alarm4="";
 				// TODO Auto-generated method stub
 				if (tb4.isChecked())
				{
					tb_alarm4="true";
				}
				else {
					tb_alarm4="false";
				}
 			
 				
 			}
 		});
         tb5.setOnCheckedChangeListener(new OnCheckedChangeListener() {
  			
  			@Override
  			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
  				tb_alarm5="";
  				// TODO Auto-generated method stub
  				if (tb5.isChecked())
				{
					tb_alarm5="true";
				}
				else {
					tb_alarm5="false";
				}
  			
  				
  			}
  		});
         tb6.setOnCheckedChangeListener(new OnCheckedChangeListener() {
  			
  			@Override
  			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
  				tb_alarm6="";
  				// TODO Auto-generated method stub
  				if (tb6.isChecked())
				{
					tb_alarm6="true";
				}
				else {
					tb_alarm6="false";
				}
  			
  				
  			}
  		});
         tb7.setOnCheckedChangeListener(new OnCheckedChangeListener() {
  			
  			@Override
  			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
  				tb_alarm7="";
  				// TODO Auto-generated method stub
  				if (tb7.isChecked())
				{
					tb_alarm7="true";
				}
				else {
					tb_alarm7="false";
				}
  			
  				
  			}
  		});
         tb8.setOnCheckedChangeListener(new OnCheckedChangeListener() {
  			
  			@Override
  			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
  				tb_alarm8="";
  				// TODO Auto-generated method stub
  				if (tb8.isChecked())
				{
					tb_alarm8="true";
				}
				else {
					tb_alarm8="false";
				}
  		
  				
  			}
  		});
         tb9.setOnCheckedChangeListener(new OnCheckedChangeListener() {
  			
  			@Override
  			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
  				tb_alarm9="";
  				// TODO Auto-generated method stub
  				if (tb9.isChecked())
				{
					tb_alarm9="true";
				}
				else {
					tb_alarm9="false";
				}
  			
  				
  			}
  		});
         tb10.setOnCheckedChangeListener(new OnCheckedChangeListener() {
  			
  			@Override
  			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
  				tb_alarm10="";
  				// TODO Auto-generated method stub
  				if (tb10.isChecked())
				{
					tb_alarm10="true";
				}
				else {
					tb_alarm1="false";
				}
  			
  				
  			}
  		});
         
         if (tb_all1=="true")
         {
			tb_All.setChecked(true);
		}
         else {
			tb_All.setChecked(false);
		}
         
         if(tb_alarm1=="true")
         {
        	 tb1.setChecked(true);
         }
         else {
			tb1.setChecked(false);
		}
         
         if(tb_alarm2=="true")
         {
        	 tb2.setChecked(true);
         }
         else {
			tb2.setChecked(false);
		}
         
         
         if(tb_alarm3=="true")
         {
        	 tb3.setChecked(true);
         }
         else {
			tb3.setChecked(false);
		}
         
         
         if(tb_alarm4=="true")
         {
        	 tb4.setChecked(true);
         }
         else {
			tb4.setChecked(false);
		}
         
         
         if(tb_alarm5=="true")
         {
        	 tb5.setChecked(true);
         }
         else {
			tb5.setChecked(false);
		}
         
         
         if(tb_alarm6=="true")
         {
        	 tb6.setChecked(true);
         }
         else {
			tb6.setChecked(false);
		}
         
         
         
         if(tb_alarm7=="true")
         {
        	 tb7.setChecked(true);
         }
         else {
			tb7.setChecked(false);
		}
         
         
         if(tb_alarm8=="true")
         {
        	 tb8.setChecked(true);
         }
         else {
			tb8.setChecked(false);
		}
         
         if(tb_alarm9=="true")
         {
        	 tb9.setChecked(true);
         }
         else {
			tb9.setChecked(false);
		}
         
         
         if(tb_alarm10=="true")
         {
        	 tb10.setChecked(true);
         }
         else {
			tb10.setChecked(false);
		}
         
         
         if(tb_alarm1=="true")
         {
        	 tb1.setChecked(true);
         }
         else {
			tb1.setChecked(false);
		}
          
     }
    
}
