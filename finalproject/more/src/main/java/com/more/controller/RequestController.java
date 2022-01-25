package com.more.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.more.request.model.RequestDTO;
import com.more.request.model.RequestService;
import com.more.suggest.model.SuggestDTO;

@Controller
public class RequestController {

	@Autowired
	private RequestService requestService;

	@RequestMapping("/lessonList.do") // 레슨 요청 cate1 페이지 이동
	public String requestCate1() {
		return "request/cate1";
	}

	@RequestMapping("/request.do") // 레슨 요청 cate2 페이지 이동
	public ModelAndView requestCate2(RequestDTO dto) {
		String cate1 = dto.getCate1();
		String lan = "resources/img/lan/lan_";
		String sport = "resources/img/sport/sport_";
		String music = "resources/img/music/music_";
		String art = "resources/img/art/art_";
		String job = "resources/img/job/job_";
		String sch = "resources/img/sch/sch_";
		String[] arr = null;
		String[] pic_arr = null;
		if (cate1.equals("외국어")) {
			arr = new String[] { "영어", "중국어", "일본어", "스페인어", "프랑스어", "독일어", "TOEIC", "OPIC", "기타언어" };
			pic_arr = new String[] { lan + "eng.jpg", lan + "china.jpg", lan + "japan.jpg", lan + "spain.jpg",
					lan + "france.jpg", lan + "ger.jpg", lan + "toeic.jpg", lan + "opic.jpg", lan + "portu.jpg" };
		} else if (cate1.equals("스포츠-댄스")) {
			arr = new String[] { "피트니스", "테니스", "골프", "볼링", "수영", "요가", "배구", "발레", "방송댄스", "댄스스포츠", "재즈댄스", "스트릿댄스" };
			pic_arr = new String[] { sport + "training.jpg", sport + "tennis.jpg", sport + "golf.jpg",
					sport + "ballin.jpg", sport + "swim.jpg", sport + "yoga.jpg", sport + "valleyball.jpg", sport + "balle.jpg",
					sport + "bangdance.jpg", sport + "dancesport.jpg", sport + "jazzdance.jpg", sport + "streetdance.jpg" };
		} else if (cate1.equals("음악")) {
			arr = new String[] { "보컬", "성악", "랩", "피아노", "기타", "단소", "피리", "우쿨렐레", "드럼", "디제잉" };
			pic_arr = new String[] { music + "vocal.jpg", music + "classicvocal.jpg", music + "rap.jpg",
					music + "piano.jpg", music + "guitar.jpg", music + "danso.jpg", music + "piri.jpg",
					music + "ucrel.jpg", music + "drum.jpg", music + "dj.jpg" };
		} else if (cate1.equals("예술-요리")) {
			arr = new String[] { "미술", "입시미술", "드로잉", "캘리그래피", "사진", "웹툰", "메이크업", "마술", "연기", "꽃꽂이", "제빵", "한식", "양식",
					"일식", "중식" };
			pic_arr = new String[] { art + "art.jpg", art + "univart.jpg", art + "draw.jpg", art + "calli.jpg",
					art + "photo.jpg", art + "webtoon.jpg", art + "makeup.jpg", art + "magic.jpg", art + "act.jpg",
					art + "flower.jpg", art + "bake.jpg", art + "koreacook.jpg", art + "westcook.jpg",
					art + "japancook.jpg", art + "chinacook.jpg" };
		} else if (cate1.equals("실무교육")) {
			arr = new String[] { "코딩", "엑셀", "PPT", "취업컨설팅", "스피치", "제테크", "통계", "포토샵", "일러스트", "영상편집" };
			pic_arr = new String[] { job + "code.png", job + "excel.jpg", job + "ppt.jpg", job + "jobconsult.jpg",
					job + "speach.jpg", job + "tech.png", job + "tong.png", job + "photosh.jpg", job + "illu.jpg",
					job + "youtube.jpg" };
		} else if (cate1.equals("교과목")) {
			arr = new String[] { "국어", "영어", "수학", "사회", "과학", "논술" };
			pic_arr = new String[] { sch + "korea.jpg", sch + "eng.jpg", sch + "math.jpg", sch + "social.jpg",
					sch + "science.jpg", sch + "non.png" };
		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.addObject("arr", arr);
		mav.addObject("pic_arr", pic_arr);
		mav.setViewName("request/cate2");
		return mav;
	}

	@RequestMapping(value = "/requestWrite.do", method = RequestMethod.GET) // 레슨 요청서 작성 페이지 이동
	public ModelAndView requestWriteForm(RequestDTO dto, @RequestParam("pic") String pic) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.addObject("pic", pic);
		mav.setViewName("request/requestWrite");
		return mav;
	}

	@RequestMapping(value = "/requestWrite.do", method = RequestMethod.POST) // 레슨 요청서 작성
	public ModelAndView requestWrite(RequestDTO dto) {

		int result = requestService.requestWrite(dto);
		String msg = result > 0 ? "요청서 전송 성공" : "요청서 전송 실패";
		String url = "index.do";

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("msg");
		return mav;
	}

	@RequestMapping("/requestContent.do") // 레슨 요청서 보기
	public ModelAndView requestContent(@RequestParam("r_idx") int r_idx) {
		System.out.println("들어옴");
		RequestDTO dto = requestService.requestContent(r_idx);
		String ad = dto.getAddr().substring(0, dto.getAddr().indexOf("구") + 1);
		dto.setAddr(ad);
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("request/requestContent");
		return mav;
	}
	
	@RequestMapping(value="/requestUpdate.do",method=RequestMethod.GET) // 레슨 요청서 수정 페이지 이동
	public ModelAndView requestUpdateForm(@RequestParam("r_idx")int r_idx) {
		RequestDTO dto=requestService.requestContent(r_idx);
		ModelAndView mav=new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("request/requestUpdate");
		return mav;
	}
	@RequestMapping(value="/requestUpdate.do",method=RequestMethod.POST) // 레슨 요청서 수정
	public ModelAndView requestUpdate(RequestDTO dto) {

		int result=requestService.requestUpdate(dto);
		String msg=result>0?"요청서 수정 성공":"요청서 수정 실패";
		String url="index.do";
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("msg");
		return mav;
	}
	@RequestMapping("/requestDelete.do") //레슨 요청서 삭제
	public ModelAndView requestDelete(@RequestParam("r_idx")int r_idx) {
		int result=requestService.requestDelete(r_idx);
		String msg = result > 0 ? "요청서 삭제 성공" : "요청서 삭제 실패";
		String url = "index.do";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("msg");
		return mav;
	}
	
	@RequestMapping("/requestList.do") // 레슨 요청 목록
	public ModelAndView requestList(@RequestParam(value = "cp", defaultValue = "1") int cp,
			@RequestParam(value = "cate1", defaultValue = "외국어") String cate1,
			@RequestParam(value = "cate2", defaultValue = "영어") String cate2) {
		System.out.println(cate1);
		System.out.println(cate2);
		int listSize = 3;
		int pageSize = 5;
		int totalCnt = requestService.requestCount(cate1, cate2);
		System.out.println("totalCnt = " + totalCnt);
		List<RequestDTO> list = requestService.reqeustList(cp, listSize, cate1, cate2);
		System.out.println("list = " + list.size());
		String pagestr = com.more.paging.SuggestPageModule.makePage("requestList.do?cate1=" + cate1 + "&cate2=" + cate2,
				totalCnt, listSize, pageSize, cp);
		ModelAndView mav = new ModelAndView("request/requestList");
		mav.addObject("list", list);
		mav.addObject("cate1", cate1);
		mav.addObject("cate2", cate2);
		mav.addObject("pagestr", pagestr);
		return mav;
	}
	
	   @RequestMapping("/sentRequest.do") // 보낸 요청
	   public ModelAndView sentRequest(@RequestParam(value = "cp", defaultValue = "1") int cp ,@RequestParam("id") String id) {
	      ModelAndView mav = new ModelAndView("request/sentRequest");
	      int listSize = 3;
	      int pageSize = 5;
	      int totalCnt = requestService.sentRequestCount(id);
	      List<RequestDTO> list = requestService.sentRequest(cp, listSize, id);
	      String pagestr = com.more.paging.SuggestPageModule.makePage("sentRequest.do?id=" + id, totalCnt, listSize, pageSize, cp);
	      mav.addObject("list", list);
	      mav.addObject("pagestr", pagestr);
	      return mav;
	   }
	
	
}
