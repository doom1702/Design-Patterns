package solid.live.srp;
class Formatter{
    Employee emp;
    Formatter(Employee emp){
        this.emp = emp;
    }
    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + emp.getEmpId() + "'>" +
                "<span>" + emp.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (emp.getTotalLeavesAllowed() - emp.getLeavesTaken()) + "</span>";
        str += "<span>" + Math.round(emp.getMonthlySalary() * 12) + "</span>";
        if (emp.getManager() != null) str += "<span>" + emp.getManager() + "</span>";
        else str += "<span>None</span>";
        int years = 3;

        str += "<span>" + emp.getTotalLeaves() + "</span>";
        return str + "</div> </div>";
    }
}
