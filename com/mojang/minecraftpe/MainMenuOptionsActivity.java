package com.mojang.minecraftpe;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import com.mojang.android.EditTextAscii;

public class MainMenuOptionsActivity extends PreferenceActivity
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  String a;
  l b;

  private void a(Preference paramPreference)
  {
    if (paramPreference == null);
    do
      return;
    while (!(paramPreference instanceof EditTextPreference));
    EditTextPreference localEditTextPreference = (EditTextPreference)paramPreference;
    paramPreference.setSummary("'" + localEditTextPreference.getText() + "'");
  }

  private void a(PreferenceGroup paramPreferenceGroup)
  {
    a(paramPreferenceGroup, new j(this));
  }

  private void a(PreferenceGroup paramPreferenceGroup, k paramk)
  {
    int i = paramPreferenceGroup.getPreferenceCount();
    int j = 0;
    if (j >= i)
      return;
    Preference localPreference = paramPreferenceGroup.getPreference(j);
    if ((localPreference instanceof PreferenceGroup))
    {
      PreferenceGroup localPreferenceGroup = (PreferenceGroup)localPreference;
      paramk.a(localPreferenceGroup);
      a(localPreferenceGroup, paramk);
    }
    while (true)
    {
      j++;
      break;
      paramk.a(localPreference);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(getIntent().getExtras().getInt("preferenceId"));
    PreferenceManager.getDefaultSharedPreferences(this).registerOnSharedPreferenceChangeListener(this);
    PreferenceScreen localPreferenceScreen = getPreferenceScreen();
    if (PreferenceManager.getDefaultSharedPreferences(this).contains("mp_username"))
      this.a = PreferenceManager.getDefaultSharedPreferences(this).getString("mp_username", null);
    this.b = new l(this);
    a(localPreferenceScreen);
    this.b.a();
  }

  public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    Preference localPreference = findPreference(paramString);
    this.b.a(paramSharedPreferences, paramString);
    if ((localPreference instanceof EditTextPreference))
    {
      EditTextPreference localEditTextPreference = (EditTextPreference)localPreference;
      SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
      String str1 = localEditTextPreference.getText();
      String str2 = EditTextAscii.a(str1).trim();
      if (((paramString.equals("mp_username")) && (str2 == null)) || (str2.length() == 0))
      {
        str2 = this.a;
        if ((str2 == null) || (str2.equals("")))
        {
          str2 = "The Best";
          this.a = str2;
        }
      }
      if (!str1.equals(str2))
      {
        localEditor.putString(paramString, str2);
        localEditor.commit();
        localEditTextPreference.setText(str2);
      }
    }
    a(localPreference);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mojang.minecraftpe.MainMenuOptionsActivity
 * JD-Core Version:    0.6.0
 */