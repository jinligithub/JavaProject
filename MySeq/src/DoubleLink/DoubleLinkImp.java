package DoubleLink;

import org.omg.CORBA.NO_IMPLEMENT;
import sequence.Sequence;

public class DoubleLinkImp implements Sequence {
    //头结点
    private Node head;
    //尾节点
    private Node tail;
    //链表的长度
    private int size;
	
    //内部类节点
    private class Node{
        private Node pre;//前一个节点的指针
        private Node next;//下一个几点的指针
        private Object data;//节点的数据

        public Node (Object data) {
            this.data=data;
        }

        public Node(Node pre, Object data, Node next){
            this.pre=pre;
            this.data=data;
            this.next=next;
        }
    }
    //尾插
    @Override
    public void add(Object data) {
        //创建新节点
       Node newNode=new Node(tail,data,null);
       //如果为空链表
        if(head==null)
            head=newNode;
        else //不是空链表
            tail.next=newNode;
        //尾指针指向新添加的节点
        tail=newNode;
        size++;
    }

    @Override
    public Object remove(int index) {
        //检查索引的范围是否合理
        rangeCheck(index);
        //取得要删除的节点
        Node cur=node(index);
        Node pre=cur.pre;
        Node next=cur.next;
        //如果要删除的节点是头结点
        if(pre==null){
            head=cur.next;
            cur.next=null;
        }else if(next==null){//删除尾节点
            tail=cur.pre;
            tail.next=null;
        }else {
            //不是头结点,也不是尾节点
        pre.next=cur.next;
        next.pre=cur.pre;
        cur.pre=cur.next=null;
        }
        Object data=cur.data;
        cur.data=null;
        size--;
        return data;
    }
    //修改节点的数据
    @Override
    public Object set(int index, Object newData) {
        //检查索引
        rangeCheck(index);
        //获取修改节点
        Node cur=node(index);
        //获取修改节点的数据
        Object oldData=cur.data;
        //修改数据
        cur.data=newData;
        //返回修改的数据
        return oldData;
    }
    //获取节点的数据,下标从0开始
    @Override
    public Object get(int index) {
        //检查索引
        rangeCheck(index);
        return node(index).data;
    }
    //检查是否含有某个数据
    @Override
    public boolean contains(Object data) {
        //如果data==null
        if(data==null){
            for(Node tmp=head;tmp!=null;tmp=tmp.next){
                if(tmp.data==null){
                    return true;
                }
            }
        }else {//data!=null
            for(Node tmp=head;tmp!=null;tmp=tmp.next){
                if(tmp.data==data){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        //创建一个数组
        Object[] data=new Object[size];
        int i=0;
        //遍历链表，把链表节点数据保存到数组中
        for(Node tmp=head=head;tmp!=null;tmp=tail.next){
            data[i++]=tmp.data;
        }
        return data;
    }

    @Override
    public void clear() {
        Node tmp=head;
        while(tmp!=null){
            //保存下一个节点
            Node next=tmp.next;
            //清空前指针和后后指针,h和节点数据
            tmp.pre=tmp.next=null;
            tmp.data=null;
            //把tmp指向下一个节点
            tmp=next;
            //链表节点-1
            size--;
        }
    }

    @Override
    public void show() {
        Node cur=head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    private void rangeCheck(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("illegal index");
        }
    }
    //获取指定索引的节点，
    private Node node(int index){
        if(index <(size>>1)){//说明节点在前半部分
            Node tmp=head;
            for(int i=0;i<index;i++){
                tmp=tmp.next;
            }
            return tmp;
        }else {//说明节点在后半部分
            Node tmp=tail;
            for(int i=size-1;i>index;i--){
                tmp=tail.pre;
            }
            return tmp;
        }
    }

}
