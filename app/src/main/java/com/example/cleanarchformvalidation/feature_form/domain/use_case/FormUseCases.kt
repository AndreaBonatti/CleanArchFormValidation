package com.example.cleanarchformvalidation.feature_form.domain.use_case

data class FormUseCases(
    val validateEmail: ValidateEmail,
    val validatePassword: ValidatePassword,
    val validateRepeatedPassword: ValidateRepeatedPassword,
    val validateTerms: ValidateTerms
)