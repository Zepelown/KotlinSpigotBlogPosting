package org.zepelown.kotlintestplugin.farming

import org.bukkit.Material
import org.bukkit.World
import org.bukkit.block.data.Ageable
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.inventory.ItemStack
import kotlin.random.Random

object FarmingEvent : Listener{
    @EventHandler
    fun breakEvent(e: BlockBreakEvent){
        if(e.block.blockData.material == Material.WHEAT){
            val age : Ageable = e.block.state.blockData as Ageable
            if(age.age == age.maximumAge){
                val random = Random(System.currentTimeMillis()).nextInt(1, 100)
                if(random in 1..100){
                    e.block.world.dropItem(e.block.location, ItemStack(Material.GLOWSTONE_DUST))
                }
            }
        }
    }
}