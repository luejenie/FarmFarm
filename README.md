<div align="center">
<img width="20%" src="https://user-images.githubusercontent.com/110653581/211257489-34757022-4c71-443f-afe7-94d240788288.png" />
<h2>팜팜</h2>
<h3>내 손으로 키운 작물, 손쉽게 거래하세요.</h3>
<br>
</div>

# :pushpin: FarmFarm
> **농산물 직거래 플랫폼 및 농사 용품 판매 쇼핑몰** <br>
\
> **[FarmFarm 바로가기](http://129.154.53.250:8080)**

<br>

## 1. 프로젝트 소개
- **제작 기간** : 2022년 12월 12일 ~ 2023년 1월 11일
- **참여 인원** : 6인 팀 프로젝트
- **프로젝트 개요**
  - Java와 Spring 프레임워크를 이용하여 온라인 쇼핑몰 구축
  - 상품 정보, 주문 정보, 회원 정보 등을 관리하는 기능 제공
  - 개인간 거래, 커뮤니티 게시판, 채팅 및 알림 기능 제공
- ** 기능**
  - 전체 프로젝트 기획 및 개발 참여
  - 일반 회원, 판매자, 게시글, 댓글 등 대상별 신고 기능 구현
  - 관리자 페이지의 편의성 향상을 위해 AJAX를 활용한 기능 구현
    - 회원 관리 : 판매자 등록 상태, 회원 활동 상태에 따른 비동기 조회
    - 신고 관리 : 강제 탈퇴, 정지, 게시글 삭제 등 신고 처리 기능 구현
  - @Scheduled를 활용하여 정지 계정 자동 활성화
  - Chart.js를 활용한 관리자 대시보드 그래프 구현

- **성과**
  - 온라인 쇼핑몰 프로토타입 완성
  - 교육원 내 프로젝트 최우수상 수상
  - WBS에 계획한 일정에 맞춰 프로젝트 구현
  
<br>

- **프로젝트 구조**
![](https://user-images.githubusercontent.com/110653573/220880515-0ece2b7e-96e6-482b-a1de-0bd7a80dae19.png)


</br>

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

</br>

## 3. ERD 설계
![](https://zuminternet.github.io/images/portal/post/2019-04-22-ZUM-Pilot-integer/final_erd.png)


## 4. 핵심 기능
  - 일반 회원, 판매자, 게시글, 댓글 등 대상별 신고 기능 구현
  - 관리자 페이지의 편의성 향상을 위해 AJAX를 활용한 기능 구현
    - 회원 관리 : 판매자 등록 상태, 회원 활동 상태에 따른 비동기 조회
    - 신고 관리 : 강제 탈퇴, 정지, 게시글 삭제 등 신고 처리 기능 구현
  - @Scheduled를 활용하여 정지 계정 자동 활성화
  - Chart.js를 활용한 관리자 대시보드 그래프 구현





<details>
<summary><b>핵심 기능 설명 펼치기</b></summary>
<div markdown="1">


### 4.1. 전체 흐름



</div>
</details>



</br></br>

## 5. 핵심 트러블 슈팅

### 5.1. Oracle Cloud 호스팅 중 예외 발생

- Oracle Cloud를 통해 제작한 FarmFarm 프로젝트 파일을 호스팅 하였는데 **예상치 못한 예외가 발생**하였습니다.
- DB에서 질의문 수행 도중 발생하는 오류였습니다. **로컬에서 서버를 돌렸을 시 문제없이 진행**되었기 때문에 팀원 모두 바로 원인을 찾지 못했습니다.
- 원인은 Chart.js를 위한 주문 내역을 가지고 오는 **SQL문의 WHERE 절**에 있었습니다.

</br></br>

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

- 기존 코드의 WHERE절을 보면 **CHAR 타입 데이터와 DATE 타입 데이터를 형변환 없이 비교**하고 있음을 알 수 있었습니다.
- 로컬에서 실행할 때는 타입이 다른 날짜 데이터의 비교가 가능했지만 linux 환경에서 실행되는 Oracle Cloud 에 호스팅 된 페이지에서는 두 데이터의 **타입이 서로 달라 예외가 발생**했던 것이었습니다.
- 여기서 타입만 수정해도 문제를 해결할 수는 있었겠지만, 더 빠르고 좋은 코드는 없을까 하는 고민을 하게 되었고 아래와 같이 **코드를 개선**하였습니다.

</br></br>

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



</br></br>

## 6. 그 외 트러블 슈팅

    
</br>


## 6. 회고 / 느낀점
>프로젝트 개발 회고 글: https://zuminternet.github.io/ZUM-Pilot-integer/

