package sequence;

public class Test {
    public static void main(String[] args) {
        Sequence seq=new SequenceArrayImp();
        seq.add(1);
        seq.add(2);
        seq.add(3);
        seq.add(4);
        seq.add(5);
        seq.add(6);
        seq.show();
        seq.remove(1);
        seq.show();
        System.out.println(seq.size());
        System.out.println(seq.contains(4));
        System.out.println(seq.get(3));
        seq.show();
    }
}
