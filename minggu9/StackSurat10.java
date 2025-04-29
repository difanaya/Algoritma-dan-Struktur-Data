package minggu9;

public class StackSurat10 {
    Surat10[] stack;
    int top;

    public StackSurat10(int kapasitas) {
        stack = new Surat10[kapasitas];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(Surat10 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak dapat menerima surat baru.");
        }
    }

    public Surat10 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat terakhir.");
            return null;
        }
    }

    public boolean cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }
}
