package cn.livedoor.security.sysguard.persistence.sqlmapdao;

import cn.livedoor.security.sysguard.domain.DataInfoType;
import cn.livedoor.security.sysguard.domain.DataInfoTypeExample;
import java.util.List;

public interface DataInfoTypeDAO {

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info_type
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    void insert(DataInfoType record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info_type
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int updateByPrimaryKey(DataInfoType record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info_type
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int updateByPrimaryKeySelective(DataInfoType record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info_type
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    List selectByExample(DataInfoTypeExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info_type
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    List selectByExample(DataInfoTypeExample example);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info_type
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    DataInfoType selectByPrimaryKey(Integer typeId);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info_type
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int deleteByExample(DataInfoTypeExample example);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table data_info_type
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int deleteByPrimaryKey(Integer typeId);
}