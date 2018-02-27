package com.google.android.gms.analytics;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

class k
  implements q
{
  private static final Object xO = new Object();
  private static k yD;
  private final Context mContext;
  private String yE;
  private boolean yF = false;
  private final Object yG = new Object();

  protected k(Context paramContext)
  {
    this.mContext = paramContext;
    ep();
  }

  private boolean ae(String paramString)
  {
    try
    {
      ae.V("Storing clientId.");
      FileOutputStream localFileOutputStream = this.mContext.openFileOutput("gaClientId", 0);
      localFileOutputStream.write(paramString.getBytes());
      localFileOutputStream.close();
      return true;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      ae.T("Error creating clientId file.");
      return false;
    }
    catch (IOException localIOException)
    {
      ae.T("Error writing to clientId file.");
    }
    return false;
  }

  public static k el()
  {
    synchronized (xO)
    {
      k localk = yD;
      return localk;
    }
  }

  private String en()
  {
    if (!this.yF);
    synchronized (this.yG)
    {
      if (!this.yF)
        ae.V("Waiting for clientId to load");
      try
      {
        do
          this.yG.wait();
        while (!this.yF);
        ae.V("Loaded clientId");
        return this.yE;
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          ae.T("Exception while waiting for clientId: " + localInterruptedException);
      }
    }
  }

  private void ep()
  {
    new Thread("client_id_fetcher")
    {
      public void run()
      {
        synchronized (k.a(k.this))
        {
          k.a(k.this, k.this.eq());
          k.a(k.this, true);
          k.a(k.this).notifyAll();
          return;
        }
      }
    }
    .start();
  }

  public static void y(Context paramContext)
  {
    synchronized (xO)
    {
      if (yD == null)
        yD = new k(paramContext);
      return;
    }
  }

  public boolean ac(String paramString)
  {
    return "&cid".equals(paramString);
  }

  String em()
  {
    synchronized (this.yG)
    {
      this.yE = eo();
      String str = this.yE;
      return str;
    }
  }

  protected String eo()
  {
    String str = UUID.randomUUID().toString().toLowerCase();
    try
    {
      if (!ae(str))
        str = "0";
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  String eq()
  {
    Object localObject = null;
    try
    {
      localFileInputStream = this.mContext.openFileInput("gaClientId");
      byte[] arrayOfByte = new byte[''];
      int i = localFileInputStream.read(arrayOfByte, 0, 128);
      if (localFileInputStream.available() > 0)
      {
        ae.T("clientId file seems corrupted, deleting it.");
        localFileInputStream.close();
        this.mContext.deleteFile("gaClientId");
      }
      while (true)
      {
        if (localObject == null)
          localObject = eo();
        return localObject;
        if (i > 0)
          break;
        ae.T("clientId file seems empty, deleting it.");
        localFileInputStream.close();
        this.mContext.deleteFile("gaClientId");
        localObject = null;
      }
      str = new String(arrayOfByte, 0, i);
    }
    catch (IOException localIOException1)
    {
      while (true)
        try
        {
          FileInputStream localFileInputStream;
          localFileInputStream.close();
          ae.V("Loaded client id from disk.");
          localObject = str;
          continue;
          localIOException1 = localIOException1;
          ae.T("Error reading clientId file, deleting it.");
          this.mContext.deleteFile("gaClientId");
        }
        catch (IOException localIOException2)
        {
          localObject = str;
          continue;
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          String str;
          localObject = str;
        }
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      while (true)
        localObject = null;
    }
  }

  public String getValue(String paramString)
  {
    if ("&cid".equals(paramString))
      return en();
    return null;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.k
 * JD-Core Version:    0.6.0
 */