package Praktikum05;
class DataDosen10 {
    Dosen10[] dataDosen = new Dosen10[10]; // Maksimal 10 data dosen
    int idx = 0;

    // Menambahkan dosen ke dalam array
    public void tambah(Dosen10 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    // Menampilkan semua data dosen
    public void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen!");
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Bubble Sort (Ascending) berdasarkan usia (termuda ke tertua)
    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    // Swap
                    Dosen10 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data telah diurutkan secara ASC (termuda ke tertua).");
    }

    // Selection Sort (Descending) berdasarkan usia (tertua ke termuda)
    public void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            // Swap
            Dosen10 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data telah diurutkan secara DSC (tertua ke termuda).");
    }
}