package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;

public class b
  implements Parcelable.Creator<SortOrder>
{
  static void a(SortOrder paramSortOrder, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.H(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1000, paramSortOrder.CK);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramSortOrder.Sf, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramSortOrder.Sg);
    com.google.android.gms.common.internal.safeparcel.b.H(paramParcel, i);
  }

  public SortOrder aR(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.G(paramParcel);
    ArrayList localArrayList = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.F(paramParcel);
      switch (a.aH(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 1:
        localArrayList = a.c(paramParcel, k, FieldWithSortOrder.CREATOR);
        break;
      case 2:
        bool = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new SortOrder(j, localArrayList, bool);
  }

  public SortOrder[] cg(int paramInt)
  {
    return new SortOrder[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.b
 * JD-Core Version:    0.6.0
 */