import java.util.Scanner;

class playGame {
    static int[] guess = new int[3];

    public playGame(Object answer) { }

    void start(int[] answer) {
        int s = 1;
        int b;
        Scanner sc = new Scanner(System.in);

        while (s < 3) {
            System.out.print("숫자를 입력해주세요 : ");
            int x = Integer.parseInt(sc.next());

            int a = 100;
            for (int i = 0; i < 3; i++) {
                guess[i] = x / a;
                x -= a * guess[i];
                a /= 10;
            }
            System.out.println(guess[0] + "" + guess[1] + "" + guess[2]);

            s = 0; b = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (guess[i] == answer[i]) {
                        s++;
                        break;
                    } else if (guess[i] == answer[j]) {
                        b++;
                    }
                }
            }
            if (s == 0 && b == 0) System.out.println("낫싱");
            else if (s == 3) System.out.println("3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            else System.out.println(b + "볼 " + s + "스트라이크");
        }
    }
}

//class userGuess(){
//
//}
public class main {
    public static void main(String[] args){
        int[] answer = new int[3];
        for (int i = 0; i < 3; i++) {
            answer[i] = (int) (Math.random() * 1000 % 9);
        }
        System.out.println(answer[0] + "" + answer[1] + "" + answer[2]);

        int guess[] = new int[3];
        System.out.println("숫자 야구 게임을 시작합니다.");

        playGame g = new playGame(answer);

        g.start(answer);
    }
}
