package com.app.common_utills

import android.app.Activity

interface Navigator {

    fun navigate(activity: Activity)

    interface Provider {
        fun getActivities(activities: Activities): Navigator
    }
}