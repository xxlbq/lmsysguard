package cn.livedoor.security.sysguard.persistence.sqlmapdao;

import cn.livedoor.security.sysguard.domain.User;
import cn.livedoor.security.sysguard.domain.UserExample;
import java.util.List;

public interface UserDAO {

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table user
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    void insert(User record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table user
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int updateByPrimaryKey(User record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table user
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table user
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    List selectByExample(UserExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table user
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    List selectByExample(UserExample example);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table user
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    User selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table user
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table user
     * @abatorgenerated  Tue Oct 24 09:57:29 CST 2006
     */
    int deleteByPrimaryKey(Integer userId);
}