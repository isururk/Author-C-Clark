package com.irk.space;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class Homepge extends Activity{

	Button weight, details;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homepge);
		
		weight = (Button)findViewById(R.id.btnweight);
		details = (Button)findViewById(R.id.btndetails);
	}

}
