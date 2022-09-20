package com.donfyy.market_api

import com.alibaba.android.arouter.facade.template.IProvider

interface IMarketService : IProvider {
    fun getServiceName(): String
}