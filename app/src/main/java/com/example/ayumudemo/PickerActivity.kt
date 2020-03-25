package com.example.ayumudemo

import android.graphics.Color
import android.graphics.Color.WHITE
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.SeekBar
import androidx.core.graphics.ColorUtils
import androidx.core.graphics.blue
import androidx.core.graphics.green
import androidx.core.graphics.red
import kotlinx.android.synthetic.main.activity_picker.*
import java.lang.Integer.parseInt
import java.util.*

class PickerActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.title = "Slider Sample"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picker)

        sbR.setProgress(0)
        sbR.setMax(255)
        sbG.setProgress(0)
        sbG.setMax(255)
        sbB.setProgress(0)
        sbB.setMax(255)



        sbR.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                //                ツマミDRAGで呼び出し
                override fun onProgressChanged(
                    seekbar: SeekBar , progress: Int, fromUser: Boolean){
                    val startColor = (colorview.background as ColorDrawable).color
                    val endColor = Color.argb(255, progress, Color.green(startColor), Color.blue(startColor))
//                    val ratio = progress.toFloat() / seekbar.max.toFloat()
//                    val blended = ColorUtils.blendARGB(startColor, endColor, ratio)
                    colorview.setBackgroundColor(endColor)

                    val str = String.format(Locale.US, "%d %%", progress)
                    textView.text = str

                }
                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                }
                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                }
            })

        sbG.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                //                ツマミDRAGで呼び出し
                override fun onProgressChanged(
                    seekbar: SeekBar , progress: Int, fromUser: Boolean){
                    val startColor = (colorview.background as ColorDrawable).color
                    val endColor = Color.argb(255, Color.red(startColor),progress,Color.blue(startColor))
//                    val ratio = progress.toFloat() / seekbar.max.toFloat()
//                    val blended = ColorUtils.blendARGB(startColor, endColor, ratio)
                    colorview.setBackgroundColor(endColor)


                    val str = String.format(Locale.US, "%d %%", progress)
                    textView.text = str


                }
                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                }
                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                }
            })


        sbB.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                //                ツマミDRAGで呼び出し
                override fun onProgressChanged(
                    seekbar: SeekBar , progress: Int, fromUser: Boolean){
                    val startColor = (colorview.background as ColorDrawable).color
                    val endColor = Color.argb(255, Color.red(startColor),Color.green(startColor),progress)
//                    val ratio = progress.toFloat() / seekbar.max.toFloat()
//                    val blended = ColorUtils.blendARGB(startColor, endColor, ratio)
                    colorview.setBackgroundColor(endColor)


                    val str = String.format(Locale.US, "%d %%", progress)
                    textView.text = str


                }
                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                }
                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                }
            })
        }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

}

