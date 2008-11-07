@REM  ******************************************************************
@REM  Batch file for the security(soap+jni) project                                  
@REM                                                                 
@REM  version: $Id: build.bat,v 1.1.1.1 2005/12/20 09:00:00 security Exp $
@REM  Copyright (c) 2005-2006 Four Meisters System Consulting, Inc.          
@REM                                               All rights reserved.
@REM  ******************************************************************
@echo off

set CLASSPATH=.

set PROJECT_HOME=J:\working\workspace\Hello

rem -------------------
rem Java
rem -------------------
set JAVA_HOME=D:\Java\jdk1.5.0_09

set CLASSPATH=%CLASSPATH%;%JAVA_HOME%\lib\tools.jar
set JAVA_OPTIONS=-Xms512m -Xmx512m

rem -------------------
rem Ant
rem -------------------
set ANT_HOME=%PROJECT_HOME%\lib\ant
set ANT_JAR=%ANT_HOME%\lib\ant.jar
set ANT_OPT_JAR=%ANT_HOME%\lib\optional.jar
set ANT_LAUNCHER_JAR=%ANT_HOME%\lib\ant-launcher.jar
set ANT_NODEPS_JAR=%ANT_HOME%\lib\ant-nodeps.jar
set PATH=%JAVA_HOME%\bin;%PATH%;%ANT_HOME%\bin

set CLASSPATH=%CLASSPATH%;%ANT_JAR%
set CLASSPATH=%CLASSPATH%;%ANT_OPT_JAR%
set CLASSPATH=%CLASSPATH%;%ANT_LAUNCHER_JAR%
set CLASSPATH=%CLASSPATH%;%ANT_NODEPS_JAR%

rem -------------------
rem Rrd4j
rem -------------------
set RRD4J_JAR=%PROJECT_HOME%\lib\rrd4j-2.0.1.jar
set CLASSPATH=%CLASSPATH%;%RRD4J_JAR%

rem -------------------
rem Rrd4j
rem -------------------
set JSCH_JAR=%PROJECT_HOME%\lib\jsch-0.1.29.jar
set CLASSPATH=%CLASSPATH%;%JSCH_JAR%

rem -------------------
rem Ibatis
rem -------------------
set ibatis-common-2.jar=%PROJECT_HOME%\lib\ibatis-common-2.jar
set ibatis-dao-2.jar=%PROJECT_HOME%\lib\ibatis-dao-2.jar
set ibatis-sqlmap-2.jar=%PROJECT_HOME%\lib\ibatis-sqlmap-2.jar
set CLASSPATH=%CLASSPATH%;%ibatis-common-2.jar%;%ibatis-dao-2.jar%;%ibatis-sqlmap-2.jar%

rem -------------------
rem Ibatis
rem -------------------
set jdom.jar=%PROJECT_HOME%\lib\jdom.jar
set CLASSPATH=%CLASSPATH%;%jdom.jar%

rem -------------------
rem Others
rem -------------------
set CLASSPATH=%CLASSPATH%;%PROJECT_HOME%\lib\j2h.jar
set CLASSPATH=%CLASSPATH%;%PROJECT_HOME%\lib\junit.jar


