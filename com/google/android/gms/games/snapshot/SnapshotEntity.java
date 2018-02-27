package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;

public final class SnapshotEntity
  implements SafeParcelable, Snapshot
{
  public static final SnapshotEntityCreator CREATOR = new SnapshotEntityCreator();
  private final int CK;
  private final SnapshotMetadataEntity aeZ;
  private final SnapshotContentsEntity afa;

  SnapshotEntity(int paramInt, SnapshotMetadata paramSnapshotMetadata, SnapshotContentsEntity paramSnapshotContentsEntity)
  {
    this.CK = paramInt;
    this.aeZ = new SnapshotMetadataEntity(paramSnapshotMetadata);
    this.afa = paramSnapshotContentsEntity;
  }

  public SnapshotEntity(SnapshotMetadata paramSnapshotMetadata, SnapshotContentsEntity paramSnapshotContentsEntity)
  {
    this(2, paramSnapshotMetadata, paramSnapshotContentsEntity);
  }

  static boolean a(Snapshot paramSnapshot, Object paramObject)
  {
    int i = 1;
    if (!(paramObject instanceof Snapshot))
      i = 0;
    Snapshot localSnapshot;
    do
    {
      do
        return i;
      while (paramSnapshot == paramObject);
      localSnapshot = (Snapshot)paramObject;
    }
    while ((jv.equal(localSnapshot.getMetadata(), paramSnapshot.getMetadata())) && (jv.equal(localSnapshot.getSnapshotContents(), paramSnapshot.getSnapshotContents())));
    return false;
  }

  static int b(Snapshot paramSnapshot)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramSnapshot.getMetadata();
    arrayOfObject[1] = paramSnapshot.getSnapshotContents();
    return jv.hashCode(arrayOfObject);
  }

  static String c(Snapshot paramSnapshot)
  {
    jv.a locala = jv.h(paramSnapshot).a("Metadata", paramSnapshot.getMetadata());
    if (paramSnapshot.getSnapshotContents() != null);
    for (boolean bool = true; ; bool = false)
      return locala.a("HasContents", Boolean.valueOf(bool)).toString();
  }

  private boolean isClosed()
  {
    return this.afa.isClosed();
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }

  public Snapshot freeze()
  {
    return this;
  }

  public SnapshotMetadata getMetadata()
  {
    return this.aeZ;
  }

  public SnapshotContents getSnapshotContents()
  {
    if (isClosed())
      return null;
    return this.afa;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public int hashCode()
  {
    return b(this);
  }

  public boolean isDataValid()
  {
    return true;
  }

  public String toString()
  {
    return c(this);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    SnapshotEntityCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotEntity
 * JD-Core Version:    0.6.0
 */