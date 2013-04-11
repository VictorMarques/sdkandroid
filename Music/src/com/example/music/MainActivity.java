package com.example.music;


import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button btplay, btpausar,btnext;
	MediaPlayer Player;
	boolean Click;
	 
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.linear);
	 
	btplay = (Button) findViewById(R.id.bttocar);
	btpausar = (Button) findViewById(R.id.btpausar);
	btnext = (Button) findViewById(R.id.btnext);
	Player = MediaPlayer.create(this, R.raw.b);

	 
	try {
	Player.prepare();
	} catch (Exception e) {
	}
	 
	btplay.setOnClickListener(new View.OnClickListener() {
	 
	@Override
	public void onClick(View arg0) {
	 
	Player.start();
	 
	}
	});
	 
	btpausar.setOnClickListener(new View.OnClickListener() {
	 
	@Override
	public void onClick(View arg0) {
	 
	Player.pause();
	 
	}
	});
	 
	}
	 
	}
