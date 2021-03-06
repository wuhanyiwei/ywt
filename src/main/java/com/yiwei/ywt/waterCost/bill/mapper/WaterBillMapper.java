package com.yiwei.ywt.waterCost.bill.mapper;

import com.yiwei.ywt.framework.dao.CRUDMapper;
import com.yiwei.ywt.waterCost.bill.model.WaterBillInfo;
import org.apache.ibatis.annotations.Mapper;
/**
 * 水费账单
 * @author czy
 * @create 2019/4/15
 * @since 1.0.0
 */
@Mapper
public interface WaterBillMapper extends CRUDMapper<WaterBillInfo> {
    /**
     * 结算成功 修改账单状态
     */
    int  updateTodoCostBill(WaterBillInfo waterBillInfo);

}