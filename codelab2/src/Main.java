import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas ABC");
    }
}

public class Main {
    public static void main(String[] args) {
        boolean exit = true;

        switch (exit) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input Data Mahasiswa");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            while (nim.length() != 15) {
                System.out.println("Panjang NIM harus 15 angka. Silakan masukkan kembali.");
                System.out.print("NIM: ");
                nim = scanner.nextLine();
            }

            System.out.print("Jurusan: ");
            String jurusan = scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);

            System.out.println("\nData Mahasiswa:");
            mahasiswa.tampilDataMahasiswa();

            System.out.println("\nInformasi Universitas:");
            Mahasiswa.tampilUniversitas();
        }
    }
}
