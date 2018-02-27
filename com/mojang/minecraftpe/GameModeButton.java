package com.mojang.minecraftpe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.mojang.android.StringValue;
import java.io.PrintStream;

public class GameModeButton extends ToggleButton
  implements View.OnClickListener, StringValue
{
  private boolean a = false;
  private int b = 0;

  public GameModeButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }

  public static String a(int paramInt)
  {
    return new String[] { "creative", "survival" }[c(paramInt)];
  }

  private void b()
  {
    setOnClickListener(this);
  }

  private void b(int paramInt)
  {
    int i = 1;
    this.b = c(paramInt);
    int k = 2131034122;
    if (this.b == i)
      k = 2131034121;
    String str = getContext().getString(k);
    View localView = getRootView().findViewById(2131099660);
    PrintStream localPrintStream = System.out;
    StringBuilder localStringBuilder = new StringBuilder("Mode: ").append(this.b).append(", view? ");
    if (localView != null);
    while (true)
    {
      localPrintStream.println(i);
      if ((str != null) && (localView != null) && ((localView instanceof TextView)))
        ((TextView)localView).setText(str);
      return;
      int j = 0;
    }
  }

  private static int c(int paramInt)
  {
    if (paramInt > 1)
      paramInt = 1;
    do
      return paramInt;
    while (paramInt >= 0);
    return 0;
  }

  private void c()
  {
    if (isChecked());
    for (int i = 1; ; i = 0)
    {
      b(i);
      return;
    }
  }

  public String a()
  {
    return a(this.b);
  }

  protected void onAttachedToWindow()
  {
    if (!this.a)
    {
      c();
      this.a = true;
    }
  }

  public void onClick(View paramView)
  {
    c();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    c();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mojang.minecraftpe.GameModeButton
 * JD-Core Version:    0.6.0
 */