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
}

const tree = new BinarySearchTree()

console.log(tree.root)