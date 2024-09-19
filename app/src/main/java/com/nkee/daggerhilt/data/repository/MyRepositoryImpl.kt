package com.nkee.daggerhilt.data.repository

import android.app.Application
import com.nkee.daggerhilt.R
import com.nkee.daggerhilt.data.remote.MyApi
import com.nkee.daggerhilt.domain.repository.MyRepository
import javax.inject.Inject


class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello From repo, app name is: $appName")
    }

    override suspend fun doNetCall() {
        println("Net Call is Succeed")
    }
}