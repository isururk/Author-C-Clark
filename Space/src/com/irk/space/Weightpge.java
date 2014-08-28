package com.irk.space;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Weightpge extends Activity{

	TabHost th;
	TabSpec specs;
	Button sun, mercury, venus, moon, mars, jupitor, saturn, uranus, neptune;
	EditText weight;
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
		
		sun = (Button)findViewById(R.id.btnsun);
		mercury = (Button)findViewById(R.id.btnmercury);
		venus = (Button)findViewById(R.id.btnvenus);
		moon = (Button)findViewById(R.id.btnmoon);
		mars = (Button)findViewById(R.id.btnmars);
		jupitor = (Button)findViewById(R.id.btnjupitor);
		saturn = (Button)findViewById(R.id.btnsaturn);
		uranus = (Button)findViewById(R.id.btnuranus);
		neptune = (Button)findViewById(R.id.btnneptune);
		
		weight = (EditText)findViewById(R.id.txtweight);
	}

}
