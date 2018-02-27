package com.mojang.minecraftpe;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

class h
  implements View.OnClickListener
{
  h(g paramg)
  {
  }

  public void onClick(View paramView)
  {
    if (MainActivity.c(g.a(this.a)) != null)
      MainActivity.c(g.a(this.a)).dismiss();
    MainActivity.b(g.a(this.a));
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mojang.minecraftpe.h
 * JD-Core Version:    0.6.0
 */