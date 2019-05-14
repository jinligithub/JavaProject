package LinkList;

public class Test {
    public static void main(String[] args) {
        LinkListImp list=new LinkListImp();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.show();
        list.remove(1);
        list.show();
        System.out.println(list.contains(3));
        list.clear();
        list.show();
    }
}
