package sequence;

import java.util.Arrays;

/**
 * 顺序表
 */
public class SequenceArrayImp implements Sequence {
   private static final int DEFAULT_CAPACITY=10;//数组的初始大小
   private int size;//顺序表元素个数
   private Object[] elementData;//顺序表数组
   private static final int MAX_ARRAY_SIZE=Integer.MAX_VALUE-8;

   public SequenceArrayImp(){
       this.elementData=new Object[DEFAULT_CAPACITY];
   }
    @Override
    public void add(Object data) {
       //检查容量
       ensureCapacity(size+1);
       //添加元素
       elementData[size++]=data;
    }

    @Override
    public Object remove(int index) {
      //检查容量
       rangeCheck(index);
       //获取要删除元素
        Object oldData=elementData[index];
       //移动元素的个数
        int moveSize=size-index-1;
        /**
         * System中提供了一个native静态方法arraycopy(),
         * 可以使用这个方法来实现数组之间的复制。对于一维数组来说，
         * 这种复制属性值传递，修改副本不会影响原来的值。
         * 对于二维或者一维数组中存放的是对象时，
         * 复制结果是一维的引用变量传递给副本的一维数组，
         * 修改副本时，会影响原来的数组
         *
         * 方法说明：
         * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
         * 将指定源数组中的数组从指定位置复制到目标数组的指定位置。
         */
        if(moveSize>0){
            System.arraycopy(elementData,index+1,elementData,index,moveSize);
        }
        //数组长度-1
        elementData[--size]=null;
        //返回删除元素
        return oldData;
    }

    @Override
    public Object set(int index, Object newData) {
       //检查是否是顺序表范围内
       rangeCheck(index);
       //获取要替换元素
        Object oldData=elementData[index];
        //替换元素
        elementData[index]=newData;
        //返回替换的元素
        return oldData;
    }

    @Override
    public Object get(int index) {
       //检查是否超过容量
       rangeCheck(index);
       //直接返回对应位置的元素
        return elementData[index];
    }

    @Override
    public boolean contains(Object data) {
       if(data==null){
           //如果传进来的数据为null
           for(int i=0;i<size;i++){
               if(elementData[i]==null){
                   return true;
               }
           }
       }else{
           //如果传进来的数据为null
           for(int i=0;i<size;i++){
               if(elementData[i].equals(data)){
                   return true;
               }
           }
       }
        return false;
    }

    @Override
    public int size() {
       //返回当前数组的大小
        return this.size;
    }

    @Override
    public Object[] toArray() {
       //赋值指定长度大小的数组
        return Arrays.copyOf(elementData,size);
    }

    @Override
    public void clear() {
       for(int i=0;i<elementData.length;i++){
           elementData[i]=null;//把顺序表的每个位置的元素都置为空
       }
       this.size=0;
    }

    @Override
    public void show() {
        for(int i=0;i<elementData.length;i++){
            System.out.print(elementData[i]+" ");
        }
        System.out.println();
    }

    //检查是否需要扩展容量
    private void ensureCapacity(int minCap){
       //检查是否超过顺序表的容量
       if(minCap-elementData.length>0){
           grow(minCap);
       }
    }
    //扩容
    private void grow(int minCap){
       //旧数组的长度
       int oldCap=elementData.length;
       //新数组的长度,为旧数组的2倍
        int newCap=oldCap<<1;

        if(newCap-minCap<0){
            newCap=minCap;
        }
        if(newCap-MAX_ARRAY_SIZE>0){
            throw  new ArrayIndexOutOfBoundsException("数组超过做大阈值");
        }
        //把新数组赋给就数组
        elementData=Arrays.copyOf(elementData,newCap);
    }
    //检查数组范围
    private void rangeCheck(int index){
       if(index>=size){
           throw new IndexOutOfBoundsException("下标不存在");
       }
    }
}
