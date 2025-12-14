# Final Project D13 - Sistem Manajemen Inventaris Gudang dan Optimasi Rute Pengiriman

**Topik** : Sistem Manajemen Inventaris Gudang dan Optimasi Rute Pengiriman

**Kelas** : D

**Kelompok** : 13

**Anggota** :  
Muhammad Fasha Asshofa / 5026241095  
Daniel Evan Aditya Nugraha / 5026241135

**Mata Kuliah** : Algoritma dan Struktur Data

**Dosen Pengampu** : Renny Pradina Kusumawardani

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

## 5. Struktur File
- FinalProject.java -> Main
- NodeBST.java & InventoryBST.java -> Binary Search Tree
- Edge.java & CityGraph.java -> Djikstra 
- ProductSorter.java -> Merge Sort
- Product.java -> Product Declaration

Kelompok Lain:
D-1 : Word Rank Guesser Game
Link : https://github.com/NashiwaInsan/asdfinalproject

D-2 : Sistem Rekomendasi Event Berbasis Graph
Link : https://github.com/dedyirama-id/kael-recommendation-system

D-3 : Smart Traffic Light Simulator
Link : https://github.com/Sudukk/FP_ASD_Traffic_Light_Simulation_FINAL

D-4 : HotelSeek - Rekomendasi Pemilihan Hotel
Link : https://github.com/dreadf/hotelseek

D-5 :
Link :

D-6 : To-Do List
Link : https://github.com/anggraitapr/ASDFPTODOLIST

D-7 : Sistem Antrian IGD
Link : https://github.com/WilliamHanantha/FP-ASD

D-8 : Sistem Rekomendasi Jadwal Latihan dan Nutrisi Gym
Link :https://github.com/tyr3x74/GymPlan

D-9 : Sistem Rekomendasi Teman Berdasarkan Mutual Friends
Link :https://github.com/mariaelvina/FinalProjectD9

D-10 : Monster Chase
Link : https://github.com/Aida41104/FPASD

D-11 : Warehouse Management System
Link : https://github.com/FasaBil/ASD-D11-Inventory-Management

D-12 : Smart Traveling Planner
Link : https://github.com/Dziky05/FP-ASD-KEL-13

D-13 : Sistem Manajemen Inventaris Gudang dan Optimasi Rute Pengiriman
Link : https://github.com/FashaAsshofa/Final-Project-ASD-D-Kelompok-13

D-14 : Rekomendasi Film berbasis Graph
Link : https://github.com/neutralcheeze/final-project-asd.git
