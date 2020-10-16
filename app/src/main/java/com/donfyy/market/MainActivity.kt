package com.donfyy.market

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.donfyy.market_module.MarketService

class MainActivity : AppCompatActivity() {
    private val marketService = MarketService()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.d("", marketService.getServiceName())
    }
}