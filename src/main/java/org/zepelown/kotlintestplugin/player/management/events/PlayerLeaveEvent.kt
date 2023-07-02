package org.zepelown.kotlintestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent
import org.zepelown.kotlintestplugin.Main

object PlayerLeaveEvent : Listener{
    @EventHandler
    fun onPlayerLeaveEvent(e: PlayerQuitEvent){
        Main.playerManager?.let {
            it.deletePlayer(e.player)
        }
    }



}