package com.example.roomsiswa.repositori

import com.example.roomsiswa.data.SiswaDao
import com.example.roomsiswa.data.Siswa
import kotlinx.coroutines.flow.Flow

class OfflineRepositoriSiswa(private val SiswaDao: SiswaDao) : RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> {
        return SiswaDao.getAllsiswa()
    }

    override fun getSiswaStream(id: Int): Flow<Siswa?> {
        return SiswaDao.getsiswa(id)
    }

    override suspend fun insertsiswa(siswa: Siswa) {
        return SiswaDao.insert(siswa)
    }

    override suspend fun deletesiswa(siswa: Siswa) {
        return SiswaDao.delete(siswa)
    }

    override suspend fun updatesiswa(siswa: Siswa) {
       return SiswaDao.update(siswa)
    }


}