package com.app.news_presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.app.common_utills.Navigator
import com.app.news_presentation.databinding.ActivityNewsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class NewsActivity : AppCompatActivity() {

    companion object{
        fun launchActivity(activity: Activity){
            val intent = Intent(activity,NewsActivity::class.java)
            activity.startActivity(intent)
        }
    }

    lateinit var activityNewsBinding: ActivityNewsBinding
    private val newsViewModel: NewsViewModel by viewModels()
    private val newsAdapter = NewsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityNewsBinding = DataBindingUtil.setContentView(this,R.layout.activity_news)

        initView()
        setObservers()
    }

    private fun initView() {
        activityNewsBinding.rvArticles.adapter = newsAdapter
    }

    private fun setObservers() {
        lifecycleScope.launchWhenStarted {
            newsViewModel.newsArticle.collectLatest {
                if (it.isLoading) {
                    activityNewsBinding.progressBar.visibility= View.VISIBLE
                }
                if (it.error.isNotBlank()) {
                    activityNewsBinding.progressBar.visibility= View.GONE
                    Toast.makeText(this@NewsActivity, it.error, Toast.LENGTH_LONG).show()
                }
                it.data?.let {
                    activityNewsBinding.progressBar.visibility= View.GONE
                    newsAdapter.setData(it)
                }
            }
        }

    }
}

object GoToNewsActivity: Navigator{
    override fun navigate(activity: Activity) {
        NewsActivity.launchActivity(activity)
    }
}