package com.land.mapper;

import com.land.pojo.Role_Resource;
import java.util.List;

public interface Role_ResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_resource
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    int deleteByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_resource
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    int insert(Role_Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_resource
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    Role_Resource selectByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_resource
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    List<Role_Resource> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_resource
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    int updateByPrimaryKey(Role_Resource record);
}