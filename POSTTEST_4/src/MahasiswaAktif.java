public class MahasiswaAktif extends Mahasiswa {

    public MahasiswaAktif(String nim, String nama, String status) {
        super(nim, nama, status);
    }

    @Override
    public void tampilData() {
        System.out.println("=== MAHASISWA AKTIF ===");
        super.tampilData();
    }
}