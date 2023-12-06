package com.example.roomsiswa.repositori

import com.example.roomsiswa.data.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {

    fun getAllSiswaStream(): Flow<List<Siswa>>

    fun getSiswaStream(id: Int): Flow<Siswa?>

    suspend fun insertsiswa(siswa: Siswa)

    suspend fun deletesiswa(siswa: Siswa)

    suspend fun updatesiswa(siswa: Siswa)
}