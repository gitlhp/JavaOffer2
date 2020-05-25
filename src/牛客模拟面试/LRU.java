package 牛客模拟面试;

/**
 * @ClassName: LRU
 * @Description:LRU算法-最近最久未使用
 * @Author: lhp
 * @Date: 2020/3/17 20:41
 * @Version: V1.0
 **/

import java.util.HashMap;

/**
 * 双向链表节点类
 */


/**
 * lru缓存定义
 */
public class LRU<K, V> {
    private int currentSize;//大小
    private int capcity;//总容量
    private HashMap<K, Node> caches;//记录所有node节点
    private Node first;//头指针
    private Node last;//尾指针

    public LRU(int size) {
        first.pre = null;
        last.next = null;
        currentSize = 0;
        this.capcity = size;
        caches = new HashMap<K, Node>(size);
    }

    class Node {
        //键
        K key;
        //值
        V value;
        //前向指针
        Node pre;
        //后续指针
        Node next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    /**
     * 添加元素
     *
     * @param key
     * @param value
     */
    public void put(K key, V value) {
        Node node = caches.get(key);
        //如果是新元素
        if (node == null) {
            node = new Node(key, value);
            //如果超过元素的总容纳量
            if (caches.size() >= capcity) {
                //移除最后一个节点
                caches.remove(last.key);
                removeLast();
                //创建新节点
                moveToHead(node);
                caches.put(key, node);
            } else {
                moveToHead(node);
                caches.put(key, node);
            }
        } else {
            //已经存在的元素进行旧值覆盖(通过key判断是否存在)
            node.value = value;
            moveToHead(node);
            caches.put(key, node);
        }
    }

    /**
     * 通过key获取元素
     *
     * @param key
     * @return
     */
    public Object get(K key) {
        Node node = caches.get(key);
        if (node == null) {
            return null;
        }
        //把访问的节点移动到首部
        moveToHead(node);
        return node.value;
    }

    /**
     * 根据key移除节点
     *
     * @param key
     * @return
     */
    private void remove(K key) {
        Node node = caches.get(key);
        //先删除链表中的节点
        if (node != null) {
            if (node == first) {
                first = node.next;
            } else if (node == last) {
                last = node.pre;
            } else {//中间节点
                node.pre.next = node.next;
                node.next.pre = node.pre;
            }
        }
        //后删除hash中的元素
        caches.remove(key);
    }

    /**
     * 移动元素到首部:访问已存在的元素时的操作
     *
     * @param node
     */
    private void moveToHead(Node node) {
        //恰好重复访问第一个元素
        if (first == node) {
            return;
        } else {
            remove(node.key);
            node.next = first;
            first.pre = node;
            first = node;
            first.pre = null;
        }
    }

    /**
     * 清除所有节点
     */
    public void clear() {
        first = null;
        last = null;
        caches.clear();
    }

    /**
     * 移除最后一个节点
     */
    private void removeLast() {
        if (last != null) {
            last = last.pre;
            last.next = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node node = first;
        while (node != null) {
            sb.append(String.format("%s:%s ", node.key, node.value));
            node = node.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LRU<Integer, String> lru = new LRU<Integer, String>(5);
        lru.put(1, "a");
        lru.put(2, "b");
        lru.put(3, "c");
        lru.put(4, "d");
        lru.put(5, "e");
        System.out.println("原始链表为:" + lru.toString());

        lru.get(4);
        System.out.println("获取key为4的元素之后的链表:" + lru.toString());

        lru.put(6, "f");
        System.out.println("新添加一个key为6之后的链表:" + lru.toString());

        lru.remove(3);
        System.out.println("移除key=3的之后的链表:" + lru.toString());
    }
}
