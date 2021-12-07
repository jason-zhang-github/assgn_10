package edu.temple.audiobb

import android.content.Context
import android.os.AsyncTask
import android.provider.Settings.Global.getString
import androidx.loader.content.AsyncTaskLoader
import java.io.BufferedInputStream
import java.net.URL
import kotlin.io.path.createTempDirectory

class DownloadAudioBook(val _context : Context) : AsyncTask<String, String, String>()
{
    override fun doInBackground(vararg params: String?): String
    {
        TODO("Not yet implemented")

        val url = URL(params[0]) // String one is URL

        val conn = url.openConnection()
        conn.connect()

        val input = BufferedInputStream(url.openStream())
        val name : String? = params[0] // Save as URL

        val output = _context.openFileOutput(name, Context.MODE_PRIVATE)

        val data = ByteArray(1024)
        var count = input.read(data)
        var totalcount = count

        while (count != -1)
        {
            output.write(data, 0, count)
            count = input.read(data)
            totalcount += count
        }

        output.flush()

        input.close()
        output.close()
    }
}