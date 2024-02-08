class ListNode {    
    constructor (val) {
        this.val = val;
        this.next = null;
    } 
}

class Queue {
    constructor() {
        this.left = null;
        this.right = null;
    }

    enqueue(val) {
        const newNode = new ListNode(val);
        if (this.right != null) {  
        // Queue is not empty 
            this.right.next = newNode;
            this.right = this.right.next;
        } else {       
        // Queue is empty             
            this.left = newNode;
            this.right = newNode;
        }
    }

    dequeue() {
        if (this.left == null) {
        // Queue is empty 
            return;
        }
        // Remove left node and return value
        const val = this.left.val;
        this.left = this.left.next;
        // If there was only 1 value in the queue before we dequeued we will need to reset right pointer
        if (!this.left) {
            this.right = null;
        }
        return val;    
    }

    print() {
        let cur = this.left;
        let s = "";
        while(cur != null) {
            s+= cur.val + "->";
            cur = cur.next;
        }
        console.log(s)
    }
}

const queue = new Queue()
queue.enqueue(1)
queue.enqueue(2)
queue.dequeue()
