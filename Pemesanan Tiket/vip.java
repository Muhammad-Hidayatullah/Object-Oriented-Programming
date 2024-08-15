/*
Nama Anggota:
Al Fatih Fachreza					1910512138
Bintang Fiergiawan Pamungkas		2110512044
Lazzuazra Arindra Putra				2110512053
Rivaldo Elshaddai Kalona Sianturi	2110512063
Muhammad Hidayatullah				2110512066
*/
class vip  extends tiket {
    private String keuntungan;
    public vip(double harga, String jenis, String lokasi, String keuntungan){
        super(harga, jenis, lokasi);
        this.keuntungan = keuntungan;
    }
    String getKeutungan(){
        return keuntungan;
    }
    double total_harga(int total_tiket){
        return total_tiket * getHarga();
    }
}


