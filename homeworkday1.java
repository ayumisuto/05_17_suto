package com;

import java.util.Scanner;

public class homeworkday1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] question = new String[5];
        String kaitoukouho = "1.当てはまる 2.わからない 3.当てはまらない";
        int[] kaitou = new int[5];
        int score = 0;
        question[0] = "自分は普通だと思う" + kaitoukouho;
        question[1] = "人生に満足している" + kaitoukouho;
        question[2] = "生きていく上で特に支障はないと思う" + kaitoukouho;
        question[3] = "他人に言えないことがある" + kaitoukouho;
        question[4] = "誰とでもうまく人間関係を構築することができる" + kaitoukouho;
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            kaitou[i] = scanner.nextInt();
            score += kaitou[i];
        }if(score > 15){
            System.out.println("相性良し。人生大丈夫?");
        }else if(score > 10){
            System.out.println("そこそこ相性良し。まだ人生間に合う");
        }else if(score > 5){
            System.out.println("私と価値感は少し異なるが、丁度良い塩梅");
        }else if(score > 1){
            System.out.println("私と価値感は異なる。普通の人生");
        }
    }
}
