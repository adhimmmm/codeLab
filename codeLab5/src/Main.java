import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while (true) {
            System.out.print("Masukkan nama ke-" + i + ": ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                try {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            mahasiswaList.add(input);
            i++;
        }

        System.out.println("Daftar mahasiswa yang diinputkan:");
        for (String nama : mahasiswaList) {
            System.out.println("- " + nama);
        }
    }
}