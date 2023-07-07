package com.ojo.backend.purchasing.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundException(
    message: String = HttpStatus.NOT_FOUND.reasonPhrase,
    cause: Throwable? = null
): IllegalArgumentException(message, cause)