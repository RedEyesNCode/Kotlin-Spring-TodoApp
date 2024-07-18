package com.redeyesncode.todoqwestify.models

import lombok.Getter
import lombok.Setter



// CustomStatusCodeModel to hold additional data
data class CustomStatusCodeModel<T>(
    override var status: String,
    override var code: Int,
    override var message: String? = null,
    val data: T? = null // Generic type to hold any data
) : StatusCodeModel(status, code, message)
