package com.wilis.webkit1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class webkit1 extends Activity {
	WebView browser;
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);
		browser=(WebView)findViewById(R.id.webkit);
		
		browser.loadData("<html><body>Tulisan Pertama yang ditampilkan di web browser</body></html>",
							"text/html", "UTF-8");
	}
}