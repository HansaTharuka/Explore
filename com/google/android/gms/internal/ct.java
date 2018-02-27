package com.google.android.gms.internal;

@ey
public final class ct extends da.a
{
  private final Object mH = new Object();
  private cv.a qD;
  private cs qE;

  public void a(cs paramcs)
  {
    synchronized (this.mH)
    {
      this.qE = paramcs;
      return;
    }
  }

  public void a(cv.a parama)
  {
    synchronized (this.mH)
    {
      this.qD = parama;
      return;
    }
  }

  public void onAdClicked()
  {
    synchronized (this.mH)
    {
      if (this.qE != null)
        this.qE.ai();
      return;
    }
  }

  public void onAdClosed()
  {
    synchronized (this.mH)
    {
      if (this.qE != null)
        this.qE.aj();
      return;
    }
  }

  public void onAdFailedToLoad(int paramInt)
  {
    while (true)
    {
      synchronized (this.mH)
      {
        if (this.qD == null)
          continue;
        if (paramInt == 3)
        {
          i = 1;
          this.qD.k(i);
          this.qD = null;
          return;
        }
      }
      int i = 2;
    }
  }

  public void onAdLeftApplication()
  {
    synchronized (this.mH)
    {
      if (this.qE != null)
        this.qE.ak();
      return;
    }
  }

  public void onAdLoaded()
  {
    synchronized (this.mH)
    {
      if (this.qD != null)
      {
        this.qD.k(0);
        this.qD = null;
        return;
      }
      if (this.qE != null)
        this.qE.am();
      return;
    }
  }

  public void onAdOpened()
  {
    synchronized (this.mH)
    {
      if (this.qE != null)
        this.qE.al();
      return;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ct
 * JD-Core Version:    0.6.0
 */