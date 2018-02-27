package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.dynamic.g.a;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public class qi extends g<qd>
{
  private static qi awH;

  protected qi()
  {
    super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
  }

  public static qa a(Activity paramActivity, c paramc, WalletFragmentOptions paramWalletFragmentOptions, qb paramqb)
    throws GooglePlayServicesNotAvailableException
  {
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramActivity);
    if (i != 0)
      throw new GooglePlayServicesNotAvailableException(i);
    try
    {
      qa localqa = ((qd)rg().L(paramActivity)).a(e.k(paramActivity), paramc, paramWalletFragmentOptions, paramqb);
      return localqa;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
    catch (g.a locala)
    {
    }
    throw new RuntimeException(locala);
  }

  private static qi rg()
  {
    if (awH == null)
      awH = new qi();
    return awH;
  }

  protected qd bW(IBinder paramIBinder)
  {
    return qd.a.bS(paramIBinder);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qi
 * JD-Core Version:    0.6.0
 */