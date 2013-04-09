/*Author: Malachi Musick

*/





package com.android.snoozealarm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	private final String ANSWER1 = "66";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void hasAnswer(View view){
		EditText editText = (EditText) findViewById(R.id.edit_answer);
		View checkMark = findViewById(R.id.check_mark);
		View xMark = findViewById(R.id.x_mark);
		
		checkMark.setVisibility(View.INVISIBLE);
		xMark.setVisibility(View.INVISIBLE);
		
		if(isCorrect(editText)){
			checkMark.setVisibility(View.VISIBLE);
		}
		else{
			xMark.setVisibility(View.VISIBLE);
			editText.setText("");
		}
	}
	
	
	public boolean isCorrect(EditText editText){
		boolean isTrue = false;
		
		if(editText.getText().toString().equals(ANSWER1))
			isTrue=true;
		
		return isTrue;
	}
	
	

}
