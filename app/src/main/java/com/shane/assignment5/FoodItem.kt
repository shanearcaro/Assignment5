package com.shane.assignment5

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Entity(tableName = "food_item")
data class FoodItem(
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "calories") val calories: Int
)

@Dao
interface FoodItemDao {
    @Query("SELECT * FROM food_item")
    fun getAll(): Flow<List<FoodItem>>

    @Insert
    fun insert(item: FoodItem)

    @Delete
    fun delete(item: FoodItem)
}