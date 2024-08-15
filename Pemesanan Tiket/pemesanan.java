/*
Nama Anggota:
Al Fatih Fachreza					1910512138
Bintang Fiergiawan Pamungkas		2110512044
Lazzuazra Arindra Putra				2110512053
Rivaldo Elshaddai Kalona Sianturi	2110512063
Muhammad Hidayatullah				2110512066
*/

import java.util.Scanner;
import java.time.LocalDate;

//Berisikan main
public class pemesanan {
    public static void main(String[] args) {
        //Harga tiket yang ditentukan oleh penyelanggara
        final double harga_cat1_kiri, harga_cat1_kanan, harga_cat2, harga_cat3, harga_cat4, harga_platinum, harga_vip;
        harga_cat1_kiri = 2900000;
        harga_cat1_kanan = 2900000;
        harga_cat2 = 2635000;
        harga_cat3 = 2135000;
        harga_cat4 = 1385000;
        harga_platinum = 3435000;
        harga_vip = 3400000;


        //Total tiket yang dipesan
        int kuantitas_c1_kiri = 0;
        int kuantitas_c1_kanan = 0;
        int kuantitas_c2 = 0;
        int kuantitas_c3 = 0;
        int kuantitas_c4 = 0;
        int kuantitas_platinum = 0;
        int kuantitas_vip = 0;

        //Diskon
        double diskon = 0.1; // 10%

        //Membuat tiket reguler, platinum, dan vip
        reguler c1_kiri = new reguler(harga_cat1_kiri, "CAT 1", "kiri");
        reguler c1_kanan = new reguler(harga_cat1_kanan, "CAT 1", "kanan");
        reguler c2 = new reguler(harga_cat2, "CAT 2", "kiri/kanan");
        reguler c3 = new reguler(harga_cat3, "CAT 3", "kiri/kanan");
        reguler c4 = new reguler(harga_cat4, "CAT 4", "kiri/kanan");
        platinum platinum = new platinum(harga_platinum, "Platinum", "Depan");
        vip vip = new vip(harga_vip, "VIP", "Paling Depan", "Soundcheck pass");


        //p1 untuk aksi
        Scanner p1 = new Scanner(System.in);

        //Untuk lanjut dengan menekan kunci apapun lalu enter
        Scanner ln = new Scanner(System.in);

        //b1 digunakan untuk memilih tiket
        Scanner b1 = new Scanner(System.in);

        //Digunakan untuk menentukan kuantitas tiket yang dibeli
        Scanner k = new Scanner(System.in);

        //Digunakan untuk looping
        boolean loop = true;

        // Parsing tanggal pemesanan
        LocalDate tanggalPemesanan = LocalDate.now();

        // Tanggal dengan diskon
        LocalDate tanggalDiskon = LocalDate.of(2023, 7, 1); // Misalnya tanggal 1 Juli 2023

        //Scanner untuk melakukan input username dan password
        Scanner usrnm = new Scanner(System.in);
        Scanner psswd = new Scanner(System.in);
        
        System.out.println("\n\n==========LAKUKAN LOGIN==========");
        System.out.print("\nMasukkan username    :   ");
        String username = usrnm.nextLine();

        System.out.print("Masukkan password    :   ");
        String password = psswd.nextLine();

        //Dideclare dan diberikan nilai "" apabila tidak diisi tidak akan error
        String nama_lengkap = "";
        String nomor_telepon = "";
        String email = "";
        String nama_bank = "";
        String no_rekening="";

        //Cek password dan username
        if(!username.equals("Dayat") || !password.equals("*****")){
            System.out.println("Username ataupun password salah, ulangi!!!");
            System.exit(0);
        }else{
            nama_lengkap = "Muhammad Hidayatullah";
            nomor_telepon = "081234567890";
            email = "dayat@gmail.com";
        }
        System.out.println("\n\n\n");


        //Looping untuk piihan menu aplikasi
        while(loop){
            //Menu pilihan aksi        
            System.out.println("=================================================================================");
            System.out.println("=       SELAMAT DATANG DI APLIKASI PEMBELIAN TIKET KONSER BLACKPINK 2023        = ");
            System.out.println("=================================================================================");
            System.out.println("1. PESAN TIKET                                                                  =");
            System.out.println("2. LIHAT STRUK PEMESANAN                                                        =");
            System.out.println("3. KELUAR                                                                       =");
            System.out.println("=================================================================================\n\n");
            
            //Memilih aksi
            System.out.println("Pilih yang mau dilakukan: ");
            int pilih = p1.nextInt();


            //Membeli tiket
            if(pilih == 1){
                Boolean loopPesan = true;
                System.out.println("\n\n\n");
                while(loopPesan){
                    System.out.println("=================================================================================");
                    System.out.println("=                    LIST JENIS-JENIS TIKET YANG TERSEDIA                       =");
                    System.out.println("=================================================================================");
                    System.out.println("Nama Tiket                               Harga                                  ");
                    System.out.println("1. TIKET CAT 1 KIRI                      Rp "+harga_cat1_kiri);
                    System.out.println("2. TIKET CAT 1 KANAN                     Rp "+harga_cat1_kanan);
                    System.out.println("3. TIKET CAT 2                           Rp "+harga_cat2);
                    System.out.println("4. TIKET CAT 3                           Rp "+harga_cat3);
                    System.out.println("5. TIKET CAT 4                           Rp "+harga_cat4);
                    System.out.println("6. TIKET PLATINUM                        Rp "+harga_platinum);
                    System.out.println("7. TIKET VIP                             Rp "+harga_vip);
                    System.out.println("=================================================================================\n\n");
    
                    System.out.println("Pilih tiket yang ingin dibeli: ");
                    int tiket = b1.nextInt();
                    if(tiket == 1){
                        System.out.println("Jumlah tiket yang dipesan: ");
                        kuantitas_c1_kiri = k.nextInt();
                    }else if(tiket == 2){
                        System.out.println("Jumlah tiket yang dipesan: ");
                        kuantitas_c1_kanan = k.nextInt();
                    }else if(tiket == 3){
                        System.out.println("Jumlah tiket yang dipesan: ");
                        kuantitas_c2 = k.nextInt();
                    }else if(tiket == 4){
                        System.out.println("Jumlah tiket yang dipesan: ");
                        kuantitas_c3 = k.nextInt();
                    }else if(tiket == 5){
                        System.out.println("Jumlah tiket yang dipesan: ");
                        kuantitas_c4 = k.nextInt();
                    }else if(tiket == 6){
                        System.out.println("Jumlah tiket yang dipesan: ");
                        kuantitas_platinum = k.nextInt();
                    }else if(tiket == 7){
                        System.out.println("Jumlah tiket yang dipesan: ");
                        kuantitas_vip = k.nextInt();
                    }else{
                        System.out.println("Input anda salah!!!\n\n\n");
                        continue;
                    }


                    //Batasan tiket yang dapat dibeli
                    int batas = 6;
                    if(kuantitas_c1_kiri > batas || kuantitas_c1_kanan > batas || kuantitas_c2 > batas
                            || kuantitas_c3 > batas ||kuantitas_c4> batas ||kuantitas_platinum > batas ||kuantitas_vip > batas ){
                        kuantitas_c1_kiri = 0;
                        kuantitas_c1_kanan = 0;
                        kuantitas_c2 = 0;
                        kuantitas_c3 = 0;
                        kuantitas_c4 = 0;
                        kuantitas_platinum = 0;
                        kuantitas_vip = 0;
                        System.out.println("\n\nPemesanan tiket tidak boleh lebih dari 4!!!!!");
                        //Digunakan untuk alternative clearscreen
                         int i = 0;
                         while(i<30){
                              System.out.println("");
                             i++;
                        }
                        break;
                    }

                    boolean cek_bank = false;
                    Scanner bank = new Scanner(System.in);
                    String[] bank_bank = {"BCA", "BRI", "Mandiri"};


                    //Menginput bank untuk transfer, bila tidak ada di array maka harus mengulang
                    while(!cek_bank){
                        System.out.print("Masukkan bank(BCA, BRI, Mandiri) : ");
                        nama_bank = bank.nextLine();

                        for(String b : bank_bank){
                            if(b.equalsIgnoreCase(nama_bank)){
                                cek_bank = true;
                                break;
                            }
                        }

                        if(!cek_bank){
                            System.out.println("\n\nBank tidak tersedia. Coba lagi!!!\n\n");
                            continue;
                        }
                    }
                    //Cek rekening
                    boolean cek_rekening = false;

                    Scanner r = new Scanner(System.in);
                    while(!cek_rekening){
                        System.out.print("Masukkan nomor rekening anda  :  ");
                        no_rekening = r.nextLine();
                        if(no_rekening.length() < 17){
                            cek_rekening = true;
                        }else{
                            System.out.println("\n\nNomor rekening anda salah. Coba lagi!!!\n\n");
                        }
                    }


                    //Digunakan untuk alternative clearscreen
                    int i = 0;
                    while(i<30){
                        System.out.println("");
                        i++;
                    }
                    pilih = 0;
                    loopPesan = false;
                 }

            //Mengecek pemesanan tiket
            }else if(pilih == 2){
                System.out.println("\n\n");
                System.out.println("Nama Lengkap          : "+nama_lengkap);
                System.out.println("Username              : "+username); 
                System.out.println("Nomor HP              : "+nomor_telepon); 
                System.out.println("Email                 : "+email); 
                System.out.println("Tanggal Pemesanan     : "+tanggalPemesanan);
                System.out.println("Bank                  : "+nama_bank);
                System.out.println("=================================================================================================");
                System.out.println("=                      INFORMASI PEMESANAN TIKET KONSER BLACKPINK                               =");
                System.out.println("=================================================================================================");
                System.out.println("PEMESANAN TIKET CAT 1 Kiri                                                                      ");
                System.out.println("Jenis tiket               :    "+c1_kiri.getJenis());
                System.out.println("Harga tiket               :    Rp "+c1_kiri.getHarga());
                System.out.println("Lokasi tempat duduk       :    "+c1_kiri.getLokasi());
                System.out.println("Total tiket               :    "+kuantitas_c1_kiri);
                System.out.println("Subtotal harga            :    Rp "+c1_kiri.total_harga(kuantitas_c1_kiri));
                System.out.println("=================================================================================================");
                System.out.println("PEMESANAN TIKET CAT 1 KANAN                                                                     ");
                System.out.println("Jenis tiket               :    "+c1_kanan.getJenis());
                System.out.println("Harga tiket               :    Rp "+c1_kanan.getHarga());
                System.out.println("Lokasi tempat duduk       :    "+c1_kanan.getLokasi());
                System.out.println("Total tiket               :    "+kuantitas_c1_kanan);
                System.out.println("Subtotal harga            :    Rp "+c1_kanan.total_harga(kuantitas_c1_kanan));
                System.out.println("=================================================================================================");
                System.out.println("PEMESANAN TIKET CAT 2                                                                           ");
                System.out.println("Jenis tiket               :    "+c2.getJenis());
                System.out.println("Harga tiket               :    Rp "+c2.getHarga());
                System.out.println("Lokasi tempat duduk       :    "+c2.getLokasi());
                System.out.println("Total tiket               :    "+kuantitas_c2);
                System.out.println("Subtotal harga            :    Rp "+c2.total_harga(kuantitas_c2));
                System.out.println("=================================================================================================");
                System.out.println("PEMESANAN TIKET CAT 3                                                                           ");
                System.out.println("Jenis tiket               :    "+c3.getJenis());
                System.out.println("Harga tiket               :    Rp "+c3.getHarga());
                System.out.println("Lokasi tempat duduk       :    "+c3.getLokasi());
                System.out.println("Total tiket               :    "+kuantitas_c3);
                System.out.println("Subtotal harga            :    Rp "+c3.total_harga(kuantitas_c3));
                System.out.println("=================================================================================================");
                System.out.println("PEMESANAN TIKET CAT 4                                                                           ");
                System.out.println("Jenis tiket               :    "+c4.getJenis());
                System.out.println("Harga tiket               :    Rp "+c4.getHarga());
                System.out.println("Lokasi tempat duduk       :    "+c4.getLokasi());
                System.out.println("Total tiket               :    "+kuantitas_c4);
                System.out.println("Subtotal harga            :    Rp "+c4.total_harga(kuantitas_c4));
                System.out.println("=================================================================================================");
                System.out.println("PEMESANAN TIKET PLATINUM                                                                        ");
                System.out.println("Jenis tiket               :    "+platinum.getJenis());
                System.out.println("Harga tiket               :    Rp "+platinum.getHarga());
                System.out.println("Lokasi tempat duduk       :    "+platinum.getLokasi());
                System.out.println("Total tiket               :    "+kuantitas_platinum);
                System.out.println("Subtotal harga            :    Rp "+platinum.total_harga(kuantitas_platinum));
                System.out.println("=================================================================================================");
                System.out.println("PEMESANAN TIKET VIP                                                                             ");
                System.out.println("Jenis tiket               :    "+vip.getJenis());
                System.out.println("Harga tiket               :    Rp "+vip.getHarga());
                System.out.println("Lokasi tempat duduk       :    "+vip.getLokasi());
                System.out.println("Keuntungan                :    "+vip.getKeutungan());
                System.out.println("Total tiket               :    "+kuantitas_vip);
                System.out.println("Subtotal harga            :    Rp "+vip.total_harga(kuantitas_vip));
                System.out.println("=================================================================================================");

                //Menghitung semua total harga
                double total_harga_tiket = c1_kiri.total_harga(kuantitas_c1_kiri) + c1_kanan.total_harga(kuantitas_c1_kanan) +
                        c2.total_harga(kuantitas_c2) + c3.total_harga(kuantitas_c3) +
                        c4.total_harga(kuantitas_c4) + platinum.total_harga(kuantitas_platinum)+vip.total_harga(kuantitas_vip);
                //Mengecek apakah berlaku diskon
                double jumlahDiskon = 0;

                //Sebelum tanggal diskon berakhir maka dapat diskon
                if(tanggalPemesanan.isBefore(tanggalDiskon)){
                    jumlahDiskon = total_harga_tiket * diskon;   
                }
                //Menghitunh biaya admin
                double biaya_admin = 35000;
                double total_biaya_admin = biaya_admin * (kuantitas_c1_kanan+kuantitas_c1_kiri+kuantitas_c2+kuantitas_c3+kuantitas_c4+kuantitas_platinum+kuantitas_vip);



                //Menghitung pajak
                double harga_setelah_diskon = total_harga_tiket - jumlahDiskon;
                double pajak = harga_setelah_diskon * 0.1 ;

                //Dibuat dalam format string agar terlihat utuh dan tidak menggunakan E
                String formatted_total_harga_tiket = String.format("%.0f", total_harga_tiket);
                String formatted_total_biaya_admin = String.format("%.0f", total_biaya_admin);
                String formatted_jumlah_diskon = String.format("%.0f", jumlahDiskon);
                String formatted_pajak = String.format("%.0f", jumlahDiskon);

                //Output tanggal pemesanan, total harga tiket, diskon yang diterima, dan biaya admin
                System.out.println("Total harga tiket                  : Rp " + formatted_total_harga_tiket);
                System.out.println("Total diskon                       : Rp " + formatted_jumlah_diskon);
                System.out.println("Total biaya admin                  : Rp " + formatted_total_biaya_admin);
                System.out.println("Total pajak(setelah diskon)        : Rp " + formatted_pajak);
                //Total yang harus dibayar
                double total_semua_biaya = harga_setelah_diskon+total_biaya_admin+pajak;
                String formatted_total_semua = String.format("%.0f", total_semua_biaya);
                System.out.println("\n\n\nTotal semua biaya   : Rp "+formatted_total_semua);;
                pilih = 0;
                System.out.println("\n\nKlik enter untuk kembali ke menu utama: ");
                String lanjut = ln.nextLine();

                int i = 0;
                while(i<50){
                    System.out.println("");
                    i++;
                }

            }else if(pilih == 3){
                //Keluar dari program
                pilih = 0;
                System.out.print("\n\nTerima Kasih Sudah Menggunakan Aplikasi Kami!!!!\n\n\n\n");
                System.exit(0);
            }else{
                //Bila input salah maka akan diulang dari awal
                System.out.println("Salah input ulangi lagi!!!!");
                pilih = 0;
                continue;
            }

        }

    }   

}