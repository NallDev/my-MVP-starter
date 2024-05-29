package com.nalldev.myfirstmvi.ui.base

interface BasePresenter<T : BaseView> {
    fun attachView(view: T)
    fun detachView()
}