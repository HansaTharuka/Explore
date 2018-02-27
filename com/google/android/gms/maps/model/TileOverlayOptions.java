package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.aa;
import com.google.android.gms.maps.model.internal.o;
import com.google.android.gms.maps.model.internal.o.a;

public final class TileOverlayOptions
  implements SafeParcelable
{
  public static final w CREATOR = new w();
  private final int CK;
  private float alX;
  private boolean alY = true;
  private o amD;
  private TileProvider amE;
  private boolean amF = true;

  public TileOverlayOptions()
  {
    this.CK = 1;
  }

  TileOverlayOptions(int paramInt, IBinder paramIBinder, boolean paramBoolean1, float paramFloat, boolean paramBoolean2)
  {
    this.CK = paramInt;
    this.amD = o.a.bE(paramIBinder);
    if (this.amD == null);
    for (1 local1 = null; ; local1 = new TileProvider()
    {
      private final o amG = TileOverlayOptions.a(TileOverlayOptions.this);

      public Tile getTile(int paramInt1, int paramInt2, int paramInt3)
      {
        try
        {
          Tile localTile = this.amG.getTile(paramInt1, paramInt2, paramInt3);
          return localTile;
        }
        catch (RemoteException localRemoteException)
        {
        }
        return null;
      }
    })
    {
      this.amE = local1;
      this.alY = paramBoolean1;
      this.alX = paramFloat;
      this.amF = paramBoolean2;
      return;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public TileOverlayOptions fadeIn(boolean paramBoolean)
  {
    this.amF = paramBoolean;
    return this;
  }

  public boolean getFadeIn()
  {
    return this.amF;
  }

  public TileProvider getTileProvider()
  {
    return this.amE;
  }

  int getVersionCode()
  {
    return this.CK;
  }

  public float getZIndex()
  {
    return this.alX;
  }

  public boolean isVisible()
  {
    return this.alY;
  }

  IBinder og()
  {
    return this.amD.asBinder();
  }

  public TileOverlayOptions tileProvider(TileProvider paramTileProvider)
  {
    this.amE = paramTileProvider;
    if (this.amE == null);
    for (2 local2 = null; ; local2 = new o.a(paramTileProvider)
    {
      public Tile getTile(int paramInt1, int paramInt2, int paramInt3)
      {
        return this.amI.getTile(paramInt1, paramInt2, paramInt3);
      }
    })
    {
      this.amD = local2;
      return this;
    }
  }

  public TileOverlayOptions visible(boolean paramBoolean)
  {
    this.alY = paramBoolean;
    return this;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (aa.ob())
    {
      x.a(this, paramParcel, paramInt);
      return;
    }
    w.a(this, paramParcel, paramInt);
  }

  public TileOverlayOptions zIndex(float paramFloat)
  {
    this.alX = paramFloat;
    return this;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.TileOverlayOptions
 * JD-Core Version:    0.6.0
 */