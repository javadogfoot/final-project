package com.more.paging;

public class BbsPageModule {

   public static String makePage(String pageName, int totalCnt, int listSize, int pageSize, int cp, String keyWord) {
      
      
      int totalPage = (totalCnt/listSize)+1;
      if(totalCnt%listSize==0)totalPage--;

      int userGroup=cp/pageSize;
      if(cp%pageSize==0)userGroup--;
      
      StringBuffer sb = new StringBuffer();
      
//      if(userGroup!=0){
//         sb.append("<a href='");
//         sb.append(pageName);
//         sb.append("?cp=");
//         int temp = (userGroup-1)*pageSize+pageSize;
//         sb.append(temp);
//         sb.append("'class=page-link>PREV</a>");
//      }
      
      int count = 0;
      
      if(userGroup!=0) {
         sb.append("<ul class='pagination'>");
         sb.append("<li class='page-item'>");
         sb.append("<a href='");
         sb.append(pageName);
         sb.append("?cp=");
         int temp = (userGroup-1)*pageSize+pageSize;
         sb.append(temp);
         sb.append("'class=page-link>PREV</a></li>");
      }
      
      for(int i=userGroup*pageSize+1; i<=userGroup*pageSize+pageSize; i++){
         
         if(count==0) {
            sb.append("<ul class='pagination'>");
         }
         if(i==cp) {
            sb.append("<li class='page-item'><label class='page-link' #id='pagingbt'");
            sb.append(" style='background-color: #bdd8ff;'>");
            sb.append(i);
            sb.append("</label></li>");
         }else {
         sb.append("<li class='page-item'>");
         sb.append("<a href='");
         sb.append(pageName);
         sb.append("?cp=");
         sb.append(i);
         sb.append("&keyWord=");
         sb.append(keyWord);
         sb.append("' class='page-link'>");
         sb.append(i);
         sb.append("</a></li>");
         }
         
         
         if(i==totalPage || totalPage==0) {
            break;
         }
         
       
         
         count++;
      }
      
      if(userGroup!=(totalPage/pageSize)-(totalPage%pageSize==0?1:0) && totalPage != 0) {
         sb.append("<li class='page-item'>");
         sb.append("<a href='");
         sb.append(pageName);
         sb.append("?cp=");
         int temp = (userGroup+1)*pageSize+1;
         sb.append(temp);
         sb.append("'class=page-link>NEXT</a></li></ul>");
      }
      
//      if(userGroup!=(totalPage/pageSize)-(totalPage%pageSize==0?1:0)){
//         sb.append("<a href='");
//         sb.append(pageName);
//         sb.append("?cp=");
//         int temp = (userGroup+1)*pageSize+1;
//         sb.append(temp);
//         sb.append("'class=page-link>NEXT</a>");
//      }
         
      return sb.toString();
   
   }
   
   public static String makePage2(
         String pageName, int totalCnt, int listSize, int pageSize, int cp) {
      
      
      int totalPage = (totalCnt/listSize)+1;
      if(totalCnt%listSize==0)totalPage--;

      int userGroup=cp/pageSize;
      if(cp%pageSize==0)userGroup--;
      
      StringBuffer sb = new StringBuffer();
      
//      if(userGroup!=0){
//         sb.append("<a href='");
//         sb.append(pageName);
//         sb.append("?cp=");
//         int temp = (userGroup-1)*pageSize+pageSize;
//         sb.append(temp);
//         sb.append("'class=page-link>PREV</a>");
//      }
      
      int count = 0;
      
      if(userGroup!=0) {
         sb.append("<ul class='pagination'>");
         sb.append("<li class='page-item'>");
         sb.append("<a href='");
         sb.append(pageName);
         sb.append("?cp=");
         int temp = (userGroup-1)*pageSize+pageSize;
         sb.append(temp);
         sb.append("'class=page-link>PREV</a></li>");
      }
      
      for(int i=userGroup*pageSize+1; i<=userGroup*pageSize+pageSize; i++){
         
         
         if(count==0) {
            sb.append("<ul class='pagination'>");
         }
         if(i==cp) {
            sb.append("<li class='page-item'><label class='page-link' #id='pagingbt'");
            sb.append(" style='background-color: #bdd8ff;'>");
            sb.append(i);
            sb.append("</label></li>");
         }else {
         sb.append("<li class='page-item'>");
         sb.append("<a href='");
         sb.append(pageName);
         sb.append("&cp=");
         sb.append(i);
         sb.append("' class='page-link'>");
         sb.append(i);
         sb.append("</a></li>");
         }
         
         
         if(i==totalPage || totalPage==0) {
             break;
          }
         
         
         count++;
      }
      
      if(userGroup!=(totalPage/pageSize)-(totalPage%pageSize==0?1:0) && totalPage != 0) {
         sb.append("<li class='page-item'>");
         sb.append("<a href='");
         sb.append(pageName);
         sb.append("?cp=");
         int temp = (userGroup+1)*pageSize+1;
         sb.append(temp);
         sb.append("'class=page-link>NEXT</a></li></ul>");
      }
      
//      if(userGroup!=(totalPage/pageSize)-(totalPage%pageSize==0?1:0)){
//         sb.append("<a href='");
//         sb.append(pageName);
//         sb.append("?cp=");
//         int temp = (userGroup+1)*pageSize+1;
//         sb.append(temp);
//         sb.append("'class=page-link>NEXT</a>");
//      }
         
      return sb.toString();
   
   }
}