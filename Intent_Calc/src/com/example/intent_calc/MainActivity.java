package com.example.intent_calc;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
private EditText number1;
private EditText number2;
private Button btnsomar;
private Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//ligação com o layout
		number1 = (EditText)findViewById(R.edit.number1);
		number2 = (EditText) findViewById(R.edit.number2);
		btnsomar = (Button) findViewById(R.button.btn1);
		
		//instancia e definição do destino
		intent = new Intent(this, Intent2.class);
		btnsomar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent.putExtra("number1", number1.getText().toString());
				intent.putExtra("number2", number2.getText().toString());
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
