package com.example.ktvswjtu;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class login extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.login);
		Button buttonlogin =(Button) findViewById(R.id.buttonl);
		  buttonlogin.setOnClickListener(new View.OnClickListener() {  
		      
			    @Override  
			    public void onClick(View v) {  
			  //  	Intent intent = new Intent(ktvlogin.this, MainActivity.class); 
	                // intent.putExtra("student", student); 
	              //   startActivity(intent); 
			    }  
			}); }
	
	
}
