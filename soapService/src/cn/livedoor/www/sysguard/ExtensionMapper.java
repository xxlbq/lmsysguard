
            /**
            * ExtensionMapper.java
            *
            * This file was auto-generated from WSDL
            * by the Apache Axis2 version: #axisVersion# #today#
            */

            package cn.livedoor.www.sysguard;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.livedoor.cn/sysguard/".equals(namespaceURI) &&
                  "SystemInfo".equals(typeName)){
                   
                            return  cn.livedoor.www.sysguard.SystemInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.livedoor.cn/sysguard/".equals(namespaceURI) &&
                  "OperationInfo".equals(typeName)){
                   
                            return  cn.livedoor.www.sysguard.OperationInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.livedoor.cn/sysguard/".equals(namespaceURI) &&
                  "UserInfo".equals(typeName)){
                   
                            return  cn.livedoor.www.sysguard.UserInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.livedoor.cn/sysguard/".equals(namespaceURI) &&
                  "HostInfo".equals(typeName)){
                   
                            return  cn.livedoor.www.sysguard.HostInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.livedoor.cn/sysguard/".equals(namespaceURI) &&
                  "LogInfo".equals(typeName)){
                   
                            return  cn.livedoor.www.sysguard.LogInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.livedoor.cn/sysguard/".equals(namespaceURI) &&
                  "GroupInfo".equals(typeName)){
                   
                            return  cn.livedoor.www.sysguard.GroupInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.livedoor.cn/sysguard/".equals(namespaceURI) &&
                  "DataInfoStandard".equals(typeName)){
                   
                            return  cn.livedoor.www.sysguard.DataInfoStandard.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.livedoor.cn/sysguard/".equals(namespaceURI) &&
                  "RoleInfo".equals(typeName)){
                   
                            return  cn.livedoor.www.sysguard.RoleInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.livedoor.cn/sysguard/".equals(namespaceURI) &&
                  "OsTypeInfo".equals(typeName)){
                   
                            return  cn.livedoor.www.sysguard.OsTypeInfo.Factory.parse(reader);
                        

                  }

              
             throw new java.lang.RuntimeException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    