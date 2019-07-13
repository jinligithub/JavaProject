public class Mystack {
    /**
     * 栈 相当于一个箱子，从上向下放箱子。
     * @param args
     */
    //栈的地步使用数组实现
    int[] elements;

    public Mystack(){
        elements=new int[0];
    }
    //栈的操作

    //压入元素
    public void  push(int element){
        //创建一个新的数组
        int[] newArr=new int[elements.length+1];
        //把元素组的元素复制到新的数组中
        for(int i=0;i<elements.length;i++){
            newArr[i]=elements[i];
        }
        //把新元素放到数组中
        newArr[elements.length]=element;
        //用新的数组替换旧得数组
        elements=newArr;
    }
	
    //取出栈顶元素
    public int pop(){
        //防止数组越界,栈中没有元素
        if(elements.length==0){
            throw new RuntimeException("stack is empty");
        }
        //取出数组的最后一个元素
        int element= elements[elements.length-1];
        //创建一个新的数组
        int[] newArr=new int[elements.length-1];
        //把原数组中除过最后一个元素，其他元素都放入新的数组中
        for(int i=0;i<elements.length-1;i++){
            newArr[i]=elements[i];
        }
        //替换数组
        elements=newArr;
        //返回栈顶元素
        return element;
    }
    //查看栈顶元素4
    public int peek(){
        //防止数组越界,栈中没有元素
        if(elements.length==0){
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length-1];
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }

}
