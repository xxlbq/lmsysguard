#!/bin/sh

#  ******************************************************************
#  Batch file for the security(soap+jni) project
#                                                                 
#  version: $Id: build.bat,v 1.1.1.1 2005/12/20 09:00:00 security Exp $
#  Copyright (c) 2005-2006 Four Meisters System Consulting, Inc.
#                                               All rights reserved.
#  ******************************************************************

#LANG=ja_JP.SJIS
#export LANG

CLASSPATH=
export CLASSPATH

# -------------------
# Project
# -------------------

PROJECT_HOME=/export/home/alex/workspace/build_project
export PROJECT_HOME

# -------------------
# Java
# -------------------

JAVA_HOME=/usr/j2se
JAVA_VENDOR=Sun

export JAVA_HOME
export JAVA_VENDOR

CLASSPATH=${CLASSPATH}:${JAVA_HOME}/lib/tools.jar


# -------------------
# Ant
# -------------------

ANT_HOME=${PROJECT_HOME}/lib/ant
ANT_JAR=${ANT_HOME}/lib/ant.jar
ANT_OPT_JAR=${ANT_HOME}/lib/optional.jar
ANT_LAUNCHER_JAR=${ANT_HOME}/lib/ant-launcher.jar
ANT_NODEPS_JAR=${ANT_HOME}/lib/ant-nodeps.jar
PATH=${PATH}:${ANT_HOME}/bin
export PATH

CLASSPATH=${CLASSPATH}:${ANT_JAR}
CLASSPATH=${CLASSPATH}:${ANT_OPT_JAR}
CLASSPATH=${CLASSPATH}:${ANT_LAUNCHER_JAR}
CLASSPATH=${CLASSPATH}:${ANT_NODEPS_JAR}



# -------------------
# Others
# -------------------
CLASSPATH=${CLASSPATH}:${PROJECT_HOME}/lib/j2h.jar
CLASSPATH=${CLASSPATH}:${PROJECT_HOME}/lib/junit.jar

export CLASSPATH
