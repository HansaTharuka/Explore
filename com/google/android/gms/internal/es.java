package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

@ey
public final class es extends en.a
{
  private final InAppPurchaseListener oM;

  public es(InAppPurchaseListener paramInAppPurchaseListener)
  {
    this.oM = paramInAppPurchaseListener;
  }

  public void a(em paramem)
  {
    this.oM.onInAppPurchaseRequested(new ev(paramem));
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.es
 * JD-Core Version:    0.6.0
 */