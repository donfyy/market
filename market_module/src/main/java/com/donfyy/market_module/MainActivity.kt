package com.donfyy.market_module

import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.donfyy.common_module.base.BaseActivity
import com.donfyy.market_api.MarketRouterTable

@Route(path = MarketRouterTable.MAIN_ACTIVITY)
class MainActivity : BaseActivity() {
    @Autowired
    @JvmField
    var name = ""
}