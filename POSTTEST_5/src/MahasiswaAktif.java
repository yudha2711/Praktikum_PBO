public class MahasiswaAktif extends Mahasiswa implements Presensi {

    public MahasiswaAktif(String nim, String nama, String status) {
        super(nim, nama, status);
    }

    @Override
    public void tampilData() {
        System.out.println("=== MAHASISWA AKTIF ===");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Status: " + status);
        System.out.println("-----------------------");
    }

    @Override
    public void cekStatus() {
        System.out.println("Mahasiswa hadir di kelas");
    }

    @Override
    public void keterangan() {
        System.out.println("Status aktif mengikuti perkuliahan");
    }
}