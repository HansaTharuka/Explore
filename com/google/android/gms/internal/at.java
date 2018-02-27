package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

@ey
public final class at extends bc.a
{
  private final AdListener ob;

  public at(AdListener paramAdListener)
  {
    this.ob = paramAdListener;
  }

  public void onAdClosed()
  {
    this.ob.onAdClosed();
  }

  public void onAdFailedToLoad(int paramInt)
  {
    this.ob.onAdFailedToLoad(paramInt);
  }

  public void onAdLeftApplication()
  {
    this.ob.onAdLeftApplication();
  }

  public void onAdLoaded()
  {
    this.ob.onAdLoaded();
  }

  public void onAdOpened()
  {
    this.ob.onAdOpened();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.at
 * JD-Core Version:    0.6.0
 */