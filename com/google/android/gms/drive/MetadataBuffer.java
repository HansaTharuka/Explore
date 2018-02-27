package com.google.android.gms.drive;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.m;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.e;
import com.google.android.gms.internal.ln;
import java.util.Collection;
import java.util.Iterator;

public final class MetadataBuffer extends DataBuffer<Metadata>
{
  private final String OB;
  private a OC;

  public MetadataBuffer(DataHolder paramDataHolder, String paramString)
  {
    super(paramDataHolder);
    this.OB = paramString;
    paramDataHolder.gV().setClassLoader(MetadataBuffer.class.getClassLoader());
  }

  public Metadata get(int paramInt)
  {
    a locala = this.OC;
    if ((locala == null) || (a.a(locala) != paramInt))
    {
      locala = new a(this.JG, paramInt);
      this.OC = locala;
    }
    return locala;
  }

  public String getNextPageToken()
  {
    return this.OB;
  }

  private static class a extends Metadata
  {
    private final DataHolder JG;
    private final int La;
    private final int OD;

    public a(DataHolder paramDataHolder, int paramInt)
    {
      this.JG = paramDataHolder;
      this.OD = paramInt;
      this.La = paramDataHolder.au(paramInt);
    }

    protected <T> T a(MetadataField<T> paramMetadataField)
    {
      return paramMetadataField.a(this.JG, this.OD, this.La);
    }

    public boolean isDataValid()
    {
      return !this.JG.isClosed();
    }

    public Metadata iy()
    {
      MetadataBundle localMetadataBundle = MetadataBundle.iZ();
      Iterator localIterator = e.iY().iterator();
      while (localIterator.hasNext())
      {
        MetadataField localMetadataField = (MetadataField)localIterator.next();
        if (((localMetadataField instanceof b)) || (localMetadataField == ln.RI))
          continue;
        localMetadataField.a(this.JG, localMetadataBundle, this.OD, this.La);
      }
      return new m(localMetadataBundle);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.MetadataBuffer
 * JD-Core Version:    0.6.0
 */