/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BusinessWaterMapper
 * Author:   XXXXXXX
 * Date:     2019/4/16 16:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.yiwei.ywt.businessProcess.businessCirclesNew.mapper;

import com.yiwei.ywt.businessProcess.businessCirclesNew.model.BusinessWater;
import org.apache.ibatis.annotations.Mapper;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author XXXXXXX
 * @create 2019/4/16
 * @since 1.0.0
 */
@Mapper
public interface BusinessWaterMapper {

    int insert(BusinessWater businessWater);

}
