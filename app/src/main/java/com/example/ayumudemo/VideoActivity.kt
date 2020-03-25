package com.example.ayumudemo

import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.title = "Play Video"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        Handler(mainLooper).postDelayed({
            val moviePath = Uri.parse("android.resource://" + packageName + "/" + R.raw.mesi3)
            videoView.setVideoURI(moviePath)

            videoView.setOnPreparedListener {
                videoView.start()

                videoView.setMediaController(MediaController(this))
            }

        }, 200)


    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}