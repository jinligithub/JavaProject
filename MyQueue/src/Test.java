public class Test {
    public static void main(String[] args) {
        MyQueue mq=new MyQueue();
       System.out.println(mq.isEmpty());
       // System.out.println(mq.queueBack());
        //System.out.println(mq.queueFront());
        mq.add(1);
        mq.add(2);
        mq.add(3);
        mq.add(4);
        System.out.println(mq.poll());
        mq.add(8);
        System.out.println(mq.size());
        System.out.println(mq.queueBack());
        System.out.println(mq.queueFront());
        System.out.println(mq.poll());
        System.out.println(mq.isEmpty());

    }
}
