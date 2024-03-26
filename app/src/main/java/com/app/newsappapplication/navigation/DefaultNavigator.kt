package com.app.newsappapplication.navigation

import com.app.common_utills.Activities
import com.app.common_utills.Navigator
import com.app.news_presentation.GoToNewsActivity
import com.app.presentation.GoToSearchActivity

class DefaultNavigator : Navigator.Provider {
    override fun getActivities(activities: Activities): Navigator {
        return when (activities) {
            Activities.NewsActivity -> {
                GoToNewsActivity
            }
            Activities.SearchActivity -> {
                GoToSearchActivity
            }
        }
    }

}