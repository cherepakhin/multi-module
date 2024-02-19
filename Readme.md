./gradlew build

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

Сначала все модули компилируются (On JavaCompile) в след. порядке:

__Module Application__
main
test	 
__Module Library__
main
test

Затем выполняются тесты (On Test).
__Module Application__
__Module Library__