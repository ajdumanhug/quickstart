package com.smile.android.util

interface HttpCallBack {
    fun onError(errorLog:String)
    fun onSuccess(message:String)
}