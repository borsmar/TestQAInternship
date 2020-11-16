# TestQAInternship

#### Tests launch ####

You'll need java 11 or higher, Maven 3.6.3

JAVA: https://www.oracle.com/ru/java/technologies/javase-downloads.html

MAVEN: http://maven.apache.org/

Firstly you need to launch app:

1. Open cmd.

2. Go to folder with app:

write proper path in cmd to folder with phonebook.jar application 

For example command:
```
cd C:\folder\apps
```
after that execute this command.


3. Execute a command in cmd:
```
java -jar phonebook.jar
```
After launching app, you can launch tests:

4. Open new cmd instance (do not close old one).

5. In cmd to folder with tests:

    write proper path to folder with MyTest project for example:
```
cd C:\folder\MyTest
```
    after that execute this command.

6. Execute a command:
```
mvn clean install
```

####OR####


You can run tests in Intellij IDEA

1. Launch phonebook.jar (steps 1,2,3 in first instruction)

2. Open folder MyTest as idea project

3. To run tests use: 
```
 mvn clean install 
```

#### Test Reports ####

Reports will be generated automaticly after tests complition and you can find it in the "target" folder inside "MyTest" folder:
```
For Example: C:\apps\MyTest\target\site\serenity
```
There you can find the HTML generated report in file: 
```
index.html
```
You can open it with any browser.
