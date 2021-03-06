package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jx;
import java.lang.reflect.Method;

public class ProviderInstaller
{
  public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
  private static Method apU;
  private static final Object ut = new Object();

  static
  {
    apU = null;
  }

  private static void V(Context paramContext)
    throws ClassNotFoundException, NoSuchMethodException
  {
    apU = paramContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[] { Context.class });
  }

  public static void installIfNeeded(Context paramContext)
    throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
  {
    jx.b(paramContext, "Context must not be null");
    GooglePlayServicesUtil.C(paramContext);
    Context localContext = GooglePlayServicesUtil.getRemoteContext(paramContext);
    if (localContext == null)
    {
      Log.e("ProviderInstaller", "Failed to get remote context");
      throw new GooglePlayServicesNotAvailableException(8);
    }
    synchronized (ut)
    {
      try
      {
        if (apU == null)
          V(localContext);
        apU.invoke(null, new Object[] { localContext });
        return;
      }
      catch (Exception localException)
      {
        Log.e("ProviderInstaller", "Failed to install provider: " + localException.getMessage());
        throw new GooglePlayServicesNotAvailableException(8);
      }
    }
  }

  public static void installIfNeededAsync(Context paramContext, ProviderInstallListener paramProviderInstallListener)
  {
    jx.b(paramContext, "Context must not be null");
    jx.b(paramProviderInstallListener, "Listener must not be null");
    jx.aU("Must be called on the UI thread");
    new AsyncTask(paramContext, paramProviderInstallListener)
    {
      protected Integer c(Void[] paramArrayOfVoid)
      {
        try
        {
          ProviderInstaller.installIfNeeded(this.nf);
          return Integer.valueOf(0);
        }
        catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
        {
          return Integer.valueOf(localGooglePlayServicesRepairableException.getConnectionStatusCode());
        }
        catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
        {
        }
        return Integer.valueOf(localGooglePlayServicesNotAvailableException.errorCode);
      }

      protected void d(Integer paramInteger)
      {
        if (paramInteger.intValue() == 0)
        {
          this.apV.onProviderInstalled();
          return;
        }
        Intent localIntent = GooglePlayServicesUtil.aj(paramInteger.intValue());
        this.apV.onProviderInstallFailed(paramInteger.intValue(), localIntent);
      }
    }
    .execute(new Void[0]);
  }

  public static abstract interface ProviderInstallListener
  {
    public abstract void onProviderInstallFailed(int paramInt, Intent paramIntent);

    public abstract void onProviderInstalled();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.security.ProviderInstaller
 * JD-Core Version:    0.6.0
 */