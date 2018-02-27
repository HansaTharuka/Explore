package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

public class k extends b<String>
{
  public k(String paramString, int paramInt)
  {
    super(paramString, Collections.singleton(paramString), Collections.emptySet(), paramInt);
  }

  public static final Collection<String> bn(String paramString)
    throws JSONException
  {
    if (paramString == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    JSONArray localJSONArray = new JSONArray(paramString);
    for (int i = 0; i < localJSONArray.length(); i++)
      localArrayList.add(localJSONArray.getString(i));
    return Collections.unmodifiableCollection(localArrayList);
  }

  protected void a(Bundle paramBundle, Collection<String> paramCollection)
  {
    paramBundle.putStringArrayList(getName(), new ArrayList(paramCollection));
  }

  protected Collection<String> d(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    try
    {
      Collection localCollection = bn(paramDataHolder.c(getName(), paramInt1, paramInt2));
      return localCollection;
    }
    catch (JSONException localJSONException)
    {
    }
    throw new IllegalStateException("DataHolder supplied invalid JSON", localJSONException);
  }

  protected Collection<String> n(Bundle paramBundle)
  {
    return paramBundle.getStringArrayList(getName());
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.k
 * JD-Core Version:    0.6.0
 */