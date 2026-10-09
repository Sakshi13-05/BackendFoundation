# Day 2: Thread Creation, Realities, & The Lifecycle ☕⚙️

Welcome to Day 2! Today we are diving into the actual Java implementation of Multithreading. We will cover how threads are created, why execution is completely out of our control, and the complete Thread Lifecycle.

---

## 1. Thread Creation in Java (Two Ways)
There are two primary ways to create a thread in Java:

### Method A: Extending the `Thread` Class (Is-A Relationship)
* Here, you are directly defining a *thread class*.
* **Behind the scenes of `t1.start()`:** The JVM asks the OS to create a thread for the application -> the thread gets allocated its own Stack space and Program Counter (PC) -> finally, it internally calls `t1.run()` to start execution.

### Method B: Implementing the `Runnable` Interface
* Here, you are defining a *task*.
* You create a class implementing `Runnable`, override the `run()` method, and pass the object reference to the constructor of the `Thread` class: `Thread t1 = new Thread(r1);`

*Image1*
<img width="896" height="1200" alt="download" src="https://github.com/user-attachments/assets/50d24b75-a39a-4b18-80c3-b88eba335b8f" />


---

## 2. Which Method is Better? (Extending Thread vs. Implementing Runnable)
**Answer:** Implementing `Runnable` is standard industry practice. Here is why:

1. **Separation of Concerns:** You define the *task* separately from the thread's execution flow. 
2. **Reusability:** You can pass the exact same `Runnable` object reference (`r1`) to multiple threads (`t1`, `t2`, `t3`) so they can execute the exact same logic.
3. **Multiple Inheritance:** Java does not support multiple class inheritance. If you *extend* `Thread`, you cannot extend any other class. If you *implement* `Runnable`, you are still free to extend another parent class!
4. **Lambda Support:** `Runnable` is a **Functional Interface** in Java, meaning we can keep our code extremely clean by using Lambda expressions.

*Image2*
<img width="896" height="1200" alt="download" src="https://github.com/user-attachments/assets/7d5e3eba-e2cb-4527-b935-6a6559897e49" />


---

## 3. Interview Goldmine: Core Realities of Threads

### Q1: Can we start a thread twice? 
**No.** If you call `t1.start()` on an already running or terminated thread, Java will throw an `IllegalThreadStateException`. The thread is considered to be in an illegal state.

### Q2: Why is multiple thread execution Non-Deterministic?
You cannot predict the exact order in which threads will execute. 
* **The Reason:** It is completely dependent on the **CPU Scheduling Algorithm** (like Round Robin), system load, and hardware. 
* Two parallel cores might pick one thread each, or context switching might occur. 
* **Conclusion:** Thread execution order is *not in our hands*. This is exactly why multithreaded code is notoriously difficult to debug!

*Image3*
<img width="896" height="1200" alt="download" src="https://github.com/user-attachments/assets/6bf7306e-bd4f-49d5-a10a-4b3b045d8740" />


---

## 4. The Thread Lifecycle
A thread goes through multiple distinct stages during its lifespan:

1. **New:** The thread object is created but `start()` has not been called.
2. **Runnable:** `start()` is called. The thread is ready and waiting for the CPU to pick it up.
3. **Running:** The CPU is actively executing the `run()` method.
4. **Blocked / Waiting / Timed Waiting:** The thread pauses execution (e.g., `sleep(time)`, waiting for an I/O task, waiting to acquire a lock, or `wait()`). Once resolved, it goes back to *Runnable*, **not** directly to Running!
5. **Terminated:** The `run()` method finishes execution.

*Image4*
<img width="896" height="1200" alt="download" src="https://github.com/user-attachments/assets/a733f508-1268-4650-bc62-0023cb3337a9" />



---
## 5. Files to refer

1. **CreateUsingRunnable.java**
2. **CreateUsingThread.java**
3. **DemoNonDeterminism.java**
4. **ThreadLifecycle.java**

---
*If you found this helpful, please hit the ⭐ button on this repository and follow me for Day 3!*
