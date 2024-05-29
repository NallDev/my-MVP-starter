package com.nalldev.myfirstmvi.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nalldev.myfirstmvi.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainPresenter @Inject constructor(private val repository: UserRepository) : MainContract.Presenter, ViewModel() {

    private var view : MainContract.View? = null

    override fun onShowMessageClick() {
        Log.e("TAG", "DO CLICK THIS")
        viewModelScope.launch {
            val user = repository.getUsers()
            if (user.isNotEmpty()) {
                view?.showMessage("First : ${user[0].name}")
            } else {
                view?.showMessage("No users found.")
            }
        }
    }

    override fun attachView(view: MainContract.View) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }
}