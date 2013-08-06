package com.zhipeng.tools;

import android.os.Environment;
import android.util.Log;

public class Provider {

	public static String getImageViewPath() {
		String result = null;
		result = Environment.getExternalStorageDirectory() + "/Pictures/Screenshots/Wonders_of_Nature_1535.jpg";
		Log.v("result:", result);
		return result;
	}
}
