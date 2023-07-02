package org.zepelown.kotlintestplugin

import org.zepelown.kotlintestplugin.player.management.commands.StatusCommand

object CommandManager {
    fun registerEvents(){
        KotlinTestPlugin.instance?.let {
            it.server.run {
                getPluginCommand("status")!!.setExecutor(StatusCommand)
            }
        }
    }
}