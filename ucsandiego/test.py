

from asyncio.windows_events import NULL
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
        return self 
    def remove_from_back(self):
        runner = self.head
        while(runner.next.next != None):
            runner = runner.next
        last_node = runner.next
        runner.next = None
        last_node = None
        return self
    def remove_val(self, val):
        runner = self.head
        while runner.next != None:
            runner = runner.next
            if runner.value == val and runner.next == None:
                self.remove_from_back()
                return self 
            elif runner.value == val:
                current_node = runner
                new_head = current_node.next
                current_node = None
            return self 




my_list = SList()

my_list.add_to_front("are").add_to_front("Linked lists").add_to_back("fun!")
my_list.print_values()
my_list.add_to_back(666)
print("NEW ONE")
my_list.remove_val("are")
my_list.print_values()