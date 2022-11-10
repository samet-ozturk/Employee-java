

public class Main {
    public static void main(String[] args) {
        employee samet = new employee("samet",2000,45,1985);

        samet.tax();
        samet.bonus();
        samet.raiseSalary();
        System.out.println("-----------------------");
        samet.toStrings();

    }
}