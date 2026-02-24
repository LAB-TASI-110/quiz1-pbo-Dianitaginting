import java.util.Scanner;

public class Driver2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input jumlah data
        int N = input.nextInt();

        // 2. Input deret nilai
        int[] nilai = new int[N];
        for (int i = 0; i < N; i++) {
            nilai[i] = input.nextInt();
        }

        // 3. Input kode kelompok
        int k = input.nextInt();

        // Hitung indeks awal kelompok ke-k
        int startIndex = (k - 1) * k / 2;
        int endIndex = startIndex + k - 1;

        // Jika kelompok tidak ada
        if (startIndex >= N) {
            System.out.println(0);
            return;
        }

        // Jika melewati batas data
        if (endIndex >= N) {
            endIndex = N - 1;
        }

        // Hitung total nilai kelompok
        int total = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            total += nilai[i];
        }

        // Output hasil
        System.out.println(total);
    }
}
