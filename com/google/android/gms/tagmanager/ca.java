package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.d.a;
import java.util.Map;

class ca extends aj
{
  private static final String ID = a.O.toString();

  public ca()
  {
    super(ID, new String[0]);
  }

  public d.a B(Map<String, d.a> paramMap)
  {
    return di.u(Build.VERSION.RELEASE);
  }

  public boolean pe()
  {
    return true;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ca
 * JD-Core Version:    0.6.0
 */