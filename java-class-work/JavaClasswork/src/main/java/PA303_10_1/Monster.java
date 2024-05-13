package PA303_10_1;

public class Monster {
    public String id;
    private String name;

    public Monster(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setId(int id) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String attack() {
        System.out.println("I don't know how to attack");
        return null;
    }
}
