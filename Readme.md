### Порядок выполнения операций в модульном проекте gradle.

````shell
./gradlew build
````


Вывод в консоль:

````text
Module Application. On JavaCompile. Executing TASK: compileJava
Module Application. On JavaCompile. Executing TASK: compileTestJava
Module Library. On JavaCompile. Executing TASK: compileJava
Module Library. On JavaCompile. Executing TASK: compileTestJava
Module Application. On Test. Executing TASK: test
Module Library. On Test. Executing TASK: test

````

Сначала все модули компилируются (On JavaCompile) в след. порядке:

__Module Application__<br/>
main<br/>
test<br/>
<br/>
__Module Library__<br/>
main<br/>
test<br/>
<br/>
Затем выполняются тесты (On Test).<br/>
__Module Application__<br/>
__Module Library__<br/>
