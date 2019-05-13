public class MyQueue {
    //队列底层使用数组实现
    int[] elements;

    public MyQueue(){
        elements=new int[0];
    }
    //入队
    public  void add(int element){
        //创建一个数组
        int[] newArr=new int[elements.length+1];
        //把数组中元素复制到新数组中
        for(int i=0;i<elements.length;i++){
            newArr[i]=elements[i];
        }
        //把新元素放到数组中
        newArr[elements.length]=element;
        //把新数组赋值给旧数组
        elements=newArr;
    }
    //出队,返回触底元素
    public int poll(){
        //检查队列是否为空
        if(elements.length==0){
            throw new RuntimeException("Queue is empty");
        }
        //把数组中第0个元素取出来
        int element=elements[0];
        //创建新的数组
        int[] newArr=new int[elements.length-1];
        //复制原数组元素到新数组
        for(int i=0;i<newArr.length;i++){
            newArr[i]=elements[i+1];
        }
        //复制数组
        elements=newArr;
        return element;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }
    //获取队头元素
    public int queueFront(){
        //检查队列是否为空
        if(elements.length==0){
            throw new RuntimeException("Queue is empty");
        }
        return elements[0];
    }
    //返回队尾数据
    public int queueBack(){
        //检查队列是否为空
        if(elements.length==0){
            throw new RuntimeException("Queue is empty");
        }
        return elements[elements.length-1];
    }
    //返回队列的大小
    public int size(){
        return elements.length;
    }
}
