package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class InFilter<T> extends AbstractFilter
{
  public static final h CREATOR = new h();
  final int CK;
  final MetadataBundle Si;
  private final b<T> St;

  InFilter(int paramInt, MetadataBundle paramMetadataBundle)
  {
    this.CK = paramInt;
    this.Si = paramMetadataBundle;
    this.St = ((b)e.b(paramMetadataBundle));
  }

  public InFilter(SearchableCollectionMetadataField<T> paramSearchableCollectionMetadataField, T paramT)
  {
    this(1, MetadataBundle.a(paramSearchableCollectionMetadataField, Collections.singleton(paramT)));
  }

  public <F> F a(f<F> paramf)
  {
    return paramf.b(this.St, getValue());
  }

  public int describeContents()
  {
    return 0;
  }

  public T getValue()
  {
    return ((Collection)this.Si.a(this.St)).iterator().next();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.internal.InFilter
 * JD-Core Version:    0.6.0
 */