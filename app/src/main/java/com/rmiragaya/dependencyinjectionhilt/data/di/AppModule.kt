package com.rmiragaya.dependencyinjectionhilt.data.di

import android.app.Application
import com.rmiragaya.dependencyinjectionhilt.data.remote.MyApi
import com.rmiragaya.dependencyinjectionhilt.data.repository.MyRepositoryImpl
import com.rmiragaya.dependencyinjectionhilt.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
// @InstallIn(ActivityComponent::class) // will live as long as the activity injected into
// @InstallIn(ViewModelComponent::class) // will live as long as the the viewmodel injected into
// @InstallIn(ActivityRetainedComponent::class) // will live as long as the activity injected into and no destroy with configuration
// @InstallIn(ServiceComponent::class) // will live as long as the Service injected into
@InstallIn(SingletonComponent::class) // will live as long as the App lives
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("http://test.com")
            .build()
            .create(MyApi::class.java)
    }

//    @Provides
//    @Singleton
//    fun provideMyRepository(
//        api: MyApi,
//        app: Application,
//        @Named("hello1")
//        hello1: String
//    ): MyRepository {
//        return MyRepositoryImpl(api, app)
//    }

    @Provides
    @Singleton
    @Named("hello1") // use when muiltiples provides of the same class
    fun provideString1() = "Hello String 1"

    @Provides
    @Singleton
    @Named("hello2") // use when muiltiples provides of the same class
    fun provideString2() = "Hello String 2"
}
