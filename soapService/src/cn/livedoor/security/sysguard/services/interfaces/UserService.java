package cn.livedoor.security.sysguard.services.interfaces;

import cn.livedoor.security.sysguard.domain.User;

public interface UserService extends DaoManagerService{
	public User login(String userName,String password);
	public User[] getAllUserInfo();
	public void modifyUser(User user);
	public void addUser(User user);
	public void deleteUser(int userId);
	public User getUserInfoByUserId(int userId);
	public User getUserByUserName(String string);
}
