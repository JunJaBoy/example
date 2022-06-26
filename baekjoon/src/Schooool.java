import java.util.Scanner;

public class Schooool {
    //안현수쌤
    //20220608
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        if (a < b){
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a - b);
    }*/
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("짝수임다");
            } else {
                System.out.println("홀수임다");
            }
        }
        else {
            System.out.println("0임다");
        }
    }*/
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b){
            if (a > c) {
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else {
            if (b > c){
                System.out.println(b);
            }
            else System.out.println(c);
        }
    }*/

    //20220614
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int cnt = 1;
        //for
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        //while
        System.out.printf("\n\n");
        while (cnt <= n) {
            System.out.println(cnt);
            cnt++;
        }
    }*/
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int cnt = 1;
        //for
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
        System.out.printf("\n\n");
        //while
        while (cnt <= a) {
            if (a % cnt == 0) {
                System.out.println(cnt);
            }
            cnt++;
        }
    }*/

    //20220615
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" %d * %d = %3d ", j, i, j * i);
            }
            System.out.println();
        }
    }*/
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (i == 5) break;
            for (int j = 0; j < 10; j++) {
                System.out.printf(" %d * %d = %3d ", j, i, j * i);
            }
            System.out.println();
        }
    }*/
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            if (i == 5) continue;
            else {
                for (int j = 1; j < 10; j++) {
                    System.out.printf(" %d * %d = %3d ", j, i, j * i);
                }
                System.out.println();
            }
        }
    }*/


    //백준 1546
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int cnt = 0;
        double rcnt = 0;
        double max = 0;
        double tmp;
        double[] num;
        cnt = sc.nextInt();
        num = new double[(int) cnt];

        for (int i = 0; i < cnt; i++) {
            num[i] = sc.nextInt();
            if (num[i] > max){
                max = num[i];
            }
        }
        for (int i = 0; i < cnt; i++) {
            rcnt += num[i] / max * 100;
        }
        System.out.println(rcnt/cnt);

    }*/
    //콜라츠
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        for (int i = 1; ; i++) {
            if (a % 2 == 0){
                a /= 2;
            }
            else {
                a = a*3 + 1;
            }
            System.out.printf("%3d : %3d\n", i, a);
            if (a == 1) {
                break;
            }
        }
    }*/
    //백준 1929_+_+_+_+_++_+_+
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        if (a )
        for (int i = a; i <= b; i++) {
        }
    }*/
}