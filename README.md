# Final Project D13 - Sistem Manajemen Inventaris Gudang dan Optimasi Rute Pengiriman

Topik : Sistem Manajemen Inventaris Gudang dan Optimasi Rute Pengiriman

Kelas : D

Kelompok : 13

Anggota :  
Muhammad Fasha Asshofa / 5026241095  
Daniel Evan Aditya Nugraha / 5026241135

Mata Kuliah : Algoritma dan Struktur Data

Dosen Pengampu : Renny Pradina Kusumawardani

## 1. Latar Belakang
- Perkembangan teknologi informasi mendorong berbagai industri untuk mengoptimalkan proses pengelolaan data, termasuk dalam bidang logistik dan manajemen inventori. Sistem yang mampu menyimpan, mencari, dan mengelola data barang secara efisien menjadi kebutuhan penting agar perusahaan dapat menjalankan operasional dengan cepat dan akurat. Selain itu, proses distribusi barang antar kota membutuhkan perhitungan jarak dan rute tercepat, sehingga dapat mengurangi biaya pengiriman dan meningkatkan efektivitas distribusi.
- Untuk menjawab kebutuhan tersebut, dibuatlah sebuah **Sistem Manajemen Inventaris Gudang dan Optimasi Rute Pengiriman** berbasis Java yang memanfaatkan beberapa struktur data dan algoritma penting. Binary Search Tree (BST) digunakan untuk manajemen data produk karena mampu melakukan penyimpanan serta pencarian barang berdasarkan ID dengan waktu akses yang efisien. Algoritma Merge Sort digunakan untuk mengurutkan barang berdasarkan harga, sehingga memudahkan proses analisis harga dan pengambilan keputusan.
- Sementara itu, algoritma Dijkstra digunakan pada pemetaan jalur antar kota untuk menentukan rute pengiriman tercepat dari satu lokasi ke lokasi lainnya. Dengan memadukan ketiga algoritma tersebut, sistem ini mampu menyediakan solusi yang terstruktur, efisien, dan mudah dikembangkan untuk kebutuhan logistik modern.
## 2. Fitur-Fitur
- Tambah Barang
- Cari Barang berdasarkan ID
- Tampilkan Barang (urut ID)
- Tampilkan Barang Termurah
- Cek Rute Pengiriman
## 3. Algoritma yang digunakan
- **Binary Search Tree (BST)** : Untuk Manajemen Inventaris -> Menyimpan data produk berdasarkan ID Barang.
- **Sorting (Merge Sort**) : Untuk Pelaporan Harga -> Mengurutkan data barang yang diambil dari BST berdasarkan atribut "Harga".
- **Graph (Dijkstra Algorithm)** : Untuk Rute Pengiriman -> Memodelkan peta antar kota. Kota adalah Vertex (simpul) dan jalan antar kota adalah Edge (sisi) dengan bobot berupa jarak (km).
## 4. Screenshot Tampilan Program
### Tampilan Menu Utama  
<img width="625" height="304" alt="image" src="https://github.com/user-attachments/assets/608dfa59-0a7e-46fd-a21d-cc161e88e71e" /><br>
### Tampilan Produk urut ID  
<img width="1005" height="708" alt="image" src="https://github.com/user-attachments/assets/8d51e9b0-9771-44a4-81cc-df9dfa7744f9" /><br>
### Tampilan Rute Pengiriman  
<img width="853" height="437" alt="image" src="https://github.com/user-attachments/assets/da4273b2-1e29-4108-b37a-1b9b3f0236f5" /><br>


