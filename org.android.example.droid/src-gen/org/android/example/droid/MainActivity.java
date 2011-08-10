package org.android.example.droid;

import org.android.example.droid.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
    }

	//Button() onClick
	public void _onClick(View view) {
	    startActivityForResult(new Intent(view.getContext(), SecondActivity.class), 0);
	}

}
