public class TheatreCat extends Cat{
    int groupID;
    String ability;

    public TheatreCat(int age, String name, String breed, boolean isMale, int groupID, String ability) {
        super(age, name, breed, isMale);
        this.groupID = groupID;
        this.ability = ability;
    }

    @Override
    public String toString() {
        return super.toString() + " " + ability;
    }
}
