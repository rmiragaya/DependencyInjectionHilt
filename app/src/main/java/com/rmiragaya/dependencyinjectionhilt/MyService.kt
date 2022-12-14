package com.rmiragaya.dependencyinjectionhilt

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.rmiragaya.dependencyinjectionhilt.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {

    /** Field injection */
    @Inject
    lateinit var repository: MyRepository

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}