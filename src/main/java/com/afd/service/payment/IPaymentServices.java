package com.afd.service.payment;

import java.math.BigDecimal;
import java.util.List;

import com.afd.model.order.OrderLog;
import com.afd.model.order.Payment;
import com.afd.model.order.PaymentDetail;
import com.afd.model.order.PaymentOrder;
import com.afd.model.payment.vo.ResultVO;

public interface IPaymentServices {
	public Long savePaymentId(List<Long> orderids,String paytype,String ip,Long userId,String payGw,String paymentType);
	public ResultVO checkPaymentIdIsValid(Long paymentId);
	public ResultVO checkAmountIsValid(Long paymentId,BigDecimal payamount);
	public int updatePayment(Payment payment);	
	public int updatePaymentpaying(Payment payment);
	public int addLog(OrderLog orderLog);
	public int updatePaySuccessOrder(PaymentOrder order);
	public int updatePayingOrder(PaymentOrder order);
	public int updatePayFailureOrder(PaymentOrder order);
	public PaymentOrder getOrderByOrderId(Long orderId);
	public Payment getPaymentInfo(Long paymentId);	
	public List<PaymentDetail> getPaymentDetailByPamentId(Long PaymentId);
	public void updatelNoPayOrder(int days);
}
