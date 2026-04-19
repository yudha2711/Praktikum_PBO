public class MahasiswaTidakAktif extends Mahasiswa implements Presensi {

    public MahasiswaTidakAktif(String nim, String nama, String status) {
        super(nim, nama, status);
    }

    @Override
    public void tampilData() {
        System.out.println("=== MAHASISWA TIDAK AKTIF ===");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Status: " + status);
        System.out.println("-----------------------");
    }

    @Override
    public void cekStatus() {
        System.out.println("Mahasiswa tidak hadir");
    }

    @Override
    public void keterangan() {
        System.out.println("Status tidak aktif / izin / alpha");
    }
}