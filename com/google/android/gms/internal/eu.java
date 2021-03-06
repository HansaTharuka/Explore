package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

@ey
public class eu
  implements InAppPurchaseResult
{
  private final eq te;

  public eu(eq parameq)
  {
    this.te = parameq;
  }

  public void finishPurchase()
  {
    try
    {
      this.te.finishPurchase();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Could not forward finishPurchase to InAppPurchaseResult", localRemoteException);
    }
  }

  public String getProductId()
  {
    try
    {
      String str = this.te.getProductId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Could not forward getProductId to InAppPurchaseResult", localRemoteException);
    }
    return null;
  }

  public Intent getPurchaseData()
  {
    try
    {
      Intent localIntent = this.te.getPurchaseData();
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Could not forward getPurchaseData to InAppPurchaseResult", localRemoteException);
    }
    return null;
  }

  public int getResultCode()
  {
    try
    {
      int i = this.te.getResultCode();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Could not forward getPurchaseData to InAppPurchaseResult", localRemoteException);
    }
    return 0;
  }

  public boolean isVerified()
  {
    try
    {
      boolean bool = this.te.isVerified();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Could not forward isVerified to InAppPurchaseResult", localRemoteException);
    }
    return false;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eu
 * JD-Core Version:    0.6.0
 */