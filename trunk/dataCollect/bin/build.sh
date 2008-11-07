#!/bin/sh

#  ******************************************************************
#  Batch file for the security(soap+jni) project
#                                                                 
#  version: $Id: build.bat,v 1.1.1.1 2005/12/20 09:00:00 security Exp $
#  Copyright (c) 2005-2006 Four Meisters System Consulting, Inc.
#                                               All rights reserved.
#  ******************************************************************

. ./setenv.sh

${JAVA_HOME}/bin/java -Dant.home=${ANT_HOME} -classpath ${CLASSPATH} org.apache.tools.ant.Main $*



