package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class at
  implements Parcelable.Creator<OnMetadataResponse>
{
  static void a(OnMetadataResponse paramOnMetadataResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    b.c(paramParcel, 1, paramOnMetadataResponse.CK);
    b.a(paramParcel, 2, paramOnMetadataResponse.Px, paramInt, false);
    b.H(paramParcel, i);
  }

  public OnMetadataResponse ay(Parcel paramParcel)
  {
    int i = a.G(paramParcel);
    int j = 0;
    MetadataBundle localMetadataBundle = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.F(paramParcel);
      switch (a.aH(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localMetadataBundle = (MetadataBundle)a.a(paramParcel, k, MetadataBundle.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new OnMetadataResponse(j, localMetadataBundle);
  }

  public OnMetadataResponse[] bN(int paramInt)
  {
    return new OnMetadataResponse[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.at
 * JD-Core Version:    0.6.0
 */