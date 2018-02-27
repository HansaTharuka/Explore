package com.mojang.android.preferences;

import android.content.Context;
import android.content.res.Resources;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SliderPreference extends DialogPreference
  implements SeekBar.OnSeekBarChangeListener
{
  private Context a;
  private TextView b;
  private SeekBar c;
  private String d;
  private int e;
  private int f;
  private int g;
  private int h;

  public SliderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
    this.d = a(paramAttributeSet, "http://schemas.android.com/apk/res/android", "text", "");
    this.e = a(paramAttributeSet, "http://schemas.android.com/apk/res/android", "defaultValue", 0);
    this.f = a(paramAttributeSet, "http://schemas.android.com/apk/res/android", "max", 100);
    this.h = a(paramAttributeSet, null, "min", 0);
    setDefaultValue(Integer.valueOf(this.e));
  }

  private int a(AttributeSet paramAttributeSet, String paramString1, String paramString2, int paramInt)
  {
    Resources localResources = getContext().getResources();
    int i = paramAttributeSet.getAttributeResourceValue(paramString1, paramString2, 0);
    if (i != 0)
      return localResources.getInteger(i);
    return paramAttributeSet.getAttributeIntValue(paramString1, paramString2, paramInt);
  }

  private String a(int paramInt)
  {
    return String.valueOf(paramInt).concat(this.d);
  }

  private String a(AttributeSet paramAttributeSet, String paramString1, String paramString2, String paramString3)
  {
    Resources localResources = getContext().getResources();
    int i = paramAttributeSet.getAttributeResourceValue(paramString1, paramString2, 0);
    if (i != 0)
      paramString3 = localResources.getString(i);
    String str;
    do
    {
      return paramString3;
      str = paramAttributeSet.getAttributeValue(paramString1, paramString2);
    }
    while (str == null);
    return str;
  }

  private int b(int paramInt)
  {
    return paramInt + this.h;
  }

  private int c(int paramInt)
  {
    return paramInt - this.h;
  }

  protected View onCreateDialogView()
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setPadding(6, 6, 6, 6);
    this.b = new TextView(this.a);
    this.b.setGravity(1);
    this.b.setTextSize(32.0F);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLinearLayout.addView(this.b, localLayoutParams);
    this.c = new SeekBar(this.a);
    this.c.setOnSeekBarChangeListener(this);
    localLinearLayout.addView(this.c, new LinearLayout.LayoutParams(-1, -2));
    if (shouldPersist())
      this.g = getPersistedInt(this.e);
    this.c.setMax(this.f);
    this.c.setProgress(this.g);
    return localLinearLayout;
  }

  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    this.g = b(paramInt);
    this.b.setText(a(this.g));
    if (shouldPersist())
      persistInt(b(paramInt));
    callChangeListener(new Integer(this.g));
  }

  protected void onSetInitialValue(boolean paramBoolean, Object paramObject)
  {
    super.onSetInitialValue(paramBoolean, paramObject);
    if (paramBoolean)
    {
      if (shouldPersist());
      for (int i = getPersistedInt(this.e); ; i = 0)
      {
        this.g = i;
        return;
      }
    }
    this.g = ((Integer)paramObject).intValue();
  }

  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
  }

  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mojang.android.preferences.SliderPreference
 * JD-Core Version:    0.6.0
 */