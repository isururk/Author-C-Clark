package com.irk.space;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Homepge extends Activity{

	Button weight, time;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homepge);
		
		weight = (Button)findViewById(R.id.btnweight);
		time = (Button)findViewById(R.id.btntime);
		
		weight.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openStrtngPoint = new Intent("android.intent.action.WEIGHTPGE");
				startActivity(openStrtngPoint);
			}
		});
		
		time.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent openStrtngPoint = new Intent("android.intent.action.TIMEPGE");
				startActivity(openStrtngPoint);
			}
		});
	}

}
