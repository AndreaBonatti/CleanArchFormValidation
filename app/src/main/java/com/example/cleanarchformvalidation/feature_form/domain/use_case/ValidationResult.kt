package com.example.cleanarchformvalidation.feature_form.domain.use_case

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)
