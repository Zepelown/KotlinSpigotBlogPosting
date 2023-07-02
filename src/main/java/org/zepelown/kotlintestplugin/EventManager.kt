package org.zepelown.kotlintestplugin

import org.zepelown.kotlintestplugin.player.management.events.PlayerJoinEvent
import org.zepelown.kotlintestplugin.player.management.events.PlayerKickEvent
import org.zepelown.kotlintestplugin.player.management.events.PlayerLeaveEvent

object EventManager {
    fun registerEvents(){
        Main.instance?.let {
            it.server.pluginManager.run {
                registerEvents(PlayerJoinEvent, it)
                registerEvents(PlayerKickEvent, it)
                registerEvents(PlayerLeaveEvent, it)
            }
        }
    }

}

