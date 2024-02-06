package com.ssk.stargram.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserModel(
    @PrimaryKey(autoGenerate = true) val uid : Int,
    @ColumnInfo(name = "userId") val userId : String?,
    @ColumnInfo(name = "nickname") val nickname : String?,
    @ColumnInfo(name = "address") val address : String?
)
