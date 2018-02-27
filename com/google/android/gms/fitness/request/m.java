package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;

public class m
  implements SafeParcelable
{
  public static final Parcelable.Creator<m> CREATOR = new n();
  private final int CK;
  private final DataType TM;

  m(int paramInt, DataType paramDataType)
  {
    this.CK = paramInt;
    this.TM = paramDataType;
  }

  private m(a parama)
  {
    this.CK = 1;
    this.TM = a.a(parama);
  }

  public int describeContents()
  {
    return 0;
  }

  public DataType getDataType()
  {
    return this.TM;
  }

  int getVersionCode()
  {
    return this.CK;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    n.a(this, paramParcel, paramInt);
  }

  public static class a
  {
    private DataType TM;

    public a c(DataType paramDataType)
    {
      this.TM = paramDataType;
      return this;
    }

    public m ka()
    {
      return new m(this, null);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.m
 * JD-Core Version:    0.6.0
 */