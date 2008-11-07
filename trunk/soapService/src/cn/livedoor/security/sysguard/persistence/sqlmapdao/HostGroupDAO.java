package cn.livedoor.security.sysguard.persistence.sqlmapdao;

import cn.livedoor.security.sysguard.domain.HostGroup;
import cn.livedoor.security.sysguard.domain.HostGroupExample;
import java.util.List;

public interface HostGroupDAO {

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table host_group
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    void insert(HostGroup record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table host_group
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int updateByPrimaryKey(HostGroup record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table host_group
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int updateByPrimaryKeySelective(HostGroup record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table host_group
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    List selectByExample(HostGroupExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table host_group
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    List selectByExample(HostGroupExample example);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table host_group
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    HostGroup selectByPrimaryKey(Integer groupId);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table host_group
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int deleteByExample(HostGroupExample example);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table host_group
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int deleteByPrimaryKey(Integer groupId);
}