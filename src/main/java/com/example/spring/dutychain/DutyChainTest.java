package com.example.spring.dutychain;

/**
 * 责任链模式测试类
 */
public class DutyChainTest {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest().setLeaveDays(30).setName("小明");
        AbstractLeaveHandler directLeaderLeaveHandler = new DirectLeaderLeaveHandler("县令");
        DeptManagerLeaveHandler deptManagerLeaveHandler = new DeptManagerLeaveHandler("知府");
        GManagerLeaveHandler gManagerLeaveHandler = new GManagerLeaveHandler("京兆尹");
        directLeaderLeaveHandler.setNextHandler(deptManagerLeaveHandler);
        deptManagerLeaveHandler.setNextHandler(gManagerLeaveHandler);
        directLeaderLeaveHandler.handlerRequest(request);
    }
}
