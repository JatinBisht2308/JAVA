 **There are total two ways to create threads in java->**

 **1**)**- By using thread classes**

*(Inbuilt class already made by java our work is to inherit it and use it to make threads.) This class is inside the java.lang package*

**Methods in Thread class->**

1)- run()

2)- start()

3)- currentThread()

4)- isAlive()

5)- getName()

6)- setName(String name)

7)- sleep()

8)- yeild()

9)- inteerupt()

10)- isInterupped()

**There are four steps to create a thread:**

*1)- extends the thread class*

*2)- override the run() method*

*3)- create an object of the class which inherits the thread class*

*4)- start the thread using the start() function.*

Life Cycle of a thread

1)- **Creation of thread** *(new thread created)*

2)- **Runnable** *(thread is in runnnable state due to start method)*

3)- **Running** *(thread started performing task by using the combination of start and run method).*

*Thread sheduler chooses the thread that which thread will be going in running state.(inside JVM)*

4)- ***Non-Runnable** (This is the state when the thread is still alive, but is currently not eligible to run-> sleep, waiting, suspend)*

5)- **Dead/Terminated** *(When the thread gets termianted.)->If a thread gets terminated then it cannot come again in the run state(just like we humans).*

 **2)- By using runnable interface (Better way)**

*This interface only has a single method i.e run()*

Thread class implements Runnable interface(It is in the API itself.)

**Q1)- Why using runnable interface is a better way to make thread?**

Ans)- Because java do not support multiple inheritence and thus we can implements the runnable interface with extending some other class.
