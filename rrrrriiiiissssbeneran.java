import java.util.Scanner;

public class RRISAGENT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("RRIS AGENT");
        System.out.println("=======================================");
        System.out.println();
        System.out.println("Login sebagai: ");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Mitra");
        System.out.println("---------------------------------------");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();
        sc.nextLine(); 

        if (pilihan == 1) {
            // disini buat si logika admin
            System.out.println("Admin");
            System.out.print("Masukkan nama admin: ");
            String namaadmin = sc.nextLine();
            System.out.println("Halo " + namaadmin + "! Have a nice day.");
            System.out.println("-----------------------------------");
            System.out.println("1. Cek Katalog hari ini.");
            System.out.println("2. Data pelanggan hari ini.");
            System.out.println("3. Review (Kritik dan Saran).");
            System.out.println();
            System.out.print("Pilihan Anda: ");
            int jenis = sc.nextInt();
            sc.nextLine();

            if (jenis == 1) {
                System.out.println("Stok Katalog Hari Ini");
                System.out.println("-------------------------------");
                System.out.println("Pilih Daerah Wisata: ");
                System.out.println("1. Bali");
                System.out.println("2. Lombok");
                System.out.println("3. Jogjakarta");
                System.out.print("Wilayah: ");
                int wilayah = sc.nextInt();
                sc.nextLine();

                if (wilayah == 1) {
                    System.out.println("Bali, Indonesia.");
                    System.out.println("a. Hotel");
                    System.out.println("b. Transportasi");
                    System.out.println("c. Data Pelanggan");
                    System.out.println("d. Review");
                    System.out.print("Jenis katalog: ");
                    String katalogbali = sc.nextLine();

                    if (katalogbali.equals("a")) {
                        System.out.println("HOTEL DI BALI.");
                        System.out.println("1. Nirwana Beach and Resort IDR ... /malam");
                        System.out.println("2. Tonys Villas and Resort IDR ... /malam");
                        System.out.println("3. Villa Kayu Raja IDR ... /malam");
                        System.out.println("4. Nikhila Seminyak IDR ... /malam");
                        System.out.println("5. Pandawa All Suite Hotel IDR ... /malam");
                    } else if (katalogbali.equals("b")) {
                        System.out.println("TRANSPORTASI DI BALI");
                        System.out.println("1. Pesawat");
                        System.out.println("2. Kapal Laut");
                        System.out.println("3. Bus");
                        System.out.println("4. Shuttle");
                        System.out.print("Jenis transportasi: ");
                        int transportasibali = sc.nextInt();
                        sc.nextLine(); 

                        if (transportasibali == 1) {
                            System.out.println("[PESAWAT] Jakarta - Bali = IDR 1.539.748.");
                        }
                    }
                }
            }
        } else if (pilihan == 2) {
            // logika customer
            System.out.println("Customer");
            System.out.print("Masukkan nama customer: ");
            String namacustomer = sc.nextLine();
            System.out.println("Halo " + namacustomer + "! Selamat datang di RRIS AGENT.");
            System.out.println("-----------------------------------");
            System.out.println("1. Lihat Katalog Wisata");
            System.out.println("2. Booking Paket Wisata");
            System.out.println("3. Cek Status Booking");
            System.out.println();
            System.out.print("Pilihan Anda: ");
            int pilihanCustomer = sc.nextInt();
            sc.nextLine(); 

            if (pilihanCustomer == 1) {
            
                System.out.println("Katalog Wisata");
                System.out.println("-------------------------------");
                System.out.println("Pilih Daerah Wisata: ");
                System.out.println("1. Bali");
                System.out.println("2. Lombok");
                System.out.println("3. Jogjakarta");
                System.out.print("Wilayah: ");
                int wilayahCustomer = sc.nextInt();
                sc.nextLine(); 

                if (wilayahCustomer == 1) {
                    System.out.println("Bali, Indonesia.");
                    System.out.println("a. Hotel");
                    System.out.println("b. Transportasi");
                    System.out.print("Jenis katalog: ");
                    String katalogCustomer = sc.nextLine();

                    if (katalogCustomer.equals("a")) {
                        System.out.println("HOTEL DI BALI.");
                        System.out.println("1. Nirwana Beach and Resort IDR ... /malam");
                        System.out.println("2. Tonys Villas and Resort IDR ... /malam");
                        System.out.println("3. Villa Kayu Raja IDR ... /malam");
                        System.out.println("4. Nikhila Seminyak IDR ... /malam");
                        System.out.println("5. Pandawa All Suite Hotel IDR ... /malam");
                    } else if (katalogCustomer.equals("b")) {
                        System.out.println("TRANSPORTASI DI BALI");
                        System.out.println("1. Pesawat");
                        System.out.println("2. Kapal Laut");
                        System.out.println("3. Bus");
                        System.out.println("4. Shuttle");
                        System.out.print("Jenis transportasi: ");
                        int transportasiCustomer = sc.nextInt();
                        sc.nextLine(); 

                        if (transportasiCustomer == 1) {
                            System.out.println("[PESAWAT] Jakarta - Bali = IDR 1.539.748.");
                        }
                    }
                }
            } else if (pilihanCustomer == 2) {
                System.out.println("Booking Paket Wisata");
                System.out.println("-------------------------------");
                System.out.print("Masukkan nama paket (contoh: Bali Adventure): ");
                String paket = sc.nextLine();
                System.out.print("Masukkan tanggal keberangkatan (DD/MM/YYYY): ");
                String tanggal = sc.nextLine();
                System.out.print("Masukkan jumlah orang: ");
                int jumlahOrang = sc.nextInt();
                sc.nextLine(); // Konsumsi newline
                System.out.println("Booking berhasil untuk paket '" + paket + "' pada " + tanggal + " untuk " + jumlahOrang + " orang.");
                System.out.println("ID Booking: BK" + (int)(Math.random() * 10000)); 
            } else if (pilihanCustomer == 3) {
                // Cek Status Booking
                System.out.println("Cek Status Booking");
                System.out.println("-------------------------------");
                System.out.print("Masukkan ID Booking: ");
                String idBooking = sc.nextLine();
                System.out.println("Status untuk ID " + idBooking + ": Dikonfirmasi. (Ini simulasi; dalam aplikasi nyata, ini akan dicek dari database.)");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } else if (pilihan == 3) {
            System.out.println("Mitra");
            System.out.println("Fitur untuk Mitra belum diimplementasikan.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        sc.close();
    }
}
