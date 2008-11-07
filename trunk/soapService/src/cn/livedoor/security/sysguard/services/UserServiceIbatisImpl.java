package cn.livedoor.security.sysguard.services;

import java.util.Calendar;
import java.util.List;

import cn.livedoor.security.sysguard.domain.User;
import cn.livedoor.security.sysguard.domain.UserExample;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.UserDAO;
import cn.livedoor.security.sysguard.services.exceptions.PasswordNotMatchException;
import cn.livedoor.security.sysguard.services.exceptions.UserNameExistException;
import cn.livedoor.security.sysguard.services.exceptions.UserNotExistException;
import cn.livedoor.security.sysguard.services.interfaces.UserService;

public class UserServiceIbatisImpl extends AbstractService implements UserService {

	public UserServiceIbatisImpl() {

	}

	public User login(String userName, String password) {
		User user = getUserByUserName(userName);
		if (user != null) {
			if (user.getPasswd() != null && !user.equals("")) {
				if (!user.getPasswd().equals(password)) {
					throw new PasswordNotMatchException("Password is wrong!");
				} else {
					user.setOnline(new Byte((byte) 0));
					modifyUser(user);
				}
			}
		}
		return user;
	}

	public User[] getAllUserInfo() {
		UserDAO userDAO = (UserDAO) getDAO(UserDAO.class);
		List<User> users = userDAO.selectByExample(new UserExample());
		return users.toArray(new User[users.size()]);
	}

	public void modifyUser(User user) {
		UserDAO userDAO = (UserDAO) getDAO(UserDAO.class);
		user.setLastLoginTime(getTime());
		userDAO.updateByPrimaryKeySelective(user);
	}

	public void addUser(User user) {
		UserDAO userDAO = (UserDAO) getDAO(UserDAO.class);
		try {
			getUserByUserName(user.getName());
			throw new UserNameExistException(user.getName() + " has be exist!");
		} catch (UserNotExistException e) {
			user.setInputTime(getTime());
			user.setLastLoginTime(getTime());
			userDAO.insert(user);
		}
	}

	public void deleteUser(int userId) {
		UserDAO userDAO = (UserDAO) getDAO(UserDAO.class);
		userDAO.deleteByPrimaryKey(userId);
	}

	public User getUserInfoByUserId(int userId) {
		UserDAO userDAO = (UserDAO) getDAO(UserDAO.class);
		User user = userDAO.selectByPrimaryKey(userId);
		return user;
	}

	public User getUserByUserName(String userName) {
		UserDAO userDAO = (UserDAO) getDAO(UserDAO.class);
		UserExample example = new UserExample();
		example.setName(userName);
		example.setName_Indicator(UserExample.EXAMPLE_EQUALS);
		List users = userDAO.selectByExample(example);
		if (users.size() == 0) {
			throw new UserNotExistException(userName + " is Not exist!");
		}
		User user = (User) users.get(0);
		return user;
	}

}
