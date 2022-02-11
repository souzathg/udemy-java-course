package classes;

public class Student3 {
    private String name;
    private String email;
    private int room;

    public Student3(String name, String email, int room) {
        this.setName(name);
        this.setEmail(email);
        this.setRoom(room);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

}
