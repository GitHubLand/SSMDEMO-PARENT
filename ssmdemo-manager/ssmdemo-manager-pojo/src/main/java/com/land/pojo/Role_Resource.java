package com.land.pojo;

import com.land.common.BasePojo;

public class Role_Resource extends BasePojo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_resource.id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    private Byte id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_resource.role_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    private Byte roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_resource.resource_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    private Byte resourceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_resource.id
     *
     * @return the value of t_role_resource.id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public Byte getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_resource.id
     *
     * @param id the value for t_role_resource.id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public void setId(Byte id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_resource.role_id
     *
     * @return the value of t_role_resource.role_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public Byte getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_resource.role_id
     *
     * @param roleId the value for t_role_resource.role_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public void setRoleId(Byte roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_resource.resource_id
     *
     * @return the value of t_role_resource.resource_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public Byte getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_resource.resource_id
     *
     * @param resourceId the value for t_role_resource.resource_id
     *
     * @mbggenerated Thu Nov 09 15:10:41 CST 2017
     */
    public void setResourceId(Byte resourceId) {
        this.resourceId = resourceId;
    }
}