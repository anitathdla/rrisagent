import java.util.Scanner;

public class rrrriiiiisssssbeneran {
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
        
        if (pilihan == 1) {
            System.out.println("Admin");
            String namaadmin = sc.nextLine();
            System.out.println("Halo "+namaadmin+ "! Have a nice day.");
            System.out.println("-----------------------------------");
            System.out.println("1. Cek Katalog hari ini.");
            System.out.println("2. Data pelanggan hari ini.");
            System.out.println("3. Review (Kritik dan Saran).");
            System.out.println();
            System.out.print("Pilihan Anda: ");
            int jenis = sc.nextInt();
            sc.nextLine();
        }

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
            }
            
                if (wilayah == 1) {
                    System.out.println("Bali, Indonesia.");
                    System.out.println("a. Hotel");
                    System.out.println("b. Transportasi");
                    System.out.println("c. Data Pelanggan");
                    System.out.println("d. Review");
                    System.out.print("Jenis katalog: ");
                    String katalogbali = sc.nextLine();
                

                    if (katalogbali.equalsIgnoreCase("a")) {
                        System.out.println("HOTEL DI BALI.");
                        System.out.println("1. Nirwana Beach and Resort IDR ... /malam");
                        System.out.println("2. Tonys Villas and Resort IDR ... /malam");
                        System.out.println("3. Villa Kayu Raja IDR ... /malam");
                        System.out.println("4. Nikhila Seminyak IDR ... /malam");
                        System.out.println("5. Pandawa All Suite Hotel IDR ... /malam");
                    } else if (katalogbali.equalsIgnoreCase("b")) {
                        System.out.println("TRANSPORTASI DI BALI");
                        System.out.println("1. Pesawat");
                        System.out.println("2. Kapal Laut");
                        System.out.println("3. Bus");
                        System.out.println("4. Shuttle");
                        System.out.print("Jenis transportasi: ");
                        int transportasibali = sc.nextInt();
                        
                        if (transportasibali == 1) {
                            System.out.println("[PESAWAT] Jakarta - Bali = IDR 1.539.748.");
                        } else if (transportasibali == 2) {
                            System.out.println("[KAPAL LAUT] Jakarta - Bali = IDR 850.000.");
                        } else if (transportasibali == 3) {
                            System.out.println("[BUS] Jakarta - Bali = IDR 600.000.");
                        } else if (transportasibali == 4) {
                            System.out.println("[SHUTTLE] Jakarta - Bali = IDR 750.000.");
                        } else {
                            System.out.println("Pilihan tidak tersedia.");
                        }
                    } else if (katalogbali.equalsIgnoreCase("c")) {
                        System.out.println("DATA PELANGGAN BALI");
                        System.out.println("1. Nama: ...");
                        System.out.println("2. Alamat: ...");
                        System.out.println("3. No. Telepon: ...");
                        System.out.println("4. Email: ...");

                    } else if (katalogbali.equalsIgnoreCase("d")) {
                        System.out.println("REVIEW BALI");
                        System.out.println("1. Pelayanan sangat baik.");
                        System.out.println("2. Tempatnya sangat indah.");
                        System.out.println("3. Harga terjangkau.");

                    } else {
                        System.out.println("Pilihan katalog tidak tersedia.");
                    }
                    
                } else if (wilayah == 2) {
                    System.out.println("Lombok, Indonesia.");
                    System.out.println("a. Hotel");
                    System.out.println("b. Transportasi");
                    System.out.println("c. Data Pelanggan");
                    System.out.println("d. Review");
                    System.out.print("Jenis katalog: ");
                    String kataloglombok = sc.nextLine();
                    if (kataloglombok.equalsIgnoreCase("a")) {
                        System.out.println("HOTEL DI LOMBOK.");
                        System.out.println("1. The Oberoi Lombok IDR ... /malam");
                        System.out.println("2. Qunci Villas IDR ... /malam");
                        System.out.println("3. Jeeva Klui Resort IDR ... /malam");
                        System.out.println("4. Katamaran Hotel & Resort IDR ... /malam");
                        System.out.println("5. Novotel Lombok IDR ... /malam");
                    } else if (kataloglombok.equalsIgnoreCase("b")) {
                        System.out.println("TRANSPORTASI DI LOMBOK");
                        System.out.println("1. Pesawat");
                        System.out.println("2. Kapal Laut");
                        System.out.println("3. Bus");
                        System.out.println("4. Shuttle");
                        System.out.print("Jenis transportasi: ");
                        int transportasilombok = sc.nextInt();
                        
                        if (transportasilombok == 1) {
                            System.out.println("[PESAWAT] Jakarta - Lombok = IDR 1.200.000.");
                        } else if (transportasilombok == 2) {
                            System.out.println("[KAPAL LAUT] Jakarta - Lombok = IDR 900.000.");
                        } else if (transportasilombok == 3) {
                            System.out.println("[BUS] Jakarta - Lombok = IDR 650.000.");
                        } else if (transportasilombok == 4) {
                            System.out.println("[SHUTTLE] Jakarta - Lombok = IDR 800.000.");
                        } else {
                            System.out.println("Pilihan tidak tersedia.");
                        }
                    } else if (kataloglombok.equalsIgnoreCase("c")) {
                        System.out.println("DATA PELANGGAN LOMBOK");
                        System.out.println("1. Nama: ...");
                        System.out.println("2. Alamat: ...");
                        System.out.println("3. No. Telepon: ...");
                        System.out.println("4. Email: ...");

                    } else if (kataloglombok.equalsIgnoreCase("d")) {
                        System.out.println("REVIEW LOMBOK");
                        System.out.println("1. Pantainya sangat indah.");
                        System.out.println("2. Pelayanan ramah.");
                        System.out.println("3. Harga bersahabat.");
                    } else {
                        System.out.println("Pilihan katalog tidak tersedia.");
                        
                    }
                } else if (wilayah == 3) {
                    System.out.println("Jogjakarta, Indonesia.");
                    System.out.println("a. Hotel");
                    System.out.println("b. Transportasi");
                    System.out.println("c. Data Pelanggan");
                    System.out.println("d. Review");
                    System.out.print("Jenis katalog: ");
                    String katalogjogja = sc.nextLine();
                    if (katalogjogja.equalsIgnoreCase("a")) {
                }
                }
            }
            

        
            }
            
                
                

                
                    
                        

                        
                        
                        
                            
                            
                           
                        
                       
