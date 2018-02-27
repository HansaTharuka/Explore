package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataHolder
  implements SafeParcelable
{
  public static final f CREATOR = new f();
  private static final a Ll = new a(null)
  {
  };
  private final int CK;
  private final int Iv;
  private final String[] Ld;
  Bundle Le;
  private final CursorWindow[] Lf;
  private final Bundle Lg;
  int[] Lh;
  int Li;
  private Object Lj;
  private boolean Lk = true;
  boolean mClosed = false;

  DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.CK = paramInt1;
    this.Ld = paramArrayOfString;
    this.Lf = paramArrayOfCursorWindow;
    this.Iv = paramInt2;
    this.Lg = paramBundle;
  }

  private DataHolder(a parama, int paramInt, Bundle paramBundle)
  {
    this(a.a(parama), a(parama, -1), paramInt, paramBundle);
  }

  public DataHolder(String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt, Bundle paramBundle)
  {
    this.CK = 1;
    this.Ld = ((String[])jx.i(paramArrayOfString));
    this.Lf = ((CursorWindow[])jx.i(paramArrayOfCursorWindow));
    this.Iv = paramInt;
    this.Lg = paramBundle;
    gX();
  }

  public static DataHolder a(int paramInt, Bundle paramBundle)
  {
    return new DataHolder(Ll, paramInt, paramBundle);
  }

  private static CursorWindow[] a(a parama, int paramInt)
  {
    int i = 0;
    if (a.a(parama).length == 0)
      return new CursorWindow[0];
    Object localObject1;
    Object localObject2;
    ArrayList localArrayList;
    int k;
    int m;
    if ((paramInt < 0) || (paramInt >= a.b(parama).size()))
    {
      localObject1 = a.b(parama);
      int j = ((List)localObject1).size();
      localObject2 = new CursorWindow(false);
      localArrayList = new ArrayList();
      localArrayList.add(localObject2);
      ((CursorWindow)localObject2).setNumColumns(a.a(parama).length);
      k = 0;
      m = 0;
      label87: if (k >= j)
        break label731;
    }
    while (true)
    {
      int i1;
      try
      {
        if (((CursorWindow)localObject2).allocRow())
          continue;
        Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + k + ")");
        localObject2 = new CursorWindow(false);
        ((CursorWindow)localObject2).setStartPosition(k);
        ((CursorWindow)localObject2).setNumColumns(a.a(parama).length);
        localArrayList.add(localObject2);
        if (((CursorWindow)localObject2).allocRow())
          continue;
        Log.e("DataHolder", "Unable to allocate row to hold data.");
        localArrayList.remove(localObject2);
        CursorWindow[] arrayOfCursorWindow = (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
        return arrayOfCursorWindow;
        localObject1 = a.b(parama).subList(0, paramInt);
        break;
        Map localMap = (Map)((List)localObject1).get(k);
        i1 = 0;
        bool = true;
        if ((i1 >= a.a(parama).length) || (!bool))
          continue;
        String str = a.a(parama)[i1];
        Object localObject3 = localMap.get(str);
        if (localObject3 != null)
          continue;
        bool = ((CursorWindow)localObject2).putNull(k, i1);
        break label748;
        if (!(localObject3 instanceof String))
          continue;
        bool = ((CursorWindow)localObject2).putString((String)localObject3, k, i1);
        break label748;
        if (!(localObject3 instanceof Long))
          continue;
        bool = ((CursorWindow)localObject2).putLong(((Long)localObject3).longValue(), k, i1);
        break label748;
        if (!(localObject3 instanceof Integer))
          continue;
        bool = ((CursorWindow)localObject2).putLong(((Integer)localObject3).intValue(), k, i1);
        break label748;
        if (!(localObject3 instanceof Boolean))
          continue;
        if (!((Boolean)localObject3).booleanValue())
          break label754;
        l = 1L;
        bool = ((CursorWindow)localObject2).putLong(l, k, i1);
        break label748;
        if (!(localObject3 instanceof byte[]))
          continue;
        bool = ((CursorWindow)localObject2).putBlob((byte[])(byte[])localObject3, k, i1);
        break label748;
        if (!(localObject3 instanceof Double))
          continue;
        bool = ((CursorWindow)localObject2).putDouble(((Double)localObject3).doubleValue(), k, i1);
        break label748;
        if (!(localObject3 instanceof Float))
          continue;
        bool = ((CursorWindow)localObject2).putDouble(((Float)localObject3).floatValue(), k, i1);
        break label748;
        throw new IllegalArgumentException("Unsupported object for column " + str + ": " + localObject3);
      }
      catch (RuntimeException localRuntimeException)
      {
        boolean bool;
        int n = localArrayList.size();
        if (i >= n)
          continue;
        ((CursorWindow)localArrayList.get(i)).close();
        i++;
        continue;
        if (bool)
          continue;
        if (m == 0)
          continue;
        throw new b("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
        Log.d("DataHolder", "Couldn't populate window data for row " + k + " - allocating new window.");
        ((CursorWindow)localObject2).freeLastRow();
        CursorWindow localCursorWindow = new CursorWindow(false);
        localCursorWindow.setStartPosition(k);
        localCursorWindow.setNumColumns(a.a(parama).length);
        localArrayList.add(localCursorWindow);
        int i2 = k - 1;
        Object localObject4 = localCursorWindow;
        int i3 = 1;
        int i4 = i2 + 1;
        m = i3;
        localObject2 = localObject4;
        k = i4;
        break label87;
        i2 = k;
        localObject4 = localObject2;
        i3 = 0;
        continue;
        throw localRuntimeException;
      }
      label731: return (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
      label748: i1++;
      continue;
      label754: long l = 0L;
    }
  }

  public static DataHolder av(int paramInt)
  {
    return a(paramInt, null);
  }

  private void g(String paramString, int paramInt)
  {
    if ((this.Le == null) || (!this.Le.containsKey(paramString)))
      throw new IllegalArgumentException("No such column: " + paramString);
    if (isClosed())
      throw new IllegalArgumentException("Buffer is closed.");
    if ((paramInt < 0) || (paramInt >= this.Li))
      throw new CursorIndexOutOfBoundsException(paramInt, this.Li);
  }

  public long a(String paramString, int paramInt1, int paramInt2)
  {
    g(paramString, paramInt1);
    return this.Lf[paramInt2].getLong(paramInt1, this.Le.getInt(paramString));
  }

  public void a(String paramString, int paramInt1, int paramInt2, CharArrayBuffer paramCharArrayBuffer)
  {
    g(paramString, paramInt1);
    this.Lf[paramInt2].copyStringToBuffer(paramInt1, this.Le.getInt(paramString), paramCharArrayBuffer);
  }

  public boolean aQ(String paramString)
  {
    return this.Le.containsKey(paramString);
  }

  public int au(int paramInt)
  {
    int i = 0;
    boolean bool;
    if ((paramInt >= 0) && (paramInt < this.Li))
    {
      bool = true;
      jx.K(bool);
    }
    while (true)
    {
      if (i < this.Lh.length)
      {
        if (paramInt < this.Lh[i])
          i--;
      }
      else
      {
        if (i == this.Lh.length)
          i--;
        return i;
        bool = false;
        break;
      }
      i++;
    }
  }

  public int b(String paramString, int paramInt1, int paramInt2)
  {
    g(paramString, paramInt1);
    return this.Lf[paramInt2].getInt(paramInt1, this.Le.getInt(paramString));
  }

  public String c(String paramString, int paramInt1, int paramInt2)
  {
    g(paramString, paramInt1);
    return this.Lf[paramInt2].getString(paramInt1, this.Le.getInt(paramString));
  }

  public void close()
  {
    monitorenter;
    try
    {
      if (!this.mClosed)
      {
        this.mClosed = true;
        for (int i = 0; i < this.Lf.length; i++)
          this.Lf[i].close();
      }
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public boolean d(String paramString, int paramInt1, int paramInt2)
  {
    g(paramString, paramInt1);
    return Long.valueOf(this.Lf[paramInt2].getLong(paramInt1, this.Le.getInt(paramString))).longValue() == 1L;
  }

  public int describeContents()
  {
    return 0;
  }

  public float e(String paramString, int paramInt1, int paramInt2)
  {
    g(paramString, paramInt1);
    return this.Lf[paramInt2].getFloat(paramInt1, this.Le.getInt(paramString));
  }

  public void e(Object paramObject)
  {
    this.Lj = paramObject;
  }

  public byte[] f(String paramString, int paramInt1, int paramInt2)
  {
    g(paramString, paramInt1);
    return this.Lf[paramInt2].getBlob(paramInt1, this.Le.getInt(paramString));
  }

  protected void finalize()
    throws Throwable
  {
    try
    {
      if ((this.Lk) && (this.Lf.length > 0) && (!isClosed()))
        if (this.Lj != null)
          break label94;
      label94: String str;
      for (Object localObject2 = "internal object: " + toString(); ; localObject2 = str)
      {
        Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (" + (String)localObject2 + ")");
        close();
        return;
        str = this.Lj.toString();
      }
    }
    finally
    {
      super.finalize();
    }
    throw localObject1;
  }

  public Uri g(String paramString, int paramInt1, int paramInt2)
  {
    String str = c(paramString, paramInt1, paramInt2);
    if (str == null)
      return null;
    return Uri.parse(str);
  }

  public Bundle gV()
  {
    return this.Lg;
  }

  public void gX()
  {
    int i = 0;
    this.Le = new Bundle();
    for (int j = 0; j < this.Ld.length; j++)
      this.Le.putInt(this.Ld[j], j);
    this.Lh = new int[this.Lf.length];
    int k = 0;
    while (i < this.Lf.length)
    {
      this.Lh[i] = k;
      int m = k - this.Lf[i].getStartPosition();
      k += this.Lf[i].getNumRows() - m;
      i++;
    }
    this.Li = k;
  }

  String[] gY()
  {
    return this.Ld;
  }

  CursorWindow[] gZ()
  {
    return this.Lf;
  }

  public int getCount()
  {
    return this.Li;
  }

  public int getStatusCode()
  {
    return this.Iv;
  }

  int getVersionCode()
  {
    return this.CK;
  }

  public boolean h(String paramString, int paramInt1, int paramInt2)
  {
    g(paramString, paramInt1);
    return this.Lf[paramInt2].isNull(paramInt1, this.Le.getInt(paramString));
  }

  public boolean isClosed()
  {
    monitorenter;
    try
    {
      boolean bool = this.mClosed;
      return bool;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }

  public static class a
  {
    private final String[] Ld;
    private final ArrayList<HashMap<String, Object>> Lm;
    private final String Ln;
    private final HashMap<Object, Integer> Lo;
    private boolean Lp;
    private String Lq;

    private a(String[] paramArrayOfString, String paramString)
    {
      this.Ld = ((String[])jx.i(paramArrayOfString));
      this.Lm = new ArrayList();
      this.Ln = paramString;
      this.Lo = new HashMap();
      this.Lp = false;
      this.Lq = null;
    }
  }

  public static class b extends RuntimeException
  {
    public b(String paramString)
    {
      super();
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder
 * JD-Core Version:    0.6.0
 */