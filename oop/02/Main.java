package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        System.out.println("이름을 입력해주세요");
        name=sc.nextLine();
        System.out.println("나이를 입력해주세요");
        age = sc.nextInt();

        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);

    }
}
