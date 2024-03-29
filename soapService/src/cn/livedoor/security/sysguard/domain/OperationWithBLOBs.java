package cn.livedoor.security.sysguard.domain;

public class OperationWithBLOBs extends Operation {

    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column operation.error_desp
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private String errorDesp;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database column operation.oper_content
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private String operContent;

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column operation.error_desp
     * @return  the value of operation.error_desp
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public String getErrorDesp() {
	return errorDesp;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column operation.error_desp
     * @param errorDesp  the value for operation.error_desp
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setErrorDesp(String errorDesp) {
	this.errorDesp = errorDesp;
    }

    /**
     * This method was generated by Abator for iBATIS. This method returns the value of the database column operation.oper_content
     * @return  the value of operation.oper_content
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public String getOperContent() {
	return operContent;
    }

    /**
     * This method was generated by Abator for iBATIS. This method sets the value of the database column operation.oper_content
     * @param operContent  the value for operation.oper_content
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setOperContent(String operContent) {
	this.operContent = operContent;
    }
}