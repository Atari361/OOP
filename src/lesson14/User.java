package lesson14;

/**
 * Created by dell on 7/4/2017.
 */
public class User implements Comparable<User>{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
    @Override
    public String toString(){
        return name + "" + age;
    }

    @Override
    public int compareTo(User o) {
//        return this.age - o.age;
//        return this.name.length() - o.name.length();
        return this.name.compareTo(o.name);
    }
}
