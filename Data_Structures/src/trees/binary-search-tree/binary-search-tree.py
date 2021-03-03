class BinarySearchTree: 
    
  # Root Node can be accessed by self.value in the methods
  def __init__(self, data):
    self.value = data
    self.leftChild = None
    self.rightChild = None

  # Attempt 1
  # def insert_node(self, data):
  #   if self.value and self.value > data: // obviously the self value exists if we are using it, the first part needs to be self.leftChild (to see if we need to insert it on the left yet or navigate to that node first before laying down another)
  #     self.leftChild.insert_node(data)
  #   if self.value and self.value < data:
  #       self.rightChild.insert_node(data)
  #   self.value = BinarySearchTree(data)
  # ------------------------------------------------
  # ---- ERROR WITH THE ABOVE COMMENTED CODE ---------
  #   Traceback (most recent call last):
  #   File "main.py", line 19, in <module>
  #     bst.insert_node(3)
  #   File "main.py", line 11, in insert_node
  #     self.leftChild.insert_node(data)
  # AttributeError: 'NoneType' object has no attribute 'insert_node'
  def insert_node(self, data):
   # This functions implies that this current value invoking this function is not None )
   # if the left child exists and the current value is greater than the one being inserted
    if self.leftChild and self.value > data:
      self.leftChild.insert_node(data)
    # if the left child doesn't exist and the current value is greater than the being inserted
    elif self.leftChild is None and self.value > data:
      self.leftChild = BinarySearchTree(data)
    # if the right child exists and the current value is greater than the one being inserted
    elif self.rightChild and self.value < data:
      self.rightChild.insert_node(data)
    # if the right child doesn't exist and the current value is greater than the being inserted
    else:
      self.rightChild = BinarySearchTree(data)

