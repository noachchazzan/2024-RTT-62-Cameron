package PA303_10_1;

public class StoneMonster extends Monster {
    public StoneMonster(String id, String name) {
        super(id, name);
    }



    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String attack(){
        return "stone attack";
    }
}
