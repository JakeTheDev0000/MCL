@echo OFF
cls

@REM java 17.0.4 2022-07-19 LTS
@REM Java(TM) SE Runtime Environment (build 17.0.4+11-LTS-179)
@REM Java HotSpot(TM) 64-Bit Server VM (build 17.0.4+11-LTS-179, mixed mode, sharing)

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
    echo "deleting binaries files (.class)"
    del Main.class
    del Setup.class
    del FileManger.class
    del time.class
    del clearConsole.class
)








