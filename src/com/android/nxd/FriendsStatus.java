package com.android.nxd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FriendsStatus extends Activity{
	public Button btn1;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.friendsstatus);
		btn1=(Button)findViewById(R.id.sbutton1);
		btn1.setOnClickListener(mListener);
	}
	OnClickListener mListener = new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.sbutton1:
				Intent intent=new Intent(FriendsStatus.this,Main.class);
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
