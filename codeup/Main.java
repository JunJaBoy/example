import java.util.Scanner;

public class Main {
    //1001
    /*public static void main(String[] args) {
        System.out.println("Hello");
    }*/
    //1002
    /*public static void main(String[] args) {
        System.out.println("Hello"+" "+"World");
    }*/
    //1003
    /*public static void main(String[] args) {
        System.out.println("Hello\nWorld");
    }*/
    //1004
    /*public static void main(String[] args) {
        System.out.println("\'Hello\'");
    }*/
    //1005
    /*public static void main(String[] args) {
        System.out.println("\"Hello World\"");
    }*/
    //1006
    /*public static void main(String[] args) {
        System.out.println("\"!@#$%^&*()\"");
    }*/
    //1007
    /*public static void main(String[] args) {
        System.out.println("\"C:\\Download\\hello.cpp\"");
    }*/
    //1008
    /*public static void main(String[] args) {
        System.out.println("\u250C\u252C\u2510\n\u251C\u253C\u2524\n\u2514\u2534\u2518");
    }*/
    //1010
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.printf("%d", n);
    }*/
    //1011
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char n = sc.next().charAt(0);
        System.out.println(n);
    }*/
    //1012
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        float n = sc.nextFloat();
        System.out.printf("%.6f", n);
    }*/
    //1013
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.printf("%d %d", n, m);
    }*/
    //1014
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char n = sc.next().charAt(0);
        char m = sc.next().charAt(0);
        System.out.printf("%c %c", m, n);
    }*/
    //1015
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        float n = sc.nextFloat();
        System.out.printf("%.2f", n);
    }*/
    //1017
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.printf("%d %d %d", n, n, n);
    }*/
    //1018
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String t[] = sc.next().split(":");
        System.out.println(t[0]+":"+t[1]);//t[0](시간)값과 :, t[1](분)값 출력
    }*/
    //1019
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String date[] = sc.nextLine().split("[.]");
        int y = Integer.parseInt(date[0]);
        int m = Integer.parseInt(date[1]);
        int d = Integer.parseInt(date[2]);
        System.out.printf("%04d.%02d.%02d", y, m, d);
    }*/
    //1020
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String num[] = sc.nextLine().split("[-]");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        System.out.println(num[0]+num[1]);
    }
}