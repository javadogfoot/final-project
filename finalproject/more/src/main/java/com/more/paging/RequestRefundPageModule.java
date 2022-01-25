package com.more.paging;

public class RequestRefundPageModule {

   public static String makePageR(String pageName,int totalCnt,int listSize,int pageSize,int cpr) {
         
         //페이지의 모듈화///////// 원하는 곳에서 사용이 가능하다~~~~~~~~~~~~~~~~~~~~~~~~~~~
         
         int totalPage=(totalCnt/listSize)+1; //총페이지수
         if(totalCnt%listSize==0)totalPage--;    //딱나눠떨어질 경우 페이지만들기위해 -1
         int userGroup=cpr/pageSize; //userGroup=사용자의 현재그룹
         if(cpr%pageSize==0)userGroup--;
         
         StringBuffer sb=new StringBuffer();
               
         if(userGroup!=0){ //이전 화살표
            sb.append("<a href='");
            sb.append(pageName);
            sb.append("?cpr=");
            int temp=(userGroup-1)*pageSize+pageSize;
            sb.append(temp);
            sb.append("'>&lt;&lt;</a>");
         }
         
         for(int i=userGroup*5+1;i<=userGroup*pageSize+pageSize;i++){  //페이지 만들기
            sb.append("&nbsp;&nbsp;<a href='");
            sb.append(pageName);
            sb.append("?cpr=");
            sb.append(i);
            sb.append("'>");
            sb.append(i);
            sb.append("</a>&nbsp;&nbsp;");

            if(i==totalPage || totalPage==0){
               break;
            }
         }
         
         if(userGroup!=(totalPage/pageSize)-(totalPage%pageSize==0?1:0) && totalPage!=0){  //다음 화살표
            sb.append("<a href='");
            sb.append(pageName);
            sb.append("?cpr=");
            int temp=(userGroup+1)*pageSize+1;
            sb.append(temp);
            sb.append("'>&gt;&gt;</a>");

         }
         return sb.toString(); //toString-->string 타입으로 변환해준다.
      }
}