package org.zepelown.kotlintestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.zepelown.kotlintestplugin.Main

object PlayerJoinEvent : Listener{

    @EventHandler
    fun onPlayerJoinEvent(e : PlayerJoinEvent) {
        Main.playerManager?.let {
            it.addPlayer(e.player)
        }
    }

}