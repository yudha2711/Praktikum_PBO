public abstract class Mahasiswa {

    protected String nim;
    protected String nama;
    protected String status;

    public Mahasiswa(String nim, String nama, String status) {
        this.nim = nim;
        this.nama = nama;
        this.status = status;
    }

     public abstract void tampilData();

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}