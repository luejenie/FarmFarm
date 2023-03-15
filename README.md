<div align="center">
<img width="20%" src="https://user-images.githubusercontent.com/110653581/211257489-34757022-4c71-443f-afe7-94d240788288.png" />
<h2>팜팜</h2>
<h3>내 손으로 키운 작물, 손쉽게 거래하세요.</h3>
<br>
</div>

# :pushpin: FarmFarm
> **농산물 직거래 플랫폼 및 농사 용품 판매 쇼핑몰** <br>
> **[FarmFarm 바로가기](http://129.154.53.250:8080)**

<br>


## 0. 기획의도

![header](https://capsule-render.vercel.app/api?type=waving&text=FarmFarm&fontSize=50&fontColor=ffffff&color=097f09&&fontAlign=85&fontAlignY=40)

최근 귀농, 숲세권 등의 단어에서 보여지듯이 자연에 대한 관심 증가하고 있다. 
작게는 집 베란다 화분에서부터 나아가서는 주말농장, 텃밭 등 *자연을 찾는 수요* 또한 늘어나고 있다. <br>
이뿐만 아니라 팬데믹으로 인해 건강에 관한 관심이 증가하면서 바른 먹거리와 깨끗한 농산물을 찾는 사람들이 많아졌고, 
건강한 먹거리를 살 수 있는 **소비자**와 건강한 먹거리를 팔 수 있는 **생산자 모두를 위한 사이트**의 필요성을 자각하게 되었다. <br>

<br>

**FarmFarm(팜팜)** 은 이러한 수요와 생산을 접목하면서 시작되었다. <br>
건강한 먹거리를 사고파는 플랫폼에서 멈추지 않고, 먹거리를 직접 기르는 사람들에게까지도 도움이 될 수 있는 플램폼을 추구한다.<br>

<br>

팜팜은, <br>
**_소비자_** 로서 건강한 먹거리를 구매하고, <br>
**_판매자_** 로서 직접 기른 농작물을 직접 판매하고, <br>
**_생산자_** 로서 농사에 필요한 농자재 구매 및 정보를 공유하는 <br>
All in One **거래 중개 플랫폼**이다.

<br>

💡**BenchMarking**💡<br>
농직, 마켓컬리, 당근마켓, 쿠팡 등

<br>
<br>

## 1. 프로젝트 소개
- **제작 기간** : 2022년 12월 12일 ~ 2023년 1월 11일
- **참여 인원** : 6인 팀 프로젝트
- **프로젝트 개요**
  - Java와 Spring 프레임워크를 이용하여 온라인 쇼핑몰 구축
  - 상품 정보, 주문 정보, 회원 정보 등을 관리하는 기능 제공
  - 개인간 거래, 커뮤니티 게시판, 채팅 및 알림 기능 제공
- **담당 기능**
  - 전체 프로젝트 기획 및 개발 참여
  - 일반 회원, 판매자, 게시글, 댓글 등 대상별 **신고 기능** 구현
  - **관리자 페이지**의 편의성 향상을 위해 AJAX/AXIOS를 활용한 기능 구현
    - 회원 관리 : 판매자 등록 상태, 회원 활동 상태에 따른 비동기 조회
    - 신고 관리 : 강제 탈퇴, 정지, 게시글 삭제 등 신고 처리 기능 구현
    - 필터, 정렬, 페이지네이션, 검색 기능 
  - @Scheduled를 활용하여 정지 계정 자동 활성화
  - Chart.js를 활용한 관리자 대시보드 통계 그래프 구현

- **성과**
  - 온라인 쇼핑몰 프로토타입 완성
  - 교육원 내 프로젝트 최우수상 수상
  - WBS에 계획한 일정에 맞춰 프로젝트 구현
  
<br>
<br>

- **프로젝트 구조**
![](https://user-images.githubusercontent.com/110653573/221127291-cec3ff02-76a7-4de3-a5e0-59ac00119050.png)


<br>
<br>

## 2. 사용 기술
<div align="center">
  
### **Back-end**
<img src="https://img.shields.io/badge/Java 11-007396?style=for-the-badge&logo=java&logoColor=white"> 
  <img src="https://img.shields.io/badge/Spring 5.3.14-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
  <img src="https://img.shields.io/badge/Oracle 21C-F80000?style=for-the-badge&logo=oracle&logoColor=white">
  <br>
  <img src="https://img.shields.io/badge/Apache Tomcat 9.0-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white">
    <img src="https://img.shields.io/badge/Apache Maven-C71A36?style=for-the-badge&logo=ApacheMaven&logoColor=white">
    <img src="https://img.shields.io/badge/Spring Sequrity-6DB33F?style=for-the-badge&logo=SpringSecurity&logoColor=white">

### **Front-end**
  <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> 
  <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"> 
  <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> 

</div>

<br>
<br>

## 3. ERD 설계
![](https://user-images.githubusercontent.com/110653573/221079293-fcda70a5-1aeb-4744-94cc-6a2033d95ebe.png)

<br>
<br>

## 4. 핵심 기능

<br>
	
<details>
<summary><b>4.1. 신고하기</b></summary>
<div markdown="1">
	
![](https://user-images.githubusercontent.com/110653573/222202403-a3a38c67-fc1b-41f1-8853-d4f022a3f709.png)

#### 총 6가지 신고
	
### 1. 신고 대상 구분하기 (JS)
	
#### (1) 페이지별 신고 대상이 하나인 경우 <br>
  - 판매자(seller), 판매 게시글(post), 채팅 회원(chat) <br>
  - 주소의 pathname을 이용하여 조건을 분리하였다.
<br>
	
▼ JS 코드
	
 ```javascript
 
// pathname: 각 기능 메인 주소
var pathname = location.pathname.substring(1, location.pathname.lastIndexOf("/"));

// postNo(판매글), seller에서 memberNo(판매자)
var targetNo = location.pathname.substring(location.pathname.lastIndexOf("/")+1);

var reportType;
var reportTargetNo;


// 신고하기 버튼 클릭 시
reportBtn.addEventListener("click", () => {

    if(reportTargetNo == 0){
        messageModalOpen("관리자는 신고 대상이 아닙니다.");
	
    } else{
        openReportModal();  // 신고하기 모달 열리고 → 신고 사유 등 선택한 뒤 신고버튼 누르면 report() 함수 선언
        switch(pathname){
            case 'seller': reportType = 'M'; reportTargetNo = targetNo; break;
            case 'post': reportType = 'P'; reportTargetNo = targetNo; break;
            case 'chat': reportType = 'M'; reportTargetNo = selectedChatNo; break; // chatContext.js에서 선언한 변수 사용
        }
    }
});

```
<br>

#### (2) 페이지별 신고 대상이 둘 이상인 경우 (각 대상의 식별 번호 이용)<br>
  - 커뮤니티 게시글 **작성자** 신고(회원 번호)<br>
  - 커뮤니티 **게시글** 신고(게시글 번호)<br>
  - 커뮤니티 **댓글** 신고(댓글 번호) <br>
 
※ 페이지 안에 신고 대상이 여러 개이기 때문에 (1)의 방법처럼 pathname으로 신고 대상을 구분하기가 쉽지 않았다. <br>
   이에 각 대상별로 조건을 나누어서 구현하는 방법을 택하였다.
	

<details>
<summary>JS 코드</summary>
<div markdown="1">

```javascript

// 1) 댓글 신고
for(let i=0; i<reportCommentBtn.length; i++){

    // 댓글의 신고하기 버튼 누르면 (본인의 댓글인 경우, 화면에서 신고하기 버튼 제거)
    reportCommentBtn[i]. addEventListener("click", () => {

	// 신고 모달 열리기
	openReportModal();

	// 각 댓글의 댓글 번호
	const targetCommentNo = document.getElementsByClassName('targetCommentNo');

	// 신고유형, 신고번호 매칭
	if(targetCommentNo[i] != null){
	    reportType = 'C';
	    reportTargetNo = targetCommentNo[i].value;

	}
    })
}



// 2) 댓글 작성자 신고
document.getElementById('reportMemberBtn').addEventListener('click', () =>{

				    // memberNo = "${loginMember.memberNo}";
				    // 본인 계정 신고x
    if(targetMemberNo != null && targetMemberNo != memberNo){
	// 신고 모달 열리기
	openReportModal();
	reportType = 'M';
	reportTargetNo = targetMemberNo;
    }

    if(targetMemberNo == memberNo){
	messageModalOpen("본인의 계정은 신고할 수 없습니다.");
    }
})



// 3) 커뮤니티 게시글 신고
document.getElementById('reportBoardBtn').addEventListener('click', () => {

    if(boardNo != null){
	// 신고 모달 열리기
	openReportModal();
	reportType = 'B';
	reportTargetNo = boardNo;
    }
})

```

</div>
</details>

<br>
	
### 2. 신고하기 <br>
	
  - 신고하기를 클릭하면, 신고 사유를 입력하는 모달창이 열리게 되고 
  - 이 모달창에서 신고하기를 누르면 신고 사유와 함께 신고 기능이 처리된다.
  - <p>신고 대상의 번호(reportTargetNo), 계정/게시글 등 신고 대상의 타입(reportType), 신고자가 선택한 신고 사유(reportReason) 및 <br>
    작성한 신고 사유(reportContent)를 담아 컨트롤러에 전달하였고, 이를 신고 테이블에 insert 하였다.</p>

<details>
<summary>신고 기능 JS</summary>
<div markdown="1">

```javascript
// 신고하기 ajax
var report = () => {
    $.ajax({
        url: "/report",
        data: { "reportType" :reportType, 
                "reportTargetNo" : reportTargetNo,
                "reportReason" : radioResult,
                "reportContent": reportContent.value},
        type: "POST",
        success: (result) => {
            if(result > 0){
                console.log("신고 접수");
                reportContainer.style.display = 'none';
                messageModalOpen('신고가 접수되었습니다.');
            
            } else {
                console.log("신고 실패");
            }
        },
        error: () => {
            console.log("신고 오류");
        }
    });

}
```

</div>
</details>
<details>
<summary>Controller</summary>
<div markdown="1">

```java
@Controller
public class ReportController {
	
	@Autowired
	private ReportService service;

	// ajax 이용하여 신고하기
	@PostMapping("/report")
	@ResponseBody
	public int insertReport(@SessionAttribute(value = "loginMember") Member loginMember,
				@RequestParam(value="reportType", required=false) String reportType,
				@RequestParam(value="reportTargetNo", required=false, defaultValue="0") int reportTargetNo,
				@RequestParam(value="reportReason", required=false) String reportReason,
				@RequestParam(value="reportContent", required=false)  String reportContent
				) {

		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("reportType", reportType);
		map.put("reportTargetNo", reportTargetNo);
		map.put("reportReason", reportReason);
		map.put("reportContent", reportContent);
		map.put("memberNo", loginMember.getMemberNo());
		
		int result = 0;
		
		if(loginMember != null) {
			result = service.insertReport(map);
		}
		
		return result;
	}
}

```

</div>
</details>

<details>
<summary>mapper</summary>
<div markdown="1">

```xml
<insert id="insertReport">
	INSERT INTO REPORT VALUES(SEQ_REPORT_NO.NEXTVAL, #{reportType}, #{memberNo}, #{reportTargetNo}, #{reportReason},
		DEFAULT, NULL, NULL, #{reportContent})
</insert>
```

</div>
</details>

---	
	
</div>
</details>	


<br>
	
<details>
<summary><b>4.2. ajax/axios를 활용하여 비동기로 관리자 페이지 기능 구현</b></summary>
<div markdown="1">

	
![](https://user-images.githubusercontent.com/110653573/224872423-32f98f57-d9a5-4c5f-addb-862610668cef.png)
<br>
![](https://user-images.githubusercontent.com/110653573/224874503-dc610f0f-8a04-498a-bcf8-25f4b2eab51c.png)


#### (1) 필터, 검색 기능

  - 필터의 경우, 필터 별로 고유한 아이디를 주어 선택될 때마다 아이디의 값을 컨트롤러로 전달하였고,
  - 검색의 경우, 검색어가 입력될 때마다 검색어를 컨트롤러로 전달하였다.
  - 필터 아이디의 값과 검색어는 mapper에서 if문을  경우의 수를 구분하여 적용하였다.
  - 각각의 결과는 비동기를 이용하여 새로 목록에 조회되도록 하였다.
  
<br>

<details>
<summary>회원관리 Controller</summary>
<div markdown="1">

```java
@Controller
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	//..(중략)..

	// 전체 회원 조회(정렬, 페이지네이션, 검색)
	@GetMapping("/admin/members/list")
	@ResponseBody
	public String selectMember(@RequestParam(value="cp", required=false, defaultValue="1") int cp,
				   @RequestParam(value="authFilter", required=false, defaultValue="0") String authFilter,
				   @RequestParam(value="statFilter", required=false, defaultValue="0") String statFilter,
				   @RequestParam(value="keyword", required=false) String keyword) {
		  
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("authFilter", authFilter); // 판매자 인증 상태 필터
		paramMap.put("statFilter", statFilter); // 계정 상태 필터
		
		if(keyword != null) {
			paramMap.put("keyword", keyword); // 검색어
		}
		
		
		Map<String, Object> map = new HashMap<String, Object>();

		// 전체 회원 정보 조회 + 페이지네이션 + 정렬
		map = service.selectMember(paramMap, cp);
	
		return new Gson().toJson(map);
	}
	
	//..(중략)..
}
```

</div>
</details>
	
<details>
<summary>회원관리 Service</summary>
<div markdown="1">

```java
@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO dao;
	
	//..(중략)..
	
	// 전체 회원 조회 (정렬, 페이지네이션, 검색)
	@Override
	public Map<String, Object> selectMember(Map<String, Object> paramMap, int cp) {


		/* 페이지네이션 */
		// 1. 전체 개수를 가져옴.
		int memberListCount = dao.memberListCount(paramMap);

		// 2. 가져온 개수와 현재 페이지를 이용해서 페이지네이션 객체 생성
		Pagination pagination = new Pagination(memberListCount, cp, 15);

		// 3. 페이네이션 객체를 생성해 목록 불러오기
		// 전체 회원 조회(정렬 포함)
		List<Admin> memberList = dao.selectMember(paramMap, pagination);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("memberListCount", memberListCount);
		map.put("pagination", pagination);
		map.put("memberList", memberList);


		return map;
	}
	
	//..(중략)..

}
```

</div>
</details>


<details>
<summary>회원관리 DAO</summary>
<div markdown="1">

```java
@Repository
public class AdminDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//..(중략)..
	
	/** 전체 회원 조회(페이지네이션, 정렬 포함)
	 * @param paramMap
	 * @param pagination
	 * @return
	 */
	public List<Admin> selectMember(Map<String, Object> paramMap, Pagination pagination) {

		int offset = (pagination.getCurrentPage() -1) * 15;
		RowBounds rowBounds = new RowBounds(offset, 15);

		return sqlSession.selectList("adminMapper.selectMemberList", paramMap, rowBounds);
	}
	
	//..(중략)..
	
}
```

</div>
</details>
	
	
	
<details>
<summary>회원관리 mapper</summary>
<div markdown="1">

```xml
<!-- 전체 회원 정보 조회 (정렬 별로 포함) -->
<select id="selectMemberList" resultMap="admin_rm">
SELECT *
FROM (SELECT 
		(CASE 
			WHEN REPORT_TYPE = 'M' THEN 'M'
			WHEN REPORT_TYPE IS NULL THEN NULL
			ELSE NULL
		END)REPORT_TYPE,
		RANK() OVER(PARTITION BY REPORT_TYPE, REPORT_TARGET_NO ORDER BY REPORT_NO DESC) AS RANKING,
		RANK() OVER(PARTITION BY MEMBER_NO ORDER BY REPORT_TYPE DESC) AS DUPL_FLAG,
		MEMBER_NO, REPORT_TARGET_NO,
		MEMBER_ID, MEMBER_NAME, MEMBER_NICKNAME, MEMBER_TEL, MEMBER_DEL_FL, SIGNUP_DATE, AUTHORITY, PROFILE_IMG, MEMBER_BIRTH,
		REPLACE(MEMBER_ADDRESS, ',,', ' ') MEMBER_ADDRESS, DEFAULT_FL, FARM_IMG, REPORT_NO, REPORT_MEMBER_NO, REPORT_REASON, REPORT_DATE, 				REPORT_PENALTY, 
		PROCESS_DATE, REPORT_CONTENT
	FROM MEMBER 
	LEFT JOIN ADDRESS USING(MEMBER_NO)
	LEFT JOIN SELLER USING(MEMBER_NO)
	LEFT JOIN REPORT ON (MEMBER_NO = REPORT_TARGET_NO)
	WHERE MEMBER_ID != 'admin'
	AND DEFAULT_FL = 'Y'
	ORDER BY MEMBER_NO)
WHERE RANKING = 1 <!--누적 신고 중 제일 최근 값 가져오기 -->
AND DUPL_FLAG = 1 <!--reportTargetNo가 같을 때 신고 타입 'M'인 경우만 가져오기 -->
<if test='authFilter==0 and statFilter==0'> <!--전체 -->
</if>
<if test='authFilter==1'> <!--판매자인증: 미등록 -->
	AND AUTHORITY = 0
</if>		
<if test='authFilter==2'> <!--판매자인증: 판매자 -->
	AND AUTHORITY = 1
</if>
<if test='authFilter==3'> <!--판매자인증: 인증대기 -->
	AND AUTHORITY = 3
</if>
<if test='authFilter==4'> <!--판매자인증: 인증보류 -->
	AND AUTHORITY = 4
</if>

<if test='statFilter==1'> <!--상태: 활동중 -->
	AND MEMBER_DEL_FL = 'N'
	AND (REPORT_PENALTY IS NULL
	OR REPORT_PENALTY = 'N'
	OR REPORT_PENALTY = 'A')
	AND REPORT_TYPE = 'M'				
</if>
<if test='statFilter==2'> <!--상태: 정지 -->
	AND MEMBER_DEL_FL = 'N'
	AND REPORT_PENALTY = 'Y' 
	AND PROCESS_DATE IS NOT NULL
	AND REPORT_TYPE = 'M'
</if>
<if test='statFilter==3'> <!--상태: 강제 탈퇴 -->
	AND MEMBER_DEL_FL = 'Y'
</if>
<if test='keyword != null'>
	AND (LOWER(MEMBER_ID) LIKE LOWER('%${keyword}%')
	OR LOWER(MEMBER_NICKNAME) LIKE LOWER('%${keyword}%')
	OR MEMBER_NO LIKE ('%${keyword}%'))
</if>
</select>
```

</div>
</details>

<br>
<details>
<summary>회원관리 JS (axios)</summary>
<div markdown="1">

```javascript

/** 전체 회원 정보 조회 함수 */
const selectMemberList = (cp) => {
    axios.get("/admin/members/list", {
        params: { "cp": cp, 
		"authFilter": authFilter,
		"statFilter": statFilter, 
		"keyword": keyword}
    })
    .then((response) => {
        const map = response.data;
        printMemberList(map.memberList, map.pagination);
    }).catch(() => {
        console.log("회원 정보 조회 실패");
    });
}

//..(중략)..
```

</div>
</details>

[▶ 회원 관리 JS 전체 코드](https://github.com/luejenie/FarmFarm/blob/main/FarmFarm/src/main/webapp/resources/js/admin/adminMember.js)	
	
<br>
[+]
<br>
	
[▶ 판매자 인증 Controller](https://github.com/luejenie/FarmFarm/blob/main/FarmFarm/src/main/java/edu/kh/farmfarm/admin/controller/AdminSellerAuthController.java#L59)<br>
[▶ 신고 내역 관리 Controller](https://github.com/luejenie/FarmFarm/blob/main/FarmFarm/src/main/java/edu/kh/farmfarm/admin/controller/AdminReportController.java)

<br>
	
#### (2) 대상별 신고 처리 기능
  - 신고된 회원 **강제 탈퇴, 정지, 반려**
  - 신고된 게시글, 댓글 **삭제, 반려**
  - <p>각 대상별로 다르게 처리되어야 했으므로 각각 기능을 다르게 만들었다.<br>
    특히 판매자의 경우, 신고된 상태를 변경하는 것에서 그치지 않고<br>
    판매자가 쓴 판매글까지 같이 삭제되어야 했기 때문에 한 번 더 처리를 해주었다.</p>

<br>
	
<details>
<summary>신고 처리 Controller</summary>
<div markdown="1">

```java
@Controller
public class AdminProcessController {
	
	@Autowired
	private AdminProcessService service;
	
	// 관리자페이지 - 신고 처리
	/*
	  계정 - 강제 탈퇴, 정지, 반려
	  게시글 - 삭제, 반려
	  admin-mapper 그대로 사용
	 */
	
	
	// 회원 관리 - 강제 탈퇴 (신고 내역 없어도 가능)
	@PatchMapping("/admin/members/{memberNo}/kickout")
	@ResponseBody
	public int memberKickout(@PathVariable("memberNo") int memberNo) {
		return service.memberKickout(memberNo);
	}
	
	
	// 신고 계정 - 강제탈퇴  // 신고된 회원 강제 탈퇴 + REPORT 테이블 변경하기 + 판매자면 판매상품 지우기
	@PatchMapping("/report/M/{memberNo}/kickout")
	@ResponseBody
	public int reportMemberKickout(@PathVariable("memberNo") int memberNo, 
					@RequestParam(value="authority", required=false, defaultValue="0") int authority) {
		return service.reportMemberKickout(memberNo, authority);
	}
	
	
	// 신고 계정 - 정지   // 스케쥴러로 7일 뒤에 풀기
	@PatchMapping("/report/M/{memberNo}/suspension")
	@ResponseBody
	public int reportMemberBanned(@PathVariable("memberNo") int memberNo) {
		return service.reportMemberBanned(memberNo);
	}
	
	
	// 신고 계정 - 반려
	@PatchMapping("/report/M/{memberNo}/hold")
	@ResponseBody
	public int reportMemberLeave(@PathVariable("memberNo") int memberNo) {
		return service.reportMemberLeave(memberNo);
	}
	
	
	// 신고 게시글(판매글, 커뮤니티 게시글, 커뮤니티 댓글) - 삭제
	@PatchMapping("/report/{reportType}/{contentNo}/delete")
	@ResponseBody
	public int reportDeleteContent(@PathVariable("contentNo") int contentNo, 
					@PathVariable("reportType") String reportType) {
		return service.reportDeleteContent(contentNo, reportType);
	}
	
	
	// 신고 게시글 - 반려
	@PatchMapping("/report/{reportType}/{contentNo}/hold")
	@ResponseBody
	public int reportLeaveContent(@PathVariable("contentNo") int contentNo, 
				      @PathVariable("reportType") String reportType) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("contentNo", contentNo);
		paramMap.put("reportType", reportType);
			
		return service.reportLeaveContent(paramMap);
	}
}

```

</div>
</details>
	
<details>
<summary>신고 처리 Service</summary>
<div markdown="1">

```java
@Service
public class AdminProcessServiceImpl implements AdminProcessService{
	
	@Autowired
	private AdminProcessDAO dao;
	
	
	// 관리자 필터
	// 관리자인지 확인
	@Override
	public int checkAdmin() {
		return dao.checkAdmin();
	}
	
	
	// 회원 강제 탈퇴 (회원관리, 신고내역x)
	@Override
	public int memberKickout(int memberNo) {
		return dao.memberKickout(memberNo);
	}

	
	// 신고된 회원 강제 탈퇴 (신고내역 O)
	@Override
	public int reportMemberKickout(int memberNo, int authority) {
		
		int result = 0;
		
		// 강제 탈퇴 시키고
		result = dao.memberKickout(memberNo);
		
		// 강제 탈퇴가 성공한다면
		if(result > 0) {
			// 신고 상태 변경, 신고 처리일자 추가
			result = dao.changeReportStatus(memberNo);
			
			// 판매자 강제 탈퇴 시, 판매글 삭제
			if(authority == 1) {
				result = dao.deletePostofSeller(memberNo);
			}
		}
		
		return result;
	}
	
	
	// 신고된 회원 계정 정지
	@Override
	public int reportMemberBanned(int memberNo) {
		return dao.reportMemberBanned(memberNo);
	}
	
	
	// 신고 계정 - 반려
	@Override
	public int reportMemberLeave(int memberNo) {
		return dao.reportMemberLeave(memberNo);
	}	
	
	
	
	// 신고 게시글 - 삭제
	@Override
	public int reportDeleteContent(int contentNo, String reportType) {
		
		int result = 0;
		
		// 커뮤니티 게시글 삭제
		if(reportType.equals("B")) {
			result = dao.reportDeleteBoard(contentNo);
		
		// 판매글 삭제
		} else if(reportType.equals("P")) {
			result = dao.reportDeletePost(contentNo);

		// 댓글
		} else if(reportType.equals("C")) {
			result = dao.reportDeleteComment(contentNo);
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("contentNo", contentNo);
		paramMap.put("reportType", reportType);
		
		// 삭제 후 신고 상태 변경, 처리 일자 추가
		if(result > 0) {
			result = dao.changeReportStatusCt(paramMap);
		}
		
		return result;
	}
	
	
	// 신고 게시글 - 반려
	@Override
	public int reportLeaveContent(Map<String, Object> paramMap) {
		return dao.reportLeaveContent(paramMap);
	}	
	
	
	//-----------------------------------------------
	
	// 정지된 계정 리스트 불러오기 (스케쥴링)
	@Override
	public List<Admin> selectBannedAccountList() {
		return dao.selectBannedAccountList();
	}
	

	// 정지된 계정 활성화 (스케쥴링)
	@Override
	public int activateAccount(int targetNo) {
		return dao.activateAccount(targetNo);
	}
}
```

</div>
</details>
	
<br>

[▶신고 대상 처리 DAO](https://github.com/luejenie/FarmFarm/blob/main/FarmFarm/src/main/java/edu/kh/farmfarm/admin/model/dao/AdminProcessDAO.java) <br>
[▶신고 대상 처리 mapper](https://github.com/luejenie/FarmFarm/blob/main/FarmFarm/src/main/resources/mappers/adminReport-mapper.xml#L368-L468)

<br>

---
	
</div>
</details>		
	
<br>	
 
<details>
<summary><b>4.3. @Scheduled를 활용하여 정지 계정 자동 활성화</b></summary>
<div markdown="1">

<br>
	
- 회원이 신고 당했을 경우, 계정을 7일 간 정지 처리할 수 있다. <br>
- @Scheduled를 활용하여, 계정이 정지된 일자가 정지된 일자의 7일을 넘었을 경우,<br>
  자동으로 활성화되도록 하였다.
 <br>
 
  [▶ Controller](https://github.com/luejenie/FarmFarm/blob/main/FarmFarm/src/main/java/edu/kh/farmfarm/admin/controller/BannedAccountActivateScheduling.java)
	
	
---
	
</div>
</details>		

<br>
	
<details>
<summary><b>4.4. Chart.js를 활용한 관리자 대시보드 그래프 구현</b></summary>
<div markdown="1">
	
![](https://user-images.githubusercontent.com/110653573/222223557-1e67c613-2ebd-4d30-b897-4e76a429af04.png)
<br>

[▶ 대시보드 Controller](https://github.com/luejenie/FarmFarm/blob/main/FarmFarm/src/main/java/edu/kh/farmfarm/admin/controller/AdminController.java#L39-L71) <br>
[▶ 대시보드 DAO](https://github.com/luejenie/FarmFarm/blob/main/FarmFarm/src/main/java/edu/kh/farmfarm/admin/model/dao/AdminDAO.java#L35)
<br>
[▶ 대시보드 JS](https://github.com/luejenie/FarmFarm/blob/main/FarmFarm/src/main/webapp/resources/js/admin/dashboard.js)
	
</div>
</details>	
	


</br></br>

## 5. 트러블 슈팅

<br>

<details>
<summary><b>5.1. Oracle Cloud 호스팅 중 예외 발생</b></summary>
<div markdown="1">
<!-- ### 5.1. Oracle Cloud 호스팅 중 예외 발생 -->
<br>

- Oracle Cloud FarmFarm 프로젝트 파일을 호스팅하는 도중 
- 관리자페이지 대시보드의 그래프가 나오지 않은 상황이 발생하였다.
- 로컬에서 서버를 돌렸을 경우에는 문제 없이 진행되었기 때문에 팀원 모두 원인을 찾지 못하는 상황에서
- 원인은 Chart.js를 사용하여 구현한 가입, 주문 수의 **SQL문의 WHERE절**인 것을 발견하였다.

</br>

<details>
<summary><b>기존 코드</b></summary>
<div markdown="1">

~~~xml
  <select id="selectOrderGraph" resultMap="graph_rm">
	  SELECT TO_CHAR(b.OD, 'MM-DD') AS ORDER_DATE
	    	 , NVL(SUM(a.cnt), 0) AS ORDER_COUNT
		FROM ( SELECT TO_CHAR(ORDER_DATE, 'YYYY-MM-DD') AS ORDER_DATE
		              ,COUNT(*) cnt
		        FROM "ORDER"
		        WHERE ORDER_DATE BETWEEN SYSDATE-31
		                             AND SYSDATE
		        GROUP BY ORDER_DATE
		        ) a
		      , (SELECT (TO_DATE(SYSDATE-30,'YY-MM-DD') + LEVEL) AS OD
				FROM dual 
				<![CDATA[CONNECT BY LEVEL <= 31]]>) b
		WHERE b.OD = a.ORDER_DATE(+)
		GROUP BY b.OD
		ORDER BY b.OD
  </select>
~~~

</div>
</details>

</br>

- 기존 코드의 WHERE절을 보면 **CHAR 타입 데이터와 DATE 타입 데이터를 형변환 없이 비교**하고 있다는 것을 알 수 있다.
- 로컬 서버 환경에서는 타입이 다른 날짜 데이터의 비교가 가능했지만, Linux 환경에서 Oracle Cloud에 호스팅 된 페이지에서는 두 데이터의 타입이 달라 비교가 어려웠다.
- 타입을 수정하는 것으로 문제를 해결하지 않고, 팀원들과 같이 고민하여 아래와 같이 SQL문을 개선할 수 있었다.

</br>

<details>
<summary><b>개선된 코드</b></summary>
<div markdown="1">

~~~xml
  <select id="selectOrderGraph" resultMap="graph_rm">
	  <![CDATA[
		SELECT ORDER_DATE, 
            (SELECT COUNT(*) 
            FROM "ORDER" o 
            WHERE TO_CHAR(o.ORDER_DATE , 'YYYY-MM-DD') = a.ORDER_DATE) ORDER_COUNT
	 	FROM (SELECT TO_CHAR(SYSDATE - 31 + LEVEL, 'YYYY-MM-DD') ORDER_DATE 
		FROM DUAL CONNECT BY LEVEL <=31) a]]>
  </select>
~~~

</div>
</details>

---

</div>
</details>

</br>
	
<details>
<summary><b>5.2. RESTFUL API로 리팩토링 진행</b></summary>
<div markdown="1">
<br>

- 기존에는 POST/GET mapping 두 가지만 사용하였다. <br>
- 이러다보니 각 요청의 동작을 명확히 하는데 한계가 있었다.

</br>

<details>
<summary><b>기존 코드</b></summary>
<div markdown="1">

```java
// 신고 게시글(판매글, 커뮤니티 게시글, 커뮤니티 댓글) - 삭제
@GetMapping("/report/deleteContent")
@ResponseBody
public int reportDeleteContent(int hiddenContentNo, String reportType) {
	return service.reportDeleteContent(hiddenContentNo, reportType);
}
```
</div>
</details>
	
<br>

  - 예를 들어, 게시글, 댓글 등을 삭제하는 코드의 경우 <br> 기존의 코드는 삭제되는 주체를 알아보기 힘들고 어떤 동작을 진행했는지 직관적으로 알아보기 어려웠다.
  - 이에 매핑 주소에 신고 대상의 타입(reportType)과 신고 대상의 식별 번호(contentNo)을 받아와 알려 주고, 
  - PostMapping을 PatchMapping으로 바꾸어 일부 수정한다는 것을 알리도록 하였다.

<br>

<details>
<summary><b>개선된 코드</b></summary>
<div markdown="1">

```java
// 신고 게시글(판매글, 커뮤니티 게시글, 커뮤니티 댓글) - 삭제
@PatchMapping("/report/{reportType}/{contentNo}/delete")
@ResponseBody
public int reportDeleteContent(@PathVariable("contentNo") int contentNo, 
			       @PathVariable("reportType") String reportType) {
	return service.reportDeleteContent(contentNo, reportType);
}
```

</div>
</details>

---

</div>
</details>
	
</br>

<details>
<summary><b>5.3. 반복되는 코드 개선</b></summary>
<div markdown="1">

<br> 

  - 기존에는 조건에 차이가 있으면, if문으로 일일이 분리하여 작성하였다.
  - 그러나 이와 같은 경우, 조건에만 차이가 존재하고 비슷한 코드가 반복되는 상황이 발생하였다.

</br>

<details>
<summary><b>기존 코드</b></summary>
<div markdown="1">

~~~java
 reportBtn.addEventListener("click", () => {
   
    // 판매자 신고
    if(pathname == "seller") {
        if(reportTargetNo == 0){
            messageModalOpen("관리자는 신고 대상이 아닙니다.");
        } else {
            // 신고 모달 열리기
            openReportModal();
            reportType = "M";
            reportTargetNo = targetNo;
        }
    }


    // 채팅방 회원 신고(판매자, 일반회원 모두 신고 가능, authority로 구분)
    if(pathname == "chat") {
        if(reportTargetNo == 0){
            messageModalOpen("관리자는 신고 대상이 아닙니다.");
        } else {
            // 신고 모달 열리기
            openReportModal();
            reportType = "M";
            reportTargetNo = selectedChatNo;  //chatContext.js에서 선언한 변수
        }
    }


    // 판매 게시글 신고 (사고팔고)
    if(pathname == "post"){
        if(reportTargetNo == 0){
            messageModalOpen("관리자는 신고 대상이 아닙니다.");
        } else {
            // 신고 모달 열리기
            openReportModal();
            reportType = "P";
            reportTargetNo = targetNo;  //postNo
        }
    }
});

~~~

</div>
</details>

</br>

  - 공통된 구문을 하나로 묶는 것이 효율적이라는 생각이 들었다.
  - messageModalOpen()함수와 openReportModal() 함수가 작동되는 조건이 동일하기 때문에
  - 먼저 두 함수가 작동되는 조건을 하나로 묶고
  - 세부 조건을 switch문을 이용하여 pathname에 따라 결과를 다르게 하였다.

<br>

<details>
<summary><b>개선된 코드</b></summary>
<div markdown="1">

```java

 reportBtn.addEventListener("click", () => {

    if(reportTargetNo == 0){
        messageModalOpen("관리자는 신고 대상이 아닙니다.");
    } else{
        openReportModal();
        switch(pathname){
            case 'seller': reportType = 'M'; reportTargetNo = targetNo; break;
            case 'post': reportType = 'P'; reportTargetNo = targetNo; break;
            case 'chat': reportType = 'M'; reportTargetNo = selectedChatNo; break;
        }
    }
 }
      
```

</div>
</details>

</div>
</details>
	
    
</br>

<!--
## 6. 회고 / 느낀점
>프로젝트 개발 회고 글
-->
