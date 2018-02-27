package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;

public class NotFilter extends AbstractFilter
{
  public static final Parcelable.Creator<NotFilter> CREATOR = new k();
  final int CK;
  final FilterHolder Sv;

  NotFilter(int paramInt, FilterHolder paramFilterHolder)
  {
    this.CK = paramInt;
    this.Sv = paramFilterHolder;
  }

  public NotFilter(Filter paramFilter)
  {
    this(1, new FilterHolder(paramFilter));
  }

  public <T> T a(f<T> paramf)
  {
    return paramf.j(this.Sv.getFilter().a(paramf));
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.internal.NotFilter
 * JD-Core Version:    0.6.0
 */