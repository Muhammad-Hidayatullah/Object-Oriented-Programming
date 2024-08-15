import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pemesanan_pesawat extends JFrame {

    private JTextField tfNama;
    private JRadioButton ekonomiRadioButton;
    private JRadioButton bisnisRadioButton;
    private JRadioButton firstClassRadioButton;
    private JTextField tfNomorTelepon;
    private JTextField tSubtotal;
    private JTextField tTotal;
    private JRadioButton weight1;
    private JRadioButton weight2;
    private JRadioButton weight3;
    private JPanel mainPanel;
    private JButton HitungButton;
    private JComboBox cbAsal;
    private JTextField tDewasa;
    private JTextField tAnak;
    private JFormattedTextField ftTanggalKembali;
    private JFormattedTextField ftTanggalBerangkat;
    private JComboBox cbTujuan;

    public pemesanan_pesawat() {
        setTitle("SELAMAT DATANG DI APLIKASI PEMESANAN TIKET");

        //Group button kelas pesawat
        ButtonGroup kelasButtonGroup = new ButtonGroup();
        kelasButtonGroup.add(ekonomiRadioButton);
        kelasButtonGroup.add(bisnisRadioButton);
        kelasButtonGroup.add(firstClassRadioButton);

        ButtonGroup weightButtonGroup = new ButtonGroup();
        weightButtonGroup.add(weight1);
        weightButtonGroup.add(weight2);
        weightButtonGroup.add(weight3);

        setSize(450, 300);

        cbAsal.addItem(new String("Jakarta"));
        cbAsal.addItem(new String("Surabaya"));
        cbAsal.addItem(new String("Semarang"));
        cbAsal.addItem(new String("Bandung"));
        cbAsal.addItem(new String("Bali"));
        cbAsal.addItem(new String("Makassar"));

        cbTujuan.addItem(new String("Jakarta"));
        cbTujuan.addItem(new String("Surabaya"));
        cbTujuan.addItem(new String("Semarang"));
        cbTujuan.addItem(new String("Bandung"));
        cbTujuan.addItem(new String("Bali"));
        cbTujuan.addItem(new String("Makassar"));


        HitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama, no_telepon, asal, tujuan, tanggal_berangkat, tanggal_kembali, kelas_penerbangan, berat_bagasi = "";
                int total_dewasa = 0, total_anak = 0, harga_tiket_dewasa = 0, harga_tiket_anak = 0;
                int subtotal = 0, biaya_pelayanan = 0, total = 0;
                int biaya_weight = 0;

                nama = tfNama.getText();
                no_telepon = tfNomorTelepon.getText();
                asal = cbAsal.getSelectedItem().toString();
                tujuan = cbTujuan.getSelectedItem().toString();

                // TODO: Handle date formatting and parsing
                tanggal_berangkat = ftTanggalBerangkat.getText();
                tanggal_kembali = ftTanggalKembali.getText();

                // Asal Jakarta
                if (asal.equals("Jakarta")) {
                    if (tujuan.equals("Surabaya")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 680000;
                            harga_tiket_anak = 500000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1800000;
                            harga_tiket_anak = 1000000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 2100000;
                            harga_tiket_anak = 1500000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Semarang")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 500000;
                            harga_tiket_anak = 350000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 650000;
                            harga_tiket_anak = 500000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 800000;
                            harga_tiket_anak = 650000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Bandung")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 300000;
                            harga_tiket_anak = 200000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 580000;
                            harga_tiket_anak = 450000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 780000;
                            harga_tiket_anak = 640000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Bali")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 600000;
                            harga_tiket_anak = 400000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 800000;
                            harga_tiket_anak = 650000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 950000;
                            harga_tiket_anak = 700000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Makassar")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 1000000;
                            harga_tiket_anak = 900000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1300000;
                            harga_tiket_anak = 1000000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 1500000;
                            harga_tiket_anak = 1200000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    }
                }

                // Asal Semarang
                else if (asal.equals("Semarang")) {
                    if (tujuan.equals("Jakarta")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 680000;
                            harga_tiket_anak = 500000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1800000;
                            harga_tiket_anak = 1000000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 2100000;
                            harga_tiket_anak = 1500000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Surabaya")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 500000;
                            harga_tiket_anak = 350000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 650000;
                            harga_tiket_anak = 500000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 800000;
                            harga_tiket_anak = 650000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Bandung")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 300000;
                            harga_tiket_anak = 200000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 580000;
                            harga_tiket_anak = 450000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 780000;
                            harga_tiket_anak = 640000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Bali")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 600000;
                            harga_tiket_anak = 400000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 800000;
                            harga_tiket_anak = 650000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 950000;
                            harga_tiket_anak = 700000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Makassar")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 1000000;
                            harga_tiket_anak = 900000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1300000;
                            harga_tiket_anak = 1000000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 1500000;
                            harga_tiket_anak = 1200000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    }
                }
                // Asal Bandung
                else if (asal.equals("Bandung")) {
                    if (tujuan.equals("Jakarta")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 300000;
                            harga_tiket_anak = 200000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 450000;
                            harga_tiket_anak = 300000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 500000;
                            harga_tiket_anak = 400000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Surabaya")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 400000;
                            harga_tiket_anak = 350000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 500000;
                            harga_tiket_anak = 400000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 550000;
                            harga_tiket_anak = 450000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Semarang")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 380000;
                            harga_tiket_anak = 250000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 450000;
                            harga_tiket_anak = 400000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 580000;
                            harga_tiket_anak = 450000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Bali")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 600000;
                            harga_tiket_anak = 480000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 770000;
                            harga_tiket_anak = 500000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 890000;
                            harga_tiket_anak = 550000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Makassar")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 1000000;
                            harga_tiket_anak = 900000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1250000;
                            harga_tiket_anak = 980000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 1500000;
                            harga_tiket_anak = 1100000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    }
                }
                // Asal Bali
                else if (asal.equals("Bali")) {
                    if (tujuan.equals("Jakarta")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 700000;
                            harga_tiket_anak = 640000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 850000;
                            harga_tiket_anak = 690000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 1000000;
                            harga_tiket_anak = 750000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Surabaya")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 450000;
                            harga_tiket_anak = 380000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 580000;
                            harga_tiket_anak = 420000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 600000;
                            harga_tiket_anak = 580000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Semarang")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 890000;
                            harga_tiket_anak = 570000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1000000;
                            harga_tiket_anak = 660000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 1150000;
                            harga_tiket_anak = 750000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Makassar")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 1170000;
                            harga_tiket_anak = 1000000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1300000;
                            harga_tiket_anak = 1100000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 1500000;
                            harga_tiket_anak = 1200000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    }
                }
                // Asal Makassar
                else if (asal.equals("Makassar")) {
                    if (tujuan.equals("Jakarta")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 1600000;
                            harga_tiket_anak = 1200000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1800000;
                            harga_tiket_anak = 1300000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 2000000;
                            harga_tiket_anak = 1500000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Surabaya")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 1160000;
                            harga_tiket_anak = 1050000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1250000;
                            harga_tiket_anak = 1100000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 1400000;
                            harga_tiket_anak = 1120000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Semarang")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 1500000;
                            harga_tiket_anak = 1200000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1700000;
                            harga_tiket_anak = 1300000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 1850000;
                            harga_tiket_anak = 1450000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    } else if (tujuan.equals("Bali")) {
                        if (ekonomiRadioButton.isSelected()) {
                            kelas_penerbangan = "Ekonomi";
                            harga_tiket_dewasa = 990000;
                            harga_tiket_anak = 850000;
                        } else if (bisnisRadioButton.isSelected()) {
                            kelas_penerbangan = "Bisnis";
                            harga_tiket_dewasa = 1100000;
                            harga_tiket_anak = 1000000;
                        } else if (firstClassRadioButton.isSelected()) {
                            kelas_penerbangan = "First Class";
                            harga_tiket_dewasa = 1200000;
                            harga_tiket_anak = 1200000;
                        } else {
                            kelas_penerbangan = "";
                        }
                    }
                }

                // TODO: Handle parsing integer values and error handling
                total_dewasa = Integer.parseInt(tDewasa.getText());
                total_anak = Integer.parseInt(tAnak.getText());

                subtotal = ((total_dewasa * harga_tiket_dewasa) + (total_anak * harga_tiket_anak));
                biaya_pelayanan = 30000;
                tSubtotal.setText(String.valueOf(subtotal));

                if (weight1.isSelected()){
                    biaya_weight = 0;
                } else if (weight2.isSelected()){
                    biaya_weight = 100000;
                } else if (weight3.isSelected()) {
                    biaya_weight = 150000;
                }

                total = subtotal + biaya_pelayanan + biaya_weight;
                tTotal.setText(String.valueOf(total));
            }
        });
    }

    public static void main (String[] args) {
        pemesanan_pesawat new_frame = new pemesanan_pesawat();
        JFrame frame = new JFrame("pemesanan_pesawat");
        frame.setContentPane(new pemesanan_pesawat().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}