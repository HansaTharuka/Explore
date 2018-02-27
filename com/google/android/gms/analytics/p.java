package com.google.android.gms.analytics;

import android.util.Log;

class p
  implements Logger
{
  private int yM = 2;

  private String af(String paramString)
  {
    return Thread.currentThread().toString() + ": " + paramString;
  }

  public void error(Exception paramException)
  {
    if (this.yM <= 3)
      Log.e("GAV4", null, paramException);
  }

  public void error(String paramString)
  {
    if (this.yM <= 3)
      Log.e("GAV4", af(paramString));
  }

  public int getLogLevel()
  {
    return this.yM;
  }

  public void info(String paramString)
  {
    if (this.yM <= 1)
      Log.i("GAV4", af(paramString));
  }

  public void setLogLevel(int paramInt)
  {
    this.yM = paramInt;
  }

  public void verbose(String paramString)
  {
    if (this.yM <= 0)
      Log.v("GAV4", af(paramString));
  }

  public void warn(String paramString)
  {
    if (this.yM <= 2)
      Log.w("GAV4", af(paramString));
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.p
 * JD-Core Version:    0.6.0
 */