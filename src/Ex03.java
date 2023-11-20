public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }

        System.out.println();
        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */
        String s = "*";
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
            s += "*";
        }
        System.out.println();

        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         */
        String b = " ";
        String a = "*";
        for (int i = 4; i > 0; i--) {
            for(int j=0; j<i; j++)
                System.out.print(b);
            System.out.print(a);
            a += "**";
            for(int j=0; j<i; j++)
                System.out.print(b);
            System.out.println();
        }
    }
}
