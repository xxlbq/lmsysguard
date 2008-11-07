
            /**
            * UserInfo.java
            *
            * This file was auto-generated from WSDL
            * by the Apache Axis2 version: #axisVersion# #today#
            */

            package cn.livedoor.www.sysguard;
            /**
            *  UserInfo bean class
            */
        
        public  class UserInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = UserInfo
                Namespace URI = http://www.livedoor.cn/sysguard/
                Namespace Prefix = ns1
                */
            

            		/**
            		* field for Name
            		*/

            		protected java.lang.String localName ;
                    

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getName(){
               			return localName;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param Name
                   		*/
                   		public void setName(java.lang.String param){
                    	
								this.localName=param;
						

                   		}
                		

            		/**
            		* field for Description
            		*/

            		protected java.lang.String localDescription ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localDescriptionTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getDescription(){
               			return localDescription;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param Description
                   		*/
                   		public void setDescription(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localDescriptionTracker = true;
                    	
								this.localDescription=param;
						

                   		}
                		

            		/**
            		* field for RoleId
            		*/

            		protected int localRoleId ;
                    

           			/**
           			* Auto generated getter method
           			* @return int
           			*/
           			public  int getRoleId(){
               			return localRoleId;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param RoleId
                   		*/
                   		public void setRoleId(int param){
                    	
								this.localRoleId=param;
						

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
            		* field for RealName
            		*/

            		protected java.lang.String localRealName ;
                    

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getRealName(){
               			return localRealName;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param RealName
                   		*/
                   		public void setRealName(java.lang.String param){
                    	
								this.localRealName=param;
						

                   		}
                		

            		/**
            		* field for Msn
            		*/

            		protected java.lang.String localMsn ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localMsnTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getMsn(){
               			return localMsn;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param Msn
                   		*/
                   		public void setMsn(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localMsnTracker = true;
                    	
								this.localMsn=param;
						

                   		}
                		

            		/**
            		* field for Skype
            		*/

            		protected java.lang.String localSkype ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localSkypeTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getSkype(){
               			return localSkype;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param Skype
                   		*/
                   		public void setSkype(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localSkypeTracker = true;
                    	
								this.localSkype=param;
						

                   		}
                		

            		/**
            		* field for LastLoginTime
            		*/

            		protected java.util.Calendar localLastLoginTime ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localLastLoginTimeTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.util.Calendar
           			*/
           			public  java.util.Calendar getLastLoginTime(){
               			return localLastLoginTime;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param LastLoginTime
                   		*/
                   		public void setLastLoginTime(java.util.Calendar param){
                    	
                    		//update the setting tracker
                    	localLastLoginTimeTracker = true;
                    	
								this.localLastLoginTime=param;
						

                   		}
                		

            		/**
            		* field for Online
            		*/

            		protected byte localOnline ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localOnlineTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return byte
           			*/
           			public  byte getOnline(){
               			return localOnline;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param Online
                   		*/
                   		public void setOnline(byte param){
                    	
                    		//update the setting tracker
                    	localOnlineTracker = true;
                    	
								this.localOnline=param;
						

                   		}
                		

            		/**
            		* field for Validate
            		*/

            		protected byte localValidate ;
                    

           			/**
           			* Auto generated getter method
           			* @return byte
           			*/
           			public  byte getValidate(){
               			return localValidate;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param Validate
                   		*/
                   		public void setValidate(byte param){
                    	
								this.localValidate=param;
						

                   		}
                		

            		/**
            		* field for UpdateTime
            		*/

            		protected java.util.Calendar localUpdateTime ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localUpdateTimeTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.util.Calendar
           			*/
           			public  java.util.Calendar getUpdateTime(){
               			return localUpdateTime;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param UpdateTime
                   		*/
                   		public void setUpdateTime(java.util.Calendar param){
                    	
                    		//update the setting tracker
                    	localUpdateTimeTracker = true;
                    	
								this.localUpdateTime=param;
						

                   		}
                		

            		/**
            		* field for Mail
            		*/

            		protected java.lang.String localMail ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localMailTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getMail(){
               			return localMail;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param Mail
                   		*/
                   		public void setMail(java.lang.String param){
                    	
                    		//update the setting tracker
                    	localMailTracker = true;
                    	
								this.localMail=param;
						

                   		}
                		

            		/**
            		* field for Passwd
            		*/

            		protected java.lang.String localPasswd ;
                    

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getPasswd(){
               			return localPasswd;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param Passwd
                   		*/
                   		public void setPasswd(java.lang.String param){
                    	
								this.localPasswd=param;
						

                   		}
                		

            		/**
            		* field for UserId
            		*/

            		protected int localUserId ;
                    

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
                    	
								this.localUserId=param;
						

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

							xmlWriter.writeStartElement(prefix,"name", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"name");
						}

					} else {
						xmlWriter.writeStartElement("name");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                            xmlWriter.writeEndElement();
                         if (localDescriptionTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"description", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"description");
						}

					} else {
						xmlWriter.writeStartElement("description");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                            xmlWriter.writeEndElement();
                        }
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"roleId", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"roleId");
						}

					} else {
						xmlWriter.writeStartElement("roleId");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoleId));
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
                        }
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"realName", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"realName");
						}

					} else {
						xmlWriter.writeStartElement("realName");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRealName));
                            xmlWriter.writeEndElement();
                         if (localMsnTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"msn", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"msn");
						}

					} else {
						xmlWriter.writeStartElement("msn");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMsn));
                            xmlWriter.writeEndElement();
                        } if (localSkypeTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"skype", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"skype");
						}

					} else {
						xmlWriter.writeStartElement("skype");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSkype));
                            xmlWriter.writeEndElement();
                        } if (localLastLoginTimeTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"lastLoginTime", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"lastLoginTime");
						}

					} else {
						xmlWriter.writeStartElement("lastLoginTime");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastLoginTime));
                            xmlWriter.writeEndElement();
                        } if (localOnlineTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"online", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"online");
						}

					} else {
						xmlWriter.writeStartElement("online");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnline));
                            xmlWriter.writeEndElement();
                        }
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"validate", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"validate");
						}

					} else {
						xmlWriter.writeStartElement("validate");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValidate));
                            xmlWriter.writeEndElement();
                         if (localUpdateTimeTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"updateTime", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"updateTime");
						}

					} else {
						xmlWriter.writeStartElement("updateTime");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateTime));
                            xmlWriter.writeEndElement();
                        } if (localMailTracker){
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"mail", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"mail");
						}

					} else {
						xmlWriter.writeStartElement("mail");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMail));
                            xmlWriter.writeEndElement();
                        }
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"passwd", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"passwd");
						}

					} else {
						xmlWriter.writeStartElement("passwd");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswd));
                            xmlWriter.writeEndElement();
                        
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
                                                                      "name"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                 if (localDescriptionTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "description"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                }
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "roleId"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoleId));
                                 if (localInputTimeTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "inputTime"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInputTime));
                                }
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "realName"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRealName));
                                 if (localMsnTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "msn"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMsn));
                                } if (localSkypeTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "skype"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSkype));
                                } if (localLastLoginTimeTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastLoginTime"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastLoginTime));
                                } if (localOnlineTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "online"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnline));
                                }
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "validate"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValidate));
                                 if (localUpdateTimeTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "updateTime"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateTime));
                                } if (localMailTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "mail"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMail));
                                }
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "passwd"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswd));
                                
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "userId"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserId));
                                

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
        public static UserInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UserInfo object = new UserInfo();
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
                    if (!"UserInfo".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (UserInfo)cn.livedoor.www.sysguard.ExtensionMapper.getTypeObject(
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
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","name").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setName(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","description").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setDescription(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","roleId").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setRoleId(
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
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","realName").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setRealName(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","msn").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setMsn(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","skype").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setSkype(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","lastLoginTime").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setLastLoginTime(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","online").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setOnline(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToByte(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","validate").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setValidate(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToByte(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","updateTime").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setUpdateTime(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","mail").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setMail(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","passwd").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setPasswd(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","userId").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setUserId(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                      
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
           
          