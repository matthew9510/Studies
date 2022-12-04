from binarySearchTree import BinarySearchTree

bst = BinarySearchTree(2)

# Insertion 1 set test case
# bst.insert_node(1)
# bst.insert_node(3)
# bst.insert_node(4)
# bst.insert_node(5)
# print(bst)
# print(bst.value)
# print(bst.rightChild.value)
# print(bst.rightChild.rightChild.value)
# print(bst.rightChild.rightChild.rightChild.value)

# Insertion 2 set case 
bst.insert_node(1)
bst.insert_node(4)
bst.insert_node(3)
bst.insert_node(5)

print(bst)
print(bst.value)
print(bst.rightChild.value)
print(bst.rightChild.leftChild.value)
print(bst.rightChild.rightChild.value)
