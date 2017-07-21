package exam1;

public class Exam01 {
    int scoreA = 0;
    int scoreB = 0;


    public Exam01(String firstPerson, String secondPerson) {
    }



    public void playerAWin() {
        scoreA++;

    }

    public void playerBWin() {
        scoreB++;


    }

    public String getScore() {
        if (scoreA == 1){
            return "Fifteen-Love";
        }else if (scoreA == 2){
            return "Thirty-Love";
        }else if (scoreA == 3){
            return "Forty-Love";
        }else if(scoreA == 4){
            return "Win for Player A";
        }


        return "Love-All";
    }

}
