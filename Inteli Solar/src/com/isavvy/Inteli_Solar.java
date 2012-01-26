package com.isavvy;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;

public class Inteli_Solar extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);
        Button b5=(Button)findViewById(R.id.button5);
        Button b6=(Button)findViewById(R.id.button6);
        Button b7=(Button)findViewById(R.id.button7);
        Button b8=(Button)findViewById(R.id.button8);
        Button b9=(Button)findViewById(R.id.button9);
        Button b10=(Button)findViewById(R.id.button10);
        Spinner s=(Spinner)findViewById(R.id.spinner1);
        final AlertDialog.Builder ad=new AlertDialog.Builder(this);

        Bitmap bm=BitmapFactory.decodeStream(getResources().openRawResource(R.drawable.a));
        try {
			setWallpaper(bm);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
      
        
        Typeface tf=Typeface.createFromAsset(getAssets(), "ARIALBI.TTF");
        b9.setTypeface(tf);
        b10.setTypeface(tf);
        
        
        ArrayAdapter aa=ArrayAdapter.createFromResource(this,R.array.Products_and_Services,android.R.layout.simple_dropdown_item_1line);
        s.setAdapter(aa);
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			Intent i=new Intent(Inteli_Solar.this,Home.class);
			startActivity(i);
			Toast.makeText(getApplicationContext(), "You Have Clicked on Home Page", Toast.LENGTH_SHORT).show();
	
			}
		});
b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(Inteli_Solar.this,Residencial.class);
			startActivity(i);
			Toast.makeText(getApplicationContext(), "You Have Clicked on Residential Page", Toast.LENGTH_SHORT).show();

			}
		});
b3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent(Inteli_Solar.this,Comertial.class);
	startActivity(i);
	Toast.makeText(getApplicationContext(), "You Have Clicked on Comercial Page", Toast.LENGTH_SHORT).show();

	}
});
b4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent(Inteli_Solar.this,Get_Evaluation.class);
	startActivity(i);
	Toast.makeText(getApplicationContext(), "You Have Clicked on Get_Evaluation Page", Toast.LENGTH_SHORT).show();

	}
});
b5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent(Inteli_Solar.this,Get_Educated.class);
	startActivity(i);
	Toast.makeText(getApplicationContext(), "You Have Clicked on Get_Education Page", Toast.LENGTH_SHORT).show();

	}
});
b6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent(Inteli_Solar.this,Contact.class);
	startActivity(i);
	Toast.makeText(getApplicationContext(), "You Have Clicked on Contact Page", Toast.LENGTH_SHORT).show();

	}
});
b7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent(Inteli_Solar.this,Blog.class);
	startActivity(i);
	Toast.makeText(getApplicationContext(), "You Have Clicked on Blog Page", Toast.LENGTH_SHORT).show();

	}
});
b8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent(Inteli_Solar.this,About_Us.class);
	startActivity(i);

	}
});
b9.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	Intent i=new Intent(Inteli_Solar.this,Shortcut.class);
	
	startActivity(i);
	}
});
b10.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
//	Intent i=new Intent(Inteli_Solar.this,Images.class);
//	startActivity(i);
	ad.setTitle("Hello");
	ad.setIcon(R.drawable.intelisolar);
	ad.setMessage("Are you want to see images?");
	ad.setPositiveButton("Yes", new OnClickListener() {
		
		@Override
		public void onClick(DialogInterface arg0, int arg1) {
			// TODO Auto-generated method stub
		Intent i=new Intent(Inteli_Solar.this,Images.class);
		startActivity(i);
		
		}
	});
	ad.setNegativeButton("No", new OnClickListener() {
		
		@Override
		public void onClick(DialogInterface arg0, int arg1) {
			// TODO Auto-generated method stub
			
		}
	});
	ad.show();
	}
});

       s.setOnItemSelectedListener(new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			switch (arg2) {
			case 0:
				Intent i1=new Intent(Inteli_Solar.this,Photovoltaics.class);
				startActivity(i1);
				break;
			case 1:
				Intent i2=new Intent(Inteli_Solar.this,Residential_BIPV.class);				
				startActivity(i2);
				break;
			case 2:
				Intent i3=new Intent(Inteli_Solar.this,DHW.class);				
				startActivity(i3);
				break;
			case 3:
				Intent i4=new Intent(Inteli_Solar.this,Pool_Heating.class);	
				startActivity(i4);
				break;
			case 4:
				Intent i5=new Intent(Inteli_Solar.this,Attic_Fans.class);
				startActivity(i5);
				break;
			case 5:
				Intent i6=new Intent(Inteli_Solar.this,Automatic_Power_Backup.class);
				startActivity(i6);
				break;
			case 6:
				Intent i7=new Intent(Inteli_Solar.this,Residential_Financing.class);
				startActivity(i7);
				break;
			case 7:
				Intent i8=new Intent(Inteli_Solar.this,Residential_rebates_and_incentives.class);
				startActivity(i8);
				break;
			case 8:
				Intent i9=new Intent(Inteli_Solar.this,Services_Plans_Warranties.class);
				startActivity(i9);
				break;
			default:
				break;
			}
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
	}); 
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// TODO Auto-generated method stub
     menu.add(0, 0, 0, "Residential");
     menu.add(1, 1, 0, "Comercial");
     menu.add(2, 2, 0, "Get Evaluated");
     menu.add(3, 3, 0, "Get Educatd");
     menu.add(4, 4, 0, "Contacts");
     menu.add(5, 5, 0, "Blog");
     menu.add(6, 6, 0, "About Us");
    	
    	return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    switch (item.getItemId()) {
	case 0:
		Intent i1=new Intent(Inteli_Solar.this,Residencial.class);
		startActivity(i1);
		break;
	case 1:
		Intent i2=new Intent(Inteli_Solar.this,Comertial.class);
		startActivity(i2);
		break;
	case 2:
		Intent i3=new Intent(Inteli_Solar.this,Get_Educated.class);
		startActivity(i3);
		break;
	case 3:
		Intent i4=new Intent(Inteli_Solar.this,Get_Educated.class);
		startActivity(i4);
		break;
	case 4:
		Intent i5=new Intent(Inteli_Solar.this,Contact.class);
		startActivity(i5);
		break;
	case 5:
		Intent i6=new Intent(Inteli_Solar.this,Blog.class);
		startActivity(i6);
		break;
	case 6:
		Intent i7=new Intent(Inteli_Solar.this,About_Us.class);
		startActivity(i7);
		break;

	default:
		break;
	}
    	
    	return super.onOptionsItemSelected(item);
    }
}