package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.d.a;
import java.util.Map;

class f extends aj
{
  private static final String ID = a.w.toString();
  private final Context mContext;

  public f(Context paramContext)
  {
    super(ID, new String[0]);
    this.mContext = paramContext;
  }

  public d.a B(Map<String, d.a> paramMap)
  {
    return di.u(this.mContext.getPackageName());
  }

  public boolean pe()
  {
    return true;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.f
 * JD-Core Version:    0.6.0
 */