package com.booleanuk;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class Scrabble {
       String word;
       Scores letterScores;

       public Scrabble(String word) {
              this.letterScores = new Scores();
              this.word = word.toUpperCase().trim();
       }

       public int score() {
              int wordScore = 0;
              for (int i = 0; i < this.word.length(); i++) {
                     char ch = this.word.charAt(i);
//                     wordScore += this.letterScores.scores.get(ch);
                     wordScore += this.letterScores.getScore(ch);
              }
              // it returns the value of the wordScore
              return wordScore;
       }
}