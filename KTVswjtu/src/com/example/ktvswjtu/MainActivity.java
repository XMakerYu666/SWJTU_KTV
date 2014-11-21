package com.example.ktvswjtu;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.os.Build;

public class MainActivity extends Activity {
	protected static final String TAG = "hhgkuhjk";
	public first mFirstFragment;
	public login secondFragment;
	public View.OnClickListener mylistener;
	String mes="send";
	int play_stop=0;
	int update=1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		//socket 
		Thread socketServerThread = new Thread(new SocketServerThread());
		socketServerThread.start();
		
		Button buttonlogin =(Button) findViewById(R.id.buttontitle);
		buttonlogin.setOnClickListener(new View.OnClickListener() {  
		      
			    @Override  
			    public void onClick(View v) {  
			        // TODO Auto-generated method stub  
			    	// Log.e(TAG, "Start to recorder video\n");  
	            	 Intent intent = new Intent(MainActivity.this, login.class); 
	                // intent.putExtra("student", student); 
	                 startActivity(intent); 
			    }  
			}); 
	        
		 
		  Button b1 = (Button) findViewById(R.id.b1);
		  final Button b2 = (Button) findViewById(R.id.b2);
		  Button b3 = (Button) findViewById(R.id.b3);
		  Button button1 = (Button) findViewById(R.id.button1);
		  Button button2 = (Button) findViewById(R.id.button2);
		  Button button3 = (Button) findViewById(R.id.button3);
		  Button button4 = (Button) findViewById(R.id.button4);
		  Button button5 = (Button) findViewById(R.id.button5);
		  Button button6 = (Button) findViewById(R.id.button6);
		  Button button7 = (Button) findViewById(R.id.button7);
		  Button button8 = (Button) findViewById(R.id.button8);
		  Button button9 = (Button) findViewById(R.id.button9);
		  Button button10 = (Button) findViewById(R.id.button10);
		  Button button11 = (Button) findViewById(R.id.button11);
		  Button button12 = (Button) findViewById(R.id.button12);
		  b1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="songmenu";
				}	});
		  b2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					if(play_stop==0){play_stop=1;mes="stop"; 
					b2.setText("play");//((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.play));  
					}
					else {play_stop=0;mes="play";
					b2.setText("stop");
					//((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.stop)); 
					}
				}	});
		  b3.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="volume";
				}	});
		  button1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve1";
				}	});
		  button2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve2";
				}	});
		  button3.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve3";
				}	});
		  button4.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve4";
				}	});
		  button5.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve5";
				}	});
		  button6.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve6";
				}	});
		  button7.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve7";
				}	});
		  button8.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve8";
				}	});
		  button9.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve9";
				}	});
		  button10.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve10";
				}	});
		  button11.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve11";
				}	});
		  button12.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					update=1;
					mes="serve12";
				}	});
		  
		    
		    
		   mFirstFragment = new first();
	        FragmentManager fm = getFragmentManager();
	        FragmentTransaction fragmentTransaction = fm.beginTransaction();
	        fragmentTransaction.add(R.id.fragment_place, mFirstFragment);
	        fragmentTransaction.commit();
	        
	        
	        
	}

private class SocketServerThread extends Thread {
		
		@Override
		public void run() {
			try {								
				Socket socket = new Socket("192.168.165.58", 6000);	
				OutputStream outputStream = socket.getOutputStream();
				PrintStream printStream = new PrintStream(outputStream);
	           while(true) {
	        	  if(update==1) {printStream.print(mes);
	        	  update=0;
	        	  }
	        	   }
	           

					
	           
		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
}

	}
}
