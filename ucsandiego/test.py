
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

my_list = SList()
print(my_list)

my_list.add_to_front("are").add_to_front("Linked lists").add_to_back("fun!").print_values()

my_list.add_to_front(5)
my_list.add_to_back(666)
my_list.print_values()