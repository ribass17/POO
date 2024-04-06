public class UsaIntegerSet {
    public static void main(String[] args) {
        var set1 = new IntegerSet();
        var set2 = new IntegerSet();

        set1.insertElement(2);
        set1.insertElement(4);
        set1.insertElement(6);
        set1.insertElement(8);
        set1.insertElement(10);
        set1.insertElement(12);

        System.out.println(set1.toSetSting());
        System.out.println(set2.toSetSting());

        System.out.println(set1.isEqual(set2));

        set2.insertElement(4);
        set2.insertElement(14);

        var set3 = new IntegerSet();
        set3 = set1.union(set2);
        System.out.println(set2.toSetSting());
        set3 = set1.intersection(set3);
        System.out.println(set2.toSetSting());

    }
}