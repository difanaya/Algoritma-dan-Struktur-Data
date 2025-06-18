package uas;

public class latihan {
    //====================================
    //Brute Force dan Divide and Conquer
    //====================================

    // int pangkatBF(int a, int n) {
    //     int hasil = 1;
    //     for (int i = 0; i < n; i++) {
    //         hasil *= a;
    //     }
    //     return hasil;
    // }

    // int pangkatDC(int a, int n) {
    //     if (n == 0) {
    //         return 1;
    //     } else {
    //         if (n % 2 == 1) {
    //             return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
    //         } else {
    //             return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
    //         }
    //     }
    // }

    // double totalBF() {
    //     double total = 0;
    //     for (int i = 0; i < keuntungan.length; i++) {
    //         total = total + keuntungan[i];
    //     }
    //     return total;
    // }

    // double totalDC(double arr[], int l, int r) {
    //     if (l == r) {
    //         return arr[l];
    //     } 
            
    //     int mid = (l + r) / 2;
    //     double lsum = totalDC(arr, l, mid);
    //     double rsum = totalDC(arr, mid + 1, r);
    //     return lsum + rsum;
    // }

    // public int maxUTS(int left, int right) {
    //     if (left == right) {
    //         return uts[left]; 
    //     }
    //     int mid = (left + right) / 2;
    //     int leftMax = maxUTS(left, mid);
    //     int rightMax = maxUTS(mid + 1, right);
    //     return Math.max(leftMax, rightMax);
    // }

    // public String MahasiswaMax() {
    //     int max = maxUTS(0, uts.length - 1);
    //     for (int i = 0; i < uts.length; i++) {
    //         if (uts[i] == max) {
    //             return nama[i];
    //         }
    //     }
    //     return null;
    // }

    // public int minUTS(int left, int right) {
    //     if (left == right) {
    //         return uts[left]; 
    //     }
    //     int mid = (left + right) / 2;
    //     int leftMin = minUTS(left, mid);
    //     int rightMin = minUTS(mid + 1, right);
    //     return Math.min(leftMin, rightMin);
    // }

    // public String MahasiswaMin() {
    //     int min = minUTS(0, uts.length - 1);
    //     for (int i = 0; i < uts.length; i++) {
    //         if (uts[i] == min) {
    //             return nama[i];
    //         }
    //     }
    //     return null;
    // }

    // int faktorialBF(int n) {
    //     int fakto = 1;
    //     for (int i = 1; i <= n; i++) {
    //         fakto = fakto * i;
    //     }
    //     return fakto;
    // }

    // int faktorialDC(int n) {
    //     if (n == 1) {
    //         return 1;
    //     } else {
    //         int fakto = n * faktorialDC(n - 1);
    //         return fakto;
    //     }
    // }

    //=============================================
    //Bubble Sort, Selection Sort, Insertion Sort
    //=============================================

    // Sorting10 (int Data[], int jmlDat) {
    //     jumData = jmlDat;
    //     data = new int[jmlDat];
    //     for (int i = 0; i < jumData; i++) {
    //     data[i] = Data[i];
    //     }
    // }

    // void bubbleSort() {
    //     int temp = 0;
    //     for (int i = 0; i < jumData - 1; i++) {
    //         for (int j = 1; j < jumData - i; j++) {
    //             if (data[j - 1] > data[j]) {
    //                 temp = data[j];
    //                 data[j] = data[j - 1];
    //                 data[j - 1] = temp;
    //             }
    //         }
    //     }
    // }

    // void tampil() {
    //     for (int i = 0; i < jumData; i++) {
    //         System.out.print(data[i] + " ");
    //     }
    //     System.out.println();
    // }

    // void SelectionSort() {
    //     for (int i = 0; i < jumData - 1; i++) {
    //         int min = i;
    //         for (int j = i + 1; j < jumData; j++) {
    //             if (data[j] < data[min]) {
    //                 min = j;
    //             }
    //         }
    //         int temp = data[i];
    //         data[i] = data[min];
    //         data[min] = temp;
    //     }
    // }

    // void insertionSort() {
    //     for (int i = 1; i <= data.length - 1; i++) {
    //         int temp = data[i];
    //         int j = i - 1;
    //         while (j >= 0 && data[j] > temp) {
    //             data[j + 1] = data[j];
    //             j--;
    //         }
    //         data[j + 1] = temp;
    //     }
    // }

    //=====================================
    //Sequential Search dan Binary Search
    //=====================================

    // public void pencarianDataSequential(String nama) {
    //     boolean ditemukan = false;
    //     int jumlahDitemukan = 0;
    //     for (int i = 0; i < idx; i++) {
    //         if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
    //             dataDosen[i].tampil();
    //             jumlahDitemukan++;
    //             ditemukan = true;
    //         }
    //     }
    //     if (!ditemukan) {
    //         System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan!");
    //     } else if (jumlahDitemukan > 1) {
    //         System.out.println("Peringatan: Terdapat " + jumlahDitemukan + " dosen dengan nama \"" + nama + "\"!");
    //     }
    // }

    // public void pencarianDataBinary(int usia) {
    //     SortingASC(); 
    //     int left = 0, right = idx - 1;
    //     boolean ditemukan = false;
    //     int jumlahDitemukan = 0;
    //     while (left <= right) {
    //         int mid = (left + right) / 2;
    //         if (dataDosen[mid].usia == usia) {
    //             System.out.println("Data dosen ditemukan dengan usia: " + usia);
    //             dataDosen[mid].tampil();
    //             jumlahDitemukan++;
    //             ditemukan = true;
    
    //             int i = mid - 1;
    //             while (i >= 0 && dataDosen[i].usia == usia) {
    //                 dataDosen[i].tampil();
    //                 jumlahDitemukan++;
    //                 i--;
    //             }
    
    //             int j = mid + 1;
    //             while (j < idx && dataDosen[j].usia == usia) {
    //                 dataDosen[j].tampil();
    //                 jumlahDitemukan++;
    //                 j++;
    //             }
    //             break;
    //         } else if (dataDosen[mid].usia < usia) {
    //             left = mid + 1;
    //         } else {
    //             right = mid - 1;
    //         }
    //     }

    //     if (!ditemukan) {
    //         System.out.println("Tidak ditemukan dosen dengan usia " + usia);
    //     } else if (jumlahDitemukan > 1) {
    //         System.out.println("Peringatan: Ditemukan " + jumlahDitemukan + " dosen dengan usia " + usia + "!");
    //     }
    // }

    // int sequentialSearching(double cari) {
    //     int posisi = -1;
    //     for (int j = 0; j < listMhs.length; j++) {
    //         if (listMhs[j].ipk == cari) {
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

    // int findBinarySearch(double cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (left + right) / 2;
    //         if (cari == listMhs[mid].ipk) {
    //             return (mid);
    //         }
    //         else if (listMhs[mid].ipk < cari) {
    //             return findBinarySearch(cari, left, mid - 1);
    //         }
    //         else {
    //             return findBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }

    //====================================
    //Stack
    //====================================

    // public StackSurat10(int kapasitas) {
    //     stack = new Surat10[kapasitas];
    //     top = -1;
    // }

    // public boolean isEmpty() {
    //     return top == -1;
    // }

    // public boolean isFull() {
    //     return top == stack.length - 1;
    // }

    // public void push(Surat10 surat) {
    //     if (!isFull()) {
    //         stack[++top] = surat;
    //     } else {
    //         System.out.println("Stack penuh! Tidak dapat menerima surat baru.");
    //     }
    // }

    // public Surat10 pop() {
    //     if (!isEmpty()) {
    //         return stack[top--];
    //     } else {
    //         System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
    //         return null;
    //     }
    // }

    // public Surat10 peek() {
    //     if (!isEmpty()) {
    //         return stack[top];
    //     } else {
    //         System.out.println("Stack kosong! Tidak ada surat terakhir.");
    //         return null;
    //     }
    // }

    // public boolean cariSurat(String namaMahasiswa) {
    //     for (int i = 0; i <= top; i++) {
    //         if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    //====================================
    //Queue
    //====================================

    // public Queue10(int n) {
    //     max = n;
    //     data = new int[max];
    //     size = 0;
    //     front = rear = -1;
    // }
    
    // public boolean IsEmpty() {
    //     if (size == 0) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // public boolean IsFull() {
    //     if (size == max) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // public void peek() {
    //     if (!IsEmpty()) {
    //         System.out.println("Elemen terdepan: " + data[front]);
    //     } else {
    //         System.out.println("Queue masih kosong");
    //     }
    // }

    // public void print() {
    //     if (IsEmpty()) {
    //         System.out.println("Queue masih kosong");
    //     } else {
    //         int i = front;
    //         while (i != rear) {
    //             System.out.print(data[i] + " ");
    //             i = (i + 1) % max;
    //         }
    //         System.out.println(data[i] + " ");
    //         System.out.println("Jumlah elemen = " + size);
    //     }
    // }

    // public void clear() {
    //     if (!IsEmpty()) {
    //         front = rear = -1;
    //         size = 0;
    //         System.out.println("Queue berhasil dikosongkan");
    //     } else {
    //         System.out.println("Queue masih kosong");
    //     }
    // }

    // public void Enqueue(int dt) {
    //     if (IsFull()) {
    //         System.out.println("Queue sudah penuh");
    //         System.exit(1);
    //     } else {
    //         if (IsEmpty()) {
    //             front = rear = 0;
    //         } else {
    //             if (rear == max - 1) {
    //                 rear = 0;
    //             } else {
    //                 rear++;
    //             }
    //         }
    //         data[rear] = dt;
    //         size++;
    //     }
    // }

    // public int Dequeue() {
    //     int dt = 0;
    //     if (IsEmpty()) {
    //         System.out.println("Queue masih kosong");
    //         System.exit(1);
    //     } else {
    //         dt = data[front];
    //         size--;
    //         if (IsEmpty()) {
    //             front = rear = -1;
    //         } else {
    //             if (front == max -1) {
    //                 front = 0;
    //             } else {
    //                 front++;
    //             }
    //         }
    //     }
    //     return dt;
    // }

    //====================================
    //Queue Linked List
    //====================================

    // public QueueLinkedList10() {
    //     front = null;
    //     rear = null;
    //     size = 0;
    // }

    // public boolean isEmpty() {
    //     return front == null;
    // }

    // public boolean isFull() {
    //     return size == max;
    // }

    // public void enqueue(MahasiswaTugas10 mhs) {
    //     if (isFull()) {
    //         System.out.println("Antrian sudah penuh!, tidak bisa menambah Mahasiswa baru.");
    //         return;
    //     }

    //     NodeTugas10 newNode = new NodeTugas10(mhs, null);
    //     if (isEmpty()) {
    //         front = newNode;
    //         rear = newNode;
    //     } else {
    //         rear.next = newNode;
    //         rear = newNode;
    //     }
    //     size++;
    //     System.out.printf("MahasiswaTugas10 %s berhasil ditambahkan ke antrian.", mhs.nama);
    // }

    // public MahasiswaTugas10 dequeue() {
    //     if (isEmpty()) {
    //         System.out.println("Antrian kosong!, tidak ada Mahasiswa yang bisa dipanggil.");
    //         return null;
    //     }

    //     MahasiswaTugas10 mhs = front.data;
    //     front = front.next;
    //     if (front == null) {
    //         rear = null;
    //     }
    //     size--;
    //     System.out.printf("MahasiswaTugas10 %s dipanggil untuk dilayani.", mhs.nama);
    //     return mhs;
    // }

    // public MahasiswaTugas10 peek() {
    //     if (isEmpty()) {
    //         System.out.println("Antrian kosong, tidak ada Mahasiswa terdepan!");
    //         return null;
    //     }
    //     return front.data;
    // }

    // public MahasiswaTugas10 peekRear() {
    //     if (isEmpty()) {
    //         System.out.println("Antrian kosong, tidak ada Mahasiswa terakhir!");
    //         return null;
    //     }
    //     return rear.data;
    // }

    // public void clear() {
    //     if (isEmpty()) {
    //         System.out.println("Antrian sudah kosong!");
    //         return;
    //     }

    //     front = null;
    //     rear = null;
    //     size = 0;
    //     System.out.println("Antrian berhasil dikosongkan.");
    // }

    // public void display() {
    //     if (isEmpty()) {
    //         System.out.println("Antrian kosong!");
    //         return;
    //     }

    //     System.out.println("\nDaftar MahasiswaTugas10 dalam Antrian:");
    //     System.out.println("--------------------------------");
    //     NodeTugas10 current = front;
    //     int nomor = 1;

    //     while (current != null) {
    //         System.out.println("Nomor Antrian: " + nomor);
    //         current.data.tampilInformasi();
    //         current = current.next;
    //         nomor++;
    //     }
    // }

    // public int size() {
    //     return size;
    // }

    // boolean isEmpty() {
    //     return (head == null);
    // }

    // public void print() {
    //     if (!isEmpty()) {
    //         NodeMahasiswa10 tmp = head;
    //         System.out.println("Isi Linked List: ");
    //         while (tmp != null) {
    //             tmp.data.tampilInformasi();
    //             tmp = tmp.next;
    //         }
    //         System.out.println("");
    //     } else {
    //         System.out.println("Linked List kosong");
    //     }
    // }

    // public void addFirst(Mahasiswa10 input) {
    //     NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, null);
    //     if (isEmpty()) {
    //         head = ndInput;
    //         tail = ndInput;
    //     } else {
    //         ndInput.next = head;
    //         head = ndInput;
    //     }
    // }

    // public void addLast(Mahasiswa10 input) {
    //     NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, null);
    //     if (isEmpty()) {
    //         head = ndInput;
    //         tail = ndInput;
    //     } else {
    //         tail.next = ndInput;
    //         tail = ndInput;
    //     }
    // }

    // public void insertAfter(String key, Mahasiswa10 input) {
    //     NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, null);
    //     NodeMahasiswa10 temp = head;
    //     do {
    //         if (temp.data.nama.equalsIgnoreCase(key)) {
    //             ndInput.next = temp.next;
    //             temp.next = ndInput;
    //             if (ndInput.next == null) {
    //                 tail = ndInput;
    //             }
    //             break;
    //         }
    //         temp = temp.next;
    //     } while (temp != null);
    // }

    // public void insertAt(int index, Mahasiswa10 input) {
    //     if (index < 0) {
    //         System.out.println("indeks salah");
    //     } else if (index == 0) {
    //         addFirst(input);
    //     } else {
    //         NodeMahasiswa10 temp = head;
    //         for (int i = 0; i < index - 1; i++) {
    //             temp = temp.next;
    //         }
    //         NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, temp.next);
    //         temp.next = ndInput;
    //         if (temp.next.next == null) {
    //             tail = temp.next;
    //         }
    //     }
    // }

    // public void getData(int index) {
    //     NodeMahasiswa10 temp = head;
    //     for (int i = 0; i < index; i++) {
    //         temp = temp.next;
    //     }
    //     temp.data.tampilInformasi();
    // }

    // public int indexOf(String key) {
    //     NodeMahasiswa10 tmp = head;
    //     int index = 0;
    //     while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
    //         tmp = tmp.next;
    //         index++;
    //     }

    //     if (tmp == null) {
    //         return -1;
    //     } else {
    //         return index;
    //     }
    // }

    // public void removeFirst() {
    //     if (isEmpty()) {
    //         System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
    //         head = tail = null;
    //     } else if (head == tail) {
    //         head = null;
    //         tail = null;
    //     } else {
    //         head = head.next;
    //     }
    // }


    // public void removeLast() {
    //     if (isEmpty()) {
    //         System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
    //     } else if (head == tail) {
    //         head = null;
    //         tail = null;
    //     } else {
    //         NodeMahasiswa10 temp = head;
    //         while (temp.next != tail) {
    //             temp = temp.next;
    //         }
    //         temp.next = null;
    //         tail = temp;
    //     }
    // }
    
    // public void remove(String key) {
    //     if (isEmpty()) {
    //         System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
    //     } else {
    //         NodeMahasiswa10 temp = head;
    //         NodeMahasiswa10 prev = null; 

    //         while (temp != null) {
    //             if (temp.data.nama.equalsIgnoreCase(key)) {
    //                 if (temp == head) {
    //                     this.removeFirst();
    //                     break;
    //                 } else {
    //                     prev.next = temp.next;
    //                     if (temp.next == null) {
    //                         tail = prev;
    //                     }
    //                     break;
    //                 }
    //             }
    //             prev = temp; 
    //             temp = temp.next;
    //         }
    //     }
    // }
    
    // public void removeAt(int index) {
    //     if (index == 0) {
    //         removeFirst();
    //     } else {
    //         NodeMahasiswa10 temp = head;
    //         for (int i = 0; i < index - 1; i++) {
    //             if (temp == null || temp.next == null) {
    //                 System.out.println("Index di luar batas Linked List!");
    //                 return;
    //             }
    //             temp = temp.next;
    //         }
    //         if (temp.next == null) {
    //             System.out.println("Index di luar batas Linked List!");
    //             return;
    //         }
    //         temp.next = temp.next.next;
    //         if (temp.next == null) {
    //             tail = temp;
    //         }
    //     }
    // }

    //====================================
    //Double Linked Lists
    //====================================

    // public DoubleLinkedLists10() {
    //     head = null;
    //     size = 0;
    // }
    
    // public boolean isEmpty() {
    //     return head == null;
    // }

    // public void addFirst(int item) {
    //     if (isEmpty()) {
    //         head = new Node10(null, item, null);
    //     } else {
    //         Node10 newNode = new Node10(null, item, head);
    //         head.prev = newNode;
    //         head = newNode;
    //     }
    //     size++;
    // }

    // public void addLast(int item) {
    //     if (isEmpty()) {
    //         addFirst(item);
    //     } else {
    //         Node10 current = head;
    //         while (current.next != null) {
    //             current = current.next;
    //         }
    //         Node10 newNode = new Node10(current, item, null);
    //         current.next = newNode;
    //         size++;
    //     }
    // }

    // public void add(int item, int index) throws Exception {
    //     if (isEmpty()) {
    //         addFirst(item);
    //     } else if (index < 0 || index > size) {
    //         throw new Exception("Nilai indeks di luar batas");
    //     } else {
    //         Node10 current = head;
    //         int i = 0;
    //         while (i < index) {
    //             current = current.next;
    //             i++;
    //         }
    //         if (current.prev == null) {
    //             Node10 newNode = new Node10(null, item, current);
    //             current.prev = newNode;
    //             head = newNode;
    //         } else {
    //             Node10 newNode = new Node10(current.prev, item, current);
    //             newNode.prev = current.prev;
    //             newNode.next = current;
    //             current.prev.next = newNode;
    //             current.prev = newNode;
    //         }
    //     }
    //     size++;
    // }

    // public int size() {
    //     return size;
    // }

    // public void clear() {
    //     head = null;
    //     size = 0;
    // }

    // public void print() {
    //     if (!isEmpty()) {
    //         Node10 tmp = head;
    //         while (tmp != null) {
    //             System.out.print(tmp.data + "\t");
    //             tmp = tmp.next;
    //         }
    //         System.out.println("\nberhasil diisi");
    //     } else {
    //         System.out.println("Linked Lists Kosong");
    //     }
    // }

    // public void removeFirst() throws Exception {
    //     if (isEmpty()) {
    //         throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
    //     } else if (size == 1) {
    //         removeLast();
    //     } else {
    //         head = head.next;
    //         head.prev = null;
    //         size--;
    //     }
    // }

    // public void removeLast() throws Exception {
    //     if (isEmpty()) {
    //         throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
    //     } else if (head.next == null) {
    //         head = null;
    //         size--;
    //         return;
    //     }
    //     Node10 current = head;
    //     while (current.next.next != null) {
    //         current = current.next;
    //     }
    //     current.next = null;
    //     size--;
    // }

    // public void remove(int index) throws Exception {
    //     if (isEmpty() || index >= size) {
    //         throw new Exception("Nilai indeks di luar batas");
    //     } else if (index == 0) {
    //         removeFirst();
    //     } else {
    //         Node10 current = head;
    //         int i = 0;
    //         while (i < index) {
    //             current = current.next;
    //             i++;
    //         }
    //         if (current.next == null) {
    //             current.prev.next = null;
    //         } else if (current.prev == null) {
    //             current = current.next;
    //             current.prev = null;
    //             head = current;
    //         } else {
    //             current.prev.next = current.next;
    //             current.next.prev = current.prev;
    //         }
    //         size--;
    //     }
    // }

    // public int getFirst() throws Exception {
    //     if (isEmpty()) {
    //         throw new Exception("Linked List kosong");
    //     }
    //     return head.data;
    // }

    // public int getLast() throws Exception {
    //     if (isEmpty()) {
    //         throw new Exception("Linked List kosong");
    //     }
    //     Node10 tmp = head;
    //     while (tmp.next != null) {
    //         tmp = tmp.next;
    //     }
    //     return tmp.data;
    // }

    // public int get(int index) throws Exception {
    //     if (isEmpty() || index >= size) {
    //         throw new Exception("Nilai indeks di luar batas.");
    //     }
    //     Node10 tmp = head;
    //     for (int i = 0; i < index; i++) {
    //         tmp = tmp.next;
    //     }
    //     return tmp.data;
    // }

    //====================================
    //Binary Tree
    //====================================

    // public BinaryTreeArray10() {
    //     this.dataMahasiswa = new Mahasiswa10[10];
    // }

    // void populateData (Mahasiswa10 dataMhs[], int idxLast) {
    //     this.dataMahasiswa = dataMhs;
    //     this.idxLast = idxLast;
    // }

    // void traverseInOrder (int idxStart) {
    //     if (idxStart <= idxLast) {
    //         if (dataMahasiswa[idxStart] != null) {
    //             traverseInOrder(2*idxStart+1);
    //             dataMahasiswa[idxStart].tampilInformasi();
    //             traverseInOrder(2*idxStart+2);
    //         }
    //     }
    // }

    // public BinaryTree10() {
    //     root = null;
    // }

    // public boolean isEmpty() {
    //     return root == null;
    // }
    
    // public void add(Mahasiswa10 mahasiswa) {
    //     Node10 newNode = new Node10(mahasiswa);
    //     if (isEmpty()) {
    //         root = newNode;
    //     } else {
    //         Node10 current = root;
    //         Node10 parent = null;
    //         while (true) {
    //             parent = current;
    //             if (mahasiswa.ipk < current.mahasiswa.ipk) {
    //                 current = current.left;
    //                 if (current == null) {
    //                     parent.left = newNode;
    //                     return;
    //                 }
    //             } else {
    //                 current = current.right;
    //                 if (current == null) {
    //                     parent.right = newNode;
    //                     return;
    //                 }
    //             }
    //         }
    //     }
    // }

    // boolean find(double ipk) {
    //     boolean result = false;
    //     Node10 current = root;
    //     while (current != null) {
    //         if (current.mahasiswa.ipk == ipk) {
    //             result = true;
    //             break;
    //         } else if (ipk > current.mahasiswa.ipk) {
    //             current = current.right;
    //         } else {
    //             current = current.left;
    //         }
    //     }
    //     return result;
    // }

    // void traversePreOrder(Node10 node) {
    //     if (node != null) {
    //         node.mahasiswa.tampilInformasi();
    //         traversePreOrder(node.left);
    //         traversePreOrder(node.right);
    //     }
    // }

    // void traverseInOrder(Node10 node) {
    //     if (node != null) {
    //         traverseInOrder(node.left);
    //         node.mahasiswa.tampilInformasi();
    //         traverseInOrder(node.right);
    //     }
    // }

    // void traversePostOrder(Node10 node) {
    //     if (node != null) {
    //         traversePostOrder(node.left);
    //         traversePostOrder(node.right);
    //         node.mahasiswa.tampilInformasi();
    //     }
    // }

    // Node10 getSuccessor(Node10 del) {
    //     Node10 successor = del.right;
    //     Node10 successorParent = del;

    //     while (successor.left != null) {
    //         successorParent = successor;
    //         successor = successor.left;
    //     }

    //     if (successor != del.right) {
    //         successorParent.left = successor.right;
    //         successor.right = del.right;
    //     }

    //     return successor;
    // }

    // void delete(double ipk) {
    //     if (isEmpty()) {
    //         System.out.println("Binary tree kosong");
    //         return;
    //     }

    //     // cari node (current) yang akan dihapus
    //     Node10 parent = root;
    //     Node10 current = root;
    //     boolean isLeftChild = false;

    //     while (current != null) {
    //         if (current.mahasiswa.ipk == ipk) {
    //             break;
    //         } else if (ipk < current.mahasiswa.ipk) {
    //             parent = current;
    //             current = current.left;
    //             isLeftChild = true;
    //         } else if (ipk > current.mahasiswa.ipk) {
    //             parent = current;
    //             current = current.right;
    //             isLeftChild = false;
    //         }
    //     }

    //     // penghapusan
    //     if (current == null) {
    //         System.out.println("Data tidak ditemukan");
    //         return;
    //     } else {
    //         // jika tidak ada anak (leaf), maka node dihapus
    //         if (current.left == null && current.right == null) {
    //             if (current == root) {
    //                 root = null;
    //             } else {
    //                 if (isLeftChild) {
    //                     parent.left = null;
    //                 } else {
    //                     parent.right = null;
    //                 }
    //             }
    //         // jika hanya punya 1 anak (kanan)
    //         } else if (current.left == null) {
    //             if (current == root) {
    //                 root = current.right;
    //             } else {
    //                 if (isLeftChild) {
    //                     parent.left = current.right;
    //                 } else {
    //                     parent.right = current.right;
    //                 }
    //             }
    //         // jika hanya punya 1 anak (kiri)
    //         } else if (current.right == null) {
    //             if (current == root) {
    //                 root = current.left;
    //             } else {
    //                 if (isLeftChild) {
    //                     parent.left = current.left;
    //                 } else {
    //                     parent.right = current.left;
    //                 }
    //             }   
    //         // jika punya 2 anak
    //         } else {
    //             Node10 successor = getSuccessor(current);
    //             System.out.println("Jika 2 anak, current = ");
    //             successor.mahasiswa.tampilInformasi();

    //             if (current == root) {
    //                 root = successor;
    //             } else {
    //                 if (isLeftChild) {
    //                     parent.left = successor;
    //                 } else {
    //                     parent.right = successor;
    //                 }
    //             }
    //             successor.left = current.left;
    //         }
    //     }
    // }
}


