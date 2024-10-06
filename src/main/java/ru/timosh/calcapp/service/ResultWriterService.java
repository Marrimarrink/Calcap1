package ru.timosh.calcapp.service;

import ru.timosh.calcapp.util.Calculator;

import java.util.Scanner;

public class ResultWriterService {
    public static void toCalc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, дружок!  Я  первая версия калькулятора и пока что умею только складывать, вычитать и умножать :) Давай попробуем?");
        System.out.println("введи  первое число");
        int num1 = scanner.nextInt();
        System.out.println("Число 1 = " + num1);
        System.out.println("Супер! А теперь...");
        System.out.println("введи второе число");
        int num2 = scanner.nextInt();
        System.out.println("Число 2 = " + num2);
        System.out.println("Отлично! Осталось выбрать  тип операции:");
        System.out.println("1. Сложение");
        System.out.println("2. Разность");
        System.out.println("3. Произведение");
        System.out.println("4. Завершить программу");
        int numOperation = scanner.nextInt();
        if (numOperation == 4){
            return;
        } else if (numOperation == 1){
            int answer = Calculator.subtraction(num1, num2);
            System.out.println("Ура! У меня для тебя есть ответ: " + answer);
        } else if (numOperation == 2){
            int answer = Calculator.subtraction(num1, num2);
            System.out.println("Ура! У меня для тебя есть ответ: " + answer);
        } else if (numOperation == 3){
            int answer = Calculator.multiplication(num1, num2);
            System.out.println("Ура! У меня для тебя есть ответ: " + answer);
        } else {
            System.out.println("Такой тип операции мне не известен");
        }
    }
}
