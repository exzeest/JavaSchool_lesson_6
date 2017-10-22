public class main {
    public static void main ( String[] args ) {
        Person mike = new Person ();
        Person2 nike = new Person2 ("Mike", 12, Gender.MAN);
        /*System.out.println (nike.toString ());
        BeanUtils.assign (nike, mike);
        System.out.println (nike.toString ());*/

        BeanUtils.assign (mike, nike);
        System.out.println ("Задаем новый объект класса Person в пустом конструкторе и \n" +
                " ассигнируем ему поля инициализованного объекта Person2 " + mike.toString ());
        System.out.println ("nike: " + nike.toString ());

        Human woman = new Human (Gender.WOMAN);
        BeanUtils.assign (mike, woman);
        System.out.println ("Меняем пол mike на пол woman :Human - суперкласса Person " + mike.toString ());

        Human man = new Human ();
        BeanUtils.assign (man, nike);
        System.out.println ("Ставим пол из mike в переменную man " + man.toString ());

    }
}
