package Abstraction;

public class Model {
		private int eid;
		private String ename;
		private double salary;
		
		public void setEid(int eid) {
			this.eid= eid;
		}
		public void setEname(String ename) {
			this.ename=ename;
		}
		public void setsalary(double salary) {
			this.salary=salary;
		}
		public int getEid() {
			return	this.eid;
		}
		public String getEname() {
			return this.ename;
		}
		public double getsalary() {
			return this.salary;
		}

}
