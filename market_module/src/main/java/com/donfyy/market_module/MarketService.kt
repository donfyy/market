package com.donfyy.market_module

import com.donfyy.market_api.IMarketService

class MarketService : IMarketService{
    override fun getServiceName(): String {
        return this.javaClass.name + "hhh"
    }
}