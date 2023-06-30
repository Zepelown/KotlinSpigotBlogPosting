package org.zepelown.kotlintestplugin

import org.zepelown.kotlintestplugin.farming.FarmingEvent

class EventManager() {

    init {
        registerEvents()
    }

    fun registerEvents(){
        KotlinTestPlugin.instance?.let {
            it.server.pluginManager.registerEvents(FarmingEvent,it)
        }
    }

}

