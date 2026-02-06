package com.careerit.cj.day10;

public class EmployeeDto {

    private String empno;
    private String ename;
    private String mgrName;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "empno='" + empno + '\'' +
                ", ename='" + ename + '\'' +
                ", mgrName='" + mgrName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
