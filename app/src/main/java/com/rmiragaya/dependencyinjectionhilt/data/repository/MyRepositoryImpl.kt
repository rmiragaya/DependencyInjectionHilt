package com.rmiragaya.dependencyinjectionhilt.data.repository

import android.app.Application
import com.rmiragaya.dependencyinjectionhilt.R
import com.rmiragaya.dependencyinjectionhilt.data.remote.MyApi
import com.rmiragaya.dependencyinjectionhilt.domain.repository.MyRepository
import javax.inject.Inject

/** Constructor injection */
class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application,
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("App name is $appName")
    }

    override suspend fun doNetworkCall() {
    }
}
