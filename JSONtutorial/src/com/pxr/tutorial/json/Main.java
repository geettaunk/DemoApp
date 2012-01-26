package com.pxr.tutorial.json;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.pxr.tutorial.xmltest.R;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class Main extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listplaceholder);
        
        ArrayList<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();
      
       
        JSONObject json = JSONfunctions.getJSONfromURL("http://api.geonames.org/earthquakesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&username=demo");
                
        try{
        	
        	JSONArray  earthquakes = json.getJSONArray("earthquakes");
        	
	        for(int i=0;i<earthquakes.length();i++){						
				HashMap<String, String> map = new HashMap<String, String>();	
				JSONObject e = earthquakes.getJSONObject(i);
				
				map.put("id",  String.valueOf(i));
	        	map.put("name", "Earthquake name:" + e.getString("eqid"));
	        	map.put("magnitude", "Magnitude: " +  e.getString("magnitude"));
	        	mylist.add(map);			
			}		
        }catch(JSONException e)        {
        	 Log.e("log_tag", "Error parsing data "+e.toString());
        }
        
        ListAdapter adapter = new SimpleAdapter(this, mylist , R.layout.main, 
                        new String[] { "name", "magnitude" }, 
                        new int[] { R.id.item_title, R.id.item_subtitle });
        
        setListAdapter(adapter);
        
        final ListView lv = getListView();
        lv.setTextFilterEnabled(true);	
        lv.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {        		
        		@SuppressWarnings("unchecked")
				HashMap<String, String> o = (HashMap<String, String>) lv.getItemAtPosition(position);	        		
        		Toast.makeText(Main.this, "ID '" + o.get("id") + "' was clicked.", Toast.LENGTH_SHORT).show(); 

			}
		});
    }
}