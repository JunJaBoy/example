import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

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
    //1009
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = 1;
            for (int j = 0; j < b; j++) {
                temp *= a;
                temp %= 10;
            }
            if (temp % 10 == 0) {
                temp = 10;
            }
            System.out.println(temp);
        }
    }*/
    //10757
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.next();
        String str2 = sc.next();


        int leng = Math.max(str1.length(), str2.length());

        int[] arr = new int[leng + 1];
        int[] brr = new int[leng + 1];

        for (int i = str1.length() - 1, idx = 0; i >= 0; i--, idx++) {
            arr[idx] = str1.charAt(i) - '0';
        }
        for (int i = str2.length() - 1, idx = 0; i >= 0; i--, idx++) {
            brr[idx] = str2.charAt(i) - '0';
        }

        for (int i = 0; i < leng; i++) {
            int res = arr[i] + brr[i];
            arr[i] = res % 10;
            arr[i + 1] += (res / 10);
        }

        StringBuilder sb = new StringBuilder();
        if (arr[leng] != 0) {
            sb.append(arr[leng]);
        }
        for (int i = leng - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }*/
    //2675
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger val = sc.nextBigInteger();
        BigInteger num = sc.nextBigInteger();
        System.out.println(val.divide(num));
        System.out.println(val.remainder(num));

    }*/
    //4101
    /*static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if ((a == 0) && (b == 0)) {
                break;
            }
            if (a > b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }*/
    //10170
    /*public static void main(String[] args) {
        System.out.printf("NFC West       W   L  T\n" +
                "-----------------------\n" +
                "Seattle        13  3  0\n" +
                "San Francisco  12  4  0\n" +
                "Arizona        10  6  0\n" +
                "St. Louis      7   9  0\n" +
                "\n" +
                "NFC North      W   L  T\n" +
                "-----------------------\n" +
                "Green Bay      8   7  1\n" +
                "Chicago        8   8  0\n" +
                "Detroit        7   9  0\n" +
                "Minnesota      5  10  1");
    }*/
    //5597

    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[31];

        for (int i = 1; i < 29; i++) {
            int comp = sc.nextInt();
            arr[comp] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }

    }*/

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("I love You");
        }
    }

}