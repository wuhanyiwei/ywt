package com.yiwei.ywt.waterCost.payment.service.impl;

import com.yiwei.ywt.waterCost.bill.mapper.WaterBillMapper;
import com.yiwei.ywt.waterCost.bill.model.WaterBillInfo;
import com.yiwei.ywt.waterCost.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 水费缴纳业务实现</p>
 * @author czy
 * @version 1.0.0
 * @date 2019/04/17 21:19
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private WaterBillMapper waterBillMapper;
    /**
     * 查询待缴费账单列表
     * @param waterBill
     * @return
     */
    public List<WaterBillInfo> selectTodoList(WaterBillInfo waterBill) {
        waterBill.setPaymentStatus("欠费");
        return waterBillMapper.selectListByEntity(waterBill);
    }
    /**
     * 结算成功 修改账单状态
     */
    @Override
    public WaterBillInfo updateTodoList(WaterBillInfo waterBillInfo) {

        return 0<this.waterBillMapper.updateTodoCostBill(waterBillInfo)?waterBillInfo:null;
    }
}
