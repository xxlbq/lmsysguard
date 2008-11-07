
            /**
            * OsTypeInfo.java
            *
            * This file was auto-generated from WSDL
            * by the Apache Axis2 version: #axisVersion# #today#
            */

            package cn.livedoor.www.sysguard;
            /**
            *  OsTypeInfo bean class
            */
        
        public  class OsTypeInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = OsTypeInfo
                Namespace URI = http://www.livedoor.cn/sysguard/
                Namespace Prefix = ns1
                */
            

            		/**
            		* field for OsId
            		*/

            		protected int localOsId ;
                    

           			/**
           			* Auto generated getter method
           			* @return int
           			*/
           			public  int getOsId(){
               			return localOsId;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param OsId
                   		*/
                   		public void setOsId(int param){
                    	
								this.localOsId=param;
						

                   		}
                		

            		/**
            		* field for OsName
            		*/

            		protected java.lang.String localOsName ;
                    

           			/**
           			* Auto generated getter method
           			* @return java.lang.String
           			*/
           			public  java.lang.String getOsName(){
               			return localOsName;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param OsName
                   		*/
                   		public void setOsName(java.lang.String param){
                    	
								this.localOsName=param;
						

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

							xmlWriter.writeStartElement(prefix,"osId", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"osId");
						}

					} else {
						xmlWriter.writeStartElement("osId");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOsId));
                            xmlWriter.writeEndElement();
                        
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"osName", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"osName");
						}

					} else {
						xmlWriter.writeStartElement("osName");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOsName));
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
                        } if (localDescriptionTracker){
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
                                                                      "osId"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOsId));
                                
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "osName"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOsName));
                                 if (localInputTimeTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "inputTime"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInputTime));
                                } if (localDescriptionTracker){
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "description"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                }

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
        public static OsTypeInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            OsTypeInfo object = new OsTypeInfo();
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
                    if (!"OsTypeInfo".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (OsTypeInfo)cn.livedoor.www.sysguard.ExtensionMapper.getTypeObject(
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
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","osId").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setOsId(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                            
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new java.lang.RuntimeException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","osName").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setOsName(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
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
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","description").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setDescription(
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                              
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
           
          