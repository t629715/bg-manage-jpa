package com.example.bgmanagejpa.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "sys_manager")
public class SysManager implements Serializable {

    private static final long serialVersionUID = -5728033207757585915L;
    /**
     * 管理员ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 上级ID
     */
    @Column(name = "superior_id")
    private Long superiorId;

    /**
     * 管理员真实姓名
     */
    @Column(name = "manager_real_name")
    private String managerRealName;

    /**
     * 管理员密码
     */
    @Column(name = "manager_password")
    private String managerPassword;

    /**
     * 管理员手机号
     */
    @Column(name = "manager_phone")
    private String managerPhone;

    /**
     * 管理员状态-1：正常，2：禁用
     */
    @Column(name = "manager_status")
    private Short managerStatus;
    /**
     * 管理员状态-1：正常，2：禁用
     */
    @Column(name = "manage_delete_state")
    private Short manageDeleteState;
    /**
     * 管理员类型-1：公司，2：渠道
     */
    @Column(name = "manager_type")
    private Short managerType;

    /**
     * 渠道类型管理员等级-1：总经理，2：市场总监，3：经理，4：主管，5：经纪人
     */
    @Column(name = "manager_rank")
    private Short managerRank;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 更新时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 角色数据权限-1：允许查看完整用户名，2：不允许查看完整用户名
     */
    @Column(name = "role_data_permission")
    private Short roleDataPermission;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Short getManageDeleteState() {
        return manageDeleteState;
    }

    public void setManageDeleteState(Short manageDeleteState) {
        this.manageDeleteState = manageDeleteState;
    }

    public Short getRoleDataPermission() {
        return roleDataPermission;
    }

    public void setRoleDataPermission(Short roleDataPermission) {
        this.roleDataPermission = roleDataPermission;
    }

    /**
     * 获取管理员ID
     *
     * @return id - 管理员ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置管理员ID
     *
     * @param id 管理员ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取上级ID
     *
     * @return superior_id - 上级ID
     */
    public Long getSuperiorId() {
        return superiorId;
    }

    /**
     * 设置上级ID
     *
     * @param superiorId 上级ID
     */
    public void setSuperiorId(Long superiorId) {
        this.superiorId = superiorId;
    }

    /**
     * 获取管理员真实姓名
     *
     * @return manager_real_name - 管理员真实姓名
     */
    public String getManagerRealName() {
        return managerRealName;
    }

    /**
     * 设置管理员真实姓名
     *
     * @param managerRealName 管理员真实姓名
     */
    public void setManagerRealName(String managerRealName) {
        this.managerRealName = managerRealName;
    }

    /**
     * 获取管理员密码
     *
     * @return manager_password - 管理员密码
     */
    public String getManagerPassword() {
        return managerPassword;
    }

    /**
     * 设置管理员密码
     *
     * @param managerPassword 管理员密码
     */
    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    /**
     * 获取管理员手机号
     *
     * @return manager_phone - 管理员手机号
     */
    public String getManagerPhone() {
        return managerPhone;
    }

    /**
     * 设置管理员手机号
     *
     * @param managerPhone 管理员手机号
     */
    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    /**
     * 获取管理员状态-1：正常，2：禁用
     *
     * @return manager_status - 管理员状态-1：正常，2：禁用
     */
    public Short getManagerStatus() {
        return managerStatus;
    }

    /**
     * 设置管理员状态-1：正常，2：禁用
     *
     * @param managerStatus 管理员状态-1：正常，2：禁用
     */
    public void setManagerStatus(Short managerStatus) {
        this.managerStatus = managerStatus;
    }

    /**
     * 获取管理员类型-1：公司，2：渠道
     *
     * @return manager_type - 管理员类型-1：公司，2：渠道
     */
    public Short getManagerType() {
        return managerType;
    }

    /**
     * 设置管理员类型-1：公司，2：渠道
     *
     * @param managerType 管理员类型-1：公司，2：渠道
     */
    public void setManagerType(Short managerType) {
        this.managerType = managerType;
    }

    /**
     * 获取渠道类型管理员等级-1：总经理，2：市场总监，3：经理，4：主管，5：经纪人
     *
     * @return manager_rank - 渠道类型管理员等级-1：总经理，2：市场总监，3：经理，4：主管，5：经纪人
     */
    public Short getManagerRank() {
        return managerRank;
    }

    /**
     * 设置渠道类型管理员等级-1：总经理，2：市场总监，3：经理，4：主管，5：经纪人
     *
     * @param managerRank 渠道类型管理员等级-1：总经理，2：市场总监，3：经理，4：主管，5：经纪人
     */
    public void setManagerRank(Short managerRank) {
        this.managerRank = managerRank;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取更新时间
     *
     * @return gmt_modified - 更新时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置更新时间
     *
     * @param gmtModified 更新时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

   /* @Override
    public String toString() {
        return "SysManager{" +
                "id=" + id +
                ", superiorId='" + superiorId +
                "managerRealName=" + managerRealName +
                "managerPassword=" + managerPassword +
                "managerPhone=" + managerPhone +
                "managerStatus=" + managerStatus +
                "manageDeleteState=" + manageDeleteState+
                "managerType=" + managerType +
                "managerRank=" + managerRank +
                "gmtCreate=" + gmtCreate +
                "gmtModified=" + gmtModified +

                '\'' +
                '}';

    }*/
}