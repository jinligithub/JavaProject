public class Test {
    public static void main(String[] args) {
        //
        Mystack ms=new Mystack();
        //压入数据
        ms.push(1);
        ms.push(12);
        ms.push(13);
        ms.push(14);
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.isEmpty());
    }
}
