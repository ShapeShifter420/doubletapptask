package com.ShapeShifter420.myapplication
import android.util.Log
import com.ShapeShifter420.myapplication.Interfaces.ILogger

object Logger :ILogger {
    override fun log(tag:String, text: String) {Log.d(tag, text)}
}