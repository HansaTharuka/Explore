package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

@ey
public final class ew extends er.a
{
  private final PlayStorePurchaseListener oN;

  public ew(PlayStorePurchaseListener paramPlayStorePurchaseListener)
  {
    this.oN = paramPlayStorePurchaseListener;
  }

  public void a(eq parameq)
  {
    this.oN.onInAppPurchaseFinished(new eu(parameq));
  }

  public boolean isValidPurchase(String paramString)
  {
    return this.oN.isValidPurchase(paramString);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ew
 * JD-Core Version:    0.6.0
 */