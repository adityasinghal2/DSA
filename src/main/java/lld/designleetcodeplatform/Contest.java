package lld.designleetcodeplatform;

import java.util.List;

public class Contest {

    private String name;
    private Level level;
    private List<Question> ques;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public List<Question> getQues() {
        return ques;
    }

    public void setQues(List<Question> ques) {
        this.ques = ques;
    }
}
