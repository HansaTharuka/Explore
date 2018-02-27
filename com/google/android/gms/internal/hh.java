package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class hh
  implements SafeParcelable
{
  public static final hi CREATOR;
  public static final int CV = Integer.parseInt("-1");
  private static final hp CW;
  final int CK;
  public final String CX;
  final hp CY;
  public final int CZ;
  public final byte[] Da;

  static
  {
    CREATOR = new hi();
    CW = new hp.a("SsbContext").G(true).at("blob").fG();
  }

  hh(int paramInt1, String paramString, hp paramhp, int paramInt2, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == CV) || (ho.P(paramInt2) != null));
    for (boolean bool = true; ; bool = false)
    {
      jx.b(bool, "Invalid section type " + paramInt2);
      this.CK = paramInt1;
      this.CX = paramString;
      this.CY = paramhp;
      this.CZ = paramInt2;
      this.Da = paramArrayOfByte;
      String str = fE();
      if (str == null)
        break;
      throw new IllegalArgumentException(str);
    }
  }

  public hh(String paramString, hp paramhp)
  {
    this(1, paramString, paramhp, CV, null);
  }

  public hh(String paramString1, hp paramhp, String paramString2)
  {
    this(1, paramString1, paramhp, ho.as(paramString2), null);
  }

  public hh(byte[] paramArrayOfByte, hp paramhp)
  {
    this(1, null, paramhp, CV, paramArrayOfByte);
  }

  public int describeContents()
  {
    return 0;
  }

  public String fE()
  {
    if ((this.CZ != CV) && (ho.P(this.CZ) == null))
      return "Invalid section type " + this.CZ;
    if ((this.CX != null) && (this.Da != null))
      return "Both content and blobContent set";
    return null;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    hi.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hh
 * JD-Core Version:    0.6.0
 */