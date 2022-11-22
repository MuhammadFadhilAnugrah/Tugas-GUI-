package GUI;

public class Peserta {
    private String nama;
    private String kupon;

    public Peserta() {
    }

    public Peserta(String nama, String kupon) {
        this.nama = nama;
        this.kupon = kupon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKupon(String kupon) {
        return this.kupon;
    }

    public void setKupon(String kupon) {
        this.kupon = kupon;
    }

    @Override
    public String toString() {
        return "Peserta{" +
                "nama='" + nama + '\'' +
                ", kupon='" + kupon + '\'' +
                '}';
    }
}
