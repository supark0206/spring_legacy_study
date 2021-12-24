package com.spring.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	//조인트포인트로 들어오는 신호를 받아서 숏스트링으로 만들어서 시그니처 스트링으로 신호를 준다.
	//조인트 포인트란? advice가 aspect가 들어가는 그 지점.
	public Object loggerAOP(ProceedingJoinPoint jp) throws Throwable{
		String sigStr = jp.getSignature().toShortString();
		System.out.println(sigStr+ "시작 됨~!!!!");
		long st = System.currentTimeMillis();
		
		try {
			Object obj = jp.proceed();
			return obj;
		} catch (Exception e) {
		}finally {
			long et = System.currentTimeMillis();
			System.out.println(sigStr + "끝~~");
			System.out.println(sigStr + "의 경과 시간 : "+ (et-st));
		}
		return st;
	}
}
