package com.isavvy;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Shortcut extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shortcut);
        ListView lv=(ListView)findViewById(R.id.listView1);
        ArrayAdapter aa=ArrayAdapter.createFromResource(this, R.array.shortcuts, android.R.layout.simple_list_item_1);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				switch (arg2) {
				case 0:
					Intent i=new Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:+9039700130"));
					startActivity(i);
					break;
				case 1:
					Intent i1=new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:+9039700130"));
					startActivity(i1);
					break;
				case 2:
					Intent i2=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
					
					startActivity(i2);
					break;
				case 3:
					Intent i3=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
					startActivity(i3);
					break;
				case 4:
					Intent i4=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("content://call_log/calls/1"));
					startActivity(i4);
					break;
				case 5:
					Intent i5=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("content://media/external/images/media/"));
					startActivity(i5);
					break;
				case 6:
					Intent i6=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
					startActivity(i6);
					break;
				case 7:
					Intent i7=new Intent(android.content.Intent.ACTION_PICK, Uri.parse("content://contacts/people/"));
					startActivity(i7);
					break;
				default:
					break;
				}
			}
		});
        
    }
}