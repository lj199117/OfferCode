package com.hnu.effectivejava.chapter6;

public class StrategyEnum {
	
}

/**
 * @author LJ
 *
 */
enum PayrollDay{
	MONDAY(PayType.WEEKDAY),THURSDAY(PayType.WEEKDAY),SUNDAY(PayType.WEEKEND);
	
	private final PayType payType;
	private PayrollDay(PayType payType) {
		this.payType = payType;
	}
	double pay(double hours,double payRate){
		return payType.pay(hours, payRate);
	}
	
	private enum PayType{
		WEEKDAY{
			@Override
			double OvertimePay(double hours,double payRate){
				return (hours - ORD_HOURS)  * payRate / 2;
			}
		},
		WEEKEND{
			@Override
			double OvertimePay(double hours,double payRate){
				return (hours * payRate / 2);
			}
		};
		//必须先声明枚举变量WEEKDAY... 否则这里的变量&方法名不能声明
		private static final int ORD_HOURS = 8;
		abstract double OvertimePay(double hours,double payRate);
		double pay(double hours,double payRate){
			double  basePay = hours * payRate;
			return basePay + OvertimePay(hours, payRate);
		}
	}
}

