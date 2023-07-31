package WiseList;

public class WiseInfo {

    int num;
    String wise;
    String author;

    WiseInfo(int num, String wise, String author) {
        this.num = num;
        this.wise = wise;
        this.author = author;
    }

    public int getNum() {
        return num;
    }

    public String getWise() {
        return wise;
    }

    public String getAuthor() {
        return author;
    }

    public String getOutFormat() {
        return num + " / " + author + " / " + wise;
    }
}
