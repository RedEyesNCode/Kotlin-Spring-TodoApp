package com.redeyesncode.todoqwestify.models



open class StatusCodeModel {
    open var status: String = ""
    open var code: Int = 0
    open var message: String? = null

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
