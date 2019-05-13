public class Test {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        n1.append(n2).append(n3).append(new Node(4));
        System.out.println(n1.next().next().getdata());
        System.out.println(n1.next().next().isLast());

    }
}
