@echo OFF
cls

echo Starting...
echo.
javac Main.java
echo.
echo =====JAVAVERTSTART=====
java Main
echo =====JAVAVERTEND=====
echo deleting binaries files (.class)
del Main.class
del Setup.class
del FileManger.class







