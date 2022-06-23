package com.example.cleanarchformvalidation.feature_form.domain.use_case

class ValidateRepeatedPassword {

    fun execute(password: String, repeatedPassword: String): ValidationResult {
        if (password != repeatedPassword) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password don't match"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}