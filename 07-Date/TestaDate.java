public class TestaDate {
    public static void main(String[] args) {
        var date1 = new Date(27, 03, 2024);

        System.out.println(date1.showsDate());

        date1.setDay(3);
        date1.setMonth(25); // tentativa de mes acimada 12
        date1.setYear(2003);

        System.out.println(date1.showsDate());
    }
}
