
            /**
            * GetAllOsTypeInfoResponse.java
            *
            * This file was auto-generated from WSDL
            * by the Apache Axis2 version: #axisVersion# #today#
            */

            package cn.livedoor.www.sysguard;
            /**
            *  GetAllOsTypeInfoResponse bean class
            */
        
        public  class GetAllOsTypeInfoResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://www.livedoor.cn/sysguard/",
                "GetAllOsTypeInfoResponse",
                "ns1");

            

            		/**
            		* field for AllOsType
            		* This was an Array!
            		*/

            		protected cn.livedoor.www.sysguard.OsTypeInfo[] localAllOsType ;
                    
           			/*  This tracker boolean wil be used to detect whether the user called the set method
              		*   for this attribute. It will be used to determine whether to include this field
               		*   in the serialized XML
           			*/
           			protected boolean localAllOsTypeTracker = false ;
           			

           			/**
           			* Auto generated getter method
           			* @return cn.livedoor.www.sysguard.OsTypeInfo[]
           			*/
           			public  cn.livedoor.www.sysguard.OsTypeInfo[] getAllOsType(){
               			return localAllOsType;
           			}

           			
            		


                   		
                  		/**
                   		* validate the array for AllOsType
                   		*/
                  		protected void validateAllOsType(cn.livedoor.www.sysguard.OsTypeInfo[] param){
                     	
                  		}


                 		/**
                  		* Auto generated setter method
                  		* @param param AllOsType
                  		*/
                  		public void setAllOsType(cn.livedoor.www.sysguard.OsTypeInfo[] param){
                  		
                   			validateAllOsType(param);

                   		
                              	if (param !=null){
                              	//update the setting tracker
                              	localAllOsTypeTracker = true;
                               	}
                           		
                  				this.localAllOsType=param;
                  		}

                   		
                 		
                 		/**
                 		* Auto generated add method for the array for convenience
                 		* @param param cn.livedoor.www.sysguard.OsTypeInfo
                 		*/
                 		public void addAllOsType(cn.livedoor.www.sysguard.OsTypeInfo param){
                   			if (localAllOsType == null){
                       		localAllOsType = new cn.livedoor.www.sysguard.OsTypeInfo[]{};
                   			}

                    	
                         	//update the setting tracker
                        	localAllOsTypeTracker = true;
                    	

                   		java.util.List list =
                        org.apache.axis2.databinding.utils.ConverterUtil.toList(localAllOsType);
                   		list.add(param);
                   		this.localAllOsType =
                     	(cn.livedoor.www.sysguard.OsTypeInfo[])list.toArray(
                        new cn.livedoor.www.sysguard.OsTypeInfo[list.size()]);

                 		}
                 		

            		/**
            		* field for ReturnCode
            		*/

            		protected int localReturnCode ;
                    

           			/**
           			* Auto generated getter method
           			* @return int
           			*/
           			public  int getReturnCode(){
               			return localReturnCode;
           			}

           			
            		
                    	/**
                   		* Auto generated setter method
                   		* @param param ReturnCode
                   		*/
                   		public void setReturnCode(int param){
                    	
								this.localReturnCode=param;
						

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

                
                if (localAllOsTypeTracker){
                                    if (localAllOsType==null){
                                         throw new RuntimeException("allOsType cannot be null!!");
                                    }
                                

                            for (int i = 0;i < localAllOsType.length;i++){
                             localAllOsType[i].getOMElement(
                                       new javax.xml.namespace.QName("","allOsType"),
                                       factory).serialize(xmlWriter);

                            }
                            
                            }
			 		namespace = "";

					if (! namespace.equals("")) {
						prefix = xmlWriter.getPrefix(namespace);

						if (prefix == null) {
							prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();

							xmlWriter.writeStartElement(prefix,"returnCode", namespace);
							xmlWriter.writeNamespace(prefix, namespace);
							xmlWriter.setPrefix(prefix, namespace);

						} else {
							xmlWriter.writeStartElement(namespace,"returnCode");
						}

					} else {
						xmlWriter.writeStartElement("returnCode");
					}

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));
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

        
               //ignore the QName passed in - we send only OUR QName!
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
    }

  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName){


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAllOsTypeTracker){
                                    if (localAllOsType==null){
                                         throw new RuntimeException("allOsType cannot be null!!");
                                    }
                                
                            for (int i = 0;i < localAllOsType.length;i++){
                              elementList.add(new javax.xml.namespace.QName("",
                                                                      "allOsType"));
                               elementList.add(localAllOsType[i]);
                            }
                            
                            }
                             elementList.add(new javax.xml.namespace.QName("",
                                                                      "returnCode"));
                            
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));
                                

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
        public static GetAllOsTypeInfoResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GetAllOsTypeInfoResponse object = new GetAllOsTypeInfoResponse();
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
                    if (!"GetAllOsTypeInfoResponse".equals(type)){
                        //find namespace for the prefix
                        java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (GetAllOsTypeInfoResponse)cn.livedoor.www.sysguard.ExtensionMapper.getTypeObject(
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
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","allOsType").equals(reader.getName())){
                            
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(cn.livedoor.www.sysguard.OsTypeInfo.Factory.parse(reader));
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
                                                // We should be at the end element, but make sure
                                                while (!reader.isEndElement())
                                                    reader.next();
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("","allOsType").equals(reader.getName())){
                                                        list1.add(cn.livedoor.www.sysguard.OsTypeInfo.Factory.parse(reader));
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            object.setAllOsType((cn.livedoor.www.sysguard.OsTypeInfo[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                    cn.livedoor.www.sysguard.OsTypeInfo.class,
                                                    list1));
                                        
                              }  // End of if for expected property start element
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                            if (reader.isStartElement() && new javax.xml.namespace.QName("","returnCode").equals(reader.getName())){
                            
                                    java.lang.String content = reader.getElementText();
                                    
                                    object.setReturnCode(
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
           
          