package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.g.a;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.jy;
import com.google.android.gms.internal.jz;

public final class SignInButton extends FrameLayout
  implements View.OnClickListener
{
  public static final int COLOR_DARK = 0;
  public static final int COLOR_LIGHT = 1;
  public static final int SIZE_ICON_ONLY = 2;
  public static final int SIZE_STANDARD = 0;
  public static final int SIZE_WIDE = 1;
  private View Jk;
  private View.OnClickListener Jl = null;
  private int mColor;
  private int mSize;

  public SignInButton(Context paramContext)
  {
    this(paramContext, null);
  }

  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setStyle(0, 0);
  }

  private void G(Context paramContext)
  {
    if (this.Jk != null)
      removeView(this.Jk);
    try
    {
      this.Jk = jy.b(paramContext, this.mSize, this.mColor);
      addView(this.Jk);
      this.Jk.setEnabled(isEnabled());
      this.Jk.setOnClickListener(this);
      return;
    }
    catch (g.a locala)
    {
      while (true)
      {
        Log.w("SignInButton", "Sign in button not found, using placeholder instead");
        this.Jk = a(paramContext, this.mSize, this.mColor);
      }
    }
  }

  private static Button a(Context paramContext, int paramInt1, int paramInt2)
  {
    jz localjz = new jz(paramContext);
    localjz.a(paramContext.getResources(), paramInt1, paramInt2);
    return localjz;
  }

  public void onClick(View paramView)
  {
    if ((this.Jl != null) && (paramView == this.Jk))
      this.Jl.onClick(this);
  }

  public void setColorScheme(int paramInt)
  {
    setStyle(this.mSize, paramInt);
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.Jk.setEnabled(paramBoolean);
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.Jl = paramOnClickListener;
    if (this.Jk != null)
      this.Jk.setOnClickListener(this);
  }

  public void setSize(int paramInt)
  {
    setStyle(paramInt, this.mColor);
  }

  public void setStyle(int paramInt1, int paramInt2)
  {
    boolean bool1;
    if ((paramInt1 >= 0) && (paramInt1 < 3))
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      jx.a(bool1, "Unknown button size %d", arrayOfObject1);
      if ((paramInt2 < 0) || (paramInt2 >= 2))
        break label92;
    }
    label92: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt2);
      jx.a(bool2, "Unknown color scheme %s", arrayOfObject2);
      this.mSize = paramInt1;
      this.mColor = paramInt2;
      G(getContext());
      return;
      bool1 = false;
      break;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.SignInButton
 * JD-Core Version:    0.6.0
 */