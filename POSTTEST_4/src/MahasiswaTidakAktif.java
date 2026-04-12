public class MahasiswaTidakAktif extends Mahasiswa {

    public MahasiswaTidakAktif(String nim, String nama, String status) {
        super(nim, nama, status);
    }

    @Override
    public void tampilData() {
        System.out.println("=== MAHASISWA TIDAK AKTIF ===");
        super.tampilData();
    }
}