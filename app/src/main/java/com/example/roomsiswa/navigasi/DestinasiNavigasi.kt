package com.example.roomsiswa.navigasi

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menemukan jalur composable
     */
    val route: String

    /**
     * String resource id yang berisi judul yang akan ditampilkan di layar halaman.
     */
    val titleRes: Int
}