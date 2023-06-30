package org.zepelown.kotlintestplugin

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import org.zepelown.kotlintestplugin.farming.FarmingEvent

class KotlinTestPlugin : JavaPlugin() {
    companion object{
        var instance : KotlinTestPlugin? = null
        var eventManager : EventManager? = null
    }

    override fun onEnable() {
        instance = this
        eventManager = EventManager()
    }

    override fun onDisable() {
    }


}