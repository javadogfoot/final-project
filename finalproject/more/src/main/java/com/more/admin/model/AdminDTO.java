package com.more.admin.model;

public class AdminDTO {
   
   private int idx;
   private String id;
   private String pwd;
   private String name;
   private String email;
   private String tel;
   private int status;
   
   public AdminDTO() {
	super();
}

public AdminDTO(int idx, String id, String pwd, String name, String email, String tel, int status) {
      super();
      this.idx = idx;
      this.id = id;
      this.pwd = pwd;
      this.name = name;
      this.email = email;
      this.tel = tel;
      this.status = status;
   }
   
   
   

   public int getIdx() {
      return idx;
   }

   public void setIdx(int idx) {
      this.idx = idx;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getPwd() {
      return pwd;
   }

   public void setPwd(String pwd) {
      this.pwd = pwd;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getTel() {
      return tel;
   }

   public void setTel(String tel) {
      this.tel = tel;
   }

   public int getStatus() {
      return status;
   }

   public void setStatus(int status) {
      this.status = status;
   }

   
}