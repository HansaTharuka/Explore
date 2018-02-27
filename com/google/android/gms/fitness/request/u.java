package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;

public class u
  implements SafeParcelable
{
  public static final Parcelable.Creator<u> CREATOR = new v();
  private final int CK;
  private final PendingIntent mPendingIntent;

  u(int paramInt, PendingIntent paramPendingIntent)
  {
    this.CK = paramInt;
    this.mPendingIntent = paramPendingIntent;
  }

  public u(PendingIntent paramPendingIntent)
  {
    this.CK = 3;
    this.mPendingIntent = paramPendingIntent;
  }

  private boolean a(u paramu)
  {
    return jv.equal(this.mPendingIntent, paramu.mPendingIntent);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof u)) && (a((u)paramObject)));
  }

  int getVersionCode()
  {
    return this.CK;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.mPendingIntent;
    return jv.hashCode(arrayOfObject);
  }

  public PendingIntent kb()
  {
    return this.mPendingIntent;
  }

  public String toString()
  {
    return jv.h(this).a("pendingIntent", this.mPendingIntent).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    v.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.u
 * JD-Core Version:    0.6.0
 */