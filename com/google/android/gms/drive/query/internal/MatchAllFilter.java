package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class MatchAllFilter extends AbstractFilter
{
  public static final j CREATOR = new j();
  final int CK;

  public MatchAllFilter()
  {
    this(1);
  }

  MatchAllFilter(int paramInt)
  {
    this.CK = paramInt;
  }

  public <F> F a(f<F> paramf)
  {
    return paramf.jd();
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.internal.MatchAllFilter
 * JD-Core Version:    0.6.0
 */