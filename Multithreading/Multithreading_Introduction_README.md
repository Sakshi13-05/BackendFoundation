# Day 1: Introduction to Multithreading & JVM Architecture 🚀

Hi there! 👋 , I am documenting my Core Java notes. Today, we dive into what happens under the hood when a Java program executes, how the JVM allocates memory, and the true difference between concurrency and parallelism.

---

## 1. Program, Process, and Thread

Before understanding multithreading, we must understand the lifecycle of execution.

* **Program:** A set of instructions written in a file (e.g., `A.java` compiled to `A.class` bytecode).
* **Process:** A program that is currently being executed. A program only becomes a process when it enters the RAM from the Disk. This allocation is done by the Operating System (OS).
  * *Key Insight:* To execute a process, the OS allocates CPU time, RAM, and resources. Processes have strictly isolated memory. For example, if Process P1 and P2 both consume 2GB of RAM, P1 cannot intercept or look at the memory space given to P2.
* **Thread:** The smallest sequence of instructions. It is a "lightweight process" that runs independently on the CPU.
  
*Image 1*
<img width="896" height="1200" alt="download" src="https://github.com/user-attachments/assets/ec2b51c3-5049-4ebf-8a2b-8e6de1deaabd" />


---


## 2. What happens behind the scenes when a program becomes a process?

When the OS brings the process into RAM, the **JVM (Java Virtual Machine)** takes command. 

**Why does the JVM explicitly manage memory instead of the OS?** 
Because the JVM is platform-dependent, which makes Java *platform-independent*. By managing its own memory standards, it doesn't have to rely on how a specific OS manages memory.

### Step-by-Step JVM Execution:
1. JVM takes command of executing the process rather than giving it to the OS.
2. The Classloader loads the main class.
3. The JVM creates the `main` thread.
4. **Memory Allocation:** The JVM assigns a dedicated **Stack** and **PC (Program Counter)** to this main thread.
5. Code starts executing from the main thread/method.

### JVM Memory Architecture (The Secret Sauce)
* **Shared Memory:** The `Heap` and `Method Area` (Mem area) are shared across the entire process.
* **Thread-Isolated Memory:** Every single thread gets its own `Stack` and `PC`.

*Image2*
<img width="896" height="1200" alt="download" src="https://github.com/user-attachments/assets/cf91f68c-a1f6-4d0c-93bc-d4dc15db5d35" />



## 3. Concurrency vs. Parallelism & Context Switching

If a CPU core dictates how many tasks it can do parallelly, what happens when we have more threads than cores?

### Context Switching (Concurrency)
* In a single core having more than 1 thread, the OS cannot execute 2 threads simultaneously. 
* It implements **Context Switching**: The intermediate instructions are stored in the PC register, and the CPU rapidly switches between threads.
* **Meaning:** Both threads *proceed*, but only 1 makes *progress* at an exact millisecond. 

### True Parallelism 
* 2 threads simultaneously proceed and progress without context switching.
* This requires multiple CPU cores (e.g., `main` thread on Core 1, `T1` thread on Core 2).

### Real-World Scenario: 2 Cores, 5 Threads
In modern computing, threads execute using a mix of both! Threads that want to run are executed for some time parallelly (across the two cores) AND concurrently (context switching on individual cores).

*Image 3*
<img width="896" height="1200" alt="download" src="https://github.com/user-attachments/assets/5fa34683-a4ed-42da-9bcf-f6da6d2eafee" />



---

## 4. Multitasking vs. Multithreading Summary

* **Multitasking:** Managed by the OS. Parallel execution of isolated processes (P1, P2, P3) across the CPU.
* **Multithreading:** A Java programming concept. Execution of multiple threads (th1, th2, th3) concurrently or parallelly within the same process.

**🔥 Ultimate Takeaway:** *"For the CPU, there is no process. All are threads."*

*Image 4*
<img width="382" height="512" alt="download" src="https://github.com/user-attachments/assets/439dbde2-eae0-4df0-9494-009fe75870c9" />



---
*If you found these under-the-hood insights helpful, please hit the ⭐ button on this repository and follow me for Day 2!*
