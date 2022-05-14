package com.example.kalkulatorsederhana;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button Jumlah =(Button)findViewById(R.id.Tamb);
		Button kurang =(Button)findViewById(R.id.Kur);
		Button Bagi =(Button)findViewById(R.id.Bag);
		Button Kali =(Button)findViewById(R.id.Kal);
		Button Moderator =(Button)findViewById(R.id.Mode);
		
		Jumlah.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText firstNum= (EditText)findViewById(R.id.editText1);
				EditText SecondNum= (EditText)findViewById(R.id.editText2);
				TextView Result= (TextView)findViewById(R.id.textView2);
			
				double num1=Double.parseDouble(firstNum.getText().toString());
				double num2=Double.parseDouble(SecondNum.getText().toString());
				double result = num1+num2 ;
				Result.setText("Hasilnya adalah " + result);
				
			}
		});
		
		kurang.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			EditText firstNum= (EditText)findViewById(R.id.editText1);
			EditText SecondNum= (EditText)findViewById(R.id.editText2);
			TextView Result=(TextView)findViewById(R.id.textView2);
			
			double num1=Double.parseDouble(firstNum.getText().toString());
			double num2=Double.parseDouble(SecondNum.getText().toString());
			double result = num1-num2 ;
			Result.setText("Hasilnya adalah " + result);
			
		}
		});
		
		Kali.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			EditText firstNum= (EditText)findViewById(R.id.editText1);
			EditText SecondNum= (EditText)findViewById(R.id.editText2);
			TextView Result=(TextView)findViewById(R.id.textView2);
			
			
			double num1=Double.parseDouble(firstNum .getText().toString());
			double num2=Double.parseDouble(SecondNum.getText().toString());
			double result = num1*num2 ;
			Result.setText("Hasilnya adalah " + result);
			
		}
			});
		
		Bagi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText firstNum= (EditText)findViewById(R.id.editText1);
				EditText SecondNum= (EditText)findViewById(R.id.editText2);
				TextView Result=(TextView)findViewById(R.id.textView2);
				
				double num1=Double.parseDouble(firstNum.getText().toString());
				double num2=Double.parseDouble(SecondNum.getText().toString());
				double result = num1/num2 ;
				Result.setText("Hasilnya adalah " + result);
				
			}
			});
		
		Moderator.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText firstNum= (EditText)findViewById(R.id.editText1);
				EditText SecondNum= (EditText)findViewById(R.id.editText2);
				TextView Result=(TextView)findViewById(R.id.textView2);
				
				double num1=Double.parseDouble(firstNum.getText().toString());
				double num2=Double.parseDouble(SecondNum.getText().toString());
				double result = num1%num2 ;
				Result.setText("Hasilnya adalah " + result);
				
			}
			});	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
