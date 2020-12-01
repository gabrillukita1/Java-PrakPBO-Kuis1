
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String menu, menu2;
      
            //Menu Awal
            System.out.println("FORM PENDAFTARAN PT. UDIN");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("\nPilih menu: ");
            menu = scanner.nextLine();

            switch(menu) {
                //menu utama ke-1
                case "1":
                    //Input Data
                    System.out.print("\nInput NIK\t: ");
                    String NIK = scanner.nextLine();
                    System.out.print("Input Nama\t: ");
                    String Nama = scanner.nextLine();
                    System.out.print("Input Nilai tes Tulis     : ");
                    double Nilai_Tulis = scanner.nextDouble();
                    System.out.print("Input Nilai tes Coding    : ");
                    double Nilai_Coding = scanner.nextDouble();
                    System.out.print("Input Nilai tes Wawancara : ");
                    double Nilai_Wawancara = scanner.nextDouble();
                    scanner.nextLine();

                    //pembentukan objek
                    Divisi_Android divisi_android = new Divisi_Android(Nama, NIK, Nilai_Tulis, Nilai_Coding, Nilai_Wawancara);
                    
                    do {
                        System.out.println("Menu");
                        System.out.println("1. Edit");
                        System.out.println("2. Tampil");
                        System.out.println("3. Exit");
                        System.out.print("Pilih: ");
                        menu2 = scanner.nextLine();
                        
                        switch (menu2) {
                            case "1":
                                //edit Data
                                System.out.print("\nInput NIK\t: ");
                                NIK = scanner.nextLine();
                                System.out.print("Input Nama\t: ");
                                Nama = scanner.nextLine();
                                System.out.print("Input Nilai tes Tulis     : ");
                                Nilai_Tulis = scanner.nextDouble();
                                System.out.print("Input Nilai tes Coding    : ");
                                Nilai_Coding = scanner.nextDouble();
                                System.out.print("Input Nilai tes Wawancara : ");
                                Nilai_Wawancara = scanner.nextDouble();
                                scanner.nextLine();
                                //pembentukan objek
                                divisi_android = new Divisi_Android(Nama, NIK, Nilai_Tulis, Nilai_Coding, Nilai_Wawancara);
                                break;

                            case "2":
                                divisi_android.Hasil_Seleksi();
                                break;
                            case "3":
                                break;
                        }
                  
                    } while (!"3".equals(menu2));
                    break;

                //menu utama ke-2
                case "2":
                    //Input Data
                    System.out.print("\nInput NIK\t: ");
                    NIK = scanner.nextLine();
                    System.out.print("Input Nama\t: ");
                    Nama = scanner.nextLine();
                    System.out.print("Input Nilai tes Tulis     : ");
                    Nilai_Tulis = scanner.nextDouble();
                    System.out.print("Input Nilai tes Coding    : ");
                    Nilai_Coding = scanner.nextDouble();
                    System.out.print("Input Nilai tes Wawancara : ");
                    Nilai_Wawancara = scanner.nextDouble();
                    scanner.nextLine();

                    //pembentukan objek
                    Divisi_Web divisi_web = new Divisi_Web(Nama, NIK, Nilai_Tulis, Nilai_Coding, Nilai_Wawancara);

                    do {
                        //menu 2
                        System.out.println("Menu");
                        System.out.println("1. Edit");
                        System.out.println("2. Tampil");
                        System.out.println("3. Exit");
                        System.out.print("Pilih: ");
                        menu2 = scanner.nextLine();
                        
                        switch (menu2) {
                            case "1":
                                //Input Data
                                System.out.print("\nInput NIK\t: ");
                                NIK = scanner.nextLine();
                                System.out.print("Input Nama\t: ");
                                Nama = scanner.nextLine();
                                System.out.print("Input Nilai tes Tulis     : ");
                                Nilai_Tulis = scanner.nextDouble();
                                System.out.print("Input Nilai tes Coding    : ");
                                Nilai_Coding = scanner.nextDouble();
                                System.out.print("Input Nilai tes Wawancara : ");
                                Nilai_Wawancara = scanner.nextDouble();
                                scanner.nextLine();

                                //pembentukan objek
                                divisi_web = new Divisi_Web(Nama, NIK, Nilai_Tulis, Nilai_Coding, Nilai_Wawancara);
                                break;

                            case "2":
                                divisi_web.Hasil_Seleksi();
                                break;
                            case "3":
                                break;
                        }
                    } while (!"3".equals(menu2));
                    break;
                    
                case "3":
                    System.exit(0);
                    break;
            }
       
    }
}
