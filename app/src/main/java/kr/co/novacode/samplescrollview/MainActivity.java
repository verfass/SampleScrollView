package kr.co.novacode.samplescrollview;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import static android.R.attr.width;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView01;
    ImageView imageView01;
    BitmapDrawable bitmap;

    boolean check = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView01 = (ScrollView)findViewById(R.id.scrollView01);
        imageView01 = (ImageView)findViewById(R.id.imageView01);
        Button button01 = (Button)findViewById(R.id.button01);

        scrollView01.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable)res.getDrawable(R.drawable.image01);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView01.setImageDrawable(bitmap);
        imageView01.getLayoutParams().width = bitmapWidth;
        imageView01.getLayoutParams().height = bitmapHeight;
    }

    public void onButton01Clicked(View v) {
        if (check) {
                changeImage(1);
        } else {
            changeImage(2);
        }
    }

    private void changeImage(int index) {
        Resources res = getResources();

        if (index == 1) {
            bitmap = (BitmapDrawable)res.getDrawable(R.drawable.image01);
        } else {
            bitmap = (BitmapDrawable)res.getDrawable(R.drawable.image02);
        }

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView01.setImageDrawable(bitmap);
        imageView01.getLayoutParams().width = bitmapWidth;
        imageView01.getLayoutParams().height = bitmapHeight;
    }
}
