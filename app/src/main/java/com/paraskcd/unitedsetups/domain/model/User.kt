package com.paraskcd.unitedsetups.domain.model

import com.paraskcd.unitedsetups.domain.enums.UserRoles

data class User(
    val id: String,
    val username: String,
    val email: String,
    val name: String,
    val telegramId: Long?,
    val profileImageUrl: String?,
    val coverImageUrl: String?,
    val role: UserRoles
)
