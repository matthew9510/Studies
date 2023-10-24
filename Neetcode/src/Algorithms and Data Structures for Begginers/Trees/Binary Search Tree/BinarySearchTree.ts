class BinarySearchTreeNode {
    val: number | null;
    left: BinarySearchTreeNode | null;
    right: BinarySearchTreeNode | null;

    constructor(val: number) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    root: BinarySearchTreeNode | null;

    constructor() {
        this.root = null
    }

    insert(val: number) {
        this.root = this.insertNode(this.root, val);
    }

    insertNode(root: BinarySearchTreeNode | null, val: number) {
        if (root === null) {
            return new BinarySearchTreeNode(val);
        } else if (root.val !== null && val < root.val) {
            root.left = this.insertNode(root.left, val);
        } else {
            root.right = this.insertNode(root.right, val)
        }

        return root;
    }
}

const tree = new BinarySearchTree()

tree.insert(1);
tree.insert(2);
tree.insert(3);

console.log(tree.root)