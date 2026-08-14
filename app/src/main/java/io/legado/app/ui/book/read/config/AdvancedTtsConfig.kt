package io.legado.app.ui.book.read.config

data class AdvancedTtsConfig(
    var name: String = "",
    var interval: Int = 0,
    var useWebSocket: Boolean = true,
    var preRequestsJson: String = "",
    var wsUrlTemplate: String = "",
    var wsSendMessageJs: String = "",
    var audioParseType: Int = 1, // 1=带头MP3/AAC, 2=无头PCM, 3=JSON嵌套Base64, 4=纯Base64, 5=自定义JS
    var customParseJs: String = "",
    var commonJsLib: String = ""
)