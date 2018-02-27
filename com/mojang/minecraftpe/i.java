package com.mojang.minecraftpe;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;

class i
  implements View.OnClickListener
{
  i(g paramg)
  {
  }

  public void onClick(View paramView)
  {
    if (MainActivity.c(g.a(this.a)) != null)
      MainActivity.c(g.a(this.a)).cancel();
    MainActivity.a(g.a(this.a));
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mojang.minecraftpe.i
 * JD-Core Version:    0.6.0
 */