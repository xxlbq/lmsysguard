package cn.livedoor.security.sysguard.persistence.sqlmapdao;

import cn.livedoor.security.sysguard.domain.DataInfo;
import cn.livedoor.security.sysguard.domain.DataInfoExample;
import java.util.List;
import cn.livedoor.security.sysguard.domain.DataInfoKey;

public interface DataInfoDAO {

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info
     * @abatorgenerated  Tue Oct 24 10:06:07 CST 2006
     */
    void insert(DataInfo record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info
     * @abatorgenerated  Tue Oct 24 10:06:07 CST 2006
     */
    int updateByPrimaryKey(DataInfo record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info
     * @abatorgenerated  Tue Oct 24 10:06:07 CST 2006
     */
    int updateByPrimaryKeySelective(DataInfo record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info
     * @abatorgenerated  Tue Oct 24 10:06:07 CST 2006
     */
    List selectByExample(DataInfoExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info
     * @abatorgenerated  Tue Oct 24 10:06:07 CST 2006
     */
    List selectByExample(DataInfoExample example);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info
     * @abatorgenerated  Tue Oct 24 10:06:07 CST 2006
     */
    DataInfo selectByPrimaryKey(DataInfoKey key);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info
     * @abatorgenerated  Tue Oct 24 10:06:07 CST 2006
     */
    int deleteByExample(DataInfoExample example);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info
     * @abatorgenerated  Tue Oct 24 10:06:07 CST 2006
     */
    int deleteByPrimaryKey(DataInfoKey key);
}