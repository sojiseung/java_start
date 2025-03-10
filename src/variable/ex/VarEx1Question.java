package variable.ex;

public class VarEx1Question {
    public static void main(String[] args) {
        // 1. 다음 코드에 반복해서 나오는 숫자 4,3을 다른 숫자로 한번에 변경할 수 있도록 다음을 변수 num1, num2를 사용하도록 변경해보세요.
        int num1 = 4;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);

        System.out.println("===================================");

        /* 2. 다음과 같은 작업을 수행하는 프로그램을 작성하세요.
            - 변수 num3을 선언하고, 이에 10을 할당하세요.
            - 변수 num4를 선언하고, 이에 20을 할당하세요.
            - 두 변수의 합을 구하고, 그 결과를 새로운 변수 sum에 저장하세요.
            - sum변수의 값을 출력하세요.
         */
//        int num3 = 10;
//        int num4 = 20;
        int num3 = 10, num4 = 20;
        int sum = num3 + num4;

        System.out.println(sum);

        System.out.println("===================================");

        /*
        3. long 타입의 변수를 선언하고, 그 변수를 10000000000(백억)으로 초기화한 후 출력하는 프로그램을 작성하세요.
            boolean 타입의 변수를 선언하고, 그 변수를 true로 초기화한 후 출력하는 프로그램을 작성하세요.
         */

        long num5 = 10000000000L;
        System.out.println("num5 = " + num5);
        
        boolean t1 = true;
        System.out.println("t1 = " + t1);
    }
}
