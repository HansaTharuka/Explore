package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentConditionRef extends MultiDataBufferRef
  implements AppContentCondition
{
  AppContentConditionRef(ArrayList<DataHolder> paramArrayList, int paramInt)
  {
    super(paramArrayList, 4, paramInt);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return AppContentConditionEntity.a(this, paramObject);
  }

  public int hashCode()
  {
    return AppContentConditionEntity.a(this);
  }

  public String kT()
  {
    return getString("condition_default_value");
  }

  public String kU()
  {
    return getString("condition_expected_value");
  }

  public String kV()
  {
    return getString("condition_predicate");
  }

  public Bundle kW()
  {
    return AppContentUtils.d(this.JG, this.XX, "condition_predicate_parameters", this.KZ);
  }

  public AppContentCondition kX()
  {
    return new AppContentConditionEntity(this);
  }

  public String toString()
  {
    return AppContentConditionEntity.b(this);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentConditionEntity)kX()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentConditionRef
 * JD-Core Version:    0.6.0
 */