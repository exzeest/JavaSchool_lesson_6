public class Person2 {
    private String name;
    private Integer age;

    @Override
    public String toString () {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    private Gender gender;

    public Person2 ( String name, Integer age, Gender gender ) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public Gender getGender () {
        return gender;
    }

    public void setGender ( Gender gender ) {
        this.gender = gender;
    }


}
