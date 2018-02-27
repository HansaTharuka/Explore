package com.google.android.gms.internal;

import android.os.Bundle;

@ey
public class gd
{
  private final Object mH = new Object();
  private final ga vL;
  private final String vO;
  private int wr;
  private int ws;

  gd(ga paramga, String paramString)
  {
    this.vL = paramga;
    this.vO = paramString;
  }

  public gd(String paramString)
  {
    this(ga.dc(), paramString);
  }

  public void d(int paramInt1, int paramInt2)
  {
    synchronized (this.mH)
    {
      this.wr = paramInt1;
      this.ws = paramInt2;
      this.vL.a(this.vO, this);
      return;
    }
  }

  public Bundle toBundle()
  {
    synchronized (this.mH)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("pmnli", this.wr);
      localBundle.putInt("pmnll", this.ws);
      return localBundle;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gd
 * JD-Core Version:    0.6.0
 */