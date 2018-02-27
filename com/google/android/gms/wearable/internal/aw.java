package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class aw
  implements SafeParcelable
{
  public static final Parcelable.Creator<aw> CREATOR = new ax();
  public final long ayc;
  public final List<an> aye;
  public final int statusCode;
  public final int versionCode;

  aw(int paramInt1, int paramInt2, long paramLong, List<an> paramList)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.ayc = paramLong;
    this.aye = paramList;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ax.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.aw
 * JD-Core Version:    0.6.0
 */