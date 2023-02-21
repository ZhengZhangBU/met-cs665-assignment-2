# Name: 
Zheng Zhang
github link: https://github.com/ZhengZhangBU/CS665

# Tasks
For assignment 2, we have to develop a notification system that will inform drivers about delivery requests. 

`Obeserver Patterm` is suitable for this task. We will notify a varying list of objects (drivers). And it can add or remove observers. Here, Shop is our subject and Driver is our observer. 

Loosely Coupled of `Obeserver Patterm` allows us to easily add or remove observers, and update new delivery request quickly.

For simplicity, `DeliveryRequest` will be my data type. We can add a lot of information that we need in `DeliveryRequest`. When Shop need to inform drivers about new delivery request, we don't need to pass all the parameters in our `notifySubscribers()` method and deal with these parameters in our `Shop` class. It's easy to read our `Shop` class.

For avoiding duplicated codes, `Driver` class helps a lot. We can instantiate a lot of drivers with different names rather than creating a lot of class for different drivers.

# UML Diagram
In the same folder, it is named as "UML class.pdf".

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```



