package com.codegym;

import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int lottery  = ThreadLocalRandom.current().nextInt(0,99+1);
        if(lottery <10){
            String LotterySo = String.valueOf(lottery);
            String LotteryString  = "0" + LotterySo;
        }
        String Lottery = String.valueOf(lottery);
        System.out.println("Nhập số thứ 1: ");
        Scanner scanner = new Scanner(System.in);
        int so1 = scanner.nextInt();
        System.out.println("Nhập số thứ 2: ");
        int so2 = scanner.nextInt();
        String chuso1 = String.valueOf(so1);
        String chuso2 = String.valueOf(so2);
        String chuso  = chuso1 + chuso2;
        int chusoint = Integer.parseInt(chuso);
        int hangdonvi = chusoint % 10;
        int hangchuc = (chusoint - hangdonvi)/10;
        String hangchucstring = String.valueOf(hangchuc);
        String hangdonvistring = String.valueOf(hangdonvi);
        String daochusostring = hangdonvistring + hangchucstring;

        int lotterydonvi = lottery %10;
        int lotterychuc = (lottery - lotterydonvi)/10;

        if(lottery<10){
            String LotterySo = String.valueOf(lottery);
            String LotteryString  = "0" + LotterySo;
            System.out.println("Số sổ số: "+ LotteryString);
        } else{
            System.out.println("Số sổ số: "+ lottery);

        }
        System.out.println(chuso);
        if(Lottery.equals(chuso)){
            System.out.println("Trúng 10000$");
        }
        else if(daochusostring.equals(Lottery)){
            System.out.println("Trúng 3000$");
        }
        else if(so1 == lotterychuc || so1 ==lotterydonvi || so2 == lotterychuc || so2 == lotterydonvi){
            System.out.println("Trúng 1000$");
        }
        else if(lottery <10 && so1 ==0 || so2 ==0) {
            System.out.println("Trúng 1000$");
        }
        else if(lottery <10 && so1 == hangdonvi ||so2==hangchuc){
            System.out.println("Trúng 10000$");
        }

    }
}
