package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;

public abstract interface CustomEventBanner extends CustomEvent
{
  public abstract void requestBannerAd(Context paramContext, CustomEventBannerListener paramCustomEventBannerListener, String paramString, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, Bundle paramBundle);
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventBanner
 * JD-Core Version:    0.6.0
 */