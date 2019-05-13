public class Node {
    //节点内容
    int data;

    //下一个节点
    Node next;

    public Node(int data){
        this.data=data;
    }

    //为节点追加节点
    public Node append(Node node){
        //当前节点
        Node curNode=this;
        //循环向后找
        while(true){
            //取出下一个节点
            Node nextNode=curNode.next;
            //日过当前节点的下一个节点为null ,说明当前节点为最后一个节点
            if(nextNode==null){
                break;
            }
            //赋给当前节点
            curNode=nextNode;

        }
        //把需要追加的节点，追加到当前节点的下一个节点
        curNode.next=node;
        return this;//返回该节点，可以继续向当前节点追加节点
    }
    //获取下一个节点
    public Node next(){
        return this.next;
    }
    //返回当前接节点的值
    public int getdata(){
        return this.data;
    }
    //查看当前节点是否为最后一个节点
    public boolean isLast(){
        return this.next==null;
    }
    //删除节点
    public void remove(){
        Node newNext=next.next;
    }
}
