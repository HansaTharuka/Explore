package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.purchase.InAppPurchase;

@ey
public class ev
  implements InAppPurchase
{
  private final em sP;

  public ev(em paramem)
  {
    this.sP = paramem;
  }

  public String getProductId()
  {
    try
    {
      String str = this.sP.getProductId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Could not forward getProductId to InAppPurchase", localRemoteException);
    }
    return null;
  }

  public void recordPlayBillingResolution(int paramInt)
  {
    try
    {
      this.sP.recordPlayBillingResolution(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Could not forward recordPlayBillingResolution to InAppPurchase", localRemoteException);
    }
  }

  public void recordResolution(int paramInt)
  {
    try
    {
      this.sP.recordResolution(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Could not forward recordResolution to InAppPurchase", localRemoteException);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ev
 * JD-Core Version:    0.6.0
 */