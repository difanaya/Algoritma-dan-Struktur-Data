package minggu8;
//Difa Naya Sari Pasha
public class Penilaian { 
   
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas; 
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian (){ 
    } 

    Penilaian (Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilaiTugas, double nilaiUts, double nilaiUas){ //kons. berparameter
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUts;
        this.nilaiUAS = nilaiUas;
    }

    //method
    public double hitungNilaiAkhir() {
        return (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }
}