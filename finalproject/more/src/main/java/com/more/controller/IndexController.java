package com.more.controller;

import java.util.List;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.more.review.model.ReviewDTO;
import com.more.review.model.ReviewService;

@Controller
public class IndexController {
	
	/**
	 * searchCate1()
	 * **/

	public String searchCate1(int random,String cate1) {
		System.out.println(random);
        switch(random) {
        case 0: cate1="외국어"; break;
        case 1: cate1="외국어"; break;
        case 2: cate1="외국어"; break;	
        case 3: cate1="외국어"; break;
        case 4: cate1="외국어"; break;
        case 5: cate1="외국어"; break;
        case 6: cate1="외국어"; break;
        case 7: cate1="외국어"; break;
        case 8: cate1="외국어"; break;
        case 9: cate1="스포츠-댄스"; break;
        case 10: cate1="스포츠-댄스"; break;
        case 11: cate1="스포츠-댄스"; break;
        case 12: cate1="스포츠-댄스"; break;
        case 13: cate1="스포츠-댄스"; break;
        case 14: cate1="스포츠-댄스"; break;
        case 15: cate1="스포츠-댄스"; break;
        case 16: cate1="스포츠-댄스"; break;
        case 17: cate1="스포츠-댄스"; break;
        case 18: cate1="스포츠-댄스"; break;
        case 19: cate1="스포츠-댄스"; break;
        case 20: cate1="스포츠-댄스"; break;
        case 21: cate1="음악"; break;
        case 22: cate1="음악"; break;
        case 23: cate1="음악"; break;
        case 24: cate1="음악"; break;
        case 25: cate1="음악"; break;
        case 26: cate1="음악"; break;
        case 27: cate1="음악"; break;
        case 28: cate1="음악"; break;
        case 29: cate1="음악"; break;
        case 30: cate1="음악"; break;
        case 31: cate1="예술-요리"; break;
        case 32: cate1="예술-요리"; break;
        case 33: cate1="예술-요리"; break;
        case 34: cate1="예술-요리"; break;
        case 35: cate1="예술-요리"; break;
        case 36: cate1="예술-요리"; break;
        case 37: cate1="예술-요리"; break;
        case 38: cate1="예술-요리"; break;
        case 39: cate1="예술-요리"; break;
        case 40: cate1="예술-요리"; break;
        case 41: cate1="예술-요리"; break;
        case 42: cate1="예술-요리"; break;
        case 43: cate1="예술-요리"; break;
        case 44: cate1="예술-요리"; break;
        case 45: cate1="예술-요리"; break;
        case 46: cate1="실무교육"; break;
        case 47: cate1="실무교육"; break;
        case 48: cate1="실무교육"; break;
        case 49: cate1="실무교육"; break;
        case 50: cate1="실무교육"; break;
        case 51: cate1="실무교육"; break;
        case 52: cate1="실무교육"; break;
        case 53: cate1="실무교육"; break;
        case 54: cate1="실무교육"; break;
        case 55: cate1="실무교육"; break;
        case 56: cate1="교과목"; break;
        case 57: cate1="교과목"; break;
        case 58: cate1="교과목"; break;
        case 59: cate1="교과목"; break;
        case 60: cate1="교과목"; break;
        case 61: cate1="교과목"; break;
 		}
        System.out.println(cate1);
        return cate1;
	}
	
	@Autowired
	ReviewService reviewService;

	@RequestMapping(value="/index.do")
	public ModelAndView index() {
		
		List<ReviewDTO> rv_list=reviewService.mainReviewList();
		
		String lan = "resources/img/lan/lan_";
		String sport = "resources/img/sport/sport_";
		String music = "resources/img/music/music_";
		String art = "resources/img/art/art_";
		String job = "resources/img/job/job_";
		String sch = "resources/img/sch/sch_";
		String[] arr = new String[] { "영어", "중국어", "일본어", "스페인어", "프랑스어", "독일어", "TOEIC", "OPIC", "기타언어", 
					"피트니스","테니스", "골프", "볼링", "수영", "요가", "배구", "발레", "방송댄스", "댄스스포츠", "재즈댄스", "스트릿댄스",
					"보컬", "성악", "랩", "피아노", "기타", "단소", "피리", "우쿨렐레", "드럼", "디제잉",
					"미술", "입시미술", "드로잉", "캘리그래피", "사진", "웹툰", "메이크업", "마술", "연기", "꽃꽂이", "제빵", "한식", "양식", "일식", "중식",
					"코딩", "엑셀", "PPT", "취업컨설팅", "스피치", "제테크", "통계", "포토샵", "일러스트", "영상편집",
					"국어", "영어", "수학", "사회", "과학", "논술"};
		
		String[] pic_arr = new String[] { lan + "eng.jpg", lan + "china.jpg", lan + "japan.jpg", lan + "spain.jpg",
					lan + "france.jpg", lan + "ger.jpg", lan + "toeic.jpg", lan + "opic.jpg", lan + "portu.jpg",
					sport + "training.jpg", sport + "tennis.jpg", sport + "golf.jpg", sport + "ballin.jpg", sport + "swim.jpg", sport + "yoga.jpg", 
					sport + "valleyball.jpg", sport + "balle.jpg", sport + "bangdance.jpg", sport + "dancesport.jpg", sport + "jazzdance.jpg", sport + "streetdance.jpg",
					music + "vocal.jpg", music + "classicvocal.jpg", music + "rap.jpg", music + "piano.jpg", music + "guitar.jpg", 
					music + "danso.jpg", music + "piri.jpg", music + "ucrel.jpg", music + "drum.jpg", music + "dj.jpg",
					art + "art.jpg", art + "univart.jpg", art + "draw.jpg", art + "calli.jpg", art + "photo.jpg", art + "webtoon.jpg", art + "makeup.jpg", 
					art + "magic.jpg", art + "act.jpg",art + "flower.jpg", art + "bake.jpg", art + "koreacook.jpg", art + "westcook.jpg", art + "japancook.jpg", art + "chinacook.jpg",
					job + "code.png", job + "excel.jpg", job + "ppt.jpg", job + "jobconsult.jpg",
					job + "speach.jpg", job + "tech.png", job + "tong.png", job + "photosh.jpg", job + "illu.jpg", job + "youtube.jpg",
					sch + "korea.jpg", sch + "eng.jpg", sch + "math.jpg", sch + "social.jpg", sch + "science.jpg", sch + "non.png"};
		
		String[] a_pic=new String[5];
		String[] a_name=new String[5];
		String[] a_cate=new String[5];
		String cateA=null;
	      for(int i=0;i<5;i++) {
	           int a_random= (int)Math.floor((Math.random()*pic_arr.length));
	           
	            a_pic[i] = pic_arr[a_random];
	            a_name[i] = arr[a_random];
	             
	            for(int j=0;j<i;j++) {
	            	if(a_pic[i]==a_pic[j]) {
		            	i--;
		            	break;      	
		            }
	            }
	            String result = searchCate1(a_random,cateA);
	            a_cate[i] = result;
	         }
	      
		String[] b_pic=new String[5];
		String[] b_name=new String[5];
		String[] b_cate=new String[5];
		String cateB=null;
	      for(int i=0;i<5;i++) {
	           int b_random= (int)Math.floor((Math.random()*pic_arr.length));
	            b_pic[i] = pic_arr[b_random];
	            b_name[i] = arr[b_random];
	            for(int j=0;j<i;j++) {
	            	if(b_pic[i]==b_pic[j]) {
		            	i--;
		            	break;
		            }
	            }
	            String result = searchCate1(b_random,cateB);
	            System.out.println("result = " + result);
	            b_cate[i] = result;
	            System.out.println("추천 카테 = " + b_cate[i]);
	         }

		ModelAndView mav = new ModelAndView();
		mav.addObject("rv_list", rv_list);
		mav.addObject("a_name", a_name);
		mav.addObject("a_pic", a_pic);
		mav.addObject("a_cate", a_cate);
		mav.addObject("b_name", b_name);
		mav.addObject("b_pic", b_pic);
		mav.addObject("b_cate", b_cate);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/sessionNull.do")
	public ModelAndView sessionNull() {
		ModelAndView mav = new ModelAndView("msg");
		mav.addObject("msg", "로그인 후 이용가능합니다!");
		mav.addObject("url", "login.do");
		return mav;
	}
	
	@RequestMapping("/sessionNullExpert.do")
	public ModelAndView sessionNullExpert() {
		ModelAndView mav = new ModelAndView("msg");
		mav.addObject("msg", "전문가는 레슨을 의뢰할 수 없어요!");
		mav.addObject("url", "index.do");
		return mav;
	}
	
	@RequestMapping("/wrong.do")
	public ModelAndView wrong() {
		ModelAndView mav = new ModelAndView("msg");
		mav.addObject("msg", "잘못된 접근입니다!");
		mav.addObject("url", "index.do");
		return mav;
	}
}