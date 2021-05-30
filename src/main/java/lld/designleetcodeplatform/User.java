package lld.designleetcodeplatform;

import java.util.List;

public class User {

    private String userName;
    private int score;
    private List<Contest> cons;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Contest> getCons() {
        return cons;
    }

    public void setCons(List<Contest> cons) {
        this.cons = cons;
    }
}
