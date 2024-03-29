package cn.livedoor.security.sysguard.persistence.sqlmapdao;

import cn.livedoor.security.sysguard.domain.Role;
import cn.livedoor.security.sysguard.domain.RoleExample;
import java.util.List;

public interface RoleDAO {

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table role
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    void insert(Role record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table role
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int updateByPrimaryKey(Role record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table role
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table role
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    List selectByExample(RoleExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table role
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    List selectByExample(RoleExample example);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table role
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    Role selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table role
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table role
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int deleteByPrimaryKey(Integer roleId);
}