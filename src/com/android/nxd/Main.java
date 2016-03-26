package com.android.nxd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity{
	public Button mtn1,mtn2,mtn3,mtn4;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mtn1=(Button)findViewById(R.id.mbutton1);
		mtn1.setOnClickListener(mListener);
		mtn2=(Button)findViewById(R.id.mbutton2);
		mtn2.setOnClickListener(mListener);
		mtn3=(Button)findViewById(R.id.mbutton3);
		mtn3.setOnClickListener(mListener);
		mtn4=(Button)findViewById(R.id.mbutton4);
		mtn4.setOnClickListener(mListener);
	}
	OnClickListener mListener = new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.mbutton4:
				Intent intent=new Intent(Main.this,Diary.class);
				startActivity(intent);
				break;
			case R.id.mbutton2:
				Intent intent1=new Intent(Main.this,Friends.class);
				startActivity(intent1);
				break;
			case R.id.mbutton3:
				Intent intent2=new Intent(Main.this,FriendsStatus.class);
				startActivity(intent2);
				break;
            case R.id.mbutton1:
            	Intent intent3=new Intent(Main.this,Comment.class);
				startActivity(intent3);
				break;
			}
		}
	};

}
