package com.mojang.android;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

public class EditTextAscii extends EditText
  implements TextWatcher
{
  public EditTextAscii(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public EditTextAscii(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public EditTextAscii(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  public static String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    for (int i = 0; ; i++)
    {
      if (i >= paramString.length())
        return localStringBuilder.toString();
      char c = paramString.charAt(i);
      if (c >= '')
        continue;
      localStringBuilder.append(c);
    }
  }

  private void a()
  {
    addTextChangedListener(this);
  }

  public void afterTextChanged(Editable paramEditable)
  {
    String str1 = paramEditable.toString();
    String str2 = a(str1);
    if (!str1.equals(str2))
      paramEditable.replace(0, paramEditable.length(), str2);
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mojang.android.EditTextAscii
 * JD-Core Version:    0.6.0
 */