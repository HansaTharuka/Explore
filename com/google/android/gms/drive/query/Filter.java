package com.google.android.gms.drive.query;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.f;

public abstract interface Filter extends SafeParcelable
{
  public abstract <T> T a(f<T> paramf);
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.Filter
 * JD-Core Version:    0.6.0
 */