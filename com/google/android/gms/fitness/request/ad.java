package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ad
  implements SafeParcelable
{
  public static final Parcelable.Creator<ad> CREATOR = new ae();
  private final int CK;
  private final l Wm;

  ad(int paramInt, IBinder paramIBinder)
  {
    this.CK = paramInt;
    this.Wm = l.a.aB(paramIBinder);
  }

  public ad(BleScanCallback paramBleScanCallback)
  {
    this.CK = 1;
    this.Wm = a.a.jP().b(paramBleScanCallback);
  }

  public int describeContents()
  {
    return 0;
  }

  int getVersionCode()
  {
    return this.CK;
  }

  public IBinder km()
  {
    return this.Wm.asBinder();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ae.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.ad
 * JD-Core Version:    0.6.0
 */