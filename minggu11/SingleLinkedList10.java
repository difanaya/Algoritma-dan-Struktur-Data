package minggu11;

public class SingleLinkedList10 {
    NodeMahasiswa10 head;
    NodeMahasiswa10 tail;

    public SingleLinkedList10() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa10 tmp = head;
            System.out.println("Isi Linked List: ");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void addFirst(Mahasiswa10 input) {
        NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa10 input) {
        NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa10 input) {
        NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, null);
        NodeMahasiswa10 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa10 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa10 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, temp.next);
            temp.next = ndInput;
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        NodeMahasiswa10 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        NodeMahasiswa10 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
            head = tail = null;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }


    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            NodeMahasiswa10 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa10 temp = head;
            NodeMahasiswa10 prev = null; 

            while (temp != null) {
                if (temp.data.nama.equalsIgnoreCase(key)) {
                    if (temp == head) {
                        this.removeFirst();
                        break;
                    } else {
                        prev.next = temp.next;
                        if (temp.next == null) {
                            tail = prev;
                        }
                        break;
                    }
                }
                prev = temp; 
                temp = temp.next;
            }
        }
    }
    
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa10 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null || temp.next == null) {
                    System.out.println("Index di luar batas Linked List!");
                    return;
                }
                temp = temp.next;
            }
            if (temp.next == null) {
                System.out.println("Index di luar batas Linked List!");
                return;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
