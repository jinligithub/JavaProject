package DoubleLink;

public class Test {
    public static void main(String[] args) {
        DoubleLinkImp dl=new DoubleLinkImp();
        dl.add(1);
        dl.add(2);
        dl.add(3);
        dl.add(4);
//        dl.add(5);
//        dl.add(6);
//        dl.add(7);
//        dl.add(8);
        System.out.println(dl.size());
        dl.show();
        System.out.println(dl.contains(7));
        System.out.println(dl.get(0));
        System.out.println(dl.get(1));
        System.out.println(dl.get(2));
        System.out.println(dl.get(3));
//        System.out.println(dl.get(4));
//        System.out.println(dl.get(5));
//        System.out.println(dl.get(6));
//        System.out.println(dl.get(7));
        //System.out.println(dl.get(8));
        System.out.println();
        System.out.println(dl.remove(0));
        dl.show();
    }
}
