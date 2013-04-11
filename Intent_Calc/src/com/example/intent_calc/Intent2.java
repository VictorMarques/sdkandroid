package com.example.intent_calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Intent2 extends Activity {
	private Intent intent;
	private String number1;
	private String number2;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		
		//recebe a intent enviada
		intent = getIntent();
		
		//armazenar os números digitados
		number1 = intent.getStringExtra("number1");
		number2 = intent.getStringExtra("number2");
		
		//try e catch para se o usuário digitar letra
	
		TextView soma = (TextView) findViewById(R.id.soma);
		soma.setText(getString(R.string.soma, Double.parseDouble(number1)+
				Double.parseDouble(number2)));
		
		}
}
