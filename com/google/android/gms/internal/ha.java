package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ha
  implements Parcelable
{

  @Deprecated
  public static final Parcelable.Creator<ha> CREATOR = new Parcelable.Creator()
  {
    @Deprecated
    public ha[] I(int paramInt)
    {
      return new ha[paramInt];
    }

    @Deprecated
    public ha k(Parcel paramParcel)
    {
      return new ha(paramParcel);
    }
  };
  private String CE;
  private String CF;
  private String mValue;

  @Deprecated
  public ha()
  {
  }

  @Deprecated
  ha(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }

  public ha(String paramString1, String paramString2, String paramString3)
  {
    this.CE = paramString1;
    this.CF = paramString2;
    this.mValue = paramString3;
  }

  @Deprecated
  private void readFromParcel(Parcel paramParcel)
  {
    this.CE = paramParcel.readString();
    this.CF = paramParcel.readString();
    this.mValue = paramParcel.readString();
  }

  @Deprecated
  public int describeContents()
  {
    return 0;
  }

  public String getId()
  {
    return this.CE;
  }

  public String getValue()
  {
    return this.mValue;
  }

  @Deprecated
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.CE);
    paramParcel.writeString(this.CF);
    paramParcel.writeString(this.mValue);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ha
 * JD-Core Version:    0.6.0
 */