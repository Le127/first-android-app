package com.example.helloworld;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

class MovieView2 extends LinearLayout {
    public MovieView2(Context context) {
        this(context,null);

    }

    public MovieView2(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MovieView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
