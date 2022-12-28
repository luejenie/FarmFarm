package edu.kh.farmfarm.mypage.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.kh.farmfarm.member.model.VO.Member;
import edu.kh.farmfarm.mypage.model.service.MyPageService;
import edu.kh.farmfarm.mypage.model.vo.Comment;

@Controller
@RequestMapping("/myPage")
public class MyPageController {
	
	@Autowired
	private MyPageService service;
	
	
	/** 마이페이지 이동(주문목록)
	 * @return
	 */
	@GetMapping("")
	public String myPage(
			@SessionAttribute("loginMember")Member loginMember,
			Model model,
			@RequestParam(value="cp", required=false, defaultValue = "1") int cp
			) {
		
		
		Map<String, Object> map = service.selectOrderList(loginMember, cp);
		
		model.addAttribute("map", map);
		
		return "myPage/myPageOrder";
	}
	
	
	

	/** 마이페이지 작성 후기
	 * @return
	 */
	@GetMapping("/review")
	public String myPageReview(
			@SessionAttribute("loginMember")Member loginMember,
			Model model,
			@RequestParam(value="cp", required=false, defaultValue = "1") int cp
			) {
		
		
		Map<String, Object> map = service.selectReviewList(loginMember, cp);
		
		model.addAttribute("map", map);
		
		return "myPage/myPageReview";
	}
	
	
	
	
	/** 마이패이지 작성 게시글
	 * @return
	 */
	@GetMapping("/board")
	public String myPageBoard(
		@SessionAttribute("loginMember")Member loginMember, 
		Model model,
		@RequestParam(value="cp", required=false, defaultValue = "1") int cp,
		@RequestParam(name ="sortFl", required = false, defaultValue="N") String sortFl) {
	
		
	Map<String, Object> paramMap = new HashMap<String, Object>();
	paramMap.put("memberNo", loginMember.getMemberNo());
	paramMap.put("sortFl", sortFl);
	          
	Map<String, Object> map = service.selectBoardList(paramMap, cp);
	
	

	model.addAttribute("map", map);

	
	return "myPage/myPageBoard";
	}
	
	
	
	/** 마이페이지 작성 댓글
	 * @param model
	 * @param cp
	 * @return
	 */
	@GetMapping("/comment")
	public String myPageComment(
			@SessionAttribute("loginMember")Member loginMember, 
			Model model,
			@RequestParam(value="cp", required=false, defaultValue = "1") int cp) {
		

		int memberNo = loginMember.getMemberNo();
		          
		Map<String, Object> map = service.selectCommentList(memberNo, cp);
		
		
		

		model.addAttribute("map", map);

		
		return "myPage/myPageComment";
	}
	
	
	
	/** 마이페이지 찜목록
	 * @return
	 */
	@GetMapping("/wishList")
	public String myPageWishList(
			@SessionAttribute("loginMember")Member loginMember, 
			Model model,
			@RequestParam(value="cp", required=false, defaultValue = "1") int cp) {
		

		int memberNo = loginMember.getMemberNo();
		          
		Map<String, Object> map = service.selectWishList(memberNo, cp);
		
		
		

		model.addAttribute("map", map);

		
		return "myPage/myPageWish";
	}
	
	
	/** 마이페이지 프로필 
	 * @return
	 */
	@GetMapping("/profile")
	public String myPageProfile(
			@SessionAttribute("loginMember")Member loginMember,
			Model model) {
		
		return "myPage/myPageProfile";
	}
	
	/** 마이페이지 프로필수정_이미지  
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("/myPageImage")
	public String updateImage(
			@SessionAttribute("loginMember") Member loginMember,
			@RequestParam(value = "farmfarm") MultipartFile farmfarm,
			RedirectAttributes ra,
			HttpServletRequest req
			) throws Exception{
		
		String webPath = "/resources/images/myPage/profile/";

		String folderPath = req.getSession().getServletContext().getRealPath(webPath);
		
		int result = service.updateImage(webPath, folderPath, loginMember, farmfarm);
		
		String message = null;
		
		if(result>0) {

			message = "프로필 이미지가 변경되었습니다.";
		}
		else {		message = "프로필 이미지 변경이 실패했습니다.";}
		
		ra.addFlashAttribute("message", message);
		
		return "redirect:myPage/myPageProfile";
	}
	
	/** 마이페이지 프로필수정_정보 
	 * @return
	 */
	@PostMapping("/myPageProfile")
	public String updateProfile(
			@SessionAttribute("loginMember") Member loginMember,
			Member inputMember,
			RedirectAttributes ra
			) {
		inputMember.setMemberNo(loginMember.getMemberNo());
		int result = service.updateProfile(inputMember);
		
		String message = null;
		
		if(result > 0) {
			loginMember.setMemberNickname(inputMember.getMemberNickname());
			message = "프로필 수정 완료";
		} else {
			message="프로필 수정 실패";
		}
		
		ra.addFlashAttribute("message", message);
		
		return "redirect:myPage/myPageProfile";
	}
	
	

}
