package org.zepelown.kotlintestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent
import org.zepelown.kotlintestplugin.KotlinTestPlugin

object PlayerLeaveEvent : Listener{
    @EventHandler
    fun onPlayerLeaveEvent(e: PlayerQuitEvent){
        KotlinTestPlugin.playerManager?.let {
            it.deletePlayer(e.player)
        }
    }



}