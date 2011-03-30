package com.securitycompass.labs.falsesecuremobile;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class ViewStatementActivity extends Activity {

    WebView mStatementDisplay;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewstatementactivity);
        
        mStatementDisplay=(WebView)findViewById(R.id.viewstatementscreen_webview);
        
        Intent i=getIntent();
        if(i.hasExtra("statement_filename")){
            String filename=i.getStringExtra("statement_filename");
            
            
/*            String html="";
            FileReader fr=new FileReader(file);
            char[] buf=new char[4096];
            StringBuilder httpContent=new StringBuilder();
            int length;
            try{
            while ( (length = fr.read(buf, 0, buf.length)) >0 ){
                httpContent.append(buf, 0, length);
            }
            } catch (IOException e){
                Toast.makeText(this, R.string.error_invalid_statment, Toast.LENGTH_SHORT).show();
            } finally {
                
            }*/
            
            mStatementDisplay.loadUrl("file://"+filename);
        } else {
            Toast.makeText(this, R.string.error_invalid_statment, Toast.LENGTH_SHORT).show();
        }
        
    }
    
}
