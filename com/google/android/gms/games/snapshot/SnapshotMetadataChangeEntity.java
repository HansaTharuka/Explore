package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;

public final class SnapshotMetadataChangeEntity extends SnapshotMetadataChange
  implements SafeParcelable
{
  public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();
  private final int CK;
  private final String UO;
  private final Uri afd;
  private final Long afe;
  private a aff;

  SnapshotMetadataChangeEntity()
  {
    this(4, null, null, null, null);
  }

  SnapshotMetadataChangeEntity(int paramInt, String paramString, Long paramLong, a parama, Uri paramUri)
  {
    this.CK = paramInt;
    this.UO = paramString;
    this.afe = paramLong;
    this.aff = parama;
    this.afd = paramUri;
    if (this.aff != null)
      if (this.afd == null)
        jx.a(bool, "Cannot set both a URI and an image");
    do
    {
      return;
      bool = false;
      break;
    }
    while (this.afd == null);
    if (this.aff == null);
    while (true)
    {
      jx.a(bool, "Cannot set both a URI and an image");
      return;
      bool = false;
    }
  }

  SnapshotMetadataChangeEntity(String paramString, Long paramLong, a parama, Uri paramUri)
  {
    this(4, paramString, paramLong, parama, paramUri);
  }

  public int describeContents()
  {
    return 0;
  }

  public Bitmap getCoverImage()
  {
    if (this.aff == null)
      return null;
    return this.aff.gT();
  }

  public Uri getCoverImageUri()
  {
    return this.afd;
  }

  public String getDescription()
  {
    return this.UO;
  }

  public Long getPlayedTimeMillis()
  {
    return this.afe;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public a mT()
  {
    return this.aff;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SnapshotMetadataChangeCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity
 * JD-Core Version:    0.6.0
 */