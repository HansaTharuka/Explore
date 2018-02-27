package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ConnectionInfo
  implements SafeParcelable
{
  public static final ConnectionInfoCreator CREATOR = new ConnectionInfoCreator();
  private final int CK;
  private final String Yi;
  private final int Yj;

  public ConnectionInfo(int paramInt1, String paramString, int paramInt2)
  {
    this.CK = paramInt1;
    this.Yi = paramString;
    this.Yj = paramInt2;
  }

  public int describeContents()
  {
    return 0;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public String le()
  {
    return this.Yi;
  }

  public int lf()
  {
    return this.Yj;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ConnectionInfoCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.ConnectionInfo
 * JD-Core Version:    0.6.0
 */