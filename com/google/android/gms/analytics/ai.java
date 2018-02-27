package com.google.android.gms.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

class ai
  implements q
{
  private static ai Cc;
  private static Object xO = new Object();
  private final Context mContext;

  protected ai(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public static ai fl()
  {
    synchronized (xO)
    {
      ai localai = Cc;
      return localai;
    }
  }

  public static void y(Context paramContext)
  {
    synchronized (xO)
    {
      if (Cc == null)
        Cc = new ai(paramContext);
      return;
    }
  }

  public boolean ac(String paramString)
  {
    return "&sr".equals(paramString);
  }

  protected String fm()
  {
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    return localDisplayMetrics.widthPixels + "x" + localDisplayMetrics.heightPixels;
  }

  public String getValue(String paramString)
  {
    if (paramString == null);
    do
      return null;
    while (!paramString.equals("&sr"));
    return fm();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.ai
 * JD-Core Version:    0.6.0
 */