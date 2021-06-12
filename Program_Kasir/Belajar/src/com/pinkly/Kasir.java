package com.pinkly;
// ini adalah library untuk pembuatan input
import java.util.Scanner;
class Menu {
    protected String nama_barang;
    protected int harga_barang;
    protected int rokok[] = new int[3];
    protected int kopi[] = new int[3];
    protected int kacang[] = new int[3];
    // ini adalah construktor akan dipanggil pertama kali pada saat objek dibuat
    protected Menu(String nama_barang, int harga_barang) {
        this.setNama_barang(nama_barang);
        this.setHarga_barang(harga_barang);
    }
    protected void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    private void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }
    // ini adalah fungsi untuk menampilkan isi objek
    void Tampilkan() {
        System.out.println(this.nama_barang + " \t: RP." + this.harga_barang);
    }
}
public class Kasir {
    static Scanner scan = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);
    static void Melihat_Daftar_Menu() {
    Menu rokok = new Menu("1. Rokok", 25000);
    Menu kopi = new Menu("2. Kopi", 10000);
    Menu kacang = new Menu("3. Kacang", 15000);
    rokok.Tampilkan();
    kopi.Tampilkan();
    kacang.Tampilkan();
    }
    static void Memilih_Daftar_Menu() {
    Menu rokok = new Menu("1. Rokok", 25000);
    Menu kopi = new Menu("2. Kopi", 10000);
    Menu kacang = new Menu("3. Kacang", 15000);
    int perhitungan[] = {50000, 20000, 0, 0, 0};
    int jumlah_barang, bayar, kurang_bayar, bayar_lagi, kembalian;
    char pilih_menu, pilih_menu_lagi;
    // disini kita akan masuk ke perulangan do while
    // untuk melakukan pemilihan menu yang ingin kita pilih secara berulan-ulang
    do {
        // ini adalah input untuk memilih case (memilih menu)
        System.out.print("Silahkan Pilih Menu\t: ");
        pilih_menu = scan.next().charAt(0);
        // dibawah ini kondisi dibuat dengan percabangan menggunakan switch case
        switch (pilih_menu) {
        // tiga case dibawah ini yang akan dijalankan hanya case yang bernilai true
        // sesuai dengan pilihan yang kita masukan pada input di atas
            case '1' :
                // jika case terpilih (true) kita akan masuk kesini
                System.out.println("==============================================");
                // disini kita akan memasukan input berapa jumlah menu (barang) yang kita pilih
                System.out.print("Masukan Jumlah Barang\t: ");
                jumlah_barang = scan.nextInt();
                rokok.rokok[0] += jumlah_barang;
                // ini adalah kondi ketika jumlah menu yang kita masukan 0 atau lebih kecil dari 0
                if (jumlah_barang == 0 || jumlah_barang < 0) {
                    // dan jika jumlah menu 0 atau lebih kecil dari 0
                    // kita akan masuk kedalam perulangan do while
                    // untuk mengisi jumlah menu lagi sampai jumlah menu lebih besar dari 0
                    do {
                        System.out.println("==============================================");
                        System.out.println("Jumlah Barang Tidak Boleh 0 Atau Kurang Dari 0");
                        System.out.println("Silahkan Anda Masukan Lagi Jumlah Barang");
                        System.out.println("==============================================");
                        // disini kita akan memasukan jumlah menu lagi (tidak boleh 0)
                        // jika jumlah menu yang dimasukan 0 atau lebih kecil dari 0
                        // pengulangan akan dilakukan secara terus-menerus
                        System.out.print("Masukan Jumlah Barang\t: ");
                        jumlah_barang = scan.nextInt();
                        rokok.rokok[0] += jumlah_barang;
                        // dan pengulangan hanya akan dihentikan ketika jumlah menu lebih besar dari 0
                        } while (jumlah_barang < 0 || jumlah_barang < 1);
                        rokok.rokok[1] = rokok.harga_barang * jumlah_barang;
                        perhitungan[2] += rokok.rokok[1];
                        System.out.println("==============================================");
                        System.out.println("Harga Rokok\t: " + jumlah_barang + "\t: RP." + rokok.rokok[1]);
                        System.out.println("==============================================");
                        rokok.rokok[2] += rokok.rokok[1];
                    // ini adalah kondisi ketika jmlah menu yang dimasukan pada input lebih besar dari 0
                    // pada kondisi else hanya akan dijalankan ketika kondisi if bernilai false
                    } else {
                        rokok.rokok[1] = rokok.harga_barang * jumlah_barang;
                        perhitungan[2] += rokok.rokok[1];
                        System.out.println("==============================================");
                        System.out.println("Harga Rokok\t: " + jumlah_barang + "\t: RP." + rokok.rokok[1]);
                        System.out.println("==============================================");
                        rokok.rokok[2] += rokok.rokok[1];
                    }
                break;
                // kondisi case dua dan tiga dibawah ini sama dengan case satu yang di atas
                case '2' :
                    System.out.println("==============================================");
                    System.out.print("Masukan Jumlah Barang\t: ");
                    jumlah_barang = scan.nextInt();
                    kopi.kopi[0] += jumlah_barang;
                    if (jumlah_barang == 0 || jumlah_barang < 0) {
                        do {
                            System.out.println("==============================================");
                            System.out.println("Jumlah Barang Tidak Boleh 0 Atau Kurang Dari 0");
                            System.out.println("Silahkan Anda Masukan Lagi Jumlah Barang");
                            System.out.println("==============================================");
                            System.out.print("Masukan Jumlah Barang\t: ");
                            jumlah_barang = scan.nextInt();
                            kopi.kopi[0] += jumlah_barang;
                        } while (jumlah_barang < 0 || jumlah_barang < 1);
                        kopi.kopi[1] = kopi.harga_barang * jumlah_barang;
                        perhitungan[2] += kopi.kopi[1];
                        System.out.println("==============================================");
                        System.out.println("Harga Kopi\t: " + jumlah_barang + "\t: RP." + kopi.kopi[1]);
                        System.out.println("==============================================");
                        kopi.kopi[2] += kopi.kopi[1];
                    } else {
                        kopi.kopi[1] = kopi.harga_barang * jumlah_barang;
                        perhitungan[2] += kopi.kopi[1];
                        System.out.println("==============================================");
                        System.out.println("Harga Kopi\t: " + jumlah_barang + "\t: RP." + kopi.kopi[1]);
                        System.out.println("==============================================");
                        kopi.kopi[2] += kopi.kopi[1];
                    }
                break;
                case '3' :
                    System.out.println("==============================================");
                    System.out.print("Masukan Jumlah Barang\t: ");
                    jumlah_barang = scan.nextInt();
                    kacang.kacang[0] += jumlah_barang;
                    if (jumlah_barang == 0 || jumlah_barang < 0) {
                        do {
                            System.out.println("==============================================");
                            System.out.println("Jumlah Barang Tidak Boleh 0 Atau Kurang Dari 0");
                            System.out.println("Silahkan Anda Masukan Lagi Jumlah Barang");
                            System.out.println("==============================================");
                            System.out.print("Masukan Jumlah Barang\t: ");
                            jumlah_barang = scan.nextInt();
                            kacang.kacang[0] += jumlah_barang;
                        } while (jumlah_barang < 0 || jumlah_barang < 1);
                        kacang.kacang[1] = kacang.harga_barang * jumlah_barang;
                        perhitungan[2] += kacang.kacang[1];
                        System.out.println("==============================================");
                        System.out.println("Harga Kacang\t: " + jumlah_barang + "\t: RP." + kacang.kacang[1]);
                        System.out.println("==============================================");
                        kacang.kacang[2] += kacang.kacang[1];
                    } else {
                        kacang.kacang[1] = kacang.harga_barang * jumlah_barang;
                        perhitungan[2] += kacang.kacang[1];
                        System.out.println("==============================================");
                        System.out.println("Harga Kacang\t: " + jumlah_barang + "\t: RP." + kacang.kacang[1]);
                        System.out.println("==============================================");
                        kacang.kacang[2] += kacang.kacang[1];
                    }
                break;
                // ini adalah default hanya akan dijalankan ketika tiga case di atas bernilai false
                default : {
                    System.out.println("Maaf Menu Yang Anda Pilih Tidak Ada");
                }
            }
            System.out.println("Apakah Anda Ingin Memilih Menu Lagi [y/t] ?");
            // disini kita akan memasukan input untuk menentukan program berjalan (input do while)
            System.out.print("Masuakn Input [y/t] ?\t: ");
            pilih_menu_lagi = scan.next().charAt(0);
            System.out.println("==============================================");
        // dan pengulangan akan terus dilakukan ketika (input do while) yang dimasukan bernilai true
        } while (pilih_menu_lagi == 'y' || pilih_menu_lagi == 'y');
        // dibawah ini akan dijalankan ketika kondisi do while do while bernilai false
        System.out.print("\n");
        // ini adalah kondisi ketika pembelian barang (lebih dari RP.400000)
        if (perhitungan[2] > 400000) {
            System.out.println("----------------------------------------------");
            System.out.println("Anda Mendapatkan Diskon : RP.50000");
            System.out.println("Karena Pembelian Lebih Dari : RP.400000");
            System.out.println("----------------------------------------------");
            // tiga kondisi if dibawah ini hanya akan dijalankan ketika jumlah barang tidak sama dengan 0
            if (rokok.rokok[0] != 0) System.out.println("Harga Rokok\t: " + rokok.rokok[0] + "\t: RP." + rokok.rokok[2]);
            if (kopi.kopi[0] != 0) System.out.println("Harga Kopi\t: " + kopi.kopi[0] + "\t: RP." + kopi.kopi[2]);
            if (kacang.kacang[0] != 0) System.out.println("Harga Kacang\t: " + kacang.kacang[0] + "\t: RP." + kacang.kacang[2]);
            perhitungan[3] += perhitungan[2];
            perhitungan[4] += perhitungan[2] - perhitungan[0];
            System.out.println("----------------------------------------------");
            System.out.println("Total Barang\t\t: RP." + perhitungan[3]);
            System.out.println("Dapat Diskon\t\t: RP." + perhitungan[0]);
            System.out.println("Total Harga\t\t: RP." + perhitungan[4]);
            System.out.println("----------------------------------------------");
            // dibawah ini adalah input untuk melakukan pembayaran
            System.out.print("Jumlah Bayar\t\t: RP.");
            bayar = scan.nextInt();
            System.out.println("----------------------------------------------");
            kembalian = bayar - perhitungan[4];
            // ini adalah kondisi ketika input pembayaran kurang dari total harga (perhitingan[4])
            if (bayar < perhitungan[4]) {
                // dan jika jumlah pembayaran kurang dari total harga (perhitingan[4])
                kurang_bayar = perhitungan[4] - bayar;
                // kita akan masuk kedalam perulangan while
                while (kurang_bayar > 0 || kurang_bayar == 0) {
                    System.out.println("Pembayaran Kurang : RP." + kurang_bayar);
                    System.out.println("Silahkan Anda Bayar Lagi");
                    System.out.println("----------------------------------------------");
                    // disini kita akan memasukan jumlah bayar lagi
                    // jika jumlah pembayaran yang dimasukan lebih kecil dari total harga (perhitingan[4])
                    // pengulangan akan dilakukan secara terus-menerus
                    System.out.print("Jumlah Bayar\t\t: RP.");
                    bayar_lagi = scan.nextInt();
                    System.out.println("----------------------------------------------");
                    kembalian = bayar_lagi - kurang_bayar;
                    if (kembalian > 0 || kembalian == 0) break;
                    kurang_bayar -= bayar_lagi;
                    // dan pengulangan hanya akan dihentikan 
                    // ketika pembayaran lebih besar dari total harga (perhitingan[4])
                }
                // ini adalah kondisi ketika kembalian 0 (didalam kondisi kurang pembayaran)
                if (kembalian == 0) {
                    System.out.println("Pembayaran Pas Tidak Ada Kembalian");
                    System.out.println("Kembalian\t\t: RP." + kembalian);
                // ini adalah kondisi ketika kembalian tidak 0 (didalam kondisi kurang pembayaran)
                } else {
                    System.out.println("Kembalian\t\t: RP." + kembalian);
                }
            // ini adalah kondisi ketika kembalian 0 (diluar kondisi kurang pembayaran)
            } else if (kembalian == 0) {
                System.out.println("Pembayaran Pas Tidak Ada Kembalian");
                System.out.println("Kembalian\t\t: RP." + kembalian);
            // ini adalah kondisi ketika kembalian tidak 0 (diluar kondisi kurang pembayaran)
            } else {
                System.out.println("Kembalian\t\t: RP." + kembalian);
            }
        // kondisi (else if dan else) dibawah logika didalamnya kira-kira sama dengan kondisi if di atas
        // ini adalah kondisi ketika pembelian barang (lebih dari RP.200000 dan kurang dari RP.400000)
        } else if (perhitungan[2] > 200000 && perhitungan[2] < 400000) {
            System.out.println("----------------------------------------------");
            System.out.println("Anda Mendapatkan Diskon : RP.20000");
            System.out.println("Karena Pembelian Lebih Dari : RP.200000");
            System.out.println("Dan Pembelian kurang Dari : RP.400000");
            System.out.println("----------------------------------------------");
            if (rokok.rokok[0] != 0) System.out.println("Harga Rokok\t: " + rokok.rokok[0] + "\t: RP." + rokok.rokok[2]);
            if (kopi.kopi[0] != 0) System.out.println("Harga Kopi\t: " + kopi.kopi[0] + "\t: RP." + kopi.kopi[2]);
            if (kacang.kacang[0] != 0) System.out.println("Harga Kacang\t: " + kacang.kacang[0] + "\t: RP." + kacang.kacang[2]);
            perhitungan[3] += perhitungan[2];
            perhitungan[4] += perhitungan[2] - perhitungan[1];
            System.out.println("----------------------------------------------");
            System.out.println("Total Barang\t\t: RP." + perhitungan[3]);
            System.out.println("Dapat Diskon\t\t: RP." + perhitungan[1]);
            System.out.println("Total Harga\t\t: RP." + perhitungan[4]);
            System.out.println("----------------------------------------------");
            System.out.print("Jumlah Bayar\t\t: RP.");
            bayar = scan.nextInt();
            System.out.println("----------------------------------------------");
            kembalian = bayar - perhitungan[4];
            if (bayar < perhitungan[4]) {
                kurang_bayar = perhitungan[4] - bayar;
                while (kurang_bayar > 0 || kurang_bayar == 0) {
                    System.out.println("Pembayaran Kurang : RP." + kurang_bayar);
                    System.out.println("Silahkan Anda Bayar Lagi");
                    System.out.println("----------------------------------------------");
                    System.out.print("Jumlah Bayar\t\t: RP.");
                    bayar_lagi = scan.nextInt();
                    System.out.println("----------------------------------------------");
                    kembalian = bayar_lagi - kurang_bayar;
                    if (kembalian > 0 || kembalian == 0) break;
                    kurang_bayar -= bayar_lagi;
                }
                if (kembalian == 0) {
                    System.out.println("Pembayaran Pas Tidak Ada Kembalian");
                    System.out.println("Kembalian\t\t: RP." + kembalian);
                } else {
                    System.out.println("Kembalian\t\t: RP." + kembalian);
                }
            } else if (kembalian == 0) {
                System.out.println("Pembayaran Pas Tidak Ada Kembalian");
                System.out.println("Kembalian\t\t: RP." + kembalian);
            } else {
                System.out.println("Kembalian\t\t: RP." + kembalian);
            }
        // ini adalah kondisi ketika pembelian barang (kurang dari RP.200000)
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("Anda Tidak Mendapatkan Diskon");
            System.out.println("Karena Pembelian Kurang Dari : RP.200000");
            System.out.println("----------------------------------------------");
            if (rokok.rokok[0] != 0) System.out.println("Harga Rokok\t: " + rokok.rokok[0] + "\t: RP." + rokok.rokok[2]);
            if (kopi.kopi[0] != 0) System.out.println("Harga Kopi\t: " + kopi.kopi[0] + "\t: RP." + kopi.kopi[2]);
            if (kacang.kacang[0] != 0) System.out.println("Harga Kacang\t: " + kacang.kacang[0] + "\t: RP." + kacang.kacang[2]);
            perhitungan[4] = perhitungan[4] + perhitungan[2];
            System.out.println("----------------------------------------------");
            System.out.println("Total Harga\t\t: RP." + perhitungan[4]);
            System.out.println("----------------------------------------------");
            System.out.print("jumlah Bayar\t\t: RP.");
            bayar = scan.nextInt();
            System.out.println("----------------------------------------------");
            kembalian = bayar - perhitungan[4];
            if (bayar < perhitungan[4]) {
                kurang_bayar = perhitungan[4] - bayar;
                while (kurang_bayar > 0 || kurang_bayar == 0) {
                    System.out.println("Pembayaran Kurang : RP." + kurang_bayar);
                    System.out.println("Silahkan Anda Bayar Lagi");
                    System.out.println("----------------------------------------------");
                    System.out.print("Jumlah Bayar\t\t: RP.");
                    bayar_lagi = scan.nextInt();
                    System.out.println("----------------------------------------------");
                    kembalian = bayar_lagi - kurang_bayar;
                    if (kembalian > 0 || kembalian == 0) break;
                    kurang_bayar -= bayar_lagi;
                }
                if (kembalian == 0) {
                    System.out.println("Pembayaran Pas Tidak Ada Kembalian");
                    System.out.println("Kembalian\t\t: RP." + kembalian);
                } else {
                    System.out.println("Kembalian\t\t: RP." + kembalian);
                }
            } else if(kembalian == 0) {
                System.out.println("Pembayaran Pas Tidak Ada Kembalian");
                System.out.println("Kembalian\t\t: RP." + kembalian);
            } else {
                System.out.println("Kembalian\t\t: RP." + kembalian);
            }
            System.out.println("----------------------------------------------");
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        // coment line disini hanya menjelaskan tentang kondisi bagaimana cara program berjalan
        // tidak menjelaskan bagaimana cara (tipe data atau variabel) untuk melakukan perhitungan
        // semua program dimulai dari sini
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("x   - - - -  PROGRAM BY -> PINKLY  - - - -   x");
        System.out.println("x   -  Belajar Membuat -> Program Kasir  -   x");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.print("\n");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Apakah Anda Ingin Memulai Program [y/t] ?");
        System.out.println("Masukan Input [y] Untuk Memulai Program");
        System.out.println("Masukan Input [t] Untk Keluar Dari Program");
        // disini kita akan memasukan input untuk menentukan program berjalan (input if)
        System.out.print("Masuakn Input [y/t] ?\t: ");
        char mulai = scan.next().charAt(0);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.print("\n");
        // kondisi if akan dijalankan jika (input if) yang dimasukan berniali true
        if (mulai == 'y') {
            // pengulangan for hanya akan dijalankan ketika kondisi if bernilai true
            // dan pengulangan akan terus dilakukan ketika (input for) yang dimasukan bernilai true
            // dan pengulangan hanya akan dihentikan ketika kondisi (for) menjadi false
            for (String pilih_lagi = "y"; pilih_lagi.equals("y") || pilih_lagi.equals("y");) {
                // kemudian akan menjalankan struktur program dibawah ini
                // program dibawah ini akan berjalan secara berurutan (secara prosedural)
                System.out.println("----------------------------------------------");
                System.out.println("Berikut Adalah Pilihan Menu Yang Tersedia");
                System.out.println("----------------------------------------------");
                System.out.println("Akan Mendapatkan Diskon RP.50000");
                System.out.println("Jika Pembelian Lebih Dari RP.400000");
                System.out.println("----------------------------------------------");
                System.out.println("Akan Mendapatkan Diskon RP.20000");
                System.out.println("Jika Pembelian Lebih Dari RP.200000");
                System.out.println("Dan Pembelian Kurang Dari RP.400000");
                System.out.println("----------------------------------------------");
                System.out.println("Tapi Jika Pembelian Kurang Dari RP.200000");
                System.out.println("Tidak Akan Mendapatkan Diskon");
                System.out.println("----------------------------------------------");
                // fungsi ini akan di panggil untuk melihat daftar menu yang tersedia
                Melihat_Daftar_Menu();
                System.out.println("----------------------------------------------");
                System.out.print("\n");
                System.out.println("==============================================");
                System.out.println("Silahkan Pilih Barang Yang Ingin Anda Beli");
                // fungsi ini akan di panggil untuk melakukan pemilihan pada menu
                Memilih_Daftar_Menu();
                System.out.println("==============================================");
                System.out.println("Masih Ada Menu Yang Ingin Anda Pilih Lagi ?");
                System.out.println("Masukan Input [y] Untuk Memilih Menu Lagi");
                System.out.println("Masukan Input [t] Untk Keluar Dari Program");
                // disini kita akan memasukan input untuk menentukan program berjalan (input for)
                System.out.print("Masuakn Input [y/t] ?\t: ");
                pilih_lagi = input.nextLine();
                System.out.println("==============================================");
                System.out.print("\n");
            }
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Anda Sudah Keluar Dari Program");
            System.out.println("Anda Tidak Bisa Melakukan Pemilihan Lagi");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        // kondisi else hanya akan dijalankan ketika kondisi if bernilai false
        } else {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Anda Sudah Keluar Dari Program");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
