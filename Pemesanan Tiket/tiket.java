/*
Nama Anggota:
Al Fatih Fachreza					1910512138
Bintang Fiergiawan Pamungkas		2110512044
Lazzuazra Arindra Putra				2110512053
Rivaldo Elshaddai Kalona Sianturi	2110512063
Muhammad Hidayatullah				2110512066
*/
abstract class tiket {
    private double harga;
    private String jenis;
    private String lokasi;
    public tiket(double harga, String jenis, String lokasi){
        this.harga  = harga;
        this.jenis = jenis;
        this.lokasi = lokasi;
    }
    double getHarga(){
        return harga;
    }
    String getJenis(){
        return jenis;
    }
    String getLokasi(){
        return lokasi;
    }
    void jenisTiket(){
        System.out.println("Ini jenis tiket");
    }
    abstract double total_harga(int total_tiket);
}



