package com;

import java.util.Scanner;

public class homeworkday1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] question = new String[5];
        String kaitoukouho = "\1.いいえ 2.はい 3.わからない";
        int[] kaitou = new int[5];
        int score = 0;
        question[0] = "テス1" + kaitoukouho;
        question[0] = "テス2" + kaitoukouho;
        question[0] = "テス3" + kaitoukouho;
        question[0] = "テス4" + kaitoukouho;
        question[0] = "テス5" + kaitoukouho;
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            kaitou[i] = scanner.nextInt();
            score += kaitou[i];
        }if(score > 15){
            System.out.println("相性良し。逆に大丈夫?");
        }else if(score > 10){
            System.out.println("そこそこ相性良し。丁度良い塩梅");
        }else if(score > 5){
            System.out.println("そこそこ価値観が違う");
        }else if(score > 1){
            System.out.println("価値観は違う");
        }
        System.out.println("自分は普通だと思う");
        System.out.println("1:思う,2:考えたことがない,3:思わない");
        System.out.println("自分という人間を通しての人生に飽き飽きしている");
        System.out.println("1:わかる,2:わからないでもない,3:どういうこと？");
        System.out.println("生きていく上で特に支障はない");
        System.out.println("1,ない,2:考えたことがない,3:ある");
        System.out.println("他人に言えないことがある");
        System.out.println("1,大それたことはない,2:ある,3:たくさんある");
        System.out.println("他人の好き/嫌い、うまくいく/いかないが激しい");
        System.out.println("1,ない,2:ある,3:どうしていいのかわからない");
    }
}
