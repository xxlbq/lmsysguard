
            /**
            * LogInfo.java
            *
            * This file was auto-generated from WSDL
            * by the Apache Axis2 version: #axisVersion# #today#
            */

            package cn.livedoor.www.sysguard;
            /**
            *  LogInfo bean class
            */
        
        public  class LogInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = LogInfo
                Namespace URI = http://www.livedoor.cn/sysguard/
                Namespace Prefix = ns1
                */
            

            		/**
            		* field for ApplogId
            		*/

            		protected long localApplogId ;
                    

           			/**
           			* Auto generated getter method
           			* @return long
           			*/
           			public  long getApplogId(){
               			return localApplogId;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param ApplogId
                   		*/
                   		public void setApplogId(long param){
                    	
								this.localApplogId=param;
						

                   		}
                		

            		/**
            		* field for ClassName
            		*/

            		protected java.lang.String localClassName ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localClassNameTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getClassName(){
               			return localClassName;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param ClassName
                   		*/
                   		public void setClassName(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localClassNameTracker = true;
                    	
								this.localClassName=param;
						

                   		}
                		

            		/**
            		* field for HostId
            		*/

            		protected int localHostId ;
                    

           			/**
           			* Auto generated getter method
           			* @return int
           			*/
           			public  int getHostId(){
               			return localHostId;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param HostId
                   		*/
                   		public void setHostId(int param){
                    	
								this.localHostId=param;
						

                   		}
                		

            		/**
            		* field for InputTime
            		*/

            		protected java.util.Calendar localInputTime ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localInputTimeTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.util.Calendar
           			*/
           			public  java.util.Calendar getInputTime(){
               			return localInputTime;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param InputTime
                   		*/
                   		public void setInputTime(java.util.Calendar param){
                    	
                    		//update the setting tracker
                    	localInputTimeTracker = true;
                    	
								this.localInputTime=param;
						

                   		}
                		

            		/**
            		* field for Level
            		*/

            		protected java.lang.String localLevel ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localLevelTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getLevel(){
               			return localLevel;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param Level
                   		*/
                   		public void setLevel(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localLevelTracker = true;
                    	
								this.localLevel=param;
						

                   		}
                		

            		/**
            		* field for LogContent
            		*/

            		protected java.lang.String localLogContent ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localLogContentTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getLogContent(){
               			return localLogContent;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param LogContent
                   		*/
                   		public void setLogContent(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localLogContentTracker = true;
                    	
								this.localLogContent=param;
						

                   		}
                		

            		/**
            		* field for LogLine
            		*/

            		protected java.lang.String localLogLine ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localLogLineTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getLogLine(){
               			return localLogLine;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param LogLine
                   		*/
                   		public void setLogLine(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localLogLineTracker = true;
                    	
								this.localLogLine=param;
						

                   		}
                		

            		/**
            		* field for LogStatus
            		*/

            		protected int localLogStatus ;
                    

           			/**
           			* Auto generated getter method
           			* @return int
           			*/
           			public  int getLogStatus(){
               			return localLogStatus;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param LogStatus
                   		*/
                   		public void setLogStatus(int param){
                    	
								this.localLogStatus=param;
						

                   		}
                		

            		/**
            		* field for LogTime
            		*/

            		protected java.util.Calendar localLogTime ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localLogTimeTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.util.Calendar
           			*/
           			public  java.util.Calendar getLogTime(){
               			return localLogTime;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param LogTime
                   		*/
                   		public void setLogTime(java.util.Calendar param){
                    	
                    		//update the setting tracker
                    	localLogTimeTracker = true;
                    	
								this.localLogTime=param;
						

                   		}
                		

            		/**
            		* field for SolveDesc
            		*/

            		protected java.lang.String localSolveDesc ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localSolveDescTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getSolveDesc(){
               			return localSolveDesc;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param SolveDesc
                   		*/
                   		public void setSolveDesc(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localSolveDescTracker = true;
                    	
								this.localSolveDesc=param;
						

                   		}
                		

            		/**
            		* field for SolveResult
            		*/

            		protected java.lang.String localSolveResult ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localSolveResultTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getSolveResult(){
               			return localSolveResult;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param SolveResult
                   		*/
                   		public void setSolveResult(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localSolveResultTracker = true;
                    	
								this.localSolveResult=param;
						

                   		}
                		

            		/**
            		* field for SolveTime
            		*/

            		protected java.util.Calendar localSolveTime ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localSolveTimeTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.util.Calendar
           			*/
           			public  java.util.Calendar getSolveTime(){
               			return localSolveTime;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param SolveTime
                   		*/
                   		public void setSolveTime(java.util.Calendar param){
                    	
                    		//update the setting tracker
                    	localSolveTimeTracker = true;
                    	
								this.localSolveTime=param;
						

                   		}
                		

            		/**
            		* field for UserId
            		*/

            		protected int localUserId ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localUserIdTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return int
           			*/
           			public  int getUserId(){
               			return localUserId;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param UserId
                   		*/
                   		public void setUserId(int param){
                    	
                    		//update the setting tracker
                    	localUserIdTracker = true;
                    	
								this.localUserId=param;
						

                   		}
                		

            		/**
            		* field for ThreadName
            		*/

            		protected java.lang.String localThreadName ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localThreadNameTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getThreadName(){
               			return localThreadName;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param ThreadName
                   		*/
                   		public void setThreadName(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localThreadNameTracker = true;
                    	
								this.localThreadName=param;
						

                   		}
                		

            		/**
            		* field for Uptime
            		*/

            		protected int localUptime ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localUptimeTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return int
           			*/
           			public  int getUptime(){
               			return localUptime;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param Uptime
                   		*/
                   		public void setUptime(int param){
                    	
                    		//update the setting tracker
                    	localUptimeTracker = true;
                    	
								this.localUptime=param;
						

                   		}
                		

            		/**
            		* field for HostIp
            		*/

            		protected java.lang.String localHostIp ;
                    

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getHostIp(){
               			return localHostIp;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param HostIp
                   		*/
                   		public void setHostIp(java.lang.String param){
                    	
								this.localHostIp=param;
						

                   		}
                		

     
     
     /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory){


        org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

         public void serialize(
                                  javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            
                

		        java.lang.String prefix = parentQName.getPrefix();
                java.lang.String namespace = parentQName.getNamespaceURI();

                if (namespace != null) {
                    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                    if (writerPrefix != null) {
                        xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                    } else {
                        if (prefix == null) {
                            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                        }

                        xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                        xmlWriter.writeNamespace(prefix, namespace);
                        xmlWriter.setPrefix(prefix, namespace);
                    }
                } else {
		    xmlWriter.writeStartElement(parentQName.getLocalPart());
		}

                
               
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"applogId", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"applogId");
						}

					} else {
						xmlWriter.writeStartElement("applogId");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApplogId));
                            xmlWriter.writeEndElement();
                         if (localClassNameTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"className", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"className");
						}

					} else {
						xmlWriter.writeStartElement("className");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClassName));
                            xmlWriter.writeEndElement();
                        }
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"hostId", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"hostId");
						}

					} else {
						xmlWriter.writeStartElement("hostId");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHostId));
                            xmlWriter.writeEndElement();
                         if (localInputTimeTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"inputTime", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"inputTime");
						}

					} else {
						xmlWriter.writeStartElement("inputTime");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInputTime));
                            xmlWriter.writeEndElement();
                        } if (localLevelTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"level", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"level");
						}

					} else {
						xmlWriter.writeStartElement("level");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLevel));
                            xmlWriter.writeEndElement();
                        } if (localLogContentTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"logContent", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"logContent");
						}

					} else {
						xmlWriter.writeStartElement("logContent");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogContent));
                            xmlWriter.writeEndElement();
                        } if (localLogLineTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"logLine", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"logLine");
						}

					} else {
						xmlWriter.writeStartElement("logLine");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogLine));
                            xmlWriter.writeEndElement();
                        }
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"logStatus", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"logStatus");
						}

					} else {
						xmlWriter.writeStartElement("logStatus");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogStatus));
                            xmlWriter.writeEndElement();
                         if (localLogTimeTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"logTime", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"logTime");
						}

					} else {
						xmlWriter.writeStartElement("logTime");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogTime));
                            xmlWriter.writeEndElement();
                        } if (localSolveDescTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"solveDesc", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"solveDesc");
						}

					} else {
						xmlWriter.writeStartElement("solveDesc");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSolveDesc));
                            xmlWriter.writeEndElement();
                        } if (localSolveResultTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"solveResult", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"solveResult");
						}

					} else {
						xmlWriter.writeStartElement("solveResult");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSolveResult));
                            xmlWriter.writeEndElement();
                        } if (localSolveTimeTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"solveTime", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"solveTime");
						}

					} else {
						xmlWriter.writeStartElement("solveTime");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSolveTime));
                            xmlWriter.writeEndElement();
                        } if (localUserIdTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"userId", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"userId");
						}

					} else {
						xmlWriter.writeStartElement("userId");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserId));
                            xmlWriter.writeEndElement();
                        } if (localThreadNameTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"threadName", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"threadName");
						}

					} else {
						xmlWriter.writeStartElement("threadName");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localThreadName));
                            xmlWriter.writeEndElement();
                        } if (localUptimeTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"uptime", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"uptime");
						}

					} else {
						xmlWriter.writeStartElement("uptime");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUptime));
                            xmlWriter.writeEndElement();
                        }
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"hostIp", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"hostIp");
						}

					} else {
						xmlWriter.writeStartElement("hostIp");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHostIp));
                            xmlWriter.writeEndElement();
                        
                   
               xmlWriter.writeEndElement();
            
            

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

         /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{

           registerPrefix(xmlWriter, namespace);

            xmlWriter.writeAttribute(namespace,attName,attValue);
          }

         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = createPrefix();

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = createPrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }

         /**
          * Create a prefix
          */
          private java.lang.String createPrefix() {
                return "ns" + (int)Math.random();
          }
        };

        
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
    }

  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "applogId"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApplogId));
                                 if (localClassNameTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "className"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClassName));
                                }
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "hostId"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHostId));
                                 if (localInputTimeTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "inputTime"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInputTime));
                                } if (localLevelTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "level"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLevel));
                                } if (localLogContentTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "logContent"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogContent));
                                } if (localLogLineTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "logLine"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogLine));
                                }
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "logStatus"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogStatus));
                                 if (localLogTimeTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "logTime"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogTime));
                                } if (localSolveDescTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "solveDesc"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSolveDesc));
                                } if (localSolveResultTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "solveResult"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSolveResult));
                                } if (localSolveTimeTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "solveTime"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSolveTime));
                                } if (localUserIdTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "userId"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserId));
                                } if (localThreadNameTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "threadName"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localThreadName));
                                } if (localUptimeTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "uptime"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUptime));
                                }
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "hostIp"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHostIp));
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{


        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static LogInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LogInfo object = new LogInfo();
            int event;
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    if (!"LogInfo".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (LogInfo)cn.livedoor.www.sysguard.ExtensionMapper.getTypeObject(
                             nsUri,type,reader);
                      }

                  }

                }
                

                
				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();
                

                boolean isReaderMTOMAware = false;
                
                try{
                  isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
                }catch(java.lang.IllegalArgumentException e){
                  isReaderMTOMAware = false;
                }


                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","applogId").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setApplogId(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","className").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setClassName(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","hostId").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setHostId(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","inputTime").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setInputTime(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","level").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setLevel(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","logContent").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setLogContent(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","logLine").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setLogLine(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","logStatus").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setLogStatus(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","logTime").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setLogTime(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","solveDesc").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setSolveDesc(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","solveResult").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setSolveResult(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","solveTime").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setSolveTime(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","userId").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setUserId(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","threadName").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setThreadName(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","uptime").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setUptime(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","hostIp").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setHostIp(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                        


            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          