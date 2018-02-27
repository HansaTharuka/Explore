package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

@ey
public class ee extends eo.a
  implements ServiceConnection
{
  private final Activity nB;
  private eb sF;
  private final eh sG;
  private ek sI;
  private Context sO;
  private em sP;
  private ef sQ;
  private ej sR;
  private String sS = null;

  public ee(Activity paramActivity)
  {
    this.nB = paramActivity;
    this.sG = eh.j(this.nB.getApplicationContext());
  }

  public static void a(Context paramContext, boolean paramBoolean, ea paramea)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", paramBoolean);
    ea.a(localIntent, paramea);
    paramContext.startActivity(localIntent);
  }

  private void a(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent)
  {
    if (this.sR != null)
      this.sR.a(paramString, paramBoolean, paramInt, paramIntent, this.sQ);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1001);
    try
    {
      int i = ei.d(paramIntent);
      if ((paramInt2 == -1) && (i == 0))
      {
        boolean bool2 = this.sI.a(this.sS, paramInt2, paramIntent);
        bool1 = false;
        if (!bool2);
      }
      for (boolean bool1 = true; ; bool1 = false)
      {
        this.sP.recordPlayBillingResolution(i);
        this.nB.finish();
        a(this.sP.getProductId(), bool1, paramInt2, paramIntent);
        return;
        this.sG.a(this.sQ);
      }
    }
    catch (RemoteException localRemoteException)
    {
      gr.W("Fail to process purchase result.");
      this.nB.finish();
      return;
    }
    finally
    {
      this.sS = null;
    }
    throw localObject;
  }

  public void onCreate()
  {
    ea localea = ea.c(this.nB.getIntent());
    this.sR = localea.sB;
    this.sI = localea.md;
    this.sP = localea.sz;
    this.sF = new eb(this.nB.getApplicationContext());
    this.sO = localea.sA;
    if (this.nB.getResources().getConfiguration().orientation == 2)
      this.nB.setRequestedOrientation(6);
    while (true)
    {
      Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
      localIntent.setPackage("com.android.vending");
      this.nB.bindService(localIntent, this, 1);
      return;
      this.nB.setRequestedOrientation(7);
    }
  }

  public void onDestroy()
  {
    this.nB.unbindService(this);
    this.sF.destroy();
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.sF.t(paramIBinder);
    try
    {
      this.sS = this.sI.cC();
      Bundle localBundle = this.sF.a(this.nB.getPackageName(), this.sP.getProductId(), this.sS);
      PendingIntent localPendingIntent = (PendingIntent)localBundle.getParcelable("BUY_INTENT");
      if (localPendingIntent == null)
      {
        int i = ei.b(localBundle);
        this.sP.recordPlayBillingResolution(i);
        a(this.sP.getProductId(), false, i, null);
        this.nB.finish();
        return;
      }
      this.sQ = new ef(this.sP.getProductId(), this.sS);
      this.sG.b(this.sQ);
      this.nB.startIntentSenderForResult(localPendingIntent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
      return;
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
      gr.d("Error when connecting in-app billing service", localSendIntentException);
      this.nB.finish();
    }
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    gr.U("In-app billing service disconnected.");
    this.sF.destroy();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ee
 * JD-Core Version:    0.6.0
 */