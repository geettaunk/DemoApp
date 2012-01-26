package com.swapnil;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.AndroidHttpTransport;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FirstScreen extends Activity {
	private static final String SOAP_ACTION = "http://tempuri.org/CelsiusToFahrenheit";
	private static final String METHOD_NAME ="CelsiusToFahrenheit";
		private static final String NAMESPACE="http://tempuri.org";
		private static final String URL="http://www.w3schools.com/webservices/tempconvert.asmx";
		TextView tv;
		
		
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv=(TextView)findViewById(R.id.Tv);
        SoapObject request=new SoapObject(NAMESPACE, METHOD_NAME);
        request.addProperty("Celsius","32");
        
        SoapSerializationEnvelope soapEnvolep=new SoapSerializationEnvelope(SoapEnvelope.VER11);
        
       soapEnvolep.dotNet=true;
        soapEnvolep.setOutputSoapObject(request);
        
        AndroidHttpTransport ath=new AndroidHttpTransport(URL);
        
        try {
        	
        	ath.call(SOAP_ACTION, soapEnvolep);
        	SoapPrimitive resultString=(SoapPrimitive)soapEnvolep.getResponse();
        	tv.setText("status:"+resultString);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        
    }
}