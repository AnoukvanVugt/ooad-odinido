package nl.han.ica.ooad;

public class Score {

    String studentnaam;
    private int score;

    Score(String studentnaam) {
        this.studentnaam = studentnaam;
    }

    void setScore(int score) {
        this.score = score;
    }

    int getScore() {
        return score;
    }
}
