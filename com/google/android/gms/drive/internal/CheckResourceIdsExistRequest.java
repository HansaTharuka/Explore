package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CheckResourceIdsExistRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<CheckResourceIdsExistRequest> CREATOR = new e();
  private final int CK;
  private final List<String> Po;

  CheckResourceIdsExistRequest(int paramInt, List<String> paramList)
  {
    this.CK = paramInt;
    this.Po = paramList;
  }

  public int describeContents()
  {
    return 0;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public List<String> iF()
  {
    return this.Po;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.CheckResourceIdsExistRequest
 * JD-Core Version:    0.6.0
 */