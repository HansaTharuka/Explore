package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;

public class FrameL extends FrameLayout
{
  static final String TAG = "admobPlus";
  private View.OnTouchListener mOnTouchListener;

  public FrameL(Context paramContext)
  {
    super(paramContext);
  }

  public FrameL(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public FrameL(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.mOnTouchListener != null)
      this.mOnTouchListener.onTouch(this, paramMotionEvent);
    return super.dispatchTouchEvent(paramMotionEvent);
  }

  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.mOnTouchListener = paramOnTouchListener;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.FrameL
 * JD-Core Version:    0.6.0
 */