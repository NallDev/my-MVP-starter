package com.nalldev.myfirstmvi.ui.main

import com.nalldev.myfirstmvi.ui.base.BasePresenter
import com.nalldev.myfirstmvi.ui.base.BaseView

interface MainContract {
    interface View : BaseView {
        fun showMessage(message: String)
    }

    interface Presenter : BasePresenter<View> {
        fun onShowMessageClick()
    }
}