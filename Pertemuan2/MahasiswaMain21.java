
public class MahasiswaMain21 {
    public static void main(String[] args) {
        Mahasiswa21 mhs1 = new Mahasiswa21();

        mhs1.Nama = "Muhammad Ali Farhan";
        mhs1.Nim = "2241720171";
        mhs1.Kelas = "SI 2J";
        mhs1.Ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa21 mh2 = new Mahasiswa21("Annisa Nabila","2141720160",3.25,"TI 2L");
        mh2.updateIpk(3.30);
        mh2.tampilkanInformasi();

        Mahasiswa21 mhsAkbar = new Mahasiswa21("Akbar Raffi","254107020235",3.50,"TI 1F");
        mhsAkbar.tampilkanInformasi();
    }
}