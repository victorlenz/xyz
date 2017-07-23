package components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by vivek on 7/22/2017.
 */

public class MyEditText extends EditText {

    public MyEditText(Context context) {
        super(context);
        Typeface face=Typeface.createFromAsset(context.getApplicationContext()
                .getAssets(), String.format("font/%s", "LS.otf"));
        this.setTypeface(face);
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getApplicationContext()
                .getAssets(), String.format("font/%s", "LS.otf"));
        this.setTypeface(face);
    }

    public MyEditText(Context context, AttributeSet attrs, int defStyle) {
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
