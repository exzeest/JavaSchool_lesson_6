public class Person extends Human{
    private String name;
    private Integer age;

    public Person ( String name, Integer age, Gender gender ) {
        this.name = name;
        this.age = age;
        this.setGender (gender);
    }
    public Person () {}

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + this.getGender () + '\'' +
                '}';
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Integer getAge () {
        return age;
    }

    public void setAge ( Integer age ) {
        this.age = age;
    }


}
