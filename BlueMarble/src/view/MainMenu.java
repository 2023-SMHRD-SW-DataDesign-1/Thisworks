package view;

import java.util.Scanner;

public class MainMenu {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      String id = new String();

      while (true) {


			System.out.println("부루마블 게임에 오신것을 환영합니다.");
			// 메인메뉴 화면
			// 랭킹화면
			// 종료화면
			// 플레이어 설정
			// 난이도 설정
			System.out.println("[1]플레이하기 [2]랭킹확인 [3]게임종료");
			System.out.println(">>");
			int check = sc.nextInt();
			if (check == 1) { // 플레이하기
				System.out.print("플레이어 인원수를 체크해주세요(2인~4인)");
				System.out.println(">>");
            int check2 = sc.nextInt();
            int i;
            if (check2 == 2) {
               for (i = 1; i <= 2; i++) {
                  String userid = "";

                  System.out.print("사용자 " + i + "의 아이디를 입력하세요");
                  System.out.println(">>");
                  userid = sc.next();

               }
               break;
            }
            if (check2 == 3) {
               for (i = 1; i <= 3; i++) {
                  String userid = "";

                  System.out.print("사용자 " + i + "의 아이디를 입력하세요");
                  System.out.println(">>");
                  userid = sc.next();

               }
               break;
            }
            if (check2 == 4) {
               for (i = 1; i <= 4; i++) {
                  String userid = "";
                  System.out.print("사용자 " + i + "의 아이디를 입력하세요");
                  System.out.println(">>");
                  userid = sc.next();

               }
               break;
            } else {
               System.out.println("2~4인 플레이만 가능합니다.");
            }
            break;
         }
         if (check == 2) {
            break;
         }
         if (check == 3) {
            System.out.println("게임을 종료합니다.");
 
            break;
         }

      }
   }

   
}