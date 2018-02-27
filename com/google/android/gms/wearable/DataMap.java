package com.google.android.gms.wearable;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ql;
import com.google.android.gms.internal.ql.a;
import com.google.android.gms.internal.qm;
import com.google.android.gms.internal.qv;
import com.google.android.gms.internal.qw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DataMap
{
  public static final String TAG = "DataMap";
  private final HashMap<String, Object> axg = new HashMap();

  private static void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    if ((paramObject instanceof String))
      paramBundle.putString(paramString, (String)paramObject);
    do
    {
      return;
      if ((paramObject instanceof Integer))
      {
        paramBundle.putInt(paramString, ((Integer)paramObject).intValue());
        return;
      }
      if ((paramObject instanceof Long))
      {
        paramBundle.putLong(paramString, ((Long)paramObject).longValue());
        return;
      }
      if ((paramObject instanceof Double))
      {
        paramBundle.putDouble(paramString, ((Double)paramObject).doubleValue());
        return;
      }
      if ((paramObject instanceof Float))
      {
        paramBundle.putFloat(paramString, ((Float)paramObject).floatValue());
        return;
      }
      if ((paramObject instanceof Boolean))
      {
        paramBundle.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
        return;
      }
      if ((paramObject instanceof Byte))
      {
        paramBundle.putByte(paramString, ((Byte)paramObject).byteValue());
        return;
      }
      if ((paramObject instanceof byte[]))
      {
        paramBundle.putByteArray(paramString, (byte[])(byte[])paramObject);
        return;
      }
      if ((paramObject instanceof String[]))
      {
        paramBundle.putStringArray(paramString, (String[])(String[])paramObject);
        return;
      }
      if ((paramObject instanceof long[]))
      {
        paramBundle.putLongArray(paramString, (long[])(long[])paramObject);
        return;
      }
      if ((paramObject instanceof float[]))
      {
        paramBundle.putFloatArray(paramString, (float[])(float[])paramObject);
        return;
      }
      if ((paramObject instanceof Asset))
      {
        paramBundle.putParcelable(paramString, (Asset)paramObject);
        return;
      }
      if (!(paramObject instanceof DataMap))
        continue;
      paramBundle.putParcelable(paramString, ((DataMap)paramObject).toBundle());
      return;
    }
    while (!(paramObject instanceof ArrayList));
    switch (d((ArrayList)paramObject))
    {
    default:
      return;
    case 0:
      paramBundle.putStringArrayList(paramString, (ArrayList)paramObject);
      return;
    case 1:
      paramBundle.putStringArrayList(paramString, (ArrayList)paramObject);
      return;
    case 3:
      paramBundle.putStringArrayList(paramString, (ArrayList)paramObject);
      return;
    case 2:
      paramBundle.putIntegerArrayList(paramString, (ArrayList)paramObject);
      return;
    case 4:
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((ArrayList)paramObject).iterator();
    while (localIterator.hasNext())
      localArrayList.add(((DataMap)localIterator.next()).toBundle());
    paramBundle.putParcelableArrayList(paramString, localArrayList);
  }

  private static void a(DataMap paramDataMap, String paramString, Object paramObject)
  {
    if ((paramObject instanceof String))
      paramDataMap.putString(paramString, (String)paramObject);
    do
    {
      return;
      if ((paramObject instanceof Integer))
      {
        paramDataMap.putInt(paramString, ((Integer)paramObject).intValue());
        return;
      }
      if ((paramObject instanceof Long))
      {
        paramDataMap.putLong(paramString, ((Long)paramObject).longValue());
        return;
      }
      if ((paramObject instanceof Double))
      {
        paramDataMap.putDouble(paramString, ((Double)paramObject).doubleValue());
        return;
      }
      if ((paramObject instanceof Float))
      {
        paramDataMap.putFloat(paramString, ((Float)paramObject).floatValue());
        return;
      }
      if ((paramObject instanceof Boolean))
      {
        paramDataMap.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
        return;
      }
      if ((paramObject instanceof Byte))
      {
        paramDataMap.putByte(paramString, ((Byte)paramObject).byteValue());
        return;
      }
      if ((paramObject instanceof byte[]))
      {
        paramDataMap.putByteArray(paramString, (byte[])(byte[])paramObject);
        return;
      }
      if ((paramObject instanceof String[]))
      {
        paramDataMap.putStringArray(paramString, (String[])(String[])paramObject);
        return;
      }
      if ((paramObject instanceof long[]))
      {
        paramDataMap.putLongArray(paramString, (long[])(long[])paramObject);
        return;
      }
      if ((paramObject instanceof float[]))
      {
        paramDataMap.putFloatArray(paramString, (float[])(float[])paramObject);
        return;
      }
      if ((paramObject instanceof Asset))
      {
        paramDataMap.putAsset(paramString, (Asset)paramObject);
        return;
      }
      if (!(paramObject instanceof Bundle))
        continue;
      paramDataMap.putDataMap(paramString, fromBundle((Bundle)paramObject));
      return;
    }
    while (!(paramObject instanceof ArrayList));
    switch (d((ArrayList)paramObject))
    {
    case 4:
    default:
      return;
    case 0:
      paramDataMap.putStringArrayList(paramString, (ArrayList)paramObject);
      return;
    case 1:
      paramDataMap.putStringArrayList(paramString, (ArrayList)paramObject);
      return;
    case 3:
      paramDataMap.putStringArrayList(paramString, (ArrayList)paramObject);
      return;
    case 2:
      paramDataMap.putIntegerArrayList(paramString, (ArrayList)paramObject);
      return;
    case 5:
    }
    paramDataMap.putDataMapArrayList(paramString, arrayListFromBundleArrayList((ArrayList)paramObject));
  }

  private void a(String paramString1, Object paramObject, String paramString2, ClassCastException paramClassCastException)
  {
    a(paramString1, paramObject, paramString2, "<null>", paramClassCastException);
  }

  private void a(String paramString1, Object paramObject1, String paramString2, Object paramObject2, ClassCastException paramClassCastException)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Key ");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" expected ");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(" but value was a ");
    localStringBuilder.append(paramObject1.getClass().getName());
    localStringBuilder.append(".  The default value ");
    localStringBuilder.append(paramObject2);
    localStringBuilder.append(" was returned.");
    Log.w("DataMap", localStringBuilder.toString());
    Log.w("DataMap", "Attempt to cast generated internal exception:", paramClassCastException);
  }

  private static boolean a(Asset paramAsset1, Asset paramAsset2)
  {
    if ((paramAsset1 == null) || (paramAsset2 == null))
      return paramAsset1 == paramAsset2;
    if (!TextUtils.isEmpty(paramAsset1.getDigest()))
      return paramAsset1.getDigest().equals(paramAsset2.getDigest());
    return Arrays.equals(paramAsset1.getData(), paramAsset2.getData());
  }

  private static boolean a(DataMap paramDataMap1, DataMap paramDataMap2)
  {
    if (paramDataMap1.size() != paramDataMap2.size())
      return false;
    Iterator localIterator = paramDataMap1.keySet().iterator();
    Object localObject1;
    Object localObject2;
    label90: label250: 
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                if (!localIterator.hasNext())
                  break label291;
                String str = (String)localIterator.next();
                localObject1 = paramDataMap1.get(str);
                localObject2 = paramDataMap2.get(str);
                if (!(localObject1 instanceof Asset))
                  break label90;
                if (!(localObject2 instanceof Asset))
                  break;
              }
              while (a((Asset)localObject1, (Asset)localObject2));
              return false;
              if (!(localObject1 instanceof String[]))
                break label130;
              if (!(localObject2 instanceof String[]))
                break;
            }
            while (Arrays.equals((String[])(String[])localObject1, (String[])(String[])localObject2));
            return false;
            if (!(localObject1 instanceof long[]))
              break label170;
            if (!(localObject2 instanceof long[]))
              break;
          }
          while (Arrays.equals((long[])(long[])localObject1, (long[])(long[])localObject2));
          return false;
          if (!(localObject1 instanceof float[]))
            break label210;
          if (!(localObject2 instanceof float[]))
            break;
        }
        while (Arrays.equals((float[])(float[])localObject1, (float[])(float[])localObject2));
        return false;
        if (!(localObject1 instanceof byte[]))
          break label250;
        if (!(localObject2 instanceof byte[]))
          break;
      }
      while (Arrays.equals((byte[])(byte[])localObject1, (byte[])(byte[])localObject2));
      return false;
      if ((localObject1 != null) && (localObject2 != null))
        continue;
      if (localObject1 == localObject2);
      for (int i = 1; ; i = 0)
        return i;
    }
    while (localObject1.equals(localObject2));
    label130: label170: label210: return false;
    label291: return true;
  }

  public static ArrayList<DataMap> arrayListFromBundleArrayList(ArrayList<Bundle> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(fromBundle((Bundle)localIterator.next()));
    return localArrayList;
  }

  private static int d(ArrayList<?> paramArrayList)
  {
    if (paramArrayList.isEmpty())
      return 0;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (localObject == null)
        continue;
      if ((localObject instanceof Integer))
        return 2;
      if ((localObject instanceof String))
        return 3;
      if ((localObject instanceof DataMap))
        return 4;
      if ((localObject instanceof Bundle))
        return 5;
    }
    return 1;
  }

  public static DataMap fromBundle(Bundle paramBundle)
  {
    paramBundle.setClassLoader(Asset.class.getClassLoader());
    DataMap localDataMap = new DataMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localDataMap, str, paramBundle.get(str));
    }
    return localDataMap;
  }

  public static DataMap fromByteArray(byte[] paramArrayOfByte)
  {
    try
    {
      DataMap localDataMap = ql.a(new ql.a(qm.n(paramArrayOfByte), new ArrayList()));
      return localDataMap;
    }
    catch (qv localqv)
    {
    }
    throw new IllegalArgumentException("Unable to convert data", localqv);
  }

  public void clear()
  {
    this.axg.clear();
  }

  public boolean containsKey(String paramString)
  {
    return this.axg.containsKey(paramString);
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof DataMap))
      return false;
    return a(this, (DataMap)paramObject);
  }

  public <T> T get(String paramString)
  {
    return this.axg.get(paramString);
  }

  public Asset getAsset(String paramString)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return null;
    try
    {
      Asset localAsset = (Asset)localObject;
      return localAsset;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "Asset", localClassCastException);
    }
    return null;
  }

  public boolean getBoolean(String paramString)
  {
    return getBoolean(paramString, false);
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return paramBoolean;
    try
    {
      boolean bool = ((Boolean)localObject).booleanValue();
      return bool;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "Boolean", Boolean.valueOf(paramBoolean), localClassCastException);
    }
    return paramBoolean;
  }

  public byte getByte(String paramString)
  {
    return getByte(paramString, 0);
  }

  public byte getByte(String paramString, byte paramByte)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return paramByte;
    try
    {
      int i = ((Byte)localObject).byteValue();
      return i;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "Byte", Byte.valueOf(paramByte), localClassCastException);
    }
    return paramByte;
  }

  public byte[] getByteArray(String paramString)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return null;
    try
    {
      byte[] arrayOfByte = (byte[])(byte[])localObject;
      return arrayOfByte;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "byte[]", localClassCastException);
    }
    return null;
  }

  public DataMap getDataMap(String paramString)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return null;
    try
    {
      DataMap localDataMap = (DataMap)localObject;
      return localDataMap;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "DataMap", localClassCastException);
    }
    return null;
  }

  public ArrayList<DataMap> getDataMapArrayList(String paramString)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return null;
    try
    {
      ArrayList localArrayList = (ArrayList)localObject;
      return localArrayList;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "ArrayList<DataMap>", localClassCastException);
    }
    return null;
  }

  public double getDouble(String paramString)
  {
    return getDouble(paramString, 0.0D);
  }

  public double getDouble(String paramString, double paramDouble)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return paramDouble;
    try
    {
      double d = ((Double)localObject).doubleValue();
      return d;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "Double", Double.valueOf(paramDouble), localClassCastException);
    }
    return paramDouble;
  }

  public float getFloat(String paramString)
  {
    return getFloat(paramString, 0.0F);
  }

  public float getFloat(String paramString, float paramFloat)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return paramFloat;
    try
    {
      float f = ((Float)localObject).floatValue();
      return f;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "Float", Float.valueOf(paramFloat), localClassCastException);
    }
    return paramFloat;
  }

  public float[] getFloatArray(String paramString)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return null;
    try
    {
      float[] arrayOfFloat = (float[])(float[])localObject;
      return arrayOfFloat;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "float[]", localClassCastException);
    }
    return null;
  }

  public int getInt(String paramString)
  {
    return getInt(paramString, 0);
  }

  public int getInt(String paramString, int paramInt)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return paramInt;
    try
    {
      int i = ((Integer)localObject).intValue();
      return i;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "Integer", localClassCastException);
    }
    return paramInt;
  }

  public ArrayList<Integer> getIntegerArrayList(String paramString)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return null;
    try
    {
      ArrayList localArrayList = (ArrayList)localObject;
      return localArrayList;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "ArrayList<Integer>", localClassCastException);
    }
    return null;
  }

  public long getLong(String paramString)
  {
    return getLong(paramString, 0L);
  }

  public long getLong(String paramString, long paramLong)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return paramLong;
    try
    {
      long l = ((Long)localObject).longValue();
      return l;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "long", localClassCastException);
    }
    return paramLong;
  }

  public long[] getLongArray(String paramString)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return null;
    try
    {
      long[] arrayOfLong = (long[])(long[])localObject;
      return arrayOfLong;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "long[]", localClassCastException);
    }
    return null;
  }

  public String getString(String paramString)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return null;
    try
    {
      String str = (String)localObject;
      return str;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "String", localClassCastException);
    }
    return null;
  }

  public String getString(String paramString1, String paramString2)
  {
    String str = getString(paramString1);
    if (str == null)
      return paramString2;
    return str;
  }

  public String[] getStringArray(String paramString)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return null;
    try
    {
      String[] arrayOfString = (String[])(String[])localObject;
      return arrayOfString;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "String[]", localClassCastException);
    }
    return null;
  }

  public ArrayList<String> getStringArrayList(String paramString)
  {
    Object localObject = this.axg.get(paramString);
    if (localObject == null)
      return null;
    try
    {
      ArrayList localArrayList = (ArrayList)localObject;
      return localArrayList;
    }
    catch (ClassCastException localClassCastException)
    {
      a(paramString, localObject, "ArrayList<String>", localClassCastException);
    }
    return null;
  }

  public int hashCode()
  {
    return 29 * this.axg.hashCode();
  }

  public boolean isEmpty()
  {
    return this.axg.isEmpty();
  }

  public Set<String> keySet()
  {
    return this.axg.keySet();
  }

  public void putAll(DataMap paramDataMap)
  {
    Iterator localIterator = paramDataMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.axg.put(str, paramDataMap.get(str));
    }
  }

  public void putAsset(String paramString, Asset paramAsset)
  {
    this.axg.put(paramString, paramAsset);
  }

  public void putBoolean(String paramString, boolean paramBoolean)
  {
    this.axg.put(paramString, Boolean.valueOf(paramBoolean));
  }

  public void putByte(String paramString, byte paramByte)
  {
    this.axg.put(paramString, Byte.valueOf(paramByte));
  }

  public void putByteArray(String paramString, byte[] paramArrayOfByte)
  {
    this.axg.put(paramString, paramArrayOfByte);
  }

  public void putDataMap(String paramString, DataMap paramDataMap)
  {
    this.axg.put(paramString, paramDataMap);
  }

  public void putDataMapArrayList(String paramString, ArrayList<DataMap> paramArrayList)
  {
    this.axg.put(paramString, paramArrayList);
  }

  public void putDouble(String paramString, double paramDouble)
  {
    this.axg.put(paramString, Double.valueOf(paramDouble));
  }

  public void putFloat(String paramString, float paramFloat)
  {
    this.axg.put(paramString, Float.valueOf(paramFloat));
  }

  public void putFloatArray(String paramString, float[] paramArrayOfFloat)
  {
    this.axg.put(paramString, paramArrayOfFloat);
  }

  public void putInt(String paramString, int paramInt)
  {
    this.axg.put(paramString, Integer.valueOf(paramInt));
  }

  public void putIntegerArrayList(String paramString, ArrayList<Integer> paramArrayList)
  {
    this.axg.put(paramString, paramArrayList);
  }

  public void putLong(String paramString, long paramLong)
  {
    this.axg.put(paramString, Long.valueOf(paramLong));
  }

  public void putLongArray(String paramString, long[] paramArrayOfLong)
  {
    this.axg.put(paramString, paramArrayOfLong);
  }

  public void putString(String paramString1, String paramString2)
  {
    this.axg.put(paramString1, paramString2);
  }

  public void putStringArray(String paramString, String[] paramArrayOfString)
  {
    this.axg.put(paramString, paramArrayOfString);
  }

  public void putStringArrayList(String paramString, ArrayList<String> paramArrayList)
  {
    this.axg.put(paramString, paramArrayList);
  }

  public Object remove(String paramString)
  {
    return this.axg.remove(paramString);
  }

  public int size()
  {
    return this.axg.size();
  }

  public Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = this.axg.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localBundle, str, this.axg.get(str));
    }
    return localBundle;
  }

  public byte[] toByteArray()
  {
    return qw.f(ql.a(this).ayo);
  }

  public String toString()
  {
    return this.axg.toString();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataMap
 * JD-Core Version:    0.6.0
 */