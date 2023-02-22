package com.codestates.seb.calculator;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("===Java Calculator===");

    Scanner input = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
    // TODO..
      System.out.print(" 첫번째 숫자를 입력해주세요 : ");
      int num1 = input.nextInt();

      System.out.print(" 두번째 숫자를 입력해주세요 : ");
      int num2 = input.nextInt();

      System.out.println(" ⚠️ 사용가능한 연산자 기호는 +, -, *, / 가 있습니다. ⚠️");
      System.out.print(" 원하는 연산자 기호를 입력해주세요 : ");
      String op = input.next();

      double num3 = 0;

      switch (op) {
        case "+" :
          num3 = num1 + num2;
          System.out.println(num3);
          break;
        case "-" :
          num3 = num1 - num2;
          System.out.println(num3);
          break;
        case "*" :
          num3 = num1 * num2;
          System.out.println(num3);
          break;
        case "/" :
          num3 = (double) num1 / (double)num2;
          System.out.println(num3);
          break;
        default:
          System.out.println("잘못된 입력입니다 : 사용 가능한 연산자 기호로 다시 입력해주세요.");
      }

  }
}
