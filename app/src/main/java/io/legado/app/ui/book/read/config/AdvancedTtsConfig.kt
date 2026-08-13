package io.legado.app.ui.book.read.config

// 你的高级引擎数据配置类
data class AdvancedTtsConfig(
    var name: String = "",               // 引擎名称
    var interval: Int = 0,               // 段落间隔
    var useWebSocket: Boolean = true,    // 是否使用WS流式（默认选高级模式）
    var preRequests: String = "",        // 前置请求链（先用纯文本存JSON，后期再拆成对象）
    var wsUrl: String = "",              // WebSocket 地址模板
    var customParseJs: String = ""       // 返回音频解析模块的自定义 JS 代码
)
