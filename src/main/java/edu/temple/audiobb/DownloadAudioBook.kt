package edu.temple.audiobb

import android.content.Context
import android.os.AsyncTask
import androidx.loader.content.AsyncTaskLoader
import java.io.BufferedInputStream

class DownloadAudioBook(val _context : Context) : AsyncTask<String, String, String>()
{
    override fun doInBackground(vararg params: String?): String {
        TODO("Not yet implemented")

        lateinit var url;
        val connect = url.openConnection()
        connect.connect()
        val input = BufferedInputStream(url.openStream())
        val filename = "audiobook"
        val outputStream = context.openFileOutput(filename, Context.MODE_PRIVATE)
        val data = ByteArray(1024)
        var total : Long = 0
        var count = 0

        while(inputStream.read(data) != -1)
        {

        }
    }
}