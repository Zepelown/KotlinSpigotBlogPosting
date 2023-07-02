package org.zepelown.kotlintestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerKickEvent
import org.zepelown.kotlintestplugin.Main

object PlayerKickEvent : Listener {

    @EventHandler
    fun onPlayerKickEvent(e: PlayerKickEvent){
        Main.playerManager?.let {
            it.deletePlayer(e.player)
        }
    }
}