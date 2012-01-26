package com.KsoapWebservicesEx;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

public class KsoapWebservicesEx extends ListActivity{
	private static final String SOAP_ACTION = "http://www.yadukris.com/GetCustomerScore";
    private static final String METHOD_NAME = "GetCustomerScore";
    private static final String NAMESPACE = "http://www.yadukris.com";
    private static final String URL = "http://codefrux.com/service.asmx";
    private SoapObject resultRequestSOAP = null;

    String[] Str;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
        SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);           
        request.addProperty("Customer_Id", "1");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = true;
        envelope.setOutputSoapObject(request); 
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
             try {
            	       androidHttpTransport.call(SOAP_ACTION, envelope);
            	       resultRequestSOAP =  (SoapObject) envelope.getResponse();
                       Str=new String[resultRequestSOAP.getPropertyCount()];
                       for(int i=0;i<resultRequestSOAP.getPropertyCount();i++)
                       {
                    	   Str[i]=resultRequestSOAP.getProperty(i).toString();
                       }
             }
                  catch(Exception e)
                  {
                	  Log.d("Exception", ""+e);
                  }   
                  
             setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Str));

    }
}