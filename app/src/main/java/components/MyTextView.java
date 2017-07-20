package components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by vivek on 7/21/2017.
 */

public class MyTextView extends TextView {

    public MyTextView(Context context) {
        super(context);
        Typeface face=Typeface.createFromAsset(context.getApplicationContext()
                .getAssets(), String.format("font/%s", "LS.otf"));
        this.setTypeface(face);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getApplicationContext()
                .getAssets(), String.format("font/%s", "LS.otf"));
        this.setTypeface(face);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face=Typeface.createFromAsset(context.getApplicationContext()
                .getAssets(), String.format("font/%s", "LS.otf"));
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);

    }

    @Override
    public boolean isInEditMode() {
        return true;
    }

}
