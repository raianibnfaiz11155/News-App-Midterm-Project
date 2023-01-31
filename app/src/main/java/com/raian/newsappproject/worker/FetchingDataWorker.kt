package com.raian.newsappproject.worker

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.raian.newsappproject.Repository.NewsRepository
import com.raian.newsappproject.db.NewsDatabase

class FetchingDataWorker(val appContext: Context, workerParams: WorkerParameters) :
    CoroutineWorker(appContext, workerParams) {
    val TAG = "WORKER"
    lateinit var repository: NewsRepository
    override suspend fun doWork(): Result {
        val applicationDao = NewsDatabase.getDatabase(applicationContext)?.newsDao()
        repository = applicationDao?.let { NewsRepository(it) }!!

        Log.d(TAG, "stars ")
        return try {
            repository.refreshAll()

            Log.d(TAG, "article called: ")

            val notificationManager =
                appContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(
                NotificationChannel(
                    "channel1",
                    "default",
                    NotificationManager.IMPORTANCE_DEFAULT
                )
            )
            val notification =
                NotificationCompat.Builder(appContext, "channel1").setContentTitle("Title")
                    .setContentText("Content")
                    .setSmallIcon(appContext.applicationInfo.icon)
                    .build()
            notificationManager.notify(1, notification)
            Result.success()
        } catch (e: Exception) {
            Log.e(TAG, "Failed to do work", e)
            Result.failure()
        }


    }
}