'''
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.

Example 1:
Input
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4
'''

from collections import deque, OrderedDict


class LRUcache:
    def __init__(self, capacity):
        self.capacity = capacity
        self.dq = deque()
        self.h = {}

    def get(self, key):
        if key in self.h:
            val = self.h[key]
            self.dq.remove(key)
            self.dq.append(key)
            return val
        return -1

    def put(self, key, value):
        if key not in self.h:
            if self.capacity == len(self.dq):
                oldest = self.dq.popleft()
                del self.h[oldest]
        else:
            self.dq.remove(key)

        self.h[key] = value
        self.dq.append(key)


class LRUCache1:

    def __init__(self, capacity: int):
        self.od = OrderedDict()
        self.capacity = capacity

    def get(self, key: int) -> int:
        if key in self.od.keys():
            val = self.od[key]
            self.od.move_to_end(key, last=True)
            return val
        else:
            return -1

    def put(self, key: int, value: int) -> None:
        if key in self.od.keys():
            self.od[key] = value
            self.od.move_to_end(key, last=True)
        else:
            if len(self.od) >= self.capacity:
                self.od.popitem(last=False)
                self.od[key] = value
                self.od.move_to_end(key, last=True)
            else:
                self.od[key] = value
                self.od.move_to_end(key, last=True)


# using doublelinked list
class Node:
    def __init__(self, key=0, value=0):
        self.key = key
        self.value = value
        self.next = None
        self.prev = None


class DLinkedlist:
    def __init__(self):
        # initialize head and tail
        self.head, self.tail = Node(), Node()

        # link them in two directions
        self.head.next = self.tail
        self.tail.prev = self.head

    def add(self, node):
        # add the new node to the tail
        prev = self.tail.prev
        prev.next = node
        node.prev = prev

        node.next = self.tail
        self.tail.prev = node

    def remove(self, node):
        Prev = node.prev
        Next = node.next

        Prev.next = Next
        Next.prev = Prev

    def move_to_end(self, node):
        self.remove(node)
        self.add(node)

    def popitem(self):
        node = self.head.next
        self.remove(node)


class LRUCache:

    def __init__(self, capacity: int):
        self.cache = {}
        self.capacity = capacity
        self.DL = DLinkedlist()

    def get(self, key: int) -> int:
        if key not in self.cache:
            return -1
        node = self.cache[key]
        self.DL.move_to_end(node)
        return node.value

    def put(self, key: int, value: int) -> None:
        if key in self.cache:
            node = self.cache[key]
            # update value
            node.value = value
            self.DL.move_to_end(node)
        else:
            if len(self.cache) == self.capacity:
                del self.cache[self.DL.head.next.key]
                self.DL.popitem()

            node = Node(key, value)
            self.DL.add(node)
            self.cache[key] = node
