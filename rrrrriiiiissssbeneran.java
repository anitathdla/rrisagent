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
            }
            
                if (wilayah == 1) {
                    System.out.println("Bali, Indonesia.");
                    System.out.println("a. Hotel");
                    System.out.println("b. Transportasi");
                    System.out.println("c. Data Pelanggan");
                    System.out.println("d. Review");
                    System.out.print("Jenis katalog: ");
                    String katalogbali = sc.nextLine();
                }

                    if (katalogbali == "a") {
                        System.out.println("HOTEL DI BALI.");
                        System.out.println("1. Nirwana Beach and Resort IDR ... /malam");
                        System.out.println("2. Tonys Villas and Resort IDR ... /malam");
                        System.out.println("3. Villa Kayu Raja IDR ... /malam");
                        System.out.println("4. Nikhila Seminyak IDR ... /malam");
                        System.out.println("5. Pandawa All Suite Hotel IDR ... /malam");
                    }
                    else if (katalogbali == "b") {
                        System.out.println("TRANSPORTASI DI BALI");
                        System.out.println("1. Pesawat");
                        System.out.println("2. Kapal Laut");
                        System.out.println("3. Bus");
                        System.out.println("4. Shuttle");
                        int transportasibali = sc.nextInt();
                        System.out.print("Jenis transportasi: ");
                    }
                        
                        if (transportasibali == 1) {
                            System.out.println("[PESAWAT] Jakarta - Bali = IDR 1.539.748.");
                        }
                    }
                }                
                
                

                
                    
                        

                        
                        
                        
                            
                            
                           
                        
                       
