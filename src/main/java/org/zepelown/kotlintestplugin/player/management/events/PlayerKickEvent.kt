package org.zepelown.kotlintestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerKickEvent
import org.zepelown.kotlintestplugin.KotlinTestPlugin

object PlayerKickEvent : Listener {

    @EventHandler
    fun onPlayerKickEvent(e: PlayerKickEvent){
        KotlinTestPlugin.playerManager?.let {
            it.deletePlayer(e.player)
        }
    }
}