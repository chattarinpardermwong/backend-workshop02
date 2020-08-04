### workshop-java-02 04-08-2020
#### Tennis-Refactor
 * refactoring by using getPlayerMatchResult() from 3-if-conditions
 
 EX.
 
 `if (player1Point ==0)
    score = "Love";
 if (player1Point ==1)
    score = "Fifteen";
 if (player1Point ==2)
    score = "Thirty";`
    
  * get into
 
 `//To fix duplicated 3-if
      public String getPlayerMatchResult(int playerScore){
          switch (playerScore){
              case 0:
                  return "Love";
              case 1:
                  return "Fifteen";
              case 2:
                  return "Thirty";
          }
          return "Forty";
      }`


