package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LRUCache
 * @Description
 * @Author: lhp
 * @Date: 2020/3/20 12:53
 * @Version: V1.0
 **/
class LRUNode {
    Integer key;
    Integer value;
    LRUNode pre;
    LRUNode next;

    public LRUNode(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
    private int capacity;//缓存总容量
    private Map<Integer, LRUNode> map = new HashMap<>();
    private LRUNode head;
    private LRUNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 添加数据
     *
     * @param key
     * @param value
     */
    public void put(int key, int value) {
        //看该节点是否在缓存中
        if (head == null) {
            head = new LRUNode(key, value);
            tail = head;
            map.put(key, head);
            return;
        }
        LRUNode node = map.get(key);
        if (node != null) {
            //首先更新值
            node.value = value;
            //把他从链表中删除并且插入到头结点
            removeAndInsert(node);
        } else {
            LRUNode tmp = new LRUNode(key, value);
            if (map.size() >= capacity) {
                //先把尾结点从哈希表删除
                map.remove(tail.key);
                //删除尾结点
                if (tail!=head){
                    tail = tail.pre;
                    tail.next = null;
                }else {
                    //如果是只有一个节点就让头节点指向当前节点
                    head = tmp;
                }
            }
            map.put(key, tmp);
            tmp.next = head;
            head.pre = tmp;
            head = tmp;
        }

    }

    /**
     * 查询数据
     *
     * @param key
     * @return
     */
    public int get(int key) {
        LRUNode node = map.get(key);
        if (node != null) {
            removeAndInsert(node);
            return node.value;
        }
        return -1;
    }

    /**
     * 删除节点并把该节点
     *
     * @param node
     */
    private void removeAndInsert(LRUNode node) {
        //考虑头结点和尾结点
        if (node == head) {
            return;
        } else if (node == tail) {
            tail = tail.pre;
            tail.next = null;
        } else {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        //头插
        node.next = head;
        node.pre = null;
        head.pre = node;
        head = node;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(1);
//        cache.put(1,1);
//        cache.put(2,2);
//        System.out.println(cache.get(1));
//        cache.put(3,3);
//        System.out.println(cache.get(2));
//        cache.put(4,4);
//        System.out.println(cache.get(1));
//        System.out.println(cache.get(3));
//        System.out.println(cache.get(4));
        cache.put(2,1);
        System.out.println(cache.get(2));
        cache.put(3,2);
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));

    }
}
