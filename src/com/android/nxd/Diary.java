package com.android.nxd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Diary extends Activity{
	public Button btn4;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diary);
		btn4=(Button)findViewById(R.id.dbutton4);
		btn4.setOnClickListener(mListener);
	}
	OnClickListener mListener = new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.dbutton4:
				Intent intent=new Intent(Diary.this,Main.class);
				startActivity(intent);
				break;
			case R.id.login_btn_login:
				
				break;
			case R.id.login_btn_cancle:
				
				break;
			}
		}
	};


}
