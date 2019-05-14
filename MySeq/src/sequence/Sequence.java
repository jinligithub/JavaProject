package sequence;

public interface Sequence {
    //添加元素
    void add(Object data);
    //删除元素
    Object remove(int index);
    //修改元素的值
    Object set(int index,Object newData);
    //获取元素
    Object get(int index);
    //是否包含这个元素
    boolean contains(Object data);
    //单链表的大小
    int size();
    //转为数组
    Object[] toArray();
    //清空链表
    void clear();
    //打印单链表
    void show();

}
