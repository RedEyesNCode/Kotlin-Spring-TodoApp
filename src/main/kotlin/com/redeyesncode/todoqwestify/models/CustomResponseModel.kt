package com.redeyesncode.todoqwestify.models

import lombok.Getter
import lombok.Setter



class CustomStatusCodeModel : StatusCodeModel {
    private var data: Any

    constructor(status: String?, code: Int, message: String?, data: Any) : super(status!!, code, message) {
        this.data = data
    }

    constructor(status: String?, code: Int, data: Any) : super(status!!, code) {
        this.data = data
    }
}