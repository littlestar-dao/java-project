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
        if(scoreA == 1 && scoreB ==1){
            return "Fifteen-All";
        }else if (scoreA == 2 && scoreB == 2){
            return "Thirty-All";
        }else if(scoreA > 2 && scoreB >2){
            if(scoreA == scoreB){
                return "Deuce";
            }
        }

        if(scoreA == 2 && scoreB == 1){
            return "Thirty-Fifteen";
        }
        else if(scoreB == 2 && scoreA ==1){
            return "Fifteen-Thirty";
        }
        else if (scoreA == 1) {
            return "Fifteen-Love";
        } else if (scoreA == 2) {
            return "Thirty-Love";
        } else if (scoreA == 3) {
            return "Forty-Love";
        } else if (scoreA == 4) {
            return "Win for Player A";
        }
        else if(scoreB == 1){
            return "Love-Fifteen";
        }else if(scoreB == 2){
            return "Love-Thirty";
        }else if(scoreB == 3){
            return "Love-Forty";
        }else if(scoreB == 4){
            return "Win for Player B";
        }


        return "Love-All";
    }

}
