package com.fergun.onboarding.model

data class SignUpModel(
    var nameSurname: String,
    var email: String,
    var password: String
) {
    override fun toString() = "$nameSurname,$email,$password"
}