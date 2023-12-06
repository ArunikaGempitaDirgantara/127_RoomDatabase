package com.example.roomsiswa.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import com.example.roomsiswa.data.Siswa as siswa

@Dao
interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: siswa)

    @Update
    suspend fun update(siswa: siswa)

    @Delete
    suspend fun delete(siswa: siswa)

    @Query("SELECT*from tblSiswa WHERE id = :id")
    fun getsiswa(id: Int): Flow<siswa>

    @Query("SELECT*from tblSiswa ORDER BY nama ASC")
    fun getAllsiswa() : Flow<List<siswa>>
}