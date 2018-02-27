package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@ey
public final class gp extends gf
{
  private final Context mContext;
  private final String mG;
  private final String vf;
  private String wl = null;

  public gp(Context paramContext, String paramString1, String paramString2)
  {
    this.mContext = paramContext;
    this.mG = paramString1;
    this.vf = paramString2;
  }

  public gp(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.mContext = paramContext;
    this.mG = paramString1;
    this.vf = paramString2;
    this.wl = paramString3;
  }

  public void cx()
  {
    try
    {
      gr.V("Pinging URL: " + this.vf);
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(this.vf).openConnection();
      try
      {
        if (this.wl == null)
          gi.a(this.mContext, this.mG, true, localHttpURLConnection);
        while (true)
        {
          int i = localHttpURLConnection.getResponseCode();
          if ((i < 200) || (i >= 300))
            gr.W("Received non-success response code " + i + " from pinging URL: " + this.vf);
          return;
          gi.a(this.mContext, this.mG, true, localHttpURLConnection, this.wl);
        }
      }
      finally
      {
        localHttpURLConnection.disconnect();
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      gr.W("Error while parsing ping URL: " + this.vf + ". " + localIndexOutOfBoundsException.getMessage());
      return;
    }
    catch (IOException localIOException)
    {
      gr.W("Error while pinging URL: " + this.vf + ". " + localIOException.getMessage());
    }
  }

  public void onStop()
  {
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gp
 * JD-Core Version:    0.6.0
 */