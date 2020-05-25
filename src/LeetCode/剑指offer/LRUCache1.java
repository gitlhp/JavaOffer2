package LeetCode.剑指offer;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: LRUCache1
 * @Description:lru算法
 * @Author: lhp
 * @Date: 2020/5/14 10:14
 * @Version: V1.0
 **/
class LRUNode {
    Integer key;
    Integer val;
    LRUNode pre;
    LRUNode next;

    public LRUNode(Integer key, Integer val) {
        this.key = key;
        this.val = val;
    }
}

public class LRUCache1 {
    private int capacity;//总容量
    private Map<Integer, LRUNode> map = new HashMap<>(capacity);
    private LRUNode head;
    private LRUNode tail;

    public LRUCache1(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 增加节点，访问节点
     *
     * @param key
     * @param val
     */
    public void put(Integer key, Integer val) {
        if (head == null) {
            head = new LRUNode(key, val);
            tail = head;
            map.put(key, head);
            return;
        } else {
            LRUNode node = map.get(key);
            if (node != null) {
                //更新值第一步
                node.val = val;
                removeAndInsert(node);
            } else {
                LRUNode tmp = new LRUNode(key, val);
                if (map.size() >= capacity) {
                    map.remove(tail.key);
                    if (head != tail) {
                        tail = tail.pre;
                        tail.next = null;
                    } else {
                        //只有一个节点的情况
                        head = tmp;
                    }
                }
                map.put(key, tmp);
                tmp.next = head;
                head.pre = tmp;
                head = tmp;
            }
        }
    }

    /**
     * 将当前访问节点移动到链表头部，代表最近访问,容量满了就删除最底部的节点，属于最久未使用
     *
     * @param node
     */
    public void removeAndInsert(LRUNode node) {
        if (node == head) {
            return;
        } else if (node == tail) {
            tail = node.pre;
            tail.next = null;
            return;
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

    /**
     * @return
     */
    public int get(int key) {
        LRUNode node = map.get(key);
        if (node!=null){
            removeAndInsert(node);
            return node.val;
        }
        return -1;
    }
}
