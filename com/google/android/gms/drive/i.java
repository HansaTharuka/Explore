package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.jx;

public abstract class i
  implements Parcelable
{
  private volatile transient boolean OW = false;

  protected abstract void I(Parcel paramParcel, int paramInt);

  public final boolean iB()
  {
    return this.OW;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!iB());
    for (boolean bool = true; ; bool = false)
    {
      jx.K(bool);
      this.OW = true;
      I(paramParcel, paramInt);
      return;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.i
 * JD-Core Version:    0.6.0
 */