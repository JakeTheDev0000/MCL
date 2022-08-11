@echo OFF
cls

echo Starting...
echo.
javac Main.java
echo.
echo =====JAVAVERTSTART=====
java Main
set errorCode=%ERRORLEVEL%
echo =====JAVAVERTEND=====
echo exit code: %errorCode%
if %1%==1 (
    echo deleting binaries files (.class)
    del Main.class
    del Setup.class
    del FileManger.class
)








