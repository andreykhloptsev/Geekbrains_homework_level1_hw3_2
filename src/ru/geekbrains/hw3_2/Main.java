package ru.geekbrains.hw3_2;

import java.util.Random;
import java.util.Scanner;

public class Main {

//    Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
//            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
//            "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
//    Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//            apple – загаданное
//    apricot - ответ игрока
//    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//    Для сравнения двух слов посимвольно, можно пользоваться:
//    String str = "apple";
//    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//    Играем до тех пор, пока игрок не отгадает слово
//    Используем только маленькие буквы


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
           "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
            "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random =new Random();
        String word = words[random.nextInt(24)];//загаданное слово
        char[] usersWord = new char[15];//вариант, который показывается пользователю
        for (int i = 0; i <usersWord.length ; i++) {
            usersWord[i]='#';
        }
        String attempt ;//попытка
        int charNumber;//для определения где букв меньше в искомом слове или в попытке
        System.out.println("Слово загадано");
        while (true)
        {
            System.out.println("Предложите ваш вариант:");
            attempt = scr.nextLine();
            if (attempt.equals(word))
            {
                System.out.println("You win!!");
                break;
            } else
            {
                charNumber=attempt.length();//коряво, но не сообразил как лучше сделать=(
                if (attempt.length()>word.length())
                {charNumber=word.length();}
                for (int i = 0; i <charNumber ; i++) {
                    if (word.charAt(i)==attempt.charAt(i))
                    {
                        usersWord[i]=word.charAt(i);
                    }
                }
                System.out.println("Строка с угаданными вами символами:");
                for (int i = 0; i <usersWord.length ; i++) {
                    System.out.print(usersWord[i]);
                }
                System.out.println();
            }
        }
    }
}
