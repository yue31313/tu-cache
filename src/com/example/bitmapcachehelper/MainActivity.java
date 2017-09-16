package com.example.bitmapcachehelper;

import net.tsz.afinal.FinalBitmap;
import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private ImageView img;
	private String uri;
	private FinalBitmap finalBitmap;
	private BitmapDrawable bitmapDrawable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		img = (ImageView) findViewById(R.id.img);
		uri = "http://g.hiphotos.baidu.com/image/w%3D2048/sign=aebd5a21347adab43dd01c43bfecb21c/503d269759ee3d6d035f6ec241166d224f4ade1a.jpg";
		bitmapDrawable = (BitmapDrawable) getResources()
				.getDrawable(R.drawable.netunavail);
		finalBitmap = FinalBitmap.create(this);
	}

	public void click1 (View v) {
		finalBitmap.display(img, uri, null, bitmapDrawable.getBitmap());
	}
	
	
	public void click2 (View v) {
		finalBitmap.clearCache();
	}
	
}
