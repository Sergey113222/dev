package Lesson6.Bancomat;

import java.util.Scanner;

public class Bancomat {
    Scanner sc;
    int twenty;
    int fifty;
    int hungred;
    static int balance = 100;
    int outMoney;

    public Bancomat(int hungred, int fifty, int twenty) {
        this.sc = new Scanner(System.in);
        this.outMoney = this.sc.nextInt();
        this.twenty = twenty;
        this.fifty = fifty;
        this.hungred = hungred;
    }

    public int addMnoney() {
        return balance = balance + this.twenty * 20 + this.fifty * 50 + this.hungred * 100;
    }

    public boolean getMoney() {
        if (balance < this.outMoney) {
            return false;
        } else if (balance > this.outMoney && this.outMoney % 10 != 0) {
            return false;
        } else {
            return this.outMoney >= 20;
        }
    }

    public void nominal() {
        if (this.getMoney() && this.outMoney % 100 == 0) {
            System.out.println(" hungred " + this.outMoney / 100 + " fifty 0 twenty 0");
        } else {
            int var10001;
            if (this.getMoney() && this.outMoney % 50 == 0) {
                var10001 = this.outMoney / 100;
                System.out.println(" hungred " + var10001 + " fifty " + this.outMoney % 100 / 50 + " twenty 0");
            } else if (this.getMoney() && this.outMoney % 20 == 0) {
                var10001 = this.outMoney / 100;
                System.out.println(" hungred " + var10001 + " fifty 0 twenty " + this.outMoney % 100 / 20);
            } else {
                for(int i = 0; i < 1000; i += 100) {
                    if (this.getMoney() && this.outMoney > i + 100 && this.outMoney < i + 150) {
                        var10001 = (this.outMoney - 50) / 100;
                        System.out.println(" hungred " + var10001 + " fifty 1 twenty " + (this.outMoney - 50) % 100 / 20);
                    } else if (this.getMoney() && this.outMoney > i + 150 && this.outMoney < i + 200) {
                        var10001 = this.outMoney / 100;
                        System.out.println(" hungred " + var10001 + " fifty " + this.outMoney % 100 / 50 + " twenty " + this.outMoney % 50 / 20);
                    }
                }
            }
        }

    }
}
