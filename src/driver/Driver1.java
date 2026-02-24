import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String kode;
        int porsiButet;
        int harga = 0;
        int total = 0;
        double diskon = 0;
        double potongan;
        double totalAkhir;

        System.out.println("=== WARUNG MAK ROBY ===");

        while (true) {

            System.out.print("\nMasukkan Kode Menu: ");
            kode = input.next().toUpperCase();

            if (kode.equals("END")) {
                break;
            }

            System.out.print("Masukkan Porsi Butet: ");
            porsiButet = input.nextInt();

            // menentukan harga berdasarkan kode
            if (kode.equals("NGS")) harga = 15000;
            else if (kode.equals("AP")) harga = 20000;
            else if (kode.equals("SA")) harga = 25000;
            else if (kode.equals("BU")) harga = 18000;
            else if (kode.equals("MAP")) harga = 15000;
            else if (kode.equals("GG")) harga = 15000;
            else if (kode.equals("SAM")) harga = 17000;
            else if (kode.equals("RD")) harga = 35000;
            else if (kode.equals("IB")) harga = 35000;
            else if (kode.equals("NUK")) harga = 20000;
            else {
                System.out.println("Kode tidak ditemukan!");
                continue;
            }

            // porsi ucok = 2 x porsi butet
            int porsiUcok = 2 * porsiButet;

            // total porsi gabungan
            int totalPorsi = porsiButet + porsiUcok;

            // hitung total harga
            total += harga * totalPorsi;
        }

        // menentukan diskon berdasarkan total belanja
        if (total >= 500000) diskon = 0.25;
        else if (total >= 400000) diskon = 0.20;
        else if (total >= 300000) diskon = 0.15;
        else if (total >= 200000) diskon = 0.10;
        else if (total >= 100000) diskon = 0.05;

        potongan = total * diskon;
        totalAkhir = total - potongan;

        System.out.println("\n====== STRUK ======");
        System.out.println("Total Belanja : Rp " + total);
        System.out.println("Diskon        : " + (int)(diskon * 100) + "%");
        System.out.println("Potongan      : Rp " + (int)potongan);
        System.out.println("Total Bayar   : Rp " + (int)totalAkhir);
        System.out.println("===================");

        input.close();
    }
}
