public class Mahasiswa {
    String nim;
    String nama;
    String status;

    // constructor
    Mahasiswa(String nim, String nama, String status) {
        this.nim = nim;
        this.nama = nama;
        this.status = status;
    }

    void tampilData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Status: " + status);
        System.out.println("-----------------------");
    }
}