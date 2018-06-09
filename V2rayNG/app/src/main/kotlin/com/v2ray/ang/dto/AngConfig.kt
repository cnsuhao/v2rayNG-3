package com.v2ray.ang.dto

data class AngConfig(
        var index: Int,
        var bypassMainland: Boolean = false,
        var muxEnabled: Boolean = false,
        var vmess: ArrayList<VmessBean>
) {
//    data class VmessBean(var guid: String = "123456",
//                         var address: String = "v2ray.cool",
//                         var port: Int = 10086,
//                         var id: String = "a3482e88-686a-4a58-8126-99c9df64b7bf",
//                         var alterId: Int = 64,
//                         var security: String = "aes-128-cfb",
//                         var network: String = "tcp",
//                         var remarks: String = "def",
//                         var headerType: String = "",
//                         var requestHost: String = "",
//                         var streamSecurity: String = "",
//                         var configType: Int = 1)

    data class VmessBean(var guid: String = "123456",
                         var address: String = "103.94.185.13",
                         var port: Int = 30001,
                         var id: String = "550E8400-E29B-11D4-A716-446655440000",
                         var alterId: Int = 64,
                         var security: String = "aes-128-cfb",
                         var network: String = "kcp",
                         var remarks: String = "hostdare",
                         var headerType: String = "none",
                         var requestHost: String = "",
                         var streamSecurity: String = "",
                         var configType: Int = 1)
}