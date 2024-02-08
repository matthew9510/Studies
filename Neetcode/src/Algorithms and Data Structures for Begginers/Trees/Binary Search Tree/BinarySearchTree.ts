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

    remove(val: number) {
        this.root = this.removeNode(this.root, val)
    }

    findMin(root: BinarySearchTreeNode | null): BinarySearchTreeNode | null {
        let curr = root;

        while (curr && curr.left !== null) {
            curr = curr.left;
        }
        return curr;
    }

    removeNode(root: BinarySearchTreeNode | null, val: number): null | BinarySearchTreeNode {
        // If tree is empty
        if (root === null) {
            return root;
        }

        if (root.val && val < root.val) {
            root.left = this.removeNode(root.left, val);
        } else if (root.val && val > root.val) {
            root.right = this.removeNode(root.right, val);
        } else {
            // Check if node to be removed has one child
            if (root.left === null) {
                return root.right;
            } else if (root.right === null) {
                return root.left;
            }
            // If node to be removed has two children
            else {
                let minNode = this.findMin(root.right)
                if (minNode && minNode.val !== null) {
                    root.val = minNode.val;
                    this.removeNode(root.right, minNode.val);
                }
            }

        }
        return root;
    }

    inOrderTraversal(root: BinarySearchTreeNode | null){
        if(!root){
            return
        }

        this.inOrderTraversal(root.left)
        console.log(root.val);
        this.inOrderTraversal(root.right)
    }

    preOrderTraversal(root: BinarySearchTreeNode | null){
        if(!root){
            return
        }
       
        console.log(root.val);
        this.preOrderTraversal(root.left)
        this.preOrderTraversal(root.right)
    }

    postOrderTraversal(root: BinarySearchTreeNode | null){
        if(!root){
            return
        }
       
        this.postOrderTraversal(root.left)
        this.postOrderTraversal(root.right)
        console.log(root.val);
    }
}

const tree = new BinarySearchTree()

tree.insert(4);
tree.insert(3);
tree.insert(2);
tree.insert(6)
tree.insert(5)
tree.insert(7)
console.log(tree.root)
// tree.remove(4)
// console.log("\nAfter removal of 4")
// console.log(tree.root)

console.log('\nin order:')
tree.inOrderTraversal(tree.root)
console.log('\npre order:')
tree.preOrderTraversal(tree.root)
console.log('\npost order:')
tree.postOrderTraversal(tree.root)
