package repository

import androidx.lifecycle.LiveData
import api.RetrofitBuilder
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import models.SecondDomainModel
import models.UserDomainModel

object MainRepository {

    //Creating a coroutine Job
    private var job: CompletableJob? = null

    fun getUser(userID: String): LiveData<UserDomainModel>{
        job = Job()
        return object: LiveData<UserDomainModel>(){
            override fun onActive() {
                super.onActive()
                job?.let {
                    CoroutineScope(IO+it).launch {
                        val user = RetrofitBuilder.apiService.getUser(userID)
                        withContext(Main){
                            value = user
                            it.complete()
                        }
                    }
                }
            }
        }
    }


    fun getSecondUser(): LiveData<SecondDomainModel>{
        job = Job()
        return object : LiveData<SecondDomainModel>(){
            override fun onActive() {
                super.onActive()
                job?.let {
                    CoroutineScope(IO+it).launch {
                        val secondUser = RetrofitBuilder.apiService.getSecondUser()
                        withContext(Main){
                            value = secondUser
                            it.complete()
                        }
                    }
                }
            }
        }
    }

    fun cancelJobs(){
        job?.cancel()
    }
}