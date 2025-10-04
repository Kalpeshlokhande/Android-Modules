package com.techmaina.intenet

import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class JobIntentServiceExample: JobIntentService() {
    override fun onHandleWork(intent: Intent) {
        Log.d("Service","Job intentservice is started")
        Log.d("sERVICE THRED", Thread.currentThread().name)

    }
    fun myBackgroundService(context:context,intent: Intent){
        enqueueWork(context, JobIntentServiceExample::class.java,1,intent)

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Service","Job intent services is stopped")
    }

}