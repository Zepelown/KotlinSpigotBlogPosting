package org.zepelown.kotlintestplugin

import org.zepelown.kotlintestplugin.farming.FarmingEvent
import org.zepelown.kotlintestplugin.player.management.events.PlayerJoinEvent
import org.zepelown.kotlintestplugin.player.management.events.PlayerKickEvent
import org.zepelown.kotlintestplugin.player.management.events.PlayerLeaveEvent

object EventManager {
    fun registerEvents(){
        KotlinTestPlugin.instance?.let {
            it.server.pluginManager.run {
                registerEvents(PlayerJoinEvent, it)
                registerEvents(PlayerKickEvent, it)
                registerEvents(PlayerLeaveEvent, it)
            }
        }
    }

}

