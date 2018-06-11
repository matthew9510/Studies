class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def print_list(self):
        temp = self.head
        if not temp:
            print("Empty LinkedList")
        while temp:
            print(temp.data)
            temp = temp.next

    def push(self, data):
        """
        Add new node to beginning of LinkedList
        """

        head = self.head
        new_node = Node(data)

        if head is None:
            head = new_node
        else:
            new_node.next = head
            # head = new_node  # WRONG
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

    def delete(self, item_to_del):
        current = self.head

        if current is None:
            print("Empty LinkedList, item not in list")


        if current is not None:
            # head node is the node to be deleted
            if current.data == item_to_del:
                current = current.next
                return

        while current:
            if current.data == item_to_del:  # Tricky that condition is before, it's like were double checking if it could be the head node but we're also checking every other node at the same time with our logic
                break
            previous = current  # Note that this variable is available outside while loop, if the variable was declared in a if loop and then it wasn't triggered it wouldn't be accessable later nor would it be declared
            current = current.next

        # if we shimmied through and didn't find the item
        if current is None:
            return "item not found"

        # else we found it and need to unlink
        previous.next = current.next
        current = None
        return


if __name__ == "__main__":
    llist = LinkedList()
    first_node = Node(1)
    second_node = Node(2)
    llist.head = first_node
    first_node.next = second_node
    llist.print_list()

    print("Pushing 3 to beginning of list")
    llist.push(3)
    llist.print_list()

    print("Appending 4 to end of list")
    llist.append(4)
    llist.print_list()

    print("Inserting 5 after 4")
    llist.insert_after(4,5)
    llist.print_list()

    print("Deleting 4")
    llist.delete(4)
    llist.print_list()
