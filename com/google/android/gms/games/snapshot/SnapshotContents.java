package com.google.android.gms.games.snapshot;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import java.io.IOException;

public abstract interface SnapshotContents extends Parcelable
{
  public abstract void close();

  public abstract ParcelFileDescriptor getParcelFileDescriptor();

  public abstract Contents ir();

  public abstract boolean isClosed();

  public abstract boolean modifyBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);

  public abstract byte[] readFully()
    throws IOException;

  public abstract boolean writeBytes(byte[] paramArrayOfByte);
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotContents
 * JD-Core Version:    0.6.0
 */