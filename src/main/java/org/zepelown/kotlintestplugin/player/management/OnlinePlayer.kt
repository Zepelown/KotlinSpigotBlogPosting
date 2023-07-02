package org.zepelown.kotlintestplugin.player.management

import java.util.UUID

data class OnlinePlayer(
    val uuid : UUID,
    var displayName:String,
    var job:String,
    var prefix:String
)
