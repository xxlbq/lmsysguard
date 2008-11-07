package cn.livedoor.security.sysguard.domain;

public class OperationExample extends Operation {

    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public static final int EXAMPLE_IGNORE = 0;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public static final int EXAMPLE_NULL = 1;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public static final int EXAMPLE_NOT_NULL = 2;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public static final int EXAMPLE_EQUALS = 3;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public static final int EXAMPLE_NOT_EQUALS = 4;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public static final int EXAMPLE_GREATER_THAN = 5;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public static final int EXAMPLE_GREATER_THAN_OR_EQUAL = 6;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public static final int EXAMPLE_LESS_THAN = 7;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public static final int EXAMPLE_LESS_THAN_OR_EQUAL = 8;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public static final int EXAMPLE_LIKE = 9;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private boolean combineTypeOr;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private int operId_Indicator;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private int userId_Indicator;
    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    private int inputTime_Indicator;

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setCombineTypeOr(boolean combineTypeOr) {
	this.combineTypeOr = combineTypeOr;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public boolean isCombineTypeOr() {
	return combineTypeOr;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public int getOperId_Indicator() {
	return operId_Indicator;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setOperId_Indicator(int operId_Indicator) {
	this.operId_Indicator = operId_Indicator;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public int getUserId_Indicator() {
	return userId_Indicator;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setUserId_Indicator(int userId_Indicator) {
	this.userId_Indicator = userId_Indicator;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public int getInputTime_Indicator() {
	return inputTime_Indicator;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table operation
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    public void setInputTime_Indicator(int inputTime_Indicator) {
	this.inputTime_Indicator = inputTime_Indicator;
    }
}