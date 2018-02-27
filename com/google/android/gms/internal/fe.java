package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

@ey
public final class fe
{
  public static gf a(Context paramContext, fh paramfh, a parama)
  {
    if (paramfh.lO.wV)
      return b(paramContext, paramfh, parama);
    return c(paramContext, paramfh, parama);
  }

  private static gf b(Context paramContext, fh paramfh, a parama)
  {
    gr.S("Fetching ad response from local ad request service.");
    ff.a locala = new ff.a(paramContext, paramfh, parama);
    locala.start();
    return locala;
  }

  private static gf c(Context paramContext, fh paramfh, a parama)
  {
    gr.S("Fetching ad response from remote ad request service.");
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) != 0)
    {
      gr.W("Failed to connect to remote ad request service.");
      return null;
    }
    return new ff.b(paramContext, paramfh, parama);
  }

  public static abstract interface a
  {
    public abstract void a(fj paramfj);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fe
 * JD-Core Version:    0.6.0
 */