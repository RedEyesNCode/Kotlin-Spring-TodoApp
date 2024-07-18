package com.redeyesncode.todoqwestify.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND)  // Set the HTTP status code to 404 Not Found
class ResourceNotFoundException(message: String) : RuntimeException(message)