package com.idn.sholatkuy

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView

class QiblatActivity : AppCompatActivity(), SensorEventListener {

    private var currentDegree = 0f

    private var mSendorManager: SensorManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qiblat)
        initData()
    }

    private fun initData() {
        mSendorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager?
    }

    override fun onResume() {
        super.onResume()
        @Suppress("DEPRECATION")
        mSendorManager?.registerListener(this,
            mSendorManager?.getDefaultSensor(Sensor.TYPE_ORIENTATION),
            SensorManager.SENSOR_DELAY_GAME)
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        val degree = Math.round(event?.values?.get(0)!!)

        val rotateAnimation = RotateAnimation(
            currentDegree,
            (-degree).toFloat(),
            Animation.RELATIVE_TO_SELF,
                0.5f,
            Animation.RELATIVE_TO_SELF,
                0.5f
        )

        rotateAnimation.duration = 210
        rotateAnimation.fillAfter = true

        var imgArrow = findViewById<ImageView>(R.id.imgCompass)

        imgArrow.startAnimation(rotateAnimation)
        currentDegree = (-degree).toFloat()
    }


}