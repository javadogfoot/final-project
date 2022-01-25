package com.more.paging;

public class SuggestPageModule {

	public static String makePage(String pageName,int totalCnt,int listSize,int pageSize,int cp) {
	      
	      //페이지의 모듈화///////// 원하는 곳에서 사용이 가능하다~~~~~~~~~~~~~~~~~~~~~~~~~~~
	      
	      int totalPage=(totalCnt/listSize)+1; //총페이지수
	      if(totalCnt%listSize==0)totalPage--;    //딱나눠떨어질 경우 페이지만들기위해 -1
	      int userGroup=cp/pageSize; //userGroup=사용자의 현재그룹
	      if(cp%pageSize==0)userGroup--;
	      
	      StringBuffer sb=new StringBuffer();
	      if (totalPage != 0) {   
		      if(userGroup!=0){ //이전 화살표
		    	 sb.append("<li class='page-item' style='margin-top:24px;'>");
		         sb.append("<a class='page-link' href='");
		         sb.append(pageName);
		         sb.append("&cp=");
		         int temp=(userGroup-1)*pageSize+pageSize;
		         sb.append(temp);
		         sb.append("'><span>«</span></a>");
		         sb.append("</li>");
		      }
	      }
	      for(int i=userGroup*5+1;i<=userGroup*pageSize+pageSize;i++) {  //페이지 만들기
	    	 if (i == cp) { 
	    		 sb.append("<li class='page-item active'>");
	    		 sb.append("&nbsp;&nbsp;<a class='page-link' href='");
	    		 sb.append(pageName);
	    		 sb.append("&cp=");
	    		 sb.append(i);
	    		 sb.append("'>");
	    		 sb.append(i);
	    		 sb.append("</a>&nbsp;&nbsp;");
	    		 sb.append("</li>");
	    	 } else {
	    		 sb.append("<li class='page-item'>");
	    		 sb.append("&nbsp;&nbsp;<a class='page-link' href='");
	    		 sb.append(pageName);
	    		 sb.append("&cp=");
	    		 sb.append(i);
	    		 sb.append("'>");
	    		 sb.append(i);
	    		 sb.append("</a>&nbsp;&nbsp;");
	    		 sb.append("</li>"); 
	    	 }

	         if(i==totalPage) {
	        	 break;
	         }
	         if (totalPage == 0) {
	        	 break;
	         }
	      }
	      if (totalPage != 0) {
		      if(userGroup!=(totalPage/pageSize)-(totalPage%pageSize==0?1:0)) {  //다음 화살표
		    	 sb.append("<li class='page-item' style='margin-top:24px;'>");
		         sb.append("<a class='page-link' href='");
		         sb.append(pageName);
		         sb.append("&cp=");
		         int temp=(userGroup+1)*pageSize+1;
		         sb.append(temp);
		         sb.append("'><span>»</span></a>");
		         sb.append("</li>");
		      }
	      }
	      return sb.toString(); //toString-->string 타입으로 변환해준다.
	   }
}
