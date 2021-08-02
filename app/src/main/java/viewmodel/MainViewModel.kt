package viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import models.UserDomainModel
import repository.MainRepository

class MainViewModel : ViewModel(){

    private val _userId: MutableLiveData<String> = MutableLiveData()

    val user: LiveData<UserDomainModel> = Transformations.switchMap(_userId){
        MainRepository.getUser(it)
    }


    fun setUserID(userId: String){
        if (_userId.value == userId) return
        _userId.value = userId
    }

    fun cancelJobs(){
        MainRepository.cancelJobs()
    }
}