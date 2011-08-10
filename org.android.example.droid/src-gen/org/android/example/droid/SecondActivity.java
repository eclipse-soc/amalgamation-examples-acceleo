package org.android.example.droid;

import org.android.example.droid.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class SecondActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.second_screen);
    }


	//Button(back) onClick
	public void back_onClick(View view) {
	    startActivityForResult(new Intent(view.getContext(), MainActivity.class), 0);
	}
	//Button(url) onClick
	public void url_onClick(View view) {
	    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com")));
	}
}
