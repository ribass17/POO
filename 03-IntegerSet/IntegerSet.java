public class IntegerSet {
    private boolean[] a;

    public IntegerSet() {
        a = new boolean[101];

        for (int i = 0; i < 101; i++) {
            a[i] = false;
        }
    }

    public IntegerSet union(IntegerSet x) {
        var aux = new IntegerSet();

        for (int i = 0; i < 101; i++) {
            if (a[i] == true || x.a[i] == true) {
                a[i] = true;
            }
        }
        return aux;
    }

    public IntegerSet intersection(IntegerSet x) {
        var aux = new IntegerSet();

        for (int i = 0; i < 101; i++) {
            if (a[i] == true && x.a[i] == true) {
                a[i] = true;
            }
        }
        return aux;
    }

    public void insertElement(int number) {
        this.a[number] = true;
    }

    public void deleteElement(int number) {
        this.a[number] = false;
    }

    public String toSetSting() {
        String aux = "";
        for (int i = 0; i < 101; i++) {
            if (this.a[i] == true) {
                aux += Integer.toString(i) + " ";
            }
        }
        if (aux == "") {
            aux = "--";
        }
        return aux;
    }

    public boolean isEqual(IntegerSet x) {
        for (int i = 0; i < 101; i++) {
            if (this.a[i] != x.a[i])
                return false;
        }
        return true;
    }
}