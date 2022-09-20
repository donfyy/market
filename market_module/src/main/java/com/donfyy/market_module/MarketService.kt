package com.donfyy.market_module

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.donfyy.market_api.IMarketService
import com.donfyy.market_api.MarketRouterTable

@Route(path = MarketRouterTable.MAIN_SERVICE)
class MarketService : IMarketService{
    override fun getServiceName(): String {
        return this.javaClass.name + "hhh"
    }

    override fun init(context: Context?) {
    }
}