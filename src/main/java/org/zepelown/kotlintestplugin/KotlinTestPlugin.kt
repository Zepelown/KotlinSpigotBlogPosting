package org.zepelown.kotlintestplugin

import org.bukkit.plugin.java.JavaPlugin
import org.zepelown.kotlintestplugin.player.management.PlayerManager

class KotlinTestPlugin : JavaPlugin() {
    companion object{
        var instance : KotlinTestPlugin? = null
        var playerManager : PlayerManager? = null
    }

    override fun onEnable() {
        instance = this
        playerManager = PlayerManager()
        EventManager.registerEvents()
        CommandManager.registerEvents()
    }

    override fun onDisable() {
    }


}