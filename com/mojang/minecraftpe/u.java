package com.mojang.minecraftpe;

import android.widget.TextView;
import com.mojang.android.StringValue;

class u
  implements StringValue
{
  private TextView a;

  public u(TextView paramTextView)
  {
    this.a = paramTextView;
  }

  public String a()
  {
    return this.a.getText().toString();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mojang.minecraftpe.u
 * JD-Core Version:    0.6.0
 */