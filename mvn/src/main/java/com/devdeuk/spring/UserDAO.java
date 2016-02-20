package com.devdeuk.spring;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	//초기화
	static List<User> list = new ArrayList<User>();
	
	public static void save(User user){
		list.add(user);
	}
	
	public static int size(){
		return list.size();
	}
	
}

