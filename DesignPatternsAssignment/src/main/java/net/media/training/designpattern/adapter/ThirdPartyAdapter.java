package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class ThirdPartyAdapter implements LeaveRecord{
    private ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public String getMostAbsentEmployee(){
        return thirdPartyLeaveRecord.getMostAbsentEmployee().getName();
    }
    
    public int getEmployeeAbsences(String employeeName){
        return thirdPartyLeaveRecord.getEmployeeAbsences(employeeName);
    };
}
