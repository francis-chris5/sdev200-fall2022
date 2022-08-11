
package dynamicwebpage;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private String home;

    public Person() {
    }

    public Person(String name, int age, String home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old, and lives in " + home;
    }
    
    
    
}//end Person class()
