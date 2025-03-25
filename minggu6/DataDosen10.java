package minggu6;
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
}
