package com.redeyesncode.todoqwestify.models



open class StatusCodeModel {
    var status: String
    var code: Int
    var message: String? = null

    constructor(status: String, code: Int, message: String?) {
        this.status = status
        this.code = code
        this.message = message
    }

    constructor(status: String, code: Int) {
        this.status = status
        this.code = code
    }
}
