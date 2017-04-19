package com.example.togglebutton;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.annotation.IdRes;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by CQL on 2017/4/19.
 */

public class ToggleButton extends View {
    private Bitmap mBackground;
    private Bitmap mSlideImage;

    public ToggleButton(Context context) {
        super(context);
    }

    public ToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measureWidth = mBackground.getWidth();
        int measureHeight = mBackground.getHeight();
        setMeasuredDimension(measureWidth, measureHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //画背景
        if (mBackground != null) {
            canvas.drawBitmap(mBackground, 0, 0, null);
        }
        if (mSlideImage != null) {
            canvas.drawBitmap(mSlideImage, 0, 0, null);
        }
        //画滑动块
    }

    public void setSwitchBackground(int resId) {
        mBackground = BitmapFactory.decodeResource(getResources(), resId);
    }

    public void setSlideImage(int resId) {
        mSlideImage = BitmapFactory.decodeResource(getResources(), resId);
    }
}
