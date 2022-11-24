package com.rmiragaya.dependencyinjectionhilt

import androidx.lifecycle.ViewModel
import com.rmiragaya.dependencyinjectionhilt.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewmodel @Inject constructor(
    private val repository: MyRepository
) : ViewModel()
