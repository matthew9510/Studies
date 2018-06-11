class Node:
    """
    Node visual representation:
     +------+----------------+
     | Data | next (pointer) |
     +------+----------------+
    """
    def __init__(self, data):
        self.data = data
        self.next = None

    """
    Note:
    That self is the first argument of every class method including __init__, it's always a reference to the 
    current INSTANCE of the class. 
    In the __init__ method, self refers to the newly created object; in other class methods, it refers to the 
    instance whose method was was called.
    In a
    """

class LinkedList:
    """
    Think of the constructor as creating a place in memory which is essentially a pointer that can be referred to later
    on for assignments of new nodes and accessing of all nodes
    Note: No random access of nodes; no llist[2].data
    +-----------------------------+
    | place in memory, called head|
    +-----------------------------+
    """
    def __init__(self):
        """
         Essentially the pointer that will be used to point to Node Objects later on, after declaration and
         initialization of a variable of a LinkedList Object
        """
        self.head = None

    def print_list(self):
        """
        Prints the LinkedList
        :return: Nothing
        """
        temp = self.head
        while temp:  # while the head or node.next doesn't equal None
            print(temp.data)
            temp = temp.next

    def push(self, data):
        """
        This will add a new Node to the beginning of a LinkedList
        :param data: any Object desirable, as long as it has a str or repr method
        :return: Nothing
        """
        head = self.head
        new_node = Node(data)
        new_node.next = head
        self.head = new_node

    def append(self, data):
        """
        Add new node to end of LinkedList
        """
        new_node = Node(data)
        current = self.head
        previous = None
        if current is None:  # Nothing in LinkedList
            current.next = new_node
        else:
            while current:
                if current.next is None:
                    current.next = new_node
                    return
                else:
                    previous = current
                    current = current.next

    def insert_after(self, find_data, new_data):
        current = self.head  # NOTE THE THE HEAD VALUE WILL BE UPDATED TO BE A NODE BY THIS POINT
        new_node = Node(new_data)

        if current is None:
            return "Nothing in LinkedList"
        else:
            while current:
                if current.data == find_data:
                    temp_pointer = current.next
                    current.next = new_node
                    new_node.next = temp_pointer
                    return  # this kills the loop
                else:
                    current = current.next

    def delete(self, data_to_del):
        """
        if not self.head:
            return "Item not in list due to an empty list"
        NOTE: LETS NOT USE self.head AFTER WE SET CURRENT
        """
        current = self.head

        if current is None:
            print("Can't delete anything from an empty list")

        # If the head node itself contains the data we want to delete
        # if current.next  WRONG LETS NOT USE CURRENT.NEXT AS A TEST CASE BAD PROGRAMMING
        if current is not None:
            if current.data == data_to_del:
                self.head = current.next  # note this takes care of if there is one thing in the list
                current = None
                return

        # no else needed just jump to while
        while current:  # SHIMMY UNTIL FOUND, WHEN FOUND BREAK
            if current.data == data_to_del:
                break
            # below is treated as else yet we don't need a else statement it'll just dive in
            previous = current  # note that this variable is accessible throughout the rest of the definition scope
            current = current.next

        if current is None:
            print("we couldn't find {} in LinkedList".format(data_to_del))
            return
        #else we found it and need to unlink
        previous.next = current.next
        current = None
        return






if __name__ == "__main__":
    llist = LinkedList()  # Declaration and initialization of LinkedList Object

    first_node = Node(1)  # assigns the LinkedList.head to point to the first node
    second_node = Node(2)
    third_node = Node(3)

    '''
        Three nodes have been created.
        We have references to these three blocks as first_node, second_node and third_node

        first_node        second_node        third_node
             |                 |                 |
             |                 |                 |
        +----+------+     +----+------+     +----+------+
        | 1  | None |     | 2  | None |     |  3 | None |
        +----+------+     +----+------+     +----+------+
    '''

    # Linking Time
    llist.head = first_node
    llist.head.next = second_node  # links the first node with the second node
    second_node.next = third_node  # links the second node with the third node

    '''
    Now next of first node second Node refers to third.  So all three
    nodes are linked.
    Note: 
        llist.head (pointer in memory) = first_node # now we have a pointer in memory to refer to later on.
        llist.head.next = second_node
        
    llist.head        second_node        third_node
         |                |                  |
         |                |                  |
    +----+------+     +----+------+     +----+------+
    | 1  |  o-------->| 2  |  o-------->|  3 | null |
    +----+------+     +----+------+     +----+------+ 
    '''
    llist.print_list()
    print("pushing 4 to front of list")
    llist.push(4)
    llist.print_list()

    print("Appending 4 to end of list")
    llist.append(4)
    llist.print_list()

    print("Inserting 5 after 4")
    llist.insert_after(4, 5)
    llist.print_list()

    print("Deleting 4")
    llist.delete(4)
    llist.print_list()