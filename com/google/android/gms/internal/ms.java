package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class ms
  implements SafeParcelable
{
  public static final Parcelable.Creator<ms> CREATOR = new mt();
  private final int CK;
  private final DataSource TN;

  ms(int paramInt, DataSource paramDataSource)
  {
    this.CK = paramInt;
    this.TN = paramDataSource;
  }

  public int describeContents()
  {
    return 0;
  }

  public DataSource getDataSource()
  {
    return this.TN;
  }

  int getVersionCode()
  {
    return this.CK;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.TN;
    return String.format("ApplicationUnregistrationRequest{%s}", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    mt.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ms
 * JD-Core Version:    0.6.0
 */