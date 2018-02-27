package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Iterator;
import java.util.Set;

class e
{
  static MetadataField<?> b(MetadataBundle paramMetadataBundle)
  {
    Set localSet = paramMetadataBundle.ja();
    if (localSet.size() != 1)
      throw new IllegalArgumentException("bundle should have exactly 1 populated field");
    return (MetadataField)localSet.iterator().next();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.internal.e
 * JD-Core Version:    0.6.0
 */