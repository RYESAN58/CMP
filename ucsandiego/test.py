from unittest import runner


class SLNode:
    def __init__(self, value):
      self.value = value
      self.next = None

class SList:
    def __init__(self):
        self.head = None

    def add_to_front(self, val):
        new_node = SLNode(val)
        current_head = self.head
        new_node.next = current_head
        self.head = new_node
        return self
    def print_values(self):
        runner = self.head
        while(runner != None):
            print(runner.value)
            runner = runner.next
        return self
    def add_to_back(self, val):
        new_node = SLNode(val)
        runner = self.head
        while(runner.next != None):
            runner = runner.next
        runner.next = new_node
        return self
    def remove_from_front(self):
        current_head = self.head
        new_head = current_head.next
        self.head = new_head
        return current_head 

my_list = SList()

my_list.add_to_front("are").add_to_front("Linked lists").add_to_back("fun!").print_values()

my_list.remove_from_front()
print("NEW ONE")
my_list.print_values()