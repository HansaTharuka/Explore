package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import java.util.ArrayList;

public abstract class MultiDataBufferRef extends d
{
  protected final ArrayList<DataHolder> XX;

  protected MultiDataBufferRef(ArrayList<DataHolder> paramArrayList, int paramInt1, int paramInt2)
  {
    super((DataHolder)paramArrayList.get(paramInt1), paramInt2);
    this.XX = paramArrayList;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.appcontent.MultiDataBufferRef
 * JD-Core Version:    0.6.0
 */