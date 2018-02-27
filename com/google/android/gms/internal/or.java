package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.Set;

public class or
  implements SafeParcelable
{
  public static final ot CREATOR = new ot();
  public final long amW;
  public final byte[] amX;
  public final Bundle amY;
  public final String tag;
  public final int versionCode;

  or(int paramInt, long paramLong, String paramString, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    this.versionCode = paramInt;
    this.amW = paramLong;
    this.tag = paramString;
    this.amX = paramArrayOfByte;
    this.amY = paramBundle;
  }

  public or(long paramLong, String paramString, byte[] paramArrayOfByte, String[] paramArrayOfString)
  {
    this.versionCode = 1;
    this.amW = paramLong;
    this.tag = paramString;
    this.amX = paramArrayOfByte;
    this.amY = g(paramArrayOfString);
  }

  private static Bundle g(String[] paramArrayOfString)
  {
    Bundle localBundle = null;
    if (paramArrayOfString == null);
    while (true)
    {
      return localBundle;
      if (paramArrayOfString.length % 2 != 0)
        throw new IllegalArgumentException("extras must have an even number of elements");
      int i = paramArrayOfString.length / 2;
      localBundle = null;
      if (i == 0)
        continue;
      localBundle = new Bundle(i);
      for (int j = 0; j < i; j++)
        localBundle.putString(paramArrayOfString[(j * 2)], paramArrayOfString[(1 + j * 2)]);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("tag=").append(this.tag).append(",");
    localStringBuilder.append("eventTime=").append(this.amW).append(",");
    if ((this.amY != null) && (!this.amY.isEmpty()))
    {
      localStringBuilder.append("keyValues=");
      Iterator localIterator = this.amY.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("(").append(str).append(",");
        localStringBuilder.append(this.amY.getString(str)).append(")");
        localStringBuilder.append(" ");
      }
    }
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ot.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.or
 * JD-Core Version:    0.6.0
 */