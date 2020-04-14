from threading import Thread
from threading import Condition
import threading
import time
import random
from threading import current_thread

isProducing = True

class BlockingQueue:

    def __init__(self, max_size):
        self.max_size = max_size
        self.curr_size = 0
        self.cond = Condition()
        self.q = []

    def dequeue(self):

        self.cond.acquire()
        while self.curr_size == 0:
            self.cond.wait()

        item = self.q.pop(0)
        self.curr_size -= 1

        self.cond.notifyAll()
        self.cond.release()

        return item

    def enqueue(self, item):

        self.cond.acquire()
        while self.curr_size == self.max_size:
            self.cond.wait()

        self.q.append(item)
        self.curr_size += 1

        self.cond.notifyAll()
        #print("\ncurrent size of queue {0}".format(self.curr_size), flush=True)
        self.cond.release()

    def isEmpty(self):
        self.cond.acquire()
        if(self.curr_size == 0):
            return True
        else:
            return False
        self.cond.notifyAll()
        self.cond.release()

class Consumer(threading.Thread):

    def run(self):
        global blocking_q
        while(isProducing or blocking_q.isEmpty()):
            num = blocking_q.dequeue()
            print ("Consumed", num)


class Producer(threading.Thread):

    def run(self):
        produced_number = 1
        global blocking_q
        while(produced_number<=20):
            blocking_q.enqueue(produced_number)
            print("Producer Produced ",produced_number)
            produced_number+=1



blocking_q = BlockingQueue(5)
Producer().start()
Consumer().start()
time.sleep(10)
