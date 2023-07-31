package WiseList;

import java.util.Scanner;

import static WiseList.WiseArray.*;

public class WiseController {

    static Scanner sc = new Scanner(System.in);

    static int count = 1;

    public static void register() {
        System.out.print("명언 : ");
        String A = sc.nextLine();

        System.out.print("작가 : ");
        String B = sc.nextLine();

        wiseList.add(new WiseInfo(count, A, B));

        System.out.println(count + "번 명언이 등록되었습니다.");

        count++;
    }

    public static void list() {
        System.out.println("================================");
        System.out.println("번호 / 작가 /  명언");

        int i = 0;
        while (i < wiseList.size()) {
            System.out.println(wiseList.get(i).getOutFormat());
            i++;
        }

        System.out.println("================================");
    }

    public static void delete() {
        System.out.print("삭제할 명언의 번호를 입력해주세요 : ");
        int inputNum = sc.nextInt();
        sc.nextLine();

        boolean check = false;

        for ( int i = 0; i < wiseList.size(); i++) {
            if ( wiseList.get(i).getNum() == inputNum ) {
                wiseList.remove(i);
                System.out.println(inputNum + "번 명언이 삭제되었습니다.");
                check = true;
            }
        }

        if (check == false) {
            System.out.println(inputNum + "번 명언은 존재하지 않습니다.");
        }
    }

    public static void change() {
        System.out.print("수정할 명언의 번호를 입력해주세요 : ");
        int inputNum = sc.nextInt();
        sc.nextLine();

        boolean check = false;

        for ( int i = 0; i < wiseList.size(); i++) {
            if ( wiseList.get(i).getNum() == inputNum ) {
                System.out.print("수정할 명언 : ");
                String modWise = sc.nextLine();

                System.out.print("수정할 작가 : ");
                String modAuthor = sc.nextLine();

                WiseInfo setInfo = new WiseInfo(inputNum, modAuthor, modWise);

                wiseList.set(i, setInfo);

                System.out.println(inputNum + "번 명언이 수정되었습니다.");
                check = true;
            }
        }

        if (check == false) {
            System.out.println(inputNum + "번 명언은 존재하지 않습니다.");
        }
    }
}
