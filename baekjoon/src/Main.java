import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import static jdk.nashorn.internal.objects.NativeMath.max;
import static jdk.nashorn.internal.objects.NativeString.charAt;

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
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int cpy = N;
        int cnt = 0;

        do {
            cpy = ((cpy % 10) * 10) + (((cpy / 10) + (cpy % 10)) % 10);
            cnt++;
        } while (cpy != N);

        System.out.println(cnt);

    }*/
    //10818
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); //sort로 arr배열 내의 값을 크기가 작은 순으로 정렬
        System.out.printf("%d %d", arr[0], arr[n - 1]);
    }*/
    //2562
    /*static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[9];
        int max = 0, index = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max + "\n" + index);
    }*/
    //2577
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        sc.close(); //n1 n2 n3 입력 후 스캐너 닫기

        int t = n1 * n2 * n3;
        int[] num = new int[10]; //숫자를 담을 10자리 배열(0 ~ 9) 선언

        while (t > 0) { //t가 0보다 작을 동안 반복
            num[t % 10]++; //t를 10으로 나눈 나머지 = 일의 자리 수, 0~9 값중 해당 수의 값 1 증가
            t /= 10; //t를 10으로 나누어서 다음 자리수 대비
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }
    }*/
    //3052
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<Integer>(); //HashSet : 중복되는 수들이 있는 경우, 하나를 제외한 나머지 수들을 없애고 HashSet에 저장

        for (int i = 0; i < 10; i++) {
            h.add(sc.nextInt() % 42); //입력받은 수를 42로 나눈 나머지를 add 메소드를 통해 Hashset에 저장
        }

        System.out.println(h.size());
    }*/
    //1546
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        arr[0] = arr[0] / max * 100;
        for (int i = 1; i < n; i++) {
            arr[0] += arr[i] / max * 100;
        }
        System.out.println(arr[0] / n);
    }*/
    //8958
    /*static Scanner sc = new Scanner(System.in);

    //https://st-lab.tistory.com/50
    public static void main(String[] args) {
        String[] arr = new String[sc.nextInt()]; // 입력 받는 크기만큼의 문자형 배열 선언

        for (int i = 0; i < arr.length; i++) { // 문자형 배열에 OX 값 대임
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            int rst = 0;
            int cnt = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') { // 배열[i]의 현재 인덱스[j]값이 'O'면, cnt를 증가시킨다
                    cnt++;
                } else { // 배열[i]의 현재 인덱스[j]값이 'O'가 아니면, cnt를 0으로 초기화한다
                    cnt = 0;
                }
                rst += cnt; // if, else문을 거치고, cnt의 값을 결과값에 대입한다
            }
            System.out.println(rst);
        }
    }*/
    //4344
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            double[] arr = new double[sc.nextInt()];
            double cnt = 0;
            double cnt2 = 0;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                cnt += arr[j];
            }
            cnt /= arr.length;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > cnt) {
                    cnt2++;
                }
            }
            System.out.printf("%.3f%%\n", cnt2 / arr.length * 100);
        }
    }*/
    //5
    //15596
    /*long sum(int[] a){
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            n += a[i];
        }
        return n;
    }*/
    //4673
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for (int i = 0; i <= 10000; i++) {
            int n = snum(i);
            if (n <= 10000) {
                check[n] = true;
            }
        }
        for (int i = 0; i <= 10000; i++) {
            if (check[i] != true) {
                System.out.println(i);
            }
        }
    }

    public static int snum(int a) {
        int f = a;

        while (a != 0) {
            f += (a % 10);
            a /= 10;
        }
        return f;
    }*/
    //1065
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(sequence(sc.nextInt()));

    }


    public static int sequence(int num) {
        int cnt = 0;

        if (num < 100) {
            return num;
        } else {
            cnt = 99;

            for (int i = 100; i <= num; i++) {
                int h = i / 100;
                int t = (i / 10) % 10;
                int o = i % 10;
                if (h - t == t - o) {
                    cnt++;
                }
            }
        }
        return cnt;
    }*/
    //6
    //11654
    /*public static void main(String[] args) throws IOException {
        int a = System.in.read();
        System.out.printf("%d", a);
    }*/
    //1170
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        String str = sc.next();

        int cnt = 0;

        for (int i = 0; i < a; i++) {
            cnt += str.charAt(i) - '0'; // charAt(i)으로 str 문자열을 문자로 치환하고, 0을 빼서 숫자로 만든다
        }

        System.out.println(cnt);
    }*/
    //10809
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[26]; // 각 알파벳의 처음 위치를 지정해 줄 길이 26의 정수형 배열
        String s = sc.nextLine();
        for (int i = 0; i < arr.length; i++) { // 배열 전체를 -1로 초기화한다
            arr[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // ch 문자형 변수에 s의 i번째 문자를 지정한다. 수명은 for문이 한 번 돌 때 까지이다.
            if (arr[ch - 'a'] == -1) { // ch 에서 a(97)을 뺀 번호의 인덱스를 가지고 있는 arr의 값을 식별한다. arr의 ch-'a'번째 인덱스가 -1이면 if문 내의 구문을 실행한다.
                arr[ch - 'a'] = i; // i(해당 글자가 등장한 위치)를 arr에 넣어준다. 만약 현재 인덱스보다 먼저 해당 글자가 등장했다면 if문 내부 실행 없이 넘어감으로, 처음 등장한 인덱스의 값을 가지게 된다.
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }

    }*/
    //2675
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            String string = sc.next();
            for (int j = 0; j < string.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.printf("%c", string.charAt(j));
                }
            }
            System.out.println();
        }
    }*/
    //1157
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = (char) (i + 'A');
            } else if (max == count[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }*/
    //1152
    /*static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str);

        System.out.println(st.countTokens());

    }*/
    /*static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = sc.next();
        String s2 = sc.next();

        String re_s1 = new StringBuffer(s1).reverse().toString();
        String re_s2 = new StringBuffer(s2).reverse().toString();

        int n1 = Integer.parseInt(re_s1);
        int n2 = Integer.parseInt(re_s2);

        System.out.println((n1 > n2) ? n1 : n2);
    }*/
}