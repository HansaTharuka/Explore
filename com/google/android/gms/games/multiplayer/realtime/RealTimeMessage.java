package com.google.android.gms.games.multiplayer.realtime;

import B;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.jx;

public final class RealTimeMessage
  implements Parcelable
{
  public static final Parcelable.Creator<RealTimeMessage> CREATOR = new Parcelable.Creator()
  {
    public RealTimeMessage cB(Parcel paramParcel)
    {
      return new RealTimeMessage(paramParcel, null);
    }

    public RealTimeMessage[] en(int paramInt)
    {
      return new RealTimeMessage[paramInt];
    }
  };
  public static final int RELIABLE = 1;
  public static final int UNRELIABLE;
  private final String aee;
  private final byte[] aef;
  private final int aeg;

  private RealTimeMessage(Parcel paramParcel)
  {
    this(paramParcel.readString(), paramParcel.createByteArray(), paramParcel.readInt());
  }

  public RealTimeMessage(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    this.aee = ((String)jx.i(paramString));
    this.aef = ((byte[])((byte[])jx.i(paramArrayOfByte)).clone());
    this.aeg = paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public byte[] getMessageData()
  {
    return this.aef;
  }

  public String getSenderParticipantId()
  {
    return this.aee;
  }

  public boolean isReliable()
  {
    return this.aeg == 1;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.aee);
    paramParcel.writeByteArray(this.aef);
    paramParcel.writeInt(this.aeg);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RealTimeMessage
 * JD-Core Version:    0.6.0
 */