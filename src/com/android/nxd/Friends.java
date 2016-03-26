package com.android.nxd;

import android.R.anim;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Friends extends Activity{
	private String[] data = { "Joe","John","Robin","Jack","Jay","Eric","Lee","Rose"};
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.friends);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(
				Friends.this,android.R.layout.simple_list_item_1,data);
		ListView listView=(ListView) findViewById(R.id.list_view);
		listView.setAdapter(adapter);
	}

}
