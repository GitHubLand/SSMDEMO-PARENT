package com.land.mapper;

import com.land.pojo.Resource;
import java.util.List;

public interface ResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    int deleteByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    int insert(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    Resource selectByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    List<Resource> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_resource
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    int updateByPrimaryKey(Resource record);
}