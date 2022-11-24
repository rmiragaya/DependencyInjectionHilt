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

    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi, app: Application): MyRepository {
        return MyRepositoryImpl(api, app)
    }
}
