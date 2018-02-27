package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.doubleclick.b;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

public class bi
{
  private final Context mContext;
  private final cx oH = new cx();
  private final ax oI;
  private bd oJ;
  private String oK;
  private InAppPurchaseListener oM;
  private PlayStorePurchaseListener oN;
  private b oO;
  private PublisherInterstitialAd oP;
  private AdListener ob;
  private AppEventListener os;
  private String ou;

  public bi(Context paramContext)
  {
    this(paramContext, ax.bg(), null);
  }

  public bi(Context paramContext, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    this(paramContext, ax.bg(), paramPublisherInterstitialAd);
  }

  public bi(Context paramContext, ax paramax, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    this.mContext = paramContext;
    this.oI = paramax;
    this.oP = paramPublisherInterstitialAd;
  }

  private void v(String paramString)
    throws RemoteException
  {
    if (this.ou == null)
      w(paramString);
    this.oJ = au.a(this.mContext, new ay(), this.ou, this.oH);
    if (this.ob != null)
      this.oJ.a(new at(this.ob));
    if (this.os != null)
      this.oJ.a(new ba(this.os));
    if (this.oM != null)
      this.oJ.a(new es(this.oM));
    if (this.oN != null)
      this.oJ.a(new ew(this.oN), this.oK);
    if (this.oO != null)
      this.oJ.a(new bs(this.oO));
  }

  private void w(String paramString)
  {
    if (this.oJ == null)
      throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + paramString + " is called.");
  }

  public void a(bg parambg)
  {
    try
    {
      if (this.oJ == null)
        v("loadAd");
      if (this.oJ.a(this.oI.a(this.mContext, parambg)))
        this.oH.d(parambg.bj());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Failed to load ad.", localRemoteException);
    }
  }

  String get()
  {
    byte[] arrayOfByte1 = { 124, 58, -82, -81, -38, 73, 73, 117, 78, 4, -54, -26, 52, -26, -127, 2, 43, -9, -111, 77, -113, -54, 22, -28, 19, -31, -30, -22, -108, -101, 124, -3, -41, -62, -99, 88, 59, 50 };
    byte[] arrayOfByte2 = { 31, 91, -125, -50, -86, 57, 100, 5, 59, 102, -25, -46, 4, -47, -80, 54, 31, -60, -93, 127, -70, -13, 46, -42, 36, -44, -48, -59, -96, -85, 76, -59, -31, -11, -83, 96, 9, 3 };
    byte[] arrayOfByte3 = new byte[arrayOfByte1.length];
    for (int i = 0; ; i++)
    {
      if (i >= arrayOfByte3.length)
        return new String(arrayOfByte3);
      arrayOfByte3[i] = (byte)(arrayOfByte1[i] ^ arrayOfByte2[(i % arrayOfByte2.length)]);
    }
  }

  public AdListener getAdListener()
  {
    return this.ob;
  }

  public String getAdUnitId()
  {
    return this.ou;
  }

  public AppEventListener getAppEventListener()
  {
    return this.os;
  }

  public InAppPurchaseListener getInAppPurchaseListener()
  {
    return this.oM;
  }

  public String getMediationAdapterClassName()
  {
    try
    {
      if (this.oJ != null)
      {
        String str = this.oJ.getMediationAdapterClassName();
        return str;
      }
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Failed to get the mediation adapter class name.", localRemoteException);
    }
    return null;
  }

  public boolean isLoaded()
  {
    try
    {
      if (this.oJ == null)
        return false;
      boolean bool = this.oJ.isReady();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Failed to check if ad is ready.", localRemoteException);
    }
    return false;
  }

  public void setAdListener(AdListener paramAdListener)
  {
    try
    {
      this.ob = paramAdListener;
      bd localbd;
      if (this.oJ != null)
      {
        localbd = this.oJ;
        if (paramAdListener == null)
          break label40;
      }
      label40: for (at localat = new at(paramAdListener); ; localat = null)
      {
        localbd.a(localat);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Failed to set the AdListener.", localRemoteException);
    }
  }

  public void setAdUnitId(String paramString)
  {
    if (this.ou != null)
      throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    get();
    this.ou = paramString;
  }

  public void setAppEventListener(AppEventListener paramAppEventListener)
  {
    try
    {
      this.os = paramAppEventListener;
      bd localbd;
      if (this.oJ != null)
      {
        localbd = this.oJ;
        if (paramAppEventListener == null)
          break label40;
      }
      label40: for (ba localba = new ba(paramAppEventListener); ; localba = null)
      {
        localbd.a(localba);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Failed to set the AppEventListener.", localRemoteException);
    }
  }

  public void setInAppPurchaseListener(InAppPurchaseListener paramInAppPurchaseListener)
  {
    if (this.oN != null)
      throw new IllegalStateException("Play store purchase parameter has already been set.");
    try
    {
      this.oM = paramInAppPurchaseListener;
      bd localbd;
      if (this.oJ != null)
      {
        localbd = this.oJ;
        if (paramInAppPurchaseListener == null)
          break label58;
      }
      label58: for (es locales = new es(paramInAppPurchaseListener); ; locales = null)
      {
        localbd.a(locales);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Failed to set the InAppPurchaseListener.", localRemoteException);
    }
  }

  public void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    try
    {
      this.oN = paramPlayStorePurchaseListener;
      bd localbd;
      if (this.oJ != null)
      {
        localbd = this.oJ;
        if (paramPlayStorePurchaseListener == null)
          break label43;
      }
      label43: for (ew localew = new ew(paramPlayStorePurchaseListener); ; localew = null)
      {
        localbd.a(localew, paramString);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Failed to set the play store purchase parameter.", localRemoteException);
    }
  }

  public void show()
  {
    try
    {
      w("show");
      this.oJ.showInterstitial();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Failed to show interstitial.", localRemoteException);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bi
 * JD-Core Version:    0.6.0
 */