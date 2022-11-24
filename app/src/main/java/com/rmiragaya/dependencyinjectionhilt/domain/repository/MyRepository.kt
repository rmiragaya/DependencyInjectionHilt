package com.rmiragaya.dependencyinjectionhilt.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}
