package com.Patient;

public class PatientPojo {
         private String name;
         private int no;
         private String password;
         private String mail;
		public PatientPojo(String name, int no, String mail, String password) {
			super();
			this.name = name;
			this.no = no;
			this.password = password;
			this.mail = mail;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNo() {
			return no;
		}
		public void setNumber(int no) {
			this.no = no;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
         
}
