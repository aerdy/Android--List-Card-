package com.example.listcard1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelloCardActivity extends Activity
{
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello_card);

		findViewById(R.id.card).setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				Intent intent = new Intent(HelloCardActivity.this, HelloCardListActivity.class);
				startActivity(intent);
			}
		});
	}
}
