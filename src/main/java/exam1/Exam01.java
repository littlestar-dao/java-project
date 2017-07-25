package exam1;

public class Exam01 {
    private int scoreA = 0;
    private int scoreB = 0;
    private String player1Name;
    private String player2Name;
    private int countDuece = 0;


    public Exam01(String firstPerson, String secondPerson) {
        this.player1Name = firstPerson;
        this.player2Name = secondPerson;
    }

    public void playerAWin() {
        scoreA++;
    }

    public void playerBWin() {
        scoreB++;
    }

    public String getScore() {
        int minusResult = scoreA - scoreB;
        if (isDuece()) {
            return "Deuce";
        } else if (isAdvantage()) {
            if (minusResult == 1) {
                return "Advantage " + this.player1Name;
            } else {
                return "Advantage " + this.player2Name;
            }
        } else if (isWinner()) {
            if (minusResult >= 2) {
                return "Win for " + this.player1Name;
            } else {
                return "Win for " + this.player2Name;
            }
        } else if (normal()) {
            String player1 = convertScoreToString(scoreA);
            if (scoreA == scoreB) {
                return player1.concat("-All");
            } else {
                return player1.concat("-").concat(convertScoreToString(scoreB));
            }
        }
        return "Love-All";
    }

    private boolean isDuece() {
        if (scoreA == scoreB && scoreA > 2 && scoreB > 2) {
            countDuece++;
            return true;
        }
        return false;
    }

    private boolean isAdvantage() {
        if (scoreA >= 4 || scoreB >= 4) {
            int minusResult = scoreA - scoreB;
            return (minusResult == 1 || minusResult == -1);
        }
        return false;
    }

    private boolean isWinner() {
        int minusResult = scoreA - scoreB;
        return (scoreA >= 4 || scoreB >= 4 && ((minusResult >= 2) || (minusResult <= -2)));
    }

    private boolean normal() {
        return (countDuece <= 0);
    }

    private String convertScoreToString(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "";
        }
    }
}
