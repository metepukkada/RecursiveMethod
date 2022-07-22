import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RecursiveMethod {

    static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir N Sayısı Giriniz: ");
        int n = scanner.nextInt();
        int temp = n;
        if (n > 0) {
            extfive(n, temp);
        } else if (n == 0) {
            System.out.print("0");
        } else if (n < 0) {
            addnegative(n, temp);
        }

    }

    static int extfive(int number, int temp) {
        if (temp > 0) {
            System.out.print(temp + " ");
            temp -= 5;
            return extfive(number, temp);
        } else {
            System.out.print(temp + " ");
            return addfive(number, temp);
        }
    }

    static int addfive(int number, int temp) {
        temp += 5;
        if (number == temp) {
            System.out.print(temp + " ");
            return 1;
        }
        System.out.print(temp + " ");
        return addfive(number, temp);
    }

    static int addnegative(int number, int temp) {
        System.out.print(temp + " ");
        temp += 5;
        if (temp > 0) {
            System.out.print(temp + " ");
            return extnegative(number, temp);
        }
        return addnegative(number, temp);
    }

    static int extnegative(int number, int temp) {
        temp -= 5;
        System.out.print(temp + " ");
        if (temp != number){
            return extnegative(number, temp);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        input();
    }
}
