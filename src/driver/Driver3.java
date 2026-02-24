import java.util.*;

public class Driver3 {

    public static void main(String[] args) {

        Queue<String> antrian = new LinkedList<>();
        List<String> komplain = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n1.Tambah  2.Proses  3.Lihat Antrian  4.Tambah Komplain  5.Lihat Komplain  0.Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    antrian.add(sc.nextLine());
                    break;

                case 2:
                    if (!antrian.isEmpty())
                        System.out.println("Diproses: " + antrian.poll());
                    else
                        System.out.println("Antrian kosong");
                    break;

                case 3:
                    System.out.println("Antrian: " + antrian);
                    break;

                case 4:
                    System.out.print("Isi komplain: ");
                    komplain.add(sc.nextLine());
                    System.out.println("Komplain disimpan");
                    break;

                case 5:
                    if (komplain.isEmpty()) {
                        System.out.println("Belum ada komplain");
                    } else {
                        System.out.println("Daftar Komplain:");
                        for (String k : komplain) {
                            System.out.println("- " + k);
                        }
                    }
                    break;
            }

        } while (pilih != 0);

        System.out.println("Program selesai");
    }
}
