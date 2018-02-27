package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionRef extends MultiDataBufferRef
  implements AppContentAction
{
  AppContentActionRef(ArrayList<DataHolder> paramArrayList, int paramInt)
  {
    super(paramArrayList, 1, paramInt);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return AppContentActionEntity.a(this, paramObject);
  }

  public Bundle getExtras()
  {
    return AppContentUtils.d(this.JG, this.XX, "action_data", this.KZ);
  }

  public String getLabel()
  {
    return getString("action_label");
  }

  public String getType()
  {
    return getString("action_type");
  }

  public int hashCode()
  {
    return AppContentActionEntity.a(this);
  }

  public List<AppContentCondition> kH()
  {
    return AppContentUtils.c(this.JG, this.XX, "action_conditions", this.KZ);
  }

  public String kI()
  {
    return getString("action_content_description");
  }

  public String kJ()
  {
    return getString("action_label_style");
  }

  public AppContentAction kK()
  {
    return new AppContentActionEntity(this);
  }

  public String toString()
  {
    return AppContentActionEntity.b(this);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentActionEntity)kK()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentActionRef
 * JD-Core Version:    0.6.0
 */