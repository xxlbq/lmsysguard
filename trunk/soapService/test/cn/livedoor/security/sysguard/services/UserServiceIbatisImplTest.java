package cn.livedoor.security.sysguard.services;

import java.util.List;

import junit.framework.JUnit4TestAdapter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import cn.livedoor.security.sysguard.domain.User;
import cn.livedoor.security.sysguard.domain.UserExample;
import cn.livedoor.security.sysguard.persistence.sqlmapdao.UserDAO;
import cn.livedoor.security.sysguard.services.exceptions.PasswordNotMatchException;
import cn.livedoor.security.sysguard.services.exceptions.UserNameExistException;
import cn.livedoor.security.sysguard.services.exceptions.UserNotExistException;
import cn.livedoor.security.sysguard.services.interfaces.UserService;

import com.ibatis.dao.client.DaoManager;

public class UserServiceIbatisImplTest {
	static UserService userService = null;

	static DaoManager daoManager;

	@BeforeClass
	public static void setUp() throws Exception {
		try {

			UserDAO dao;
			daoManager = DaoConfig.getDaoManager();
			userService = ServiceFactory.getUserService();
			userService.setDaoManager(daoManager);
			User user = new User();
			user.setName("userName");
			user.setPasswd("password");
			user.setRealName("realName");
			user.setValidate(new Byte((byte) 0));

			user.setRoleId(1);
			dao = (UserDAO) daoManager.getDao(UserDAO.class);
			dao.insert(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// test logon method
	@Test
	public void testLogon() {
		User user = userService.login("userName", "password");

		UserExample u = new UserExample();
		u.setName("userName");
		u.setName_Indicator(UserExample.EXAMPLE_EQUALS);
		UserDAO dao = (UserDAO) daoManager.getDao(UserDAO.class);
		List list1 = dao.selectByExample(u);
		if (list1.size() > 0) {
			User user1 = (User) list1.get(0);
			assertEquals(user.getUserId(), user1.getUserId());
			assertEquals("The User should online", user1.getValidate(), new Byte((byte) 0));
		} else {
			fail("should have one user");
		}
	}

	@Test(expected = UserNotExistException.class)
	public void logonByNoUserName() {
		userService.login("noexistname", "password");
	}

	@Test(expected = PasswordNotMatchException.class)
	public void logonByErrorPassword() {
		userService.login("userName", "error password");
	}

	// end test logon method

	// test ModifyUser
	@Test
	public void modifyUser() {
		UserExample u = new UserExample();
		u.setName("userName");
		u.setName_Indicator(UserExample.EXAMPLE_EQUALS);
		UserDAO dao = (UserDAO) daoManager.getDao(UserDAO.class);
		List list1 = dao.selectByExample(u);
		if (list1.size() > 0) {
			User user = (User) list1.get(0);
			user.setPasswd("newPassword");
			userService.modifyUser(user);
			User modifyedUser = dao.selectByPrimaryKey(user.getUserId());
			assertEquals("Modify password should be 'newPassword'", "newPassword", modifyedUser.getPasswd());
			user.setPasswd("password");
			userService.modifyUser(user);
		} else {
			fail("should have one user");
		}
	}
	//test getAllUserInfo
	@Test
	public void getAllUser() {
		User[] users = userService.getAllUserInfo();
		boolean hasUser = false;
		for (int i = 0; i < users.length; i++) {
			if (users[i].getName().equals("userName")) {
				hasUser = true;
				break;
			}
		}
		assertTrue("should have a user", hasUser);
	}
	//test addUser
	@Test
	public void addUser() {
		User user = new User();
		user.setName("addUserName");
		user.setRealName("addRealUserName");
		user.setPasswd("addPassword");
		user.setRoleId(1);
		user.setValidate((byte) 0);
		userService.addUser(user);

		UserExample u = new UserExample();
		u.setName("addUserName");
		u.setName_Indicator(UserExample.EXAMPLE_EQUALS);
		UserDAO dao = (UserDAO) daoManager.getDao(UserDAO.class);
		List list1 = dao.selectByExample(u);
		if (list1.size() > 0) {
			User addUser = (User) list1.get(0);
			assertEquals("The name should be 'addUserName", "addUserName", addUser.getName());
			assertEquals("The realName should be 'addRealUserName", "addRealUserName", addUser.getRealName());
			dao.deleteByPrimaryKey(addUser.getUserId());
		} else {
			fail("should have one user");
		}
	}

	@Test(expected = UserNameExistException.class)
	public void addExistUserNameUser() {
		User user = new User();
		user.setName("userName");
		user.setPasswd("password");
		user.setRealName("realName");
		user.setValidate(new Byte((byte) 0));

		user.setRoleId(1);
		userService.addUser(user);
	}

	//test getUserByUserName
	
	@Test
	public void getUserByName(){
		User user = userService.getUserByUserName("userName");
		assertNotNull("user should be not null",user);
		assertEquals("user's password should be 'password'","password",user.getPasswd());
	}
	
	@Test(expected=UserNotExistException.class)
	public void getUserByNameByNoUserExist(){
		userService.getUserByUserName("noexistUsername");
	}
	
	//test deleteUser
	
	@Test
	public void deleteUser(){
		UserExample u = new UserExample();
		u.setName("userName");
		u.setName_Indicator(UserExample.EXAMPLE_EQUALS);
		UserDAO dao = (UserDAO) daoManager.getDao(UserDAO.class);
		List list1 = dao.selectByExample(u);
		if (list1.size() > 0) {
			User user = (User) list1.get(0);
			userService.deleteUser(user.getUserId());
		}
		
		List list = dao.selectByExample(u);
		assertEquals("There should be no user whose name is 'userName'",0,list.size());
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		userService = null;
		UserExample u = new UserExample();
		u.setName("userName");
		u.setName_Indicator(UserExample.EXAMPLE_EQUALS);
		DaoManager manager = DaoConfig.getDaoManager();
		UserDAO dao = (UserDAO) manager.getDao(UserDAO.class);
		dao.deleteByExample(u);
	}

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(UserServiceIbatisImplTest.class);

	}
}
