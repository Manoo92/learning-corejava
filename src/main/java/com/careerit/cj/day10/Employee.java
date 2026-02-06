package com.careerit.cj.day10;

public class Employee {

    private String empno;
    private String ename;
    private String mgr;
    private double salary;

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getMgr() {
        return mgr;
    }

    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno='" + empno + '\'' +
                ", ename='" + ename + '\'' +
                ", mgr='" + mgr + '\'' +
                ", salary=" + salary +
                '}';
    }
}
