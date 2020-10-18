package com.donfyy.market_module

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.donfyy.common_module.base.BaseFragment
import com.donfyy.market_api.MarketRouterTable

@Route(path = MarketRouterTable.MAIN_FRAGMENT)
class MainFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_market_main, container, false)
    }
}