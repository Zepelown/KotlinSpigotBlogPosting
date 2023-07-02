package org.zepelown.kotlintestplugin.player.management

import org.bukkit.entity.Player
import org.zepelown.kotlintestplugin.KotlinTestPlugin

class PlayerManager {
    companion object{
        private var onlinePlayerData = HashMap<Player, OnlinePlayer>()
    }

    fun addPlayer(player: Player){
        val newOnlinePlayer = OnlinePlayer(player.uniqueId, player.displayName, "jobless","[뉴비]")
        onlinePlayerData[player] = newOnlinePlayer
        KotlinTestPlugin.instance!!.logger.info("플레이어 데이터를 추가하였습니다.")
    }

    fun deletePlayer(player: Player){
        onlinePlayerData.remove(player)
        KotlinTestPlugin.instance!!.logger.info("플레이어 데이터를 삭제하였습니다.")
    }

    fun getPlayerData(player: Player) : OnlinePlayer?{
        return onlinePlayerData[player]
    }

}