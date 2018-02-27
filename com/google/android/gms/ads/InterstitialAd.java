package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.bi;

public final class InterstitialAd
{
  private final bi lm;

  public InterstitialAd(Context paramContext)
  {
    this.lm = new bi(paramContext);
  }

  public AdListener getAdListener()
  {
    return this.lm.getAdListener();
  }

  public String getAdUnitId()
  {
    return this.lm.getAdUnitId();
  }

  public InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.lm.getInAppPurchaseListener();
  }

  public String getMediationAdapterClassName()
  {
    return this.lm.getMediationAdapterClassName();
  }

  public boolean isLoaded()
  {
    return this.lm.isLoaded();
  }

  public void loadAd(AdRequest paramAdRequest)
  {
    this.lm.a(paramAdRequest.Y());
  }

  public void setAdListener(AdListener paramAdListener)
  {
    this.lm.setAdListener(paramAdListener);
  }

  public void setAdUnitId(String paramString)
  {
    this.lm.setAdUnitId(paramString);
  }

  public void setInAppPurchaseListener(InAppPurchaseListener paramInAppPurchaseListener)
  {
    this.lm.setInAppPurchaseListener(paramInAppPurchaseListener);
  }

  public void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    this.lm.setPlayStorePurchaseParams(paramPlayStorePurchaseListener, paramString);
  }

  public void show()
  {
    this.lm.show();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.InterstitialAd
 * JD-Core Version:    0.6.0
 */