import java.io.*;

class Person implements Serializable{
    private String name;
    private transient int age;

    public Person(String name, int age) {
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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class SerilizableTest {
    public static void main(String[] args) throws Exception {
        //序列化
        Person per=new Person("zhangsan",50);
        File file=new File("C:\\Users\\Z\\Desktop\\TestSer.txt");
        //取得输出流
        OutputStream out=new FileOutputStream(file);
        //输出终端
        ObjectOutputStream oos=new ObjectOutputStream(out);
        oos.writeObject(per);
        oos.close();

        //反序列化
//        File file=new File("C:\\Users\\Z\\Desktop\\TestSer.txt");
//        InputStream in =new FileInputStream(file);
//        ObjectInputStream ois =new ObjectInputStream(in);
//        Person per=(Person)ois.readObject();
//        System.out.println(per);



    }
}
