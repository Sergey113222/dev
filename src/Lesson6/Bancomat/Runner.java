package Lesson6.Bancomat;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Bancomat.balance);
        System.out.println("ведите сумму которую хотите снять");
        Bancomat b1 = new Bancomat(11, 1, 5);
        b1.addMnoney();
        System.out.println(Bancomat.balance);
        System.out.println(b1.getMoney());
        b1.nominal();
    }
}
