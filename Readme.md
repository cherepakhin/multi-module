### Порядок выполнения операций в модульном проекте gradle.

````shell
./gradlew build
````

Вывод в консоль:

````text
Module Application. On JavaCompile. Executing TASK: compileJava
----------------
Module Application. On JavaCompile. Executing TASK: compileTestJava
----------------
Module Library. On JavaCompile. Executing TASK: compileJava
----------------
Module Library. On JavaCompile. Executing TASK: compileTestJava
----------------
Module Application. On Test. Executing TASK: test
----------------
Module Library. On Test. Executing TASK: test
----------------
````

Сначала все модули компилируются (On JavaCompile) в след. порядке:

Module __Application__:
<ul>
    <li>compile Application MAIN</li>
    <li>compile Application TEST</li>
</ul>

Module __Library__
<ul>
    <li>compile Library MAIN</li>
    <li>compile Library TEST</li>
</ul>

Затем выполняются тесты (On Test) (т.к. build).
<ul>
    <li>Test Module Application</li>
    <li>Test Module Library</li>
</ul>
