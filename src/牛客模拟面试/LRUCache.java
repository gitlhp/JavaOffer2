package 牛客模拟面试;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LRUCache
 * @Description:LRU
 * @Author: lhp
 * @Date: 2020/3/18 13:25
 * @Version: V1.0
 **/
class LRUNode {
    Integer key;
    Object value;
    LRUNode pre;
    LRUNode next;

    public LRUNode(Integer key, Object value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
    private int capacity;//总容量
    private Map<Integer, LRUNode> map = new HashMap<>();
    private LRUNode head;
    private LRUNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 插入节点
     * @param key
     * @param value
     */
    public void put(Integer key, Object value) {
        if (head == null) {
            head = new LRUNode(key, value);
            tail = head;//初始头和尾一致
            map.put(key,head);
        }
        LRUNode node = map.get(key);
        if (node != null) {
            //更新值
            node.value = value;
            //把他从链表删除并且插入到头结点
            removeAndInsert(node);
        }else {
            LRUNode tmp = new LRUNode(key,value);
            if (map.size()>=capacity){
                //先把尾结点从哈希表删除
                map.remove(tail.key);
                //删除尾结点
                tail = tail.pre;
                tail.next = null;
            }
            map.put(key,tmp);
            tmp.next = head;
            head.pre = tmp;
            head = tmp;
        }
    }

    /**
     * 访问节点
     * @param key
     * @return
     */
    public Object get(Integer key){
        LRUNode node = map.get(key);
        if (node!=null){
            //把这个节点删除并插入到头结点
            removeAndInsert(node);
            return node.value;
        }
        //没有
        return -1;
    }

    /**
     * 从链表中删除并且插入头结点
     *
     * @param node
     */
    private void removeAndInsert(LRUNode node) {
    //特殊情况先判断，例如该节点是否为头结点或者是尾结点
        if (node==head) {
            return;
        }else if (node==tail){
            tail=tail.pre;
            tail.next=null;
        }else {
            node.pre.next=node.next;
            node.next.pre=node.pre;
        }
        //插入到头结点
        node.next = head;
        node.pre = null;
        head.pre = node;
        head = node;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        LRUNode node = head;
        while (node!=null){
            str.append(String.format("%s:%s ",node.key,node.value));
            node = node.next;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(5);
        lru.put(1,"a");
        lru.put(2,"b");
        lru.put(3,"c");
        lru.put(4,"d");
        lru.put(5,"e");
        System.out.println("原始链表为："+lru.toString());
        lru.get(4);
        System.out.println("获取key为4的元素之后的链表:"+lru.toString());

        lru.put(6,"f");
        System.out.println("新添加一个key为6之后的链表:"+lru.toString());

    }
}
