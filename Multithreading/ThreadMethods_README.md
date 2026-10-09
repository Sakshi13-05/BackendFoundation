# Day 3: Crucial Thread Methods, Interrupts, & Daemon Threads ⚙️

Welcome to Day 3! Today we look at the essential methods used to control thread execution, how to properly interrupt a thread, and the difference between User and Daemon threads.

---

## 1. Controlling Thread Execution

### `Thread.sleep(ms)`
* Puts the current thread into the **TIMED-WAITING** state.
* Once the time expires, it goes back to the **RUNNABLE** state, waiting for the CPU.
* ⚠️ **CRITICAL INTERVIEW NOTE:** When a thread goes to sleep, it **DOES NOT release the lock** on a critical section. Other threads waiting for that lock will remain blocked!
> 💻 **Code Reference:** Check out `MethodSleep.java` to see this in action.

### `t1.join()`
* Tells the current thread to wait until thread `t1` completes its execution.
* Makes multithreaded code slightly more deterministic. 
* Can also take a time parameter `join(ms)`, putting the calling thread into a **TIMED-WAITING** state.
> 💻 **Code Reference:** Check out `MethodJoin.java`

### `t1.isAlive()`
* A handy method to check if a thread has been started and has not yet died. It returns `true` if the thread is anywhere between the Runnable and Terminated phase.
> 💻 **Code Reference:** Check out `MethodIsAlive.java`

### `Thread.yield()`
* A static method that acts as a *suggestion* to the OS. 
* The current thread pauses and offers the CPU to other threads of the **same priority**.
* The OS scheduler can completely ignore this request! The thread stays in the **RUNNABLE** state (it does not block).
> 💻 **Code Reference:** Check out `MethodYeild.java`

*(Drag and drop your sleep/join/yield diagram here)*

---

## 2. Interrupting Threads
How do you stop a thread that is running a long background task? You can't just kill it; you have to *interrupt* it.

* **`t1.interrupt()`**: Sends a signal to a thread. Every thread has an internal boolean "interrupt flag" (default is false). This method sets the flag to true.
* **Why do `sleep()` and `join()` need a try-catch block?** Because if a thread is waiting/sleeping and another thread calls `interrupt()` on it, it will immediately throw an `InterruptedException`.

### `interrupted()` vs. `isInterrupted()`
This is a very common interview question:
* `interrupted()`: A static method that returns true/false AND **resets the flag** back to false.
* `isInterrupted()`: An instance method that simply returns true/false without changing the flag.
> 💻 **Code Reference:** Check out `MethodInterrupt.java` to see how interruption flags behave.

*(Drag and drop your interrupt notes here)*

---

## 3. Thread Priority
Java threads have priorities ranging from 1 to 10.
* `MIN_PRIORITY = 1`
* `NORM_PRIORITY = 5` (Default)
* `MAX_PRIORITY = 10`
* Note: Setting priority is just an indication. The ultimate decision still lies with the OS CPU Scheduler.
> 💻 **Code Reference:** Check out `MethodPriority.java`

---

## 4. Daemon Threads (Background Threads)
Java divides threads into two categories: **User Threads** and **Daemon (Background) Threads**.

* **User Thread:** The JVM will stay alive as long as at least one User Thread is still running (even if the `main` thread finishes!).
* **Daemon Thread:** A background running thread. When all User threads finish, the JVM will abruptly terminate all running Daemon threads and shut down.
* **Example:** The Java **Garbage Collector** is the most famous Daemon thread!
> 💻 **Code Reference:** Check out `MethodDaemon.java` to see how background threads terminate.

*(Drag and drop your Priority/Daemon Thread notes here)*

---
*If you found this helpful, please hit the ⭐ button on this repository and follow me for Day 4!*