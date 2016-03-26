package com.android.nxd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Comment extends Activity{
	public Button btn2;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.comment);
		btn2=(Button)findViewById(R.id.cbutton2);
		btn2.setOnClickListener(mListener);
	}
	OnClickListener mListener = new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.cbutton2:
				Intent intent=new Intent(Comment.this,Main.class);
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
