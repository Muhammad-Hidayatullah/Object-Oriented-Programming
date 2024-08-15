/*
Nama Anggota:
Al Fatih Fachreza					1910512138
Bintang Fiergiawan Pamungkas		2110512044
Lazzuazra Arindra Putra				2110512053
Rivaldo Elshaddai Kalona Sianturi	2110512063
Muhammad Hidayatullah				2110512066
*/
public class platinum extends tiket{

    //Lokasi kiri kanan untuk cat
    //Lokasi platinum yaitu paling depan dan random
    //Jenis cat 1, cat 2, cat 3, cat 4, dan platinum

    public platinum(double harga, String jenis, String lokasi){
        super(harga, jenis, lokasi);

    }
    @Override
    double total_harga(int total_tiket){
        return getHarga() * total_tiket;
    }
}