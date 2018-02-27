package com.google.android.gms.internal;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class j extends i
{
  private static AdvertisingIdClient kO;
  private static CountDownLatch kP = new CountDownLatch(1);
  private static boolean kQ;

  protected j(Context paramContext, m paramm, n paramn)
  {
    super(paramContext, paramm, paramn);
  }

  public static j a(String paramString, Context paramContext)
  {
    e locale = new e();
    a(paramString, paramContext, locale);
    monitorenter;
    try
    {
      if (kO == null)
      {
        kO = new AdvertisingIdClient(paramContext);
        new AsyncTask()
        {
          protected Void a(Void[] paramArrayOfVoid)
          {
            try
            {
              j.A().start();
              j.B().countDown();
              return null;
            }
            catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
            {
              while (true)
              {
                j.a(true);
                j.a(null);
              }
            }
            catch (IOException localIOException)
            {
              while (true)
                j.a(null);
            }
            catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
            {
              while (true)
                j.a(null);
            }
          }
        }
        .execute(new Void[0]);
      }
      return new j(paramContext, locale, new p(239));
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  protected void b(Context paramContext)
  {
    super.b(paramContext);
    try
    {
      if (kQ)
      {
        a(24, d(paramContext));
        return;
      }
      a locala1 = z();
      if (locala1.isLimitAdTrackingEnabled())
      {
        l = 1L;
        a(28, l);
        String str = locala1.getId();
        if (str == null)
          return;
        a(26, 5L);
        a(24, str);
        return;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        return;
        long l = 0L;
      }
    }
    catch (i.a locala)
    {
    }
  }

  a z()
    throws IOException
  {
    int i = 0;
    monitorenter;
    try
    {
      if (!kP.await(2L, TimeUnit.SECONDS))
      {
        a locala2 = new a(null, false);
        return locala2;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      a locala1 = new a(null, false);
      return locala1;
    }
    finally
    {
      monitorexit;
    }
    if (kO == null)
    {
      a locala3 = new a(null, false);
      monitorexit;
      return locala3;
    }
    AdvertisingIdClient.Info localInfo = kO.getInfo();
    monitorexit;
    String str1 = localInfo.getId();
    byte[] arrayOfByte;
    if ((str1 != null) && (str1.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")))
    {
      arrayOfByte = new byte[16];
      int j = 0;
      while (i < str1.length())
      {
        if ((i == 8) || (i == 13) || (i == 18) || (i == 23))
          i++;
        arrayOfByte[j] = (byte)((Character.digit(str1.charAt(i), 16) << 4) + Character.digit(str1.charAt(i + 1), 16));
        j++;
        i += 2;
      }
    }
    for (String str2 = this.ky.a(arrayOfByte, true); ; str2 = str1)
      return new a(str2, localInfo.isLimitAdTrackingEnabled());
  }

  class a
  {
    private String kR;
    private boolean kS;

    public a(String paramBoolean, boolean arg3)
    {
      this.kR = paramBoolean;
      boolean bool;
      this.kS = bool;
    }

    public String getId()
    {
      return this.kR;
    }

    public boolean isLimitAdTrackingEnabled()
    {
      return this.kS;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.j
 * JD-Core Version:    0.6.0
 */