package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;

public final class Scope
  implements SafeParcelable
{
  public static final Parcelable.Creator<Scope> CREATOR = new e();
  final int CK;
  private final String Kv;

  Scope(int paramInt, String paramString)
  {
    jx.b(paramString, "scopeUri must not be null or empty");
    this.CK = paramInt;
    this.Kv = paramString;
  }

  public Scope(String paramString)
  {
    this(1, paramString);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof Scope))
      return false;
    return this.Kv.equals(((Scope)paramObject).Kv);
  }

  public String gO()
  {
    return this.Kv;
  }

  public int hashCode()
  {
    return this.Kv.hashCode();
  }

  public String toString()
  {
    return this.Kv;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Scope
 * JD-Core Version:    0.6.0
 */