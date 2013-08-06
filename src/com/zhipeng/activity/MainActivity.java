package com.zhipeng.activity;

import com.zhipeng.imageviewhandler.R;
import com.zhipeng.tools.ImageAsyncTask;
import com.zhipeng.tools.Provider;
import com.zhipeng.handler.ImageViewHandler;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private ImageView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imageView = (ImageView) findViewById(R.id.iv);
		
		// set image view handler
		new ImageViewHandler(imageView);

		// set handler task
		new ImageAsyncTask(Provider.getImageViewPath(), imageView).execute();
	}
}
