package com.irk.space;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Timepge extends Activity{
	
	final Context context = this;
	TabHost th;
	TabSpec specs;
	Button tmsun, tmmercury, tmvenus, tmmoon, tmmars, tmjupitor, tmsaturn, tmuranus, tmneptune;
	EditText tmspeed;
	double spddata = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timepge);
		
		th = (TabHost) findViewById(R.id.tabhost);

		th.setup();
		specs = th.newTabSpec("tag1");// just set it up
		specs.setContent(R.id.Speed);
		specs.setIndicator("Speed");
		th.addTab(specs);

		specs = th.newTabSpec("tag2");// just set it up
		specs.setContent(R.id.Planet);
		specs.setIndicator("Planet");
		th.addTab(specs);
		
		tmsun = (Button) findViewById(R.id.tmebtnsun);
		tmmercury = (Button) findViewById(R.id.tmebtnmercury);
		tmvenus = (Button) findViewById(R.id.tmebtnvenus);
		tmmoon = (Button) findViewById(R.id.tmebtnmoon);
		tmmars = (Button) findViewById(R.id.tmebtnmars);
		tmjupitor = (Button) findViewById(R.id.tmebtnjupitor);
		tmsaturn = (Button) findViewById(R.id.tmebtnsaturn);
		tmuranus = (Button) findViewById(R.id.tmebtnuranus);
		tmneptune = (Button) findViewById(R.id.tmebtnneptune);

		tmspeed = (EditText) findViewById(R.id.tmetxtspeed);
		
		tmsun.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				spddata = 10000/Double.parseDouble(tmspeed.getText().toString());
				AlertDialog.Builder popup = new AlertDialog.Builder(context);
				popup.setTitle("Your Time");
				popup.setMessage("To the Sun your time = " + spddata + "hours");
				popup.setCancelable(false).setPositiveButton("OK",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								// if yes button is clicked, close current
								// activity
								// AlertDialog.this.finish();
							}
						});
				// create alert dialog
				AlertDialog alertDialog = popup.create();
				// Display alert dialog
				alertDialog.show();
			}
		});
	}

}
