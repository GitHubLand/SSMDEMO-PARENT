package com.land.pojo;

import com.land.common.BasePojo;

public class User_Role extends BasePojo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    private Byte id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.user_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    private Byte userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.role_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    private Byte roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.id
     *
     * @return the value of t_user_role.id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public Byte getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.id
     *
     * @param id the value for t_user_role.id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public void setId(Byte id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.user_id
     *
     * @return the value of t_user_role.user_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public Byte getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.user_id
     *
     * @param userId the value for t_user_role.user_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public void setUserId(Byte userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.role_id
     *
     * @return the value of t_user_role.role_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public Byte getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.role_id
     *
     * @param roleId the value for t_user_role.role_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public void setRoleId(Byte roleId) {
        this.roleId = roleId;
    }
}