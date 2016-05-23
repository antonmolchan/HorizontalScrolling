package com.example.anton.horizontalscrolling;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10;
    HorizontalScrollView horizontalScrollView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inMutable = true;

        iv1 = (ImageView) findViewById(R.id.imageView);
        iv2 = (ImageView) findViewById(R.id.imageView2);
        iv3 = (ImageView) findViewById(R.id.imageView3);
        iv4 = (ImageView) findViewById(R.id.imageView4);
        iv5 = (ImageView) findViewById(R.id.imageView5);
        iv6 = (ImageView) findViewById(R.id.imageView6);
        iv7 = (ImageView) findViewById(R.id.imageView7);
        iv8 = (ImageView) findViewById(R.id.imageView8);
        iv9 = (ImageView) findViewById(R.id.imageView9);
        iv10 = (ImageView) findViewById(R.id.imageView10);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        Bitmap bitma1 = BitmapFactory.decodeResource(getResources(), R.drawable.img1, opt);
        Bitmap bitma2 = BitmapFactory.decodeResource(getResources(), R.drawable.img2, opt);
        Bitmap bitma3 = BitmapFactory.decodeResource(getResources(), R.drawable.img3, opt);
        Bitmap bitma4 = BitmapFactory.decodeResource(getResources(), R.drawable.img4, opt);
        Bitmap bitma5 = BitmapFactory.decodeResource(getResources(), R.drawable.img5, opt);
        Bitmap bitma6 = BitmapFactory.decodeResource(getResources(), R.drawable.img6, opt);
        Bitmap bitma7 = BitmapFactory.decodeResource(getResources(), R.drawable.img7, opt);
        Bitmap bitma8 = BitmapFactory.decodeResource(getResources(), R.drawable.img8, opt);
        Bitmap bitma9 = BitmapFactory.decodeResource(getResources(), R.drawable.img9, opt);
        Bitmap bitma10 = BitmapFactory.decodeResource(getResources(), R.drawable.img10, opt);

        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitma1, metrics.widthPixels, metrics.heightPixels ,false);
        Bitmap bitmap2 = Bitmap.createScaledBitmap(bitma2, metrics.widthPixels, metrics.heightPixels ,false);
        Bitmap bitmap3 = Bitmap.createScaledBitmap(bitma3, metrics.widthPixels, metrics.heightPixels ,false);
        Bitmap bitmap4 = Bitmap.createScaledBitmap(bitma4, metrics.widthPixels, metrics.heightPixels ,false);
        Bitmap bitmap5 = Bitmap.createScaledBitmap(bitma5, metrics.widthPixels, metrics.heightPixels ,false);
        Bitmap bitmap6 = Bitmap.createScaledBitmap(bitma6, metrics.widthPixels, metrics.heightPixels ,false);
        Bitmap bitmap7 = Bitmap.createScaledBitmap(bitma7, metrics.widthPixels, metrics.heightPixels ,false);
        Bitmap bitmap8 = Bitmap.createScaledBitmap(bitma8, metrics.widthPixels, metrics.heightPixels ,false);
        Bitmap bitmap9 = Bitmap.createScaledBitmap(bitma9, metrics.widthPixels, metrics.heightPixels ,false);
        Bitmap bitmap10 = Bitmap.createScaledBitmap(bitma10, metrics.widthPixels, metrics.heightPixels ,false);

        iv1.setImageBitmap(bitmap1);
        iv2.setImageBitmap(bitmap2);
        iv3.setImageBitmap(bitmap3);
        iv4.setImageBitmap(bitmap4);
        iv5.setImageBitmap(bitmap5);
        iv6.setImageBitmap(bitmap6);
        iv7.setImageBitmap(bitmap7);
        iv8.setImageBitmap(bitmap8);
//        iv9.setImageBitmap(bitmap9);
//        iv10.setImageBitmap(bitmap10);

        horizontalScrollView = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            for(int i = 0; i < 50000; i++) {
                                try {
                                    horizontalScrollView.setSmoothScrollingEnabled(true);
                                    horizontalScrollView.smoothScrollBy(+1, 0);
                                    Thread.sleep(6);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }).start();

            }
        });

    }
}
