package com.agumen.alpha.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.agumen.alpha.domain.User;

@Repository
public class UserDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int getMatchCount(String user_name,String password) {
		String sql_str = " SELECT count(*) FROM table_user "+" WHERE user_name = ? and password =?";
		return jdbcTemplate.queryForObject(sql_str, new Object[] {user_name,password}, Integer.class);
	}
	
	public User findUserByUserName(final String user_name){
		String sql_str = " SELECT user_id,user_name,nick_name " + " FROM table_user WHERE user_name = ?";
		final User user = new User();
		jdbcTemplate.query(sql_str, new Object[] {user_name},new RowCallbackHandler() {	
			public void processRow(ResultSet resultSet) throws SQLException {
				user.setUserId(resultSet.getInt("user_id"));
				user.setUserName(resultSet.getString("user_name"));
				user.setNickName(resultSet.getString("nick_name"));
				// TODO Auto-generated method stub
			}
		});
		
		return user;
	}
	
	
}
