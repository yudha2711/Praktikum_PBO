import java.util.ArrayList;
import java.util.Scanner;

public class SistemPresensiMahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> data = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM PRESENSI MAHASISWA ===");
            System.out.println("1. Tambah Presensi");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Presensi");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();

                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Status (Hadir/Izin/Alpha): ");
                    String status = input.nextLine();

                    data.add(new Mahasiswa(nim, nama, status));
                    System.out.println("Data berhasil ditambahkan");
                    break;

                case 2:
                    if (data.isEmpty()) {
                        System.out.println("Data masih kosong");
                    } else {
                        for (Mahasiswa m : data) {
                            m.tampilData();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang ingin diupdate: ");
                    String nimUpdate = input.nextLine();

                    boolean ditemukan = false;

                    for (Mahasiswa m : data) {
                        if (m.getNim().equals(nimUpdate)) {

                            System.out.print("Nama baru: ");
                            m.setNama(input.nextLine());

                            System.out.print("Status baru: ");
                            m.setStatus(input.nextLine());

                            System.out.println("Data berhasil diupdate");
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan NIM yang ingin dihapus: ");
                    String nimHapus = input.nextLine();

                    boolean hapus = data.removeIf(m -> m.getNim().equals(nimHapus));
                    if (hapus) {
                        System.out.println("Data berhasil dihapus");
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilihan != 5);

        input.close();
    }
}