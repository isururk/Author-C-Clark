package com.irk.space;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Weightpge extends Activity {

	final Context context = this;
	TabHost th;
	TabSpec specs;
	Button sun, mercury, venus, moon, mars, jupitor, saturn, uranus, neptune;
	EditText weight;
	double data = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weightpge);

		th = (TabHost) findViewById(R.id.tabhost);

		th.setup();
		specs = th.newTabSpec("tag1");// just set it up
		specs.setContent(R.id.Weight);
		specs.setIndicator("Weight");
		th.addTab(specs);

		specs = th.newTabSpec("tag2");// just set it up
		specs.setContent(R.id.Planet);
		specs.setIndicator("Planet");
		th.addTab(specs);

		sun = (Button) findViewById(R.id.btnsun);
		mercury = (Button) findViewById(R.id.btnmercury);
		venus = (Button) findViewById(R.id.btnvenus);
		moon = (Button) findViewById(R.id.btnmoon);
		mars = (Button) findViewById(R.id.btnmars);
		jupitor = (Button) findViewById(R.id.btnjupitor);
		saturn = (Button) findViewById(R.id.btnsaturn);
		uranus = (Button) findViewById(R.id.btnuranus);
		neptune = (Button) findViewById(R.id.btnneptune);

		weight = (EditText) findViewById(R.id.txtweight);

		sun.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				data = Double.parseDouble(weight.getText().toString())*2;
				AlertDialog.Builder popup = new AlertDialog.Builder(context);
				popup.setTitle("Your Weight");
				popup.setMessage("In the Sun your weight = " + data + "Kg");
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
		
		mercury.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				data = Double.parseDouble(weight.getText().toString())*3;
				AlertDialog.Builder popup = new AlertDialog.Builder(context);
				popup.setTitle("Your Weight");
				popup.setMessage("In the Mercury your weight = " + data + "Kg");
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
		
		venus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				data = Double.parseDouble(weight.getText().toString())*4.5;
				AlertDialog.Builder popup = new AlertDialog.Builder(context);
				popup.setTitle("Your Weight");
				popup.setMessage("In the Venus your weight = " + data + "Kg");
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
		
		moon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				data = Double.parseDouble(weight.getText().toString())*5;
				AlertDialog.Builder popup = new AlertDialog.Builder(context);
				popup.setTitle("Your Weight");
				popup.setMessage("In the Moon your weight = " + data + "Kg");
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
		
		mars.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				data = Double.parseDouble(weight.getText().toString())*7;
				AlertDialog.Builder popup = new AlertDialog.Builder(context);
				popup.setTitle("Your Weight");
				popup.setMessage("In the Mars your weight = " + data + "Kg");
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
		
		jupitor.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				data = Double.parseDouble(weight.getText().toString())*6.8;
				AlertDialog.Builder popup = new AlertDialog.Builder(context);
				popup.setTitle("Your Weight");
				popup.setMessage("In the Jupitor your weight = " + data + "Kg");
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
		
		saturn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				data = Double.parseDouble(weight.getText().toString())*4.65;
				AlertDialog.Builder popup = new AlertDialog.Builder(context);
				popup.setTitle("Your Weight");
				popup.setMessage("In the Saturn your weight = " + data + "Kg");
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
		
		uranus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				data = Double.parseDouble(weight.getText().toString())*2.3;
				AlertDialog.Builder popup = new AlertDialog.Builder(context);
				popup.setTitle("Your Weight");
				popup.setMessage("In the Uranus your weight = " + data + "Kg");
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
		
		neptune.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				data = Double.parseDouble(weight.getText().toString())*2.65;
				AlertDialog.Builder popup = new AlertDialog.Builder(context);
				popup.setTitle("Your Weight");
				popup.setMessage("In the Neptune your weight = " + data + "Kg");
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
