package com.google.android.gms.analytics;

import android.content.Context;

class z extends n<aa>
{
  public z(Context paramContext)
  {
    super(paramContext, new a());
  }

  private static class a
    implements n.a<aa>
  {
    private final aa Bi = new aa();

    public void c(String paramString, int paramInt)
    {
      if ("ga_dispatchPeriod".equals(paramString))
      {
        this.Bi.Bk = paramInt;
        return;
      }
      ae.W("int configuration name not recognized:  " + paramString);
    }

    public void e(String paramString1, String paramString2)
    {
    }

    public void e(String paramString, boolean paramBoolean)
    {
      if ("ga_dryRun".equals(paramString))
      {
        aa localaa = this.Bi;
        if (paramBoolean);
        for (int i = 1; ; i = 0)
        {
          localaa.Bl = i;
          return;
        }
      }
      ae.W("bool configuration name not recognized:  " + paramString);
    }

    public aa eN()
    {
      return this.Bi;
    }

    public void f(String paramString1, String paramString2)
    {
      if ("ga_appName".equals(paramString1))
      {
        this.Bi.ya = paramString2;
        return;
      }
      if ("ga_appVersion".equals(paramString1))
      {
        this.Bi.yb = paramString2;
        return;
      }
      if ("ga_logLevel".equals(paramString1))
      {
        this.Bi.Bj = paramString2;
        return;
      }
      ae.W("string configuration name not recognized:  " + paramString1);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.z
 * JD-Core Version:    0.6.0
 */