package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

public class jh
  implements DialogInterface.OnClickListener
{
  private final Fragment Mx;
  private final int My;
  private final Intent mIntent;
  private final Activity nB;

  public jh(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.nB = paramActivity;
    this.Mx = null;
    this.mIntent = paramIntent;
    this.My = paramInt;
  }

  public jh(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    this.nB = null;
    this.Mx = paramFragment;
    this.mIntent = paramIntent;
    this.My = paramInt;
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if ((this.mIntent != null) && (this.Mx != null))
        this.Mx.startActivityForResult(this.mIntent, this.My);
      while (true)
      {
        paramDialogInterface.dismiss();
        return;
        if (this.mIntent == null)
          continue;
        this.nB.startActivityForResult(this.mIntent, this.My);
      }
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jh
 * JD-Core Version:    0.6.0
 */