package com.cuihai.nineimgview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * author:  崔海
 * time:    2017/5/15 20:45
 * name:
 * overview:
 * usage:
 */

public class ExampleImgView extends NineImgView {
    public ExampleImgView(Context context) {
        super(context);
    }

    public ExampleImgView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected boolean displayOneImage(ImageView imageView, String url, int parentWidth) {
        return true;
    }

    @Override
    protected void displayImage(ImageView imageView, String url) {
        Glide.with(getContext()).load(url).into(imageView);
    }

    @Override
    protected void onClickImage(int position, String url, List<String> urlList) {
        Toast.makeText(mContext, "点击了图片", Toast.LENGTH_SHORT).show();
    }
}
