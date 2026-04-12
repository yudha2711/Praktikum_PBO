public class Mahasiswa {

    private String nim;
    private String nama;
    private String status;

    Mahasiswa(String nim, String nama, String status) {
        this.nim = nim;
        this.nama = nama;
        this.status = status;
    }

    // OVERLOADING (constructor tambahan)
    Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.status = "Hadir"; // default
    }

    // GETTER
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    // SETTER
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // OVERLOADING METHOD
    public void tampilData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Status: " + status);
        System.out.println("-----------------------");
    }

    public void tampilData(boolean detail) {
        if (detail) {
            System.out.println("[DETAIL MAHASISWA]");
        }
        tampilData();
    }
}