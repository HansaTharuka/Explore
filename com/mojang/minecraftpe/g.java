package com.mojang.minecraftpe;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.mojang.android.StringValue;
import java.util.ArrayList;

class g
  implements Runnable
{
  g(MainActivity paramMainActivity, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int[] paramArrayOfInt)
  {
  }

  public void run()
  {
    boolean bool1 = true;
    int i = 0;
    MainActivity localMainActivity = this.a;
    boolean bool2;
    label26: LayoutInflater localLayoutInflater;
    if (this.b == 0)
    {
      bool2 = bool1;
      if (this.c != 0)
        break label233;
      MainActivity.a(localMainActivity, bool2, bool1, this.d);
      localLayoutInflater = LayoutInflater.from(this.a);
    }
    while (true)
    {
      try
      {
        View localView1 = localLayoutInflater.inflate(this.e, null);
        if ((this.b == 0) || (this.b == -1))
          continue;
        View localView4 = localView1.findViewById(this.b);
        if (localView4 == null)
          continue;
        localView4.setOnClickListener(new h(this));
        if ((this.c == 0) || (this.c == -1))
          continue;
        View localView3 = localView1.findViewById(this.c);
        if (localView3 == null)
          continue;
        localView3.setOnClickListener(new i(this));
        MainActivity.c(this.a).setView(localView1);
        if (this.f == null)
          continue;
        int[] arrayOfInt = this.f;
        int j = arrayOfInt.length;
        if (i < j)
          continue;
        MainActivity.c(this.a).show();
        MainActivity.c(this.a).getWindow().setFlags(1024, 1024);
        MainActivity.c(this.a).getWindow().setLayout(-1, -1);
        return;
        bool2 = false;
        break;
        label233: bool1 = false;
        break label26;
        View localView2 = localView1.findViewById(arrayOfInt[i]);
        if (!(localView2 instanceof StringValue))
          continue;
        MainActivity.d(this.a).add((StringValue)localView2);
        break label320;
        if ((localView2 instanceof TextView))
          MainActivity.d(this.a).add(new u((TextView)localView2));
      }
      catch (Error localError)
      {
        localError.printStackTrace();
        continue;
      }
      label320: i++;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mojang.minecraftpe.g
 * JD-Core Version:    0.6.0
 */