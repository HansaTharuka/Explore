package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import java.util.ArrayList;

public class InvitationClusterCreator
  implements Parcelable.Creator<ZInvitationCluster>
{
  static void a(ZInvitationCluster paramZInvitationCluster, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    b.c(paramParcel, 1, paramZInvitationCluster.mq(), false);
    b.c(paramParcel, 1000, paramZInvitationCluster.getVersionCode());
    b.H(paramParcel, i);
  }

  public ZInvitationCluster cw(Parcel paramParcel)
  {
    int i = a.G(paramParcel);
    int j = 0;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.F(paramParcel);
      switch (a.aH(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localArrayList = a.c(paramParcel, k, InvitationEntity.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ZInvitationCluster(j, localArrayList);
  }

  public ZInvitationCluster[] eg(int paramInt)
  {
    return new ZInvitationCluster[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.multiplayer.InvitationClusterCreator
 * JD-Core Version:    0.6.0
 */