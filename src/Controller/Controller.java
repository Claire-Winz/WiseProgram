package Controller;

import WiseList.WiseController;

import java.util.Scanner;

public class Controller {

    public void WiseListControl() {

        Scanner sc = new Scanner(System.in);

        boolean run = true;

        System.out.println("======  명언 메모 앱  ======");
        System.out.println("------  명령어 리스트  ------");
        System.out.println(" *등록* *목록* *수정* *종료*");

        while (run) {

            System.out.print("명령을 입력해주세요. > ");

            switch (sc.nextLine()) {

                case "종료" :
                    run = false;
                    break;

                case "등록" :
                    WiseController.register();
                    break;

                case "목록" :
                    WiseController.list();
                    break;

                case "삭제" :
                    WiseController.delete();
                    break;

                case "수정" :
                    WiseController.change();
                    break;
            }
        }
    }
}
