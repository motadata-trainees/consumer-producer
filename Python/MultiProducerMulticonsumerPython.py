from threading import Thread, Lock
import time
import random
​
queue = []
lock = Lock()
​
​
class ProducerThread(Thread):
    def run(self):
        numbers = range(5) #This Will create the list [0, 1, 2, 3, 4]
        global queue
        while True:
            number = random.choice(numbers)  
            lock.acquire()
            queue.append(number)
            print "Produced", number
            lock.release()
            time.sleep(random.random())
​
​
class ConsumerThread(Thread):
    def run(self):
        global queue
        while True:
            lock.acquire()
            if not queue:
                print "Nothing in queue, but consumer will try to consume"
            number = queue.pop(0)
            print "Consumed", number
            lock.release()
            time.sleep(random.random())
​
ProducerThread().start()
ProducerThread().start()
ProducerThread().start()
ConsumerThread().start()
ConsumerThread().start()
