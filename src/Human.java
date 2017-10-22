public class Human {
    private Gender gender;

    public Human () {}

    public Human ( Gender gender ) {
        this.gender = gender;
    }

    public Gender getGender () {
        return gender;
    }

    @Override
    public String toString () {
        return "Human{" +
                "gender=" + gender +
                '}';
    }

    public void setGender ( Gender gender ) {
        this.gender = gender;
    }
}
