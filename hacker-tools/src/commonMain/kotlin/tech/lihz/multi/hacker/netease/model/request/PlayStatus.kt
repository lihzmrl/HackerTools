package tech.lihz.multi.hacker.netease.model.request

import kotlinx.serialization.Serializable

@Serializable
enum class PlayStatus {
    ui, playend, interrupt, exception
}