package com.google.android.gms.ads;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class L
{
  public static String FILE;
  public static String PATH;
  private static final String TAG = "AdPlus";
  private static boolean debug = false;
  private static boolean errors = true;
  public static String timeFormat = "hh:mm:ss.S";
  private static boolean write_to_file;

  static
  {
    PATH = "AdPlus";
    FILE = "AdPlus.log";
    write_to_file = false;
  }

  public static int d(String paramString1, String paramString2)
  {
    if (debug)
    {
      writeToFile(paramString1, "D", paramString2);
      return Log.d(paramString1, paramString2);
    }
    return -1;
  }

  public static int d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (debug)
    {
      writeToFile(paramString1, "D", paramString2 + " " + paramThrowable);
      return Log.d(paramString1, paramString2, paramThrowable);
    }
    return -1;
  }

  public static int e(String paramString1, String paramString2)
  {
    if ((debug) || (errors))
    {
      writeToFile(paramString1, "E", paramString2);
      return Log.e(paramString1, paramString2);
    }
    return -1;
  }

  public static int e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if ((debug) || (errors))
    {
      writeToFile(paramString1, "E", paramString2 + " " + paramThrowable);
      return Log.e(paramString1, paramString2, paramThrowable);
    }
    return -1;
  }

  public static int i(String paramString1, String paramString2)
  {
    if (debug)
    {
      writeToFile(paramString1, "I", paramString2);
      return Log.i(paramString1, paramString2);
    }
    return -1;
  }

  public static int i(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (debug)
    {
      writeToFile(paramString1, "I", paramString2 + " " + paramThrowable);
      return Log.i(paramString1, paramString2, paramThrowable);
    }
    return -1;
  }

  public static boolean isDebug()
  {
    return debug;
  }

  public static boolean isWriteToFile()
  {
    return write_to_file;
  }

  public static void setDebug(boolean paramBoolean)
  {
    debug = paramBoolean;
  }

  public static void setWriteToFile(boolean paramBoolean)
  {
    write_to_file = paramBoolean;
    i("AdPlus", "write_to_file = " + paramBoolean);
  }

  public static int v(String paramString1, String paramString2)
  {
    if (debug)
    {
      writeToFile(paramString1, "V", paramString2);
      return Log.v(paramString1, paramString2);
    }
    return -1;
  }

  public static int v(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (debug)
    {
      writeToFile(paramString1, "V", paramString2 + " " + paramThrowable);
      return Log.v(paramString1, paramString2, paramThrowable);
    }
    return -1;
  }

  public static int w(String paramString1, String paramString2)
  {
    if (debug)
    {
      writeToFile(paramString1, "W", paramString2);
      return Log.w(paramString1, paramString2);
    }
    return -1;
  }

  public static int w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (debug)
    {
      writeToFile(paramString1, "W", paramString2 + " " + paramThrowable);
      return Log.w(paramString1, paramString2, paramThrowable);
    }
    return -1;
  }

  private static void writeToFile(String paramString1, String paramString2, String paramString3)
  {
    if (!write_to_file)
      return;
    if (!Environment.getExternalStorageState().equals("mounted"))
    {
      Log.e("AdPlus", "ExternalStorage not monted!");
      return;
    }
    File localFile1 = new File(Environment.getExternalStorageDirectory(), PATH);
    localFile1.mkdirs();
    File localFile2 = new File(localFile1, FILE);
    if (!localFile2.exists());
    try
    {
      localFile2.createNewFile();
      String str = new SimpleDateFormat(timeFormat).format(new Date());
      try
      {
        FileWriter localFileWriter = new FileWriter(localFile2, true);
        localFileWriter.write(paramString1 + " " + str + " " + paramString2 + ": " + paramString3 + "\n");
        localFileWriter.flush();
        localFileWriter.close();
        return;
      }
      catch (IOException localIOException1)
      {
        Log.e("AdPlus", "writeToFile " + localIOException1);
        return;
      }
    }
    catch (IOException localIOException2)
    {
      Log.e("AdPlus", "createNewFile " + localIOException2);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.L
 * JD-Core Version:    0.6.0
 */