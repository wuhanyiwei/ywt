package com.yiwei.ywt.businessProcess.residentChange.model;

import com.yiwei.ywt.framework.model.BaseEntity;
import lombok.Data;

/**
 * 居民用水改移装业务 实体类
 * 数据库表：t_resident_change
 * @author xk
 * @version 1.0.0
 * @date 2019/04/18
 */
@Data
public class ResidentChange extends BaseEntity {
    /**
     *户号
     */
    private String familyNumber;
    /**
     *户名
     */
    private String familyName;
    /**
     *用水地址
     */
    private String waterAddress;
    /**
     *改移原因
     */
    private String changeReason;
    /**
     *证件类型
     */
    private String idType;
    /**
     *证件号码
     */
    private String idCard;
    /**
     *经办人姓名
     */
    private String managerName;
    /**
     *经办人电话
     */
    private String managerMobile;
    /**
     *有效身份证件正、反面（护照提供内页）
     */
    private String idCardImage;
    /**
     *不动产完整内页图片地址
     */
    private String ownerCertificateImage;
    /**
     *授权委托、经办人有效身份证正、反（护照提供内页）
     */
    private String managerIdCardImage;
    /**
     *手机验证码
     */
    private String mobileCode;
}