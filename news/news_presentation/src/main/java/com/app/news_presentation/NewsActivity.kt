package com.app.news_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.common_utills.Navigator

class NewsActivity : AppCompatActivity() {

    companion object{
        fun launchActivity(activity: Activity){
            val intent = Intent(activity,NewsActivity::class.java)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}

object GoToNewsActivity: Navigator{
    override fun navigate(activity: Activity) {
        NewsActivity.launchActivity(activity)
    }
}