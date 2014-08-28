package com.irk.space;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Thread timer = new Thread(){
			public void run() {
				try{
					sleep(2000);
			} 
				catch(InterruptedException ex){
					ex.printStackTrace();
			}
				finally{
					//Intent openStartingPoint = new Intent("com.thunderstick.medreminder.Setting");
					Intent openStrtngPoint = new Intent("android.intent.action.HOMEPGE");
					startActivity(openStrtngPoint);
			}
			}
		};
		timer.start();
    }
    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		finish();
		super.onPause();
	}
}
