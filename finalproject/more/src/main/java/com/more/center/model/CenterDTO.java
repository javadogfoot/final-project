package com.more.center.model;

public class CenterDTO {

   private int n_idx;
   private String title;
   private String content;
   private String writer;
   private String writedate;
   private int readcnt;
   
   private int q_idx;
   private int a_no;
   private String cate;
   
   public CenterDTO() {

   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public int getN_idx() {
      return n_idx;
   }

   public void setN_idx(int n_idx) {
      this.n_idx = n_idx;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getWriter() {
      return writer;
   }

   public void setWriter(String writer) {
      this.writer = writer;
   }

   public String getWritedate() {
      return writedate;
   }

   public void setWritedate(String writedate) {
      this.writedate = writedate;
   }

   public int getReadcnt() {
      return readcnt;
   }

   public void setReadcnt(int readcnt) {
      this.readcnt = readcnt;
   }

   public int getQ_idx() {
      return q_idx;
   }

   public void setQ_idx(int q_idx) {
      this.q_idx = q_idx;
   }

   public int getA_no() {
      return a_no;
   }

   public void setA_no(int a_no) {
      this.a_no = a_no;
   }

   public String getCate() {
      return cate;
   }

   public void setCate(String cate) {
      this.cate = cate;
   }

   
}