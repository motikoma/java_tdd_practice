package refactoring_regacy_code.tennis_game;

import java.util.Objects;

public class Player {
    int score;
    String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public boolean isMoreScoreThan(Player player2){
        return this.score > player2.score;
    }

    public boolean isTieScore(Player player2){
        return this.score == player2.score;
    }

    String getNormalScoreName(int tempScore) {
        switch (tempScore){
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return "";
    }

    boolean isAdvantageScore(){
        return this.score >= 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return score == player.score && Objects.equals(playerName, player.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, playerName);
    }

    @Override
    public String toString() {
        return "Player{" +
                "score=" + score +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}
