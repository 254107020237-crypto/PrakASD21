public class Mahasiswa21 {

    String Nama;
    String Nim;
    String Kelas;
    double Ipk;

    public Mahasiswa21(){
    }
    public Mahasiswa21(String name, String nim, double ipk, String kls){
        Nama = name;
        this.Nim = nim;
        this.Ipk = ipk;
        Kelas = kls;
    }
    void tampilkanInformasi() {
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + Nim);
        System.out.println("IPK: " + Ipk);
        System.out.println("Kelas: " + Kelas);
        System.out.println("----------------------");
    }
    void ubahKelas(String KelasBaru){
        Kelas = KelasBaru;
    }
    void updateIpk(double ipkBaru){
        if (ipkBaru <= 4.0 && ipkBaru >= 0.0) {
            Ipk = ipkBaru;
        } else {
            System.out.println("IPK Tidak Valid. Harus Antara 0.0 Dan 4.0");
        }
    }
    String nilaiKinerja(double Ipk){
        if (Ipk >= 3.5 ) {
            return "Kinerja Sangat Baik";
        } else if (Ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (Ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
    public static void main(String[] args) {

        Mahasiswa21 mhs1 = new Mahasiswa21(
            "Muhammad Ali Farhan",
            "2241720171",
            3.55,
            "SI 2J"
        );

        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);

        mhs1.tampilkanInformasi();

        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja(mhs1.Ipk));
    }
}