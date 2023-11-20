class Player {
    String name;
    int status;
}
public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보
        
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.

        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택

        // player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
        
        // 둘 중에 이긴 사람 출력, 무승부면 계속 반복

        Player player01 = new Player();
        Player player02 = new Player();

        player01.name = "이름1";
        player01.status = (int)(Math.random()*3+1);
        player02.name = "이름2";
        player02.status = (int)(Math.random()*3+1);

        System.out.println(player01.status);
        System.out.println(player02.status);

        while (true){
            if(player01.status > player02.status || (player01.status==1 && player02.status==3)){
                System.out.println("Player 1 이김");
                break;
            }
            else if (player01.status < player02.status || (player02.status==1 && player01.status==3)){
                System.out.println("Player 2 이김");
                break;
            }
            else {
                System.out.println("무승부");
            }
        }
//        while(player01.status == player02.status){
//            if(player01.status > player02.status) System.out.println("player 2 이김");
//            else System.out.println("player 1 이김");
//        }
    }
}
