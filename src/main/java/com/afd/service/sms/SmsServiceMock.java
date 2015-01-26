package com.afd.service.sms;

public class SmsServiceMock implements ISmsService {

	@Override
	public int sendSmsMultiEx(String[] mobile, String smsContent, String bizCode) {
		return 0;
	}

	@Override
	public int sendSmsMulti(String[] mobile, String smsContent) {
		return 0;
	}

	@Override
	public int sendSmsEx(String mobile, String smsContent, String bizCode) {
		return 0;
	}

	@Override
	public int sendSms(String mobile, String smsContent) {
		return 0;
	}

	@Override
	public int sendScheduledSmsMultiEx(String[] mobile, String smsContent,
			String sendTime, String bizCode) {
		return 0;
	}

	@Override
	public int sendScheduledSmsMulti(String[] mobile, String smsContent,
			String sendTime) {
		return 0;
	}

	@Override
	public int sendScheduledSmsEx(String mobile, String smsContent,
			String sendTime, String bizCode) {
		return 0;
	}

	@Override
	public int sendScheduledSms(String mobile, String smsContent,
			String sendTime) {
		return 0;
	}

}
