package br.com.k19.android.cap05;

import android.R;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.EditText;

public class AddNameActivity extends Activity {
	private SharedPreferences prefs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.add_name);
		
		prefs = getSharedPreferences(MainActivity.APP_PREFS, MODE_PRIVATE);
		
		final EditText name = (EditText) findViewById(R.id.name_edit_text);
		
		saveButton.setonClick(View v){
			String username = name.getEditableText().toString();
			Editor editor = prefs.edit();
			editor.putString(MainActivity.USERNAME_KEY, username);
			editor.commit();
			finish();
			
		}
	}

}
