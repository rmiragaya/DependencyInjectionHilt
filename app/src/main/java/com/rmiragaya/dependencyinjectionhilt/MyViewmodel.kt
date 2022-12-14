package com.rmiragaya.dependencyinjectionhilt

import androidx.lifecycle.ViewModel
import com.rmiragaya.dependencyinjectionhilt.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
/** Constructor injection */
class MyViewmodel @Inject constructor(
    private val repository: MyRepository
//    private val repository: Lazy<MyRepository>
) : ViewModel() {

    init {
//        repository.get()
    }
}
