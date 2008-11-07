package cn.livedoor.security.sysguard.services.mock;

import java.util.Calendar;

import cn.livedoor.security.sysguard.domain.User;
import cn.livedoor.security.sysguard.services.AbstractService;
import cn.livedoor.security.sysguard.services.exceptions.PasswordNotMatchException;
import cn.livedoor.security.sysguard.services.exceptions.UserNotExistException;
import cn.livedoor.security.sysguard.services.interfaces.UserService;

public class UserServiceMockImpl extends AbstractService implements UserService {

	public void addUser(User user) {
		System.out.println("add user" + user.getName());
	}

	public void deleteUser(int userId) {
		System.out.println("delete user" + userId);
	}

	public User[] getAllUserInfo() {
		User[] users = new User[10];
		for (int i = 0; i < users.length; i++) {
			users[i] = getUserInfoByUserId(i);
		}
		return users;
	}

	public User login(String userName, String password) {
		if (userName.equals("info1")) {
			if (!password.equals("livedoor")) {
				throw new PasswordNotMatchException("Password is wrong!");
			} else {
				User user = new User();
				user.setUserId(1);
				user.setInputTime(Calendar.getInstance().getTime());
				user.setLastLoginTime(Calendar.getInstance().getTime());
				user.setMsn("msn");
				user.setOnline((byte) 0);
				user.setRealName("real name ");
				user.setRoleId(1);
				user.setSkype("skype");
				user.setUpdateTime(Calendar.getInstance().getTime());
				user.setName("info");
				user.setPasswd("livedoor");
				user.setValidate((byte)0);
				user.setMail("mail");
				return user;
			}
		} else if (userName.equals("info2")) {
			if (!password.equals("livedoor")) {
				throw new PasswordNotMatchException("Password is wrong!");
			} else {
				User user = new User();
				user.setUserId(2);
				user.setInputTime(Calendar.getInstance().getTime());
				user.setLastLoginTime(Calendar.getInstance().getTime());
				user.setMsn("msn");
				user.setOnline((byte) 0);
				user.setRealName("real name ");
				user.setRoleId(2);
				user.setSkype("skype");
				user.setUpdateTime(Calendar.getInstance().getTime());
				user.setName("info");
				user.setPasswd("livedoor");
				user.setValidate((byte)0);
				user.setMail("mail");
				return user;
			}
		} else if (userName.equals("info")) {
				if (!password.equals("livedoor")) {
					throw new PasswordNotMatchException("Password is wrong!");
				} else {
					User user = new User();
					user.setUserId(0);
					user.setInputTime(Calendar.getInstance().getTime());
					user.setLastLoginTime(Calendar.getInstance().getTime());
					user.setMsn("msn");
					user.setOnline((byte) 0);
					user.setRealName("real name ");
					user.setRoleId(0);
					user.setSkype("skype");
					user.setUpdateTime(Calendar.getInstance().getTime());
					user.setName("info");
					user.setPasswd("livedoor");
					user.setValidate((byte)0);
					user.setMail("mail");
					return user;
				}
			} else if (userName.equals("liuyw")) {
				if (!password.equals("liuyw")) {
					throw new PasswordNotMatchException("Password is wrong!");
				} else {
					User user = new User();
					user.setUserId(1);
					user.setInputTime(Calendar.getInstance().getTime());
					user.setLastLoginTime(Calendar.getInstance().getTime());
					user.setMsn("msn");
					user.setOnline((byte) 0);
					user.setRealName("real name ");
					user.setRoleId(1);
					user.setSkype("skype");
					user.setUpdateTime(Calendar.getInstance().getTime());
					user.setName("info");
					user.setPasswd("livedoor");
					user.setValidate((byte)0);
					user.setMail("mail@livedoor.cn");
					return user;
				}
			}{
				throw new UserNotExistException(userName + " is not exist!");
			}
	}

	public void modifyUser(User user) {
		System.out.println("add user" + user.getName());
	}

	public User getUserInfoByUserId(int userId) {
		User user = new User();
		user.setUserId(userId);
		user.setInputTime(Calendar.getInstance().getTime());
		user.setLastLoginTime(Calendar.getInstance().getTime());
		user.setMsn("msn " + userId);
		user.setOnline((byte) 0);
		user.setRealName("real name " + userId);
		user.setRoleId(1);
		user.setPasswd("livedoor");
		user.setSkype("skype" + userId);
		user.setUpdateTime(Calendar.getInstance().getTime());
		user.setName("info" + userId);
		user.setValidate((byte)0);
		user.setMail("mail@livedoor.cn");
		return user;
	}

	public User getUserByUserName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
