package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc=sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        int count = 0;
        ArrayList<WiseSaying> sayings = new ArrayList<WiseSaying>(); // sayings라는 리스트를 생성
        while (true){
            String command=sc.nextLine().trim();
            if(command.equals("종료")){
                break;
            }else if(command.equals("등록")){
                System.out.println("명언을 등록해주세요.");
                String content = sc.nextLine().trim();
                System.out.println("작가를 입력해주세요.");
                String author = sc.nextLine().trim();

                int id = count +1;
                WiseSaying wiseSaying=new WiseSaying(id, content, author);
                sayings.add(wiseSaying);
                System.out.println(count+"번 명언을 등록했습니다.");

            }else if(command.equals("목록")){
                System.out.println("명언 수 " + sayings.size());
            }
        }
    }
}
