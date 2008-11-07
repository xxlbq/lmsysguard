

        /**
        * SysguardMessageReceiverInOut.java
        *
        * This file was auto-generated from WSDL
        * by the Apache Axis2 version: SNAPSHOT Sep 07, 2006 (07:23:02 GMT+00:00)
        */
        package cn.livedoor.www.sysguard;

        /**
        *  SysguardMessageReceiverInOut message receiver
        */

        public class SysguardMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutSyncMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        //Inject the Message Context if it is asked for
        org.apache.axis2.engine.DependencyManager.configureBusinessLogicProvider(obj, msgContext.getOperationContext());

        SysguardSkeleton skel = (SysguardSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if(op.getName() != null & (methodName = op.getName().getLocalPart()) != null){

        


            if("GetLoadPicByHostIp".equals(methodName)){


            cn.livedoor.www.sysguard.GetLoadPicByHostIpResponse param63 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param63 =
                                                     skel.GetLoadPicByHostIp(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param63, false);
                        

            }
        


            if("AddGroup".equals(methodName)){


            cn.livedoor.www.sysguard.AddGroupResponse param65 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.AddGroupRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.AddGroupRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.AddGroupRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param65 =
                                                     skel.AddGroup(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param65, false);
                        

            }
        


            if("GetAllOsTypeInfo".equals(methodName)){


            cn.livedoor.www.sysguard.GetAllOsTypeInfoResponse param67 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param67 =
                                                     skel.GetAllOsTypeInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param67, false);
                        

            }
        


            if("DeleteOperationInfoByOperationId".equals(methodName)){


            cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdResponse param69 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param69 =
                                                     skel.DeleteOperationInfoByOperationId(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param69, false);
                        

            }
        


            if("BatchExecuteCommand".equals(methodName)){


            cn.livedoor.www.sysguard.BatchExecuteCommandResponse param71 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.BatchExecuteCommandRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.BatchExecuteCommandRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.BatchExecuteCommandRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param71 =
                                                     skel.BatchExecuteCommand(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param71, false);
                        

            }
        


            if("ModifyOperationInfo".equals(methodName)){


            cn.livedoor.www.sysguard.ModifyOperationInfoResponse param73 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.ModifyOperationInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.ModifyOperationInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.ModifyOperationInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param73 =
                                                     skel.ModifyOperationInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param73, false);
                        

            }
        


            if("ModifyUserInfo".equals(methodName)){


            cn.livedoor.www.sysguard.ModifyUserInfoResponse param75 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.ModifyUserInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.ModifyUserInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.ModifyUserInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param75 =
                                                     skel.ModifyUserInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param75, false);
                        

            }
        


            if("GetAllHostInfo".equals(methodName)){


            cn.livedoor.www.sysguard.GetAllHostInfoResponse param77 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetAllHostInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetAllHostInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetAllHostInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param77 =
                                                     skel.GetAllHostInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param77, false);
                        

            }
        


            if("Logout".equals(methodName)){


            cn.livedoor.www.sysguard.LogoutResponse param79 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.LogoutRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.LogoutRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.LogoutRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param79 =
                                                     skel.Logout(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param79, false);
                        

            }
        


            if("ModifyOsTypeInfo".equals(methodName)){


            cn.livedoor.www.sysguard.ModifyOsTypeInfoResponse param81 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param81 =
                                                     skel.ModifyOsTypeInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param81, false);
                        

            }
        


            if("ModifyLogInfo".equals(methodName)){


            cn.livedoor.www.sysguard.ModifyLogInfoResponse param83 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.ModifyLogInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.ModifyLogInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.ModifyLogInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param83 =
                                                     skel.ModifyLogInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param83, false);
                        

            }
        


            if("GetAllGroupInfo".equals(methodName)){


            cn.livedoor.www.sysguard.GetAllGroupInfoResponse param85 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetAllGroupInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetAllGroupInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetAllGroupInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param85 =
                                                     skel.GetAllGroupInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param85, false);
                        

            }
        


            if("DeleteGroupByGroupId".equals(methodName)){


            cn.livedoor.www.sysguard.DeleteGroupByGroupIdResponse param87 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param87 =
                                                     skel.DeleteGroupByGroupId(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param87, false);
                        

            }
        


            if("GetAllSystemInfo".equals(methodName)){


            cn.livedoor.www.sysguard.GetAllSystemInfoResponse param89 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetAllSystemInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetAllSystemInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetAllSystemInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param89 =
                                                     skel.GetAllSystemInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param89, false);
                        

            }
        


            if("AddOsTypeInfo".equals(methodName)){


            cn.livedoor.www.sysguard.AddOsTypeInfoResponse param91 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.AddOsTypeInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.AddOsTypeInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.AddOsTypeInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param91 =
                                                     skel.AddOsTypeInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param91, false);
                        

            }
        


            if("DeleteUserByUserId".equals(methodName)){


            cn.livedoor.www.sysguard.DeleteUserByUserIdResponse param93 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.DeleteUserByUserIdRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.DeleteUserByUserIdRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.DeleteUserByUserIdRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param93 =
                                                     skel.DeleteUserByUserId(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param93, false);
                        

            }
        


            if("GetAllDataInfoStandard".equals(methodName)){


            cn.livedoor.www.sysguard.GetAllDataInfoStandardResponse param95 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param95 =
                                                     skel.GetAllDataInfoStandard(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param95, false);
                        

            }
        


            if("DeleteOsTypeInfoByOsTypeId".equals(methodName)){


            cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdResponse param97 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param97 =
                                                     skel.DeleteOsTypeInfoByOsTypeId(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param97, false);
                        

            }
        


            if("Login".equals(methodName)){


            cn.livedoor.www.sysguard.LoginResponse param99 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.LoginRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.LoginRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.LoginRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param99 =
                                                     skel.Login(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param99, false);
                        

            }
        


            if("ModifyGroupInf".equals(methodName)){


            cn.livedoor.www.sysguard.ModifyGroupInfResponse param101 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.ModifyGroupInfRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.ModifyGroupInfRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.ModifyGroupInfRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param101 =
                                                     skel.ModifyGroupInf(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param101, false);
                        

            }
        


            if("GetAllRoleInfo".equals(methodName)){


            cn.livedoor.www.sysguard.GetAllRoleInfoResponse param103 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetAllRoleInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetAllRoleInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetAllRoleInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param103 =
                                                     skel.GetAllRoleInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param103, false);
                        

            }
        


            if("DeleteHostByHostId".equals(methodName)){


            cn.livedoor.www.sysguard.DeleteHostByHostIdResponse param105 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.DeleteHostByHostIdRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.DeleteHostByHostIdRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.DeleteHostByHostIdRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param105 =
                                                     skel.DeleteHostByHostId(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param105, false);
                        

            }
        


            if("ModifyHostInfo".equals(methodName)){


            cn.livedoor.www.sysguard.ModifyHostInfoResponse param107 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.ModifyHostInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.ModifyHostInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.ModifyHostInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param107 =
                                                     skel.ModifyHostInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param107, false);
                        

            }
        


            if("AddUser".equals(methodName)){


            cn.livedoor.www.sysguard.AddUserResponse param109 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.AddUserRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.AddUserRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.AddUserRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param109 =
                                                     skel.AddUser(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param109, false);
                        

            }
        


            if("AddOperationInfo".equals(methodName)){


            cn.livedoor.www.sysguard.AddOperationInfoResponse param111 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.AddOperationInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.AddOperationInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.AddOperationInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param111 =
                                                     skel.AddOperationInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param111, false);
                        

            }
        


            if("BatchUploadFile".equals(methodName)){


            cn.livedoor.www.sysguard.BatchUploadFileResponse param113 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.BatchUploadFileRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.BatchUploadFileRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.BatchUploadFileRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param113 =
                                                     skel.BatchUploadFile(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param113, false);
                        

            }
        


            if("GetOperationById".equals(methodName)){


            cn.livedoor.www.sysguard.GetOperationByIdResponse param115 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetOperationByIdRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetOperationByIdRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetOperationByIdRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param115 =
                                                     skel.GetOperationById(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param115, false);
                        

            }
        


            if("GetAllLogInfo".equals(methodName)){


            cn.livedoor.www.sysguard.GetAllLogInfoResponse param117 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetAllLogInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetAllLogInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetAllLogInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param117 =
                                                     skel.GetAllLogInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param117, false);
                        

            }
        


            if("GetAllOperation".equals(methodName)){


            cn.livedoor.www.sysguard.GetAllOperationResponse param119 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetAllOperationRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetAllOperationRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetAllOperationRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param119 =
                                                     skel.GetAllOperation(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param119, false);
                        

            }
        


            if("GetAllUserInfo".equals(methodName)){


            cn.livedoor.www.sysguard.GetAllUserInfoResponse param121 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.GetAllUserInfoRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.GetAllUserInfoRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.GetAllUserInfoRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param121 =
                                                     skel.GetAllUserInfo(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param121, false);
                        

            }
        


            if("AddHost".equals(methodName)){


            cn.livedoor.www.sysguard.AddHostResponse param123 = null;
            
                    //doc style
                    cn.livedoor.www.sysguard.AddHostRequest wrappedParam =
                                                         (cn.livedoor.www.sysguard.AddHostRequest)fromOM(
                                msgContext.getEnvelope().getBody().getFirstElement(),
                                cn.livedoor.www.sysguard.AddHostRequest.class,
                                getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           param123 =
                                                     skel.AddHost(wrappedParam) ;
                                                
                            envelope = toEnvelope(getSOAPFactory(msgContext), param123, false);
                        

            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetLoadPicByHostIpResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetLoadPicByHostIpResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.AddGroupRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.AddGroupRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.AddGroupResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.AddGroupResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllOsTypeInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllOsTypeInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.BatchExecuteCommandRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.BatchExecuteCommandRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.BatchExecuteCommandResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.BatchExecuteCommandResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyOperationInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyOperationInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyOperationInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyOperationInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyUserInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyUserInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyUserInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyUserInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllHostInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllHostInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllHostInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllHostInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.LogoutRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.LogoutRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.LogoutResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.LogoutResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyOsTypeInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyOsTypeInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyLogInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyLogInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyLogInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyLogInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllGroupInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllGroupInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllGroupInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllGroupInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.DeleteGroupByGroupIdResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.DeleteGroupByGroupIdResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllSystemInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllSystemInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllSystemInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllSystemInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.AddOsTypeInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.AddOsTypeInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.AddOsTypeInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.AddOsTypeInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.DeleteUserByUserIdRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.DeleteUserByUserIdRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.DeleteUserByUserIdResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.DeleteUserByUserIdResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllDataInfoStandardResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllDataInfoStandardResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.LoginRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.LoginRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.LoginResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.LoginResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyGroupInfRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyGroupInfRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyGroupInfResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyGroupInfResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllRoleInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllRoleInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllRoleInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllRoleInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.DeleteHostByHostIdRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.DeleteHostByHostIdRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.DeleteHostByHostIdResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.DeleteHostByHostIdResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyHostInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyHostInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.ModifyHostInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.ModifyHostInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.AddUserRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.AddUserRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.AddUserResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.AddUserResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.AddOperationInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.AddOperationInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.AddOperationInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.AddOperationInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.BatchUploadFileRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.BatchUploadFileRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.BatchUploadFileResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.BatchUploadFileResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetOperationByIdRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetOperationByIdRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetOperationByIdResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetOperationByIdResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllLogInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllLogInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllLogInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllLogInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllOperationRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllOperationRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllOperationResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllOperationResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllUserInfoRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllUserInfoRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.GetAllUserInfoResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.GetAllUserInfoResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.AddHostRequest param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.AddHostRequest.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(cn.livedoor.www.sysguard.AddHostResponse param, boolean optimizeContent){
            
                     return param.getOMElement(cn.livedoor.www.sysguard.AddHostResponse.MY_QNAME,
                                  org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetLoadPicByHostIpResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetLoadPicByHostIpResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.AddGroupResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.AddGroupResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetAllOsTypeInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetAllOsTypeInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.BatchExecuteCommandResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.BatchExecuteCommandResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.ModifyOperationInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.ModifyOperationInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.ModifyUserInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.ModifyUserInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetAllHostInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetAllHostInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.LogoutResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.LogoutResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.ModifyOsTypeInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.ModifyOsTypeInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.ModifyLogInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.ModifyLogInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetAllGroupInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetAllGroupInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.DeleteGroupByGroupIdResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.DeleteGroupByGroupIdResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetAllSystemInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetAllSystemInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.AddOsTypeInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.AddOsTypeInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.DeleteUserByUserIdResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.DeleteUserByUserIdResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetAllDataInfoStandardResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetAllDataInfoStandardResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.LoginResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.LoginResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.ModifyGroupInfResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.ModifyGroupInfResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetAllRoleInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetAllRoleInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.DeleteHostByHostIdResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.DeleteHostByHostIdResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.ModifyHostInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.ModifyHostInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.AddUserResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.AddUserResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.AddOperationInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.AddOperationInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.BatchUploadFileResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.BatchUploadFileResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetOperationByIdResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetOperationByIdResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetAllLogInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetAllLogInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetAllOperationResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetAllOperationResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.GetAllUserInfoResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.GetAllUserInfoResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, cn.livedoor.www.sysguard.AddHostResponse param, boolean optimizeContent){
                      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                       
                                emptyEnvelope.getBody().addChild(param.getOMElement(cn.livedoor.www.sysguard.AddHostResponse.MY_QNAME,factory));
                            

                     return emptyEnvelope;
                    }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces){

        try {
        
                if (cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetLoadPicByHostIpRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetLoadPicByHostIpResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetLoadPicByHostIpResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.AddGroupRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.AddGroupRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.AddGroupResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.AddGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllOsTypeInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllOsTypeInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllOsTypeInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.DeleteOperationInfoByOperationIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.BatchExecuteCommandRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.BatchExecuteCommandRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.BatchExecuteCommandResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.BatchExecuteCommandResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyOperationInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyOperationInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyOperationInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyOperationInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyUserInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyUserInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyUserInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyUserInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllHostInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllHostInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllHostInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllHostInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.LogoutRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.LogoutRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.LogoutResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.LogoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyOsTypeInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyOsTypeInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyOsTypeInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyLogInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyLogInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyLogInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyLogInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllGroupInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllGroupInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllGroupInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllGroupInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.DeleteGroupByGroupIdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.DeleteGroupByGroupIdResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.DeleteGroupByGroupIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllSystemInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllSystemInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllSystemInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllSystemInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.AddOsTypeInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.AddOsTypeInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.AddOsTypeInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.AddOsTypeInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.DeleteUserByUserIdRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.DeleteUserByUserIdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.DeleteUserByUserIdResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.DeleteUserByUserIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllDataInfoStandardRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllDataInfoStandardResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllDataInfoStandardResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.DeleteOsTypeInfoByOsTypeIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.LoginRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.LoginRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.LoginResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.LoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyGroupInfRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyGroupInfRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyGroupInfResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyGroupInfResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllRoleInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllRoleInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllRoleInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllRoleInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.DeleteHostByHostIdRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.DeleteHostByHostIdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.DeleteHostByHostIdResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.DeleteHostByHostIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyHostInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyHostInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.ModifyHostInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.ModifyHostInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.AddUserRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.AddUserRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.AddUserResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.AddUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.AddOperationInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.AddOperationInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.AddOperationInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.AddOperationInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.BatchUploadFileRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.BatchUploadFileRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.BatchUploadFileResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.BatchUploadFileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetOperationByIdRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetOperationByIdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetOperationByIdResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetOperationByIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllLogInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllLogInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllLogInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllLogInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllOperationRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllOperationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllOperationResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllOperationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllUserInfoRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllUserInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.GetAllUserInfoResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.GetAllUserInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.AddHostRequest.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.AddHostRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (cn.livedoor.www.sysguard.AddHostResponse.class.equals(type)){
                
                           return cn.livedoor.www.sysguard.AddHostResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (Exception e) {
        throw new RuntimeException(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }



        }//end of class
    