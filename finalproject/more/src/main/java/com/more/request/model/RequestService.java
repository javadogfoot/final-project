package com.more.request.model;

import java.util.List;
import java.util.Map;

public interface RequestService {

   public int requestWrite(RequestDTO dto);
   
   public RequestDTO requestContent(int r_idx);
   
   public int requestUpdate(RequestDTO dto);
	
   public int requestDelete(int r_idx);
   
   public List<RequestDTO> reqeustList(int cp, int ls, String cate1, String cate2);
   
   public int requestCount(String ct1, String ct2);
   
   public List<RequestDTO> sentRequest(int cp, int ls, String id);
   
   public int sentRequestCount(String id);
   
}
