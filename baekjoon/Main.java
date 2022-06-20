import java.io.*;
import java.util.Optional;
import java.util.Scanner;
import java.util.StringTokenizer;

import static jdk.nashorn.internal.objects.NativeMath.max;

public class Main {
    //1
    //2557
    /*public static void main(String[] args) {
        System.out.println("Hello World!");
    }*/
    //10718
    /*public static void main(String[] args) {
        System.out.println("강한친구 대한육군\n강한친구 대한육군");
    }*/
    //10171
    /*public static void main(String[] args) {
        System.out.println("\\    /\\\n )  ( ')\n(  /  )\n \\(__)|");
    }*/
    //10172
    /*public static void main(String[] args) {
        System.out.println("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`    |\n||_/=\\\\__|");
    }*/
    //1000
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d", a+b);
    }*/
    //1001
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }*/
    //10998
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }*/
    //1008
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(a / b);
    }*/
    //10869
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a / b);
        System.out.println(a%b);
    }*/
    //10926
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String id= sc.nextLine();
        System.out.println(id+"??!");
    }*/
    //18108
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int a = sc.nextInt();
        System.out.println(a-543);
    }*/
    //10430
    /*tatic Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a+b)%c+"\n"+((a%c) + (b%c))%c+"\n"+(a*b)%c+"\n"+((a%c)*(b%c))%c);
    }*/
    //2588
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt(); //첫번째 수 입력(첫번째 수는 자릿수로 나눌 필요 X)
        String b = sc.next(); //두번째 수 배열로 입력(자릿수 나누기 위해)

        System.out.println(a*(b.charAt(2) - '0')); //첫번째 수에 b의 3번째 자리수 곱하기(charAt으로 각 자리수를 배열에서 문자열로 변환 후 아스키코드 번호 48번을 빼서 정수로 만들기(0 = 아스키코드 48))
        System.out.println(a*(b.charAt(1) - '0')); //두번째 수에 b의 2번째 자리수 "
        System.out.println(a*(b.charAt(0) - '0')); //두번째 수에 b의 1번째 자리수 "
        System.out.println(a*Integer.parseInt(b)); //전체 수를 곱한 값 출력(parseInt로 배열 b를 정수로 바꿈)
    }*/
    //25083
    /*public static void main(String[] args) {
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    }*/
    //2
    //1330
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println(">");
        }
        else if (a < b) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }
    }*/
    //9498
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }*/
    //2753
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int y = sc.nextInt();
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.println("1");
        }
        else System.out.println("0");
    }*/
    //14681
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0) {
            if (y > 0) {
                System.out.println("1");
            } else System.out.println("4");
        } else {
            if (y > 0) {
                System.out.println("2");
            } else System.out.println("3");
        }
    }*/
    //2884
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (m < 45) {
            h--;
            m = 60 - (45 - m);
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));

        }
    }*/
    //2525
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        h = h * 60 + m + n;
        m = (h % 60);
        h /= 60;
        if (h > 23){h -=24;}
        System.out.println(h + " " + m);
    }*/
    //2480
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a == b) && (b == c)) { //a, b, c 모두 같은 경우
            System.out.println(10000 + (a * 1000));
        } else if ((a == b) || (b == c)) { //a, b만 또는 b, c만 같은 경우
            System.out.println(1000 + (b * 100));
        } else if (a == c) {  //a, c만 같은 경우
            System.out.println(1000 + (a * 100));
        } else { //그 외의 경우
            System.out.println(Math.max(a, Math.max(b, c)) * 100); // Math.max 함수로 최대값을 구한 후 출력
        }
    }*/
    //3
    //2739
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }*/
    //10950
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[999];
        int[] brr = new int[999];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            brr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println((arr[i] + brr[i]));
        }
    }*/
    //8393
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= a; i++) {
            cnt += i;
        }
        System.out.println(cnt);
    }*/
    //15552
    /*  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //버퍼 선언
    static StringBuilder sb = new StringBuilder(); //string 선언
    //https://st-lab.tistory.com/30
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine()); //buffer로 Int 입력
        for (int i = 0; i < n; i++) {
            String str = bf.readLine(); //buffer로 string형 변수 str 입력
            int target = str.indexOf(" "); //str에 공백(" ")이 있다면 공백의 배열 위치를 반환, 없으면 -1 반환
            int result = Integer.parseInt(str.substring(0, target)) + Integer.parseInt(str.substring(target + 1));
            //substring으로 (시작값, 길이)(0, target)까지만 잘라서 target까지의 string을 잘라낸 후, 나머지 target(공백) 뒤의 수를 더한다
            // (+1하는 이유는 배열이기 때문에 0부터 시작)

            sb.append(result+"\n"); //append : 기존 문자열 맨 마지막에 새로운 문자열을 붙이는 함수, result에 줄바꿈을 추가한다
        }
        bf.close(); //bf 메소드를 닫아 누수를 방지한다
        System.out.print(sb); //sb string을 출력한다
    }*/
    //2741
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }*/
    //2742
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }*/
    //11021
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int[] arr = new int[999];
        int[] brr = new int[999];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
            brr[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            System.out.println("Case " + "#" + (i + 1) + ": " + (arr[i] + brr[i]));
        }

    }*/
    //11022
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[999];
        int[] brr= new int[999];

        for (int i= 0;i < n; i++) {
            arr[i] = sc.nextInt();
            brr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Case #" + (i+1) + ": " + arr[i] + " + " + brr[i] + " = " + (arr[i] + brr[i]));
        }
    }*/
    //2438
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }*/
    //2439
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }*/
    //10871
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] arr = new int[n]; //arr배열의 길이를 한정해주지 않으면 런타임이 너무 길어져 오류가 발생했다. 입력받을 숫자의 개수인 n은 배열의 길이와 갇기에 길이를 n으로 설정해준다

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            if (arr[i] < a) {
                System.out.print(arr[i] + " ");
            }
        }
    }*/
    //10952
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        for (int i = 0; ; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) { break; }
            System.out.println(a + b);
        }
    }*/
    //10951
    /*static Scanner  sc = new Scanner(System.in);
    //계속해서 정수를 입력받고, 합을 출력한다. 정수 외의 수가 입력되면 종료된다
    public static void main(String[] args) {
        int a, b;
        while (sc.hasNextInt()) { //hasNextInt로 참을 반환하여 true(1)이면 다음 입력이 정수일 동안(while) 반복문을 실행한다 (false(0)이 반환되면 반복문을 멈춘다)
            a = sc.nextInt(); //a를 입력받는다
            b = sc.nextInt(); //b를 입력받는다
            System.out.println(a + b); //a + b를 출력한다
        }
    }*/
    //1110
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int cpy = N;
        int cnt = 0;

        do {
            cpy = ((cpy % 10) * 10) + (((cpy / 10) + (cpy % 10)) % 10);
            cnt++;
        } while (cpy != N);

        System.out.println(cnt);

    }
}
