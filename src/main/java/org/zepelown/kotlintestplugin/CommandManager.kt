package org.zepelown.kotlintestplugin

import org.zepelown.kotlintestplugin.player.management.commands.StatusCommand

object CommandManager {
    fun registerEvents(){
        Main.instance?.let {
            it.server.run {
                getPluginCommand("status")!!.setExecutor(StatusCommand)
            }
        }
    }
}