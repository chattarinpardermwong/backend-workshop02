public class TennisGame2 implements TennisGame{
    private int player1Point = 0;
    private int player2Point = 0;

//    private String P1res = "";
//    private String P2res = "";
    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    //To fix duplicated 3-if
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
    }

    public String getScore(){
        String player1Result = "";
        String player2Result = "";
        String score = "";
        if (player1Point == player2Point && player1Point < 4)
        {
//            if (player1Point ==0)
//                score = "Love";
//            if (player1Point ==1)
//                score = "Fifteen";
//            if (player1Point ==2)
//                score = "Thirty";
            score = getPlayerMatchResult(player1Point);
            score += "-All";
        }
        if (player1Point == player2Point && player1Point >=3)
            score = "Deuce";

        if (player1Point > 0 && player2Point ==0)
        {
//            if (player1Point ==1)
//                player1Result = "Fifteen";
//            if (player1Point ==2)
//                player1Result = "Thirty";
//            if (player1Point ==3)
//                player1Result = "Forty";
            player1Result = getPlayerMatchResult(player1Point);
            player2Result = "Love";
            score = player1Result + "-" + player2Result;
        }
        if (player2Point > 0 && player1Point ==0)
        {
//            if (player2Point ==1)
//                player2Result = "Fifteen";
//            if (player2Point ==2)
//                player2Result = "Thirty";
//            if (player2Point ==3)
//                player2Result = "Forty";
            player2Result = getPlayerMatchResult(player2Point);
            player1Result = "Love";
            score = player1Result + "-" + player2Result;
        }

        if (player1Point > player2Point && player1Point < 4)
        {
//            if (player1Point ==2)
//                player1Result="Thirty";
//            if (player1Point ==3)
//                player1Result="Forty";
//            if (player2Point ==1)
//                player2Result="Fifteen";
//            if (player2Point ==2)
//                player2Result="Thirty";
            player1Result = getPlayerMatchResult(player1Point);
            player2Result = getPlayerMatchResult(player2Point);
            score = player1Result + "-" + player2Result;
        }
        if (player2Point > player1Point && player2Point < 4)
        {
//            if (player2Point ==2)
//                player2Result="Thirty";
//            if (player2Point ==3)
//                player2Result="Forty";
//            if (player1Point ==1)
//                player1Result="Fifteen";
//            if (player1Point ==2)
//                player1Result="Thirty";
            player1Result = getPlayerMatchResult(player1Point);
            player2Result = getPlayerMatchResult(player2Point);
            score = player1Result + "-" + player2Result;
        }

        if (player1Point > player2Point && player2Point >= 3)
        {
            score = "Advantage player1";
        }

        if (player2Point > player1Point && player1Point >= 3)
        {
            score = "Advantage player2";
        }

        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2)
        {
            score = "Win for player1";
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

//    public void SetP1Score(int number){
//
//        for (int i = 0; i < number; i++)
//        {
//            P1Score();
//        }
//
//    }
//
//    public void SetP2Score(int number){
//
//        for (int i = 0; i < number; i++)
//        {
//            P2Score();
//        }
//
//    }

    public void player1Score(){
        player1Point++;
    }

    public void player2Score(){
        player2Point++;
    }

    public void wonPoint(String player) {
//        if(player.equals("player1"))//NullPointerException get in null object
        if ("player1".equals(player))//Null safety
            player1Score();
        else
            player2Score();
    }
}
