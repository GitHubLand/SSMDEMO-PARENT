package com.land.mapper;

import com.land.pojo.User_Role;
import java.util.List;

public interface User_RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    int deleteByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    int insert(User_Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    User_Role selectByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    List<User_Role> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    int updateByPrimaryKey(User_Role record);
}