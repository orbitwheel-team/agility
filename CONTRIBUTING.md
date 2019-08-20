## How to submit a bug report

Please ensure to specify the following:

* agility version (e.g. 1.0.1)
* Contextual information (e.g. what you were trying to achieve with agility)
* Simplest possible steps to reproduce
  * More complex the steps are, lower the priority will be.
  * A pull request with failing JUnit test case is most preferred, although it's OK to paste the test case into the issue description.
* Anything that might be relevant in your opinion, such as:
  * JDK/JRE version or the output of `java -version`
  * Operating system and the output of `uname -a`
  * Network configuration


### Example

```
agility version: 1.0.1

Context:
I encountered an exception which looks suspicious while load-testing my Netty-based Thrift server implementation.

Steps to reproduce:
1. ...
2. ...
3. ...
4. ...

$ java -version
java version "1.8.0_211"
Java(TM) SE Runtime Environment (build 1.8.0_211-b12)
Java HotSpot(TM) Client VM (build 25.211-b12, mixed mode)

Operating system: Ubuntu Linux 13.04 64-bit

$ uname -a
Linux infinity 3.10.32-1-lts #1 SMP Sun Feb 23 09:44:24 CET 2014 x86_64 GNU/Linux

My system has IPv6 disabled.
```

## How to contribute your work

please read [our developer guide](https://github.com/orbitwheel-team/agility/pulls).