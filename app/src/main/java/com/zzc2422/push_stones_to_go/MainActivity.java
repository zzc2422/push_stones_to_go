package com.zzc2422.push_stones_to_go;

import android.app.Activity;
import android.os.Bundle;

import com.zzc2422.push_stones_to_go.view.GameView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new GameView(this));
	}
	
	@Override
	public void onBackPressed() {
		moveTaskToBack(true);
	}
}