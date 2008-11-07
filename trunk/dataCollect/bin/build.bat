@REM  ******************************************************************
@REM  Batch file for the security(soap+jni) project                                  
@REM                                                                 
@REM  version: $Id: build.bat,v 1.1.1.1 2005/12/20 09:00:00 security Exp $
@REM  Copyright (c) 2005-2006 Four Meisters System Consulting, Inc.          
@REM                                               All rights reserved.
@REM  ******************************************************************

echo off
@REM SETLOCAL

call setenv.bat

%JAVA_HOME%\bin\java -Dant.home=%ANT_HOME% -classpath %CLASSPATH% org.apache.tools.ant.Main %*

@REM ENDLOCAL