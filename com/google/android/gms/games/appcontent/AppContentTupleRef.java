package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

public final class AppContentTupleRef extends d
  implements AppContentTuple
{
  AppContentTupleRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return AppContentTupleEntity.a(this, paramObject);
  }

  public String getName()
  {
    return getString("tuple_name");
  }

  public String getValue()
  {
    return getString("tuple_value");
  }

  public int hashCode()
  {
    return AppContentTupleEntity.a(this);
  }

  public AppContentTuple ld()
  {
    return new AppContentTupleEntity(this);
  }

  public String toString()
  {
    return AppContentTupleEntity.b(this);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentTupleEntity)ld()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentTupleRef
 * JD-Core Version:    0.6.0
 */