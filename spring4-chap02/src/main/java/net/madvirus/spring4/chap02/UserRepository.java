package net.madvirus.spring4.chap02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
		private Map<String, User> userMap = new HashMap<>();
		
		public User findUserById(String id) {
			
			return null;
		}
		
		public void setUser(List<User> users) {
			for (User u : users)
				userMap.put(u.getId(), u);
		}
		
	}
