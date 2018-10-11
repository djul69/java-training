package exercices;

public class Person {
private String name;
private int age;
private boolean wilder;

    public Person(String name, int age){
        this.name=name;
        this.age=age
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Int getAge(){
            return age;
        }

    public void setAge(int Age){
        this.age=age;
    }

    public boolean isWilder(){
        return wilder;
    }

    public void setWilde(boolean wilder)
    {
        this.wilder = wilder;
    }

    public String whoAmI (String name, int age){
            return "My name is "+name+" and I'm "+age;
    }

}
