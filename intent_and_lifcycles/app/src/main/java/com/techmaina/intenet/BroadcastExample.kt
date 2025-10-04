package com.techmaina.intenet

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastExample: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlaneMode: Boolean=intent.getBooleanExtra("state",false)\
        if(isAirPlaneMode){
            Toast.makeText(context,"This decide is an airplane mode", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context,"This decide is not airplane mode", Toast.LENGTH_LONG).show()
        }

    }
}