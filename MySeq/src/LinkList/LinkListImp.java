package LinkList;

import sequence.Sequence;


public class LinkListImp implements Sequence {
    // 虚拟头节点，不存储元素，专门作为头节点使用
    private Node head;//头结点
    private int size;//链表大小

    //---内部节点--内部类
    private class Node{
        /**
         * data:节点数据
         * next:存放的下一个节点
         */
        private Object data;
        private Node next;
        Node(Object data,Node next){
            this.data=data;
            this.next=next;
        }
        Node(Object data){
            this.data=data;
        }
    }

    public LinkListImp(){
        head=new Node(null,null);
    }

    @Override
    public void add(Object data) {
        //尾插
        addLast(data);

    }

    @Override
    public Object remove(int index) {
        rangeCheck(index);
        //获取头节点
        Node pre=head;
        //找到要删除节点的前一个节点
        for(int i=0;i<index;i++){
            pre=pre.next;
        }
        //获取要删除节点
        Node cur=node(index);
        //把当前节点指向要删除节点的下一个节点
        pre.next=cur.next;
        cur.next=null;
        cur.data=null;
        size--;
        return true;
    }

    @Override
    public Object set(int index, Object newData) {
        //检查索引的大小
        rangeCheck(index);
        //取得index的节点
        Node node =new Node(index);
        //获取替换夜店的数据
        Object oldData=node.data;
        //替换节点的值
        node.data=newData;
        //返回比替换节点的值
        return oldData;

    }

    @Override
    public Object get(int index) {
        rangeCheck(index);
        //取得相应index的node节点的值
        return node(index).data;
    }

    @Override
    public boolean contains(Object data) {
        Object[] datas=toArray();
        if(data==null){
            //如果查询数据为空
            for(int i=0;i<size;i++){
                if(datas[i]==null){
                    return true;
                }
            }
        }else{
            //如果查询数据 不为空
            for(int i=0;i<size;i++){
                if(datas[i]==data){
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
        //创建一个数组保存节点的数据
        Object[] result=new Object[size];
        int i=0;
        //把节点中的数据存入数组中
        for(Node tmp=head.next;tmp!=null;tmp=tmp.next){
            result[i++]=tmp.data;
        }
        return result;
    }

    @Override
    public void clear() {
        Node cur=head.next;
        while(cur!=null){
            //保存下一个节点的位置，并且质控当前节点
            Node tmp=cur.next;
            cur.data=null;
            cur.next=null;
            //改变当前节点的位置
            cur=tmp;
            //链表的长度-1
            size--;
        }

    }

    @Override
    public void show() {
        //拿到头节点
        Node cur=head.next;
        for(int i=0;i<size;i++){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //指定位置插入新节点
    public void add(int index,Object data){
        //检查索引是否合法
        rangeCheck(index);
        //获取链表的头结点
        Node pre=head;
        //找到指定位置的节点
        for(int i=0;i<index;i++){
            pre=pre.next;
        }
        //插入节点
        Node newNode =new Node(data);
        newNode.next=pre.next;
        pre.next=newNode;
        //链表长度加一
        size++;
    }
    //头插
    private void addFrist(Object data){
        add(0,data);
    }
    //尾插
    private void addLast(Object data){
        add(size,data);
    }
    private void rangeCheck(int index){
        //检查索引是否在单链表的长度范围内
        if(index<0||index>size){
            throw  new IndexOutOfBoundsException("illegal index");
        }
    }
    //找到index（索引 ）的当前节点
    private Node node(int index){
        //取得链表的头结点
        Node cur=head.next;
        //找到指定索引的节点
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;
    }
}
