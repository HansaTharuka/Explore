package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

@ey
public final class dm
{
  public static boolean a(Context paramContext, do paramdo, dv paramdv)
  {
    if (paramdo == null)
    {
      gr.W("No intent data for launcher overlay.");
      return false;
    }
    Intent localIntent = new Intent();
    if (TextUtils.isEmpty(paramdo.rH))
    {
      gr.W("Open GMSG did not contain a URL.");
      return false;
    }
    if (!TextUtils.isEmpty(paramdo.mimeType))
      localIntent.setDataAndType(Uri.parse(paramdo.rH), paramdo.mimeType);
    while (true)
    {
      localIntent.setAction("android.intent.action.VIEW");
      if (!TextUtils.isEmpty(paramdo.packageName))
        localIntent.setPackage(paramdo.packageName);
      if (TextUtils.isEmpty(paramdo.rI))
        break;
      String[] arrayOfString = paramdo.rI.split("/", 2);
      if (arrayOfString.length < 2)
      {
        gr.W("Could not parse component name from open GMSG: " + paramdo.rI);
        return false;
        localIntent.setData(Uri.parse(paramdo.rH));
        continue;
      }
      localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
    }
    try
    {
      gr.V("Launching an intent: " + localIntent);
      paramContext.startActivity(localIntent);
      paramdv.af();
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      gr.W(localActivityNotFoundException.getMessage());
    }
    return false;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dm
 * JD-Core Version:    0.6.0
 */