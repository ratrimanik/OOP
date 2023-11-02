package Model;

public class ToDo {
    public int id;
    public int owner;
    public String title;
    public String description;
    public String date;
    public String status;

    public ToDo(int id, int owner, String title, String description, String date) {
        this.id = id;
        this.owner = owner;
        this.title = title;
        this.description = description;
        this.date = date;
    }
}