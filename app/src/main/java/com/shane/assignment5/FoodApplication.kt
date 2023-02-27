package com.shane.assignment5

import android.app.Application

/**
 * Get an instance of the database to be used
 */
class FoodApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}