## Synchronized Methods

- A **synchronized method** in Java ensures that **only one thread can execute it at a time** for a given object.
- It is mainly used in **multithreading** when multiple threads try to access and modify shared resources (like variables, files, or databases).


### 🏃‍♂️💨 What is a Race Condition?

- A race condition happens when two or more threads (or processes) try to access and modify the same shared resource at the same time, and the final result depends on the timing of execution.
- Since thread scheduling is unpredictable, the outcome is often incorrect or inconsistent.


### 🔑 How it Works to avoid race condition

- When a thread calls a synchronized method:
- It locks the object’s monitor (every Java object has a lock/monitor).
- Other threads trying to call any synchronized method on the same object are blocked until the lock is released.
- Once the thread finishes the method, the lock is released, and another thread can acquire it.


## 🛠️ What’s Happening demonstrated in SynchronizedMethods.java

### Synchronized Counter (synchronizedCount)

- Two threads (t1 and t2) each increment it 1000000 times.
- Thanks to synchronized, only one thread can access incrementSynchronized() at a time.
- Final result = 2000000 ✅ (always correct).

### Asynchronized Counter (asynchronizedCount)

- Two threads (t3 and t4) each increment it 1000000 times.
- Without synchronization, both threads can run incrementAsynchronized() at the same time.
- Some increments are lost because of race conditions.
- Final result < 2000000 ⚠️ (inconsistent).

### Output of asynchronous and synchronous methods.

- Final Synchronized Count: 2000000
- Final Asynchronized Count: 1105976


### 📊 Key Points
- Synchronized method locks the object (monitor) before executing the method.
- Only one thread per object can access a synchronized method at a time.
- Other threads must wait until the lock is released.
- Synchronization ensures thread safety but may reduce performance due to locking overhead.