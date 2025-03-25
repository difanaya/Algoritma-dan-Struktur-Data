package minggu7;
public class DataDosen10 {
    Dosen10[] dataDosen = new Dosen10[10];
    int idx = 0;

    public void tambah(Dosen10 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("--------------------");
        }
    }

    public void SortingASC() {
        for (int i=0; i<idx-1; i++) {
            for (int j=0; j<idx-i-1; j++) {
                if (dataDosen[j].usia > dataDosen[j+1].usia) {
                    Dosen10 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j+1] = temp;
                }
            }
        }
    }

    public void sortingDSC() {
        for (int i=0; i<idx-1; i++) {
            int maxIdx = i;
            for (int j=i+1; j<idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen10 temp = dataDosen[i];
            dataDosen[i] = dataDosen[maxIdx];
            dataDosen[maxIdx] = temp;
        }
    }

    public void insertionSort() {
        for (int i=1; i<idx; i++) {
            Dosen10 temp = dataDosen[i];
            int j = i-1;
            while (j>=0 && dataDosen[j].usia<temp.usia) {
                dataDosen[j+1] = dataDosen[j];
                j--;
            }
            dataDosen[j+1] = temp;
        }
    }

    public void pencarianDataSequential(String nama) {
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                jumlahDitemukan++;
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan!");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Terdapat " + jumlahDitemukan + " dosen dengan nama \"" + nama + "\"!");
        }
    }

    public void pencarianDataBinary(int usia) {
        SortingASC(); 
        int left = 0, right = idx - 1;
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == usia) {
                System.out.println("Data dosen ditemukan dengan usia: " + usia);
                dataDosen[mid].tampil();
                jumlahDitemukan++;
                ditemukan = true;
    
                int i = mid - 1;
                while (i >= 0 && dataDosen[i].usia == usia) {
                    dataDosen[i].tampil();
                    jumlahDitemukan++;
                    i--;
                }
    
                int j = mid + 1;
                while (j < idx && dataDosen[j].usia == usia) {
                    dataDosen[j].tampil();
                    jumlahDitemukan++;
                    j++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ditemukan dosen dengan usia " + usia);
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Ditemukan " + jumlahDitemukan + " dosen dengan usia " + usia + "!");
        }
    }
}
