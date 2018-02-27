package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@ey
public final class dc extends cz.a
{
  private final MediationAdapter qV;

  public dc(MediationAdapter paramMediationAdapter)
  {
    this.qV = paramMediationAdapter;
  }

  private Bundle a(String paramString1, int paramInt, String paramString2)
    throws RemoteException
  {
    gr.W("Server parameters: " + paramString1);
    Bundle localBundle;
    try
    {
      localObject = new Bundle();
      if (paramString1 == null)
        break label121;
      JSONObject localJSONObject = new JSONObject(paramString1);
      localBundle = new Bundle();
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localBundle.putString(str, localJSONObject.getString(str));
      }
    }
    catch (Throwable localThrowable)
    {
      gr.d("Could not get Server Parameters Bundle.", localThrowable);
      throw new RemoteException();
    }
    Object localObject = localBundle;
    label121: if ((this.qV instanceof AdMobAdapter))
    {
      ((Bundle)localObject).putString("adJson", paramString2);
      ((Bundle)localObject).putInt("tagForChildDirectedTreatment", paramInt);
    }
    return (Bundle)localObject;
  }

  public void a(d paramd, av paramav, String paramString, da paramda)
    throws RemoteException
  {
    a(paramd, paramav, paramString, null, paramda);
  }

  public void a(d paramd, av paramav, String paramString1, String paramString2, da paramda)
    throws RemoteException
  {
    if (!(this.qV instanceof MediationInterstitialAdapter))
    {
      gr.W("MediationAdapter is not a MediationInterstitialAdapter: " + this.qV.getClass().getCanonicalName());
      throw new RemoteException();
    }
    gr.S("Requesting interstitial ad from adapter.");
    try
    {
      MediationInterstitialAdapter localMediationInterstitialAdapter = (MediationInterstitialAdapter)this.qV;
      HashSet localHashSet;
      db localdb;
      if (paramav.of != null)
      {
        localHashSet = new HashSet(paramav.of);
        localdb = new db(new Date(paramav.od), paramav.oe, localHashSet, paramav.ol, paramav.og, paramav.oh);
        if (paramav.on == null)
          break label190;
      }
      label190: for (Bundle localBundle = paramav.on.getBundle(localMediationInterstitialAdapter.getClass().getName()); ; localBundle = null)
      {
        localMediationInterstitialAdapter.requestInterstitialAd((Context)e.f(paramd), new dd(paramda), a(paramString1, paramav.oh, paramString2), localdb, localBundle);
        return;
        localHashSet = null;
        break;
      }
    }
    catch (Throwable localThrowable)
    {
      gr.d("Could not request interstitial ad from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public void a(d paramd, ay paramay, av paramav, String paramString, da paramda)
    throws RemoteException
  {
    a(paramd, paramay, paramav, paramString, null, paramda);
  }

  public void a(d paramd, ay paramay, av paramav, String paramString1, String paramString2, da paramda)
    throws RemoteException
  {
    if (!(this.qV instanceof MediationBannerAdapter))
    {
      gr.W("MediationAdapter is not a MediationBannerAdapter: " + this.qV.getClass().getCanonicalName());
      throw new RemoteException();
    }
    gr.S("Requesting banner ad from adapter.");
    try
    {
      MediationBannerAdapter localMediationBannerAdapter = (MediationBannerAdapter)this.qV;
      if (paramav.of != null);
      for (HashSet localHashSet = new HashSet(paramav.of); ; localHashSet = null)
      {
        db localdb = new db(new Date(paramav.od), paramav.oe, localHashSet, paramav.ol, paramav.og, paramav.oh);
        Bundle localBundle1 = paramav.on;
        Bundle localBundle2 = null;
        if (localBundle1 != null)
          localBundle2 = paramav.on.getBundle(localMediationBannerAdapter.getClass().getName());
        localMediationBannerAdapter.requestBannerAd((Context)e.f(paramd), new dd(paramda), a(paramString1, paramav.oh, paramString2), a.a(paramay.width, paramay.height, paramay.op), localdb, localBundle2);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      gr.d("Could not request banner ad from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public void destroy()
    throws RemoteException
  {
    try
    {
      this.qV.onDestroy();
      return;
    }
    catch (Throwable localThrowable)
    {
      gr.d("Could not destroy adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public d getView()
    throws RemoteException
  {
    if (!(this.qV instanceof MediationBannerAdapter))
    {
      gr.W("MediationAdapter is not a MediationBannerAdapter: " + this.qV.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      d locald = e.k(((MediationBannerAdapter)this.qV).getBannerView());
      return locald;
    }
    catch (Throwable localThrowable)
    {
      gr.d("Could not get banner view from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public void pause()
    throws RemoteException
  {
    try
    {
      this.qV.onPause();
      return;
    }
    catch (Throwable localThrowable)
    {
      gr.d("Could not pause adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public void resume()
    throws RemoteException
  {
    try
    {
      this.qV.onResume();
      return;
    }
    catch (Throwable localThrowable)
    {
      gr.d("Could not resume adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public void showInterstitial()
    throws RemoteException
  {
    if (!(this.qV instanceof MediationInterstitialAdapter))
    {
      gr.W("MediationAdapter is not a MediationInterstitialAdapter: " + this.qV.getClass().getCanonicalName());
      throw new RemoteException();
    }
    gr.S("Showing interstitial from adapter.");
    try
    {
      ((MediationInterstitialAdapter)this.qV).showInterstitial();
      return;
    }
    catch (Throwable localThrowable)
    {
      gr.d("Could not show interstitial from adapter.", localThrowable);
    }
    throw new RemoteException();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dc
 * JD-Core Version:    0.6.0
 */