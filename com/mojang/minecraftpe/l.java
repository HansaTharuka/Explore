package com.mojang.minecraftpe;

import android.content.SharedPreferences;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import java.util.ArrayList;

class l
{
  private PreferenceActivity a;
  private ArrayList b = new ArrayList();

  public l(PreferenceActivity paramPreferenceActivity)
  {
    this.a = paramPreferenceActivity;
  }

  private Preference a(String paramString)
  {
    return this.a.findPreference(paramString);
  }

  public void a()
  {
    for (int i = 0; ; i++)
    {
      if (i >= this.b.size())
        return;
      ((m)this.b.get(i)).a.removePreference(((m)this.b.get(i)).b);
    }
  }

  public void a(SharedPreferences paramSharedPreferences, String paramString)
  {
    Preference localPreference = a(paramString);
    boolean bool4;
    boolean bool1;
    boolean bool2;
    if ((localPreference instanceof CheckBoxPreference))
    {
      if (paramString.equals("gfx_lowquality"))
      {
        boolean bool3 = paramSharedPreferences.getBoolean("gfx_lowquality", false);
        CheckBoxPreference localCheckBoxPreference3 = (CheckBoxPreference)a("gfx_fancygraphics");
        if (localCheckBoxPreference3 != null)
        {
          if (!bool3)
            break label206;
          bool4 = false;
          localCheckBoxPreference3.setEnabled(bool4);
          if (bool3)
            localCheckBoxPreference3.setChecked(false);
        }
      }
      if (paramString.equals("gfx_fancygraphics"))
      {
        CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)localPreference;
        if (MainActivity.a())
          localCheckBoxPreference2.setSummary("Experimental on this device!");
      }
      if (localPreference.getKey().equals("ctrl_usetouchscreen"))
      {
        bool1 = MainActivity.b();
        if (!bool1)
        {
          PreferenceCategory localPreferenceCategory = (PreferenceCategory)a("category_graphics");
          this.b.add(new m(localPreferenceCategory, localPreference));
        }
        localPreference.setEnabled(bool1);
        bool2 = false;
        if (!bool1)
          break label212;
      }
    }
    while (true)
    {
      localPreference.setDefaultValue(Boolean.valueOf(bool2));
      if (bool1)
      {
        CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)localPreference;
        ((CheckBoxPreference)a("ctrl_usetouchjoypad")).setEnabled(localCheckBoxPreference1.isChecked());
      }
      return;
      label206: bool4 = true;
      break;
      label212: bool2 = true;
    }
  }

  public void a(Preference paramPreference)
  {
    a(PreferenceManager.getDefaultSharedPreferences(this.a), paramPreference.getKey());
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mojang.minecraftpe.l
 * JD-Core Version:    0.6.0
 */