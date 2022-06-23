package com.example.cleanarchformvalidation.di

import com.example.cleanarchformvalidation.feature_form.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUseCases() : FormUseCases {
        return FormUseCases(
            validateEmail = ValidateEmail(),
            validatePassword = ValidatePassword(),
            validateRepeatedPassword = ValidateRepeatedPassword(),
            validateTerms = ValidateTerms()
        )
    }
}