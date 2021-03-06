package com.yiwei.ywt.businessProcess.residentTransfer.model;

import com.yiwei.ywt.framework.model.BaseEntity;
import lombok.Data;
/**
 * 居民过户业务 实体类
 * 数据库表：t_resident_transfer
 * @author xk
 * @version 1.0.0
 * @date 2019/04/18
 */
@Data
public class ResidentTransfer extends BaseEntity {
    /**
     * 户号
     */
    private String familyNumber;
    /**
     * 用水地址
     */
    private String waterAddress;
    /**
     * 新户名
     */
    private String newFamilyName;
    /**
     * 产权地址
     */
    private String propertyAddress;
    /**
     * 新联系电话
     */
    private String newOwnerMobile;
    /**
     * 证件类型
     */
    private String idType;
    /**
     * 证件号码
     */
    private String idCard;
    /**
     * 产权证号
     */
    private String ownerCertificateno;
    /**
     * 其它说明
     */
    private String other;
    /**
     * 有效身份证件正、反面（护照提供内页）
     */
    private String idCardImage;
    /**
     * 不动产完整内页图片地址
     */
    private String ownerCertificateImage;
    /**
     * 授权委托、经办人有效身份证正、反（护照提供内页）
     */
    private String managerIdCardImage;
    /**
     * 手机验证码
     */
    private String mobileCode;
}