# 🐦 OMOKHUB

- 개발자들을 위한 프로젝트 모집인원 모집 및 모집된 프로젝트의 일정을 함께 관리할 수 있는 사이트입니다.

##  🐦 팀명 : 오목눈이

##  🙂 팀원

- 팀원 : **최종찬**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/CJC0512)
- 팀원 : **이재원**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/jlee38266)
- 팀원 : **장민석**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/ms1011)
- 팀원 : **조예린**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/orlzlL)
- 팀원 : **지현근**
[<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/jihyeongeun)

## <p id="목차">목차</p>
<a href="#1">1. 📝 프로젝트 개요</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#1-1">1-1. 프로젝트 소개</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#1-2">1-2. 프로젝트 필요성</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#1-3">1-3. 프로젝트 주요 기능</a>

<a href="#2">2. 🧑‍💻 기술스택</a>

<a href="#3"> 3. 📃 WBS</a>

<a href="#4">4. 📖 요구사항</a>

<a href="#5">5. 📋 DDD</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#5-1">5-1. Event Stroming</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#5-2">5-2. Context Map</a>

<a href="#6">6. 📗 DB 모델링</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#6-1">6-1. 개념 모델링</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#6-2">6-2. 논리 모델링(Barker 표기법)</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#6-3">6-3. 물리 모델링</a>

<a href="#7">7. 📁 DDL</a>

<a href="#8">8. 📒 API 명세서</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#8-1">8-1. USER-SERVICE</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#8-2">8-2. PROJECT</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#8-2-1">8-2-1. PROJECT - PROJECT</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#8-2-2">8-2-2. PROJECT - SCHEDULE</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#8-2-3">8-2-3. PROJECT - ISSUE</a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#8-3">8-3. PROJECT - TEAM</a>

<a href="#9">9. 📃 단위테스트 결과 보고서</a>

<a href="#10">10. 📰 Project Architecture</a>

<a href="#11">11. 👫 회고</a>








##  <p id="1">1. 📝 프로젝트 개요</p>

### <p id="1-1">1-1. 프로젝트 소개</p>

- OMOKHUB 사이트는 개발자들을 위한 프로젝트 팀 모집 및 모집된 프로젝트의 일정을 함께 관리할 수 있는 사이트입니다. OMOKHUB 사이트를 활용하면 회원은 본인이 하고 싶은 프로젝트의 모집글을 통해 프로젝트 팀원을 모집할 수 있고 모집한 팀원들과의 프로젝트 일정관리도 가능하게 함으로써 원활한 협업이 가능합니다.

### <p id="1-2">1-2. 프로젝트 필요성</p>

- 개발자를 위한 다양한 사이트가 존재합니다. 지식을 공유하고 팀원을 모집하고, 일정을 관리하는 등 다양한 종류의 사이트가 있지만 프로젝트의 흐름에 따라 각각 다른 사이트를 이용해야한다는 불편함이 존재합니다.
 OMOKHUB 사이트는 프로젝트의 팀원 모집부터 프로젝트 생성, 프로젝트에 따른 일정관리까지 OMOKHUB 사이트에서 프로젝트가 한번에 진행될 수 있도록하여 개발자들의 원활한 협업을 돕습니다.


### <p id="1-3">1-3. 프로젝트 주요 기능</p>

- 프로젝트 팀원 모집
- 프로젝트 생성
- 프로젝트 일정관리

##  <p id="2">2. 🧑‍💻 기술스택</p>
<a href="#목차">목차로 돌아가기</a>
<div align="center">

|DA#|ubuntu|MariaDB 3.3.3|spring 3.2.3|JPA 3.2.3|MyBatis 3.0.3|
|---|---|---|---|---|---|
|<img src="https://github.com/beyond-sw-camp/be04-1st-4goda-vite/blob/main/PNG/Readme/da%23.png" height="150" />|<img src="https://github.com/beyond-sw-camp/be04-1st-4goda-vite/blob/main/PNG/Readme/ubuntu.png" height="150" />|<img src="https://github.com/beyond-sw-camp/be04-1st-4goda-vite/blob/main/PNG/Readme/mariadb.png" height="150" />|<img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/spring.jpg" height="150" />|<img src="https://github.com/OmokNoonE/OmokNoonE/blob/main/img/JPA.png" height="150" />|<img src="https://github.com/OmokNoonE/OmokNoonE/blob/main/img/mybatis.jpg" height="150" />

</div>

##  <p id="3">3. 📃 WBS</p>
<a href="#목차">목차로 돌아가기</a>

[WBS 바로가기](https://docs.google.com/spreadsheets/d/1YxT_lA8VaVXNsjbl9au3YW109yCLpxz5oe4L39z-LwM/edit#gid=1027017419)
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%98%A4%EB%AA%A9%EB%88%88%EC%9D%B4%201%EC%B0%A8%20%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EB%AC%B8%EC%84%9C%20-%20WBS.png"/></p>

##  <p id="4">4. 📖 요구사항</p>
<a href="#목차">목차로 돌아가기</a>
<details>
<summary><b>Omok 세부정책</b></summary>
    
- 세부정책
  
</details>

[요구사항 명세서 바로가기](https://docs.google.com/spreadsheets/d/1YxT_lA8VaVXNsjbl9au3YW109yCLpxz5oe4L39z-LwM/edit#gid=0)
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%98%A4%EB%AA%A9%EB%88%88%EC%9D%B4%201%EC%B0%A8%20%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EB%AC%B8%EC%84%9C%20-%20%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD%20%EB%AA%85%EC%84%B8%EC%84%9C%20(2)_1.png"/></p>

##  <p id="5">5. 📋 DDD</p>
<a href="#목차">목차로 돌아가기</a>

### <p id="5-1">5-1. Event Stroming</p>
<img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/eventstroming.jpg"/>

### <p id="5-2">5-2. Context Map</p>
<img src="https://github.com/OmokNoonE/OmokNoonE/blob/main/img/context-map.jpg"/>

##  <p id="6">6. 📗 DB 모델링</p>
<a href="#목차">목차로 돌아가기</a>

### <p id="6-1">6-1. 개념 모델링</p>
<p align="center"><img src="https://github.com/OmokNoonE/OmokNoonE/blob/main/img/%EA%B0%9C%EB%85%90%EB%AA%A8%EB%8D%B8%EB%A7%81.png"/></p>

### <p id="6-2">6-2. 논리 모델링(Barker 표기법)</p>
<p align="center"><img src="https://github.com/OmokNoonE/OmokNoonE/blob/main/img/logic-model.png"/></p>

### <p id="6-3">6-3. 물리 모델링</p>
<p align="center"><img src="https://github.com/OmokNoonE/OmokNoonE/blob/main/img/PhysicalModel.png"/></p>

##  <p id="7">7. 📁 DDL</p>
<a href="#목차">목차로 돌아가기</a>
<details>
<summary><b>Omok DDL</b></summary>
    
```
CREATE TABLE `PROJECT_TEAM`
(
    `PROJECT_TEAM_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `MAX_MEMBER`    INTEGER NOT NULL,
    `CURRENT_MEMBER`    INTEGER NOT NULL,
    `TEAM_NAME`    VARCHAR(50) NOT NULL,
    `ADDED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `IS_ACTIVE`    BOOLEAN DEFAULT FALSE NOT NULL,
 PRIMARY KEY ( `PROJECT_TEAM_ID` )
);


CREATE TABLE `NOTICE`
(
    `NOTICE_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TITLE`    VARCHAR(50) NOT NULL,
    `CONTENT`    LONGTEXT NOT NULL,
    `POSTED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
 PRIMARY KEY ( `NOTICE_ID` )
);


CREATE TABLE `REPLY`
(
    `REPLY_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `CONTENT`    LONGTEXT NOT NULL,
    `POSTED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `COMMENT_ID`    INTEGER NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
 PRIMARY KEY ( `REPLY_ID` )
);


CREATE TABLE `PERSONAL_LINK`
(
    `URL`    VARCHAR(255) NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
 PRIMARY KEY ( `URL`,`MEMBER_ID` )
);


CREATE TABLE `PROJECT_MEMBER`
(
    `PROJECT_MEMBER_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `PROJECT_TEAM_ID`    INTEGER NOT NULL,
    `MEMBER_CATEGORY`    VARCHAR(255) NOT NULL,
 PRIMARY KEY ( `PROJECT_MEMBER_ID` )
);


CREATE TABLE `PROJECT`
(
    `PROJECT_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TITLE`    VARCHAR(50) NOT NULL,
    `START_DATE`    VARCHAR(30) NOT NULL,
    `END_DATE`    VARCHAR(30),
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `STATUS`    VARCHAR(20) NOT NULL,
    `PROJECT_TEAM_ID`    INTEGER NOT NULL,
    `PROJECT_MEMBER_ID`    INTEGER NOT NULL,
    `IS_PUBLIC`    BOOLEAN DEFAULT TRUE NOT NULL,
 PRIMARY KEY ( `PROJECT_ID` )
);


CREATE TABLE `ISSUE`
(
    `ISSUE_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TITLE`    VARCHAR(50) NOT NULL,
    `CONTENT`    LONGTEXT NOT NULL,
    `IS_CLOSED`    BOOLEAN DEFAULT FALSE NOT NULL,
    `POSTED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `CLOSED_DATE`    VARCHAR(30),
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `PROJECT_MEMBER_ID`    INTEGER NOT NULL,
    `PROJECT_ID`    INTEGER NOT NULL,
 PRIMARY KEY ( `ISSUE_ID` )
);


CREATE TABLE `BOOKMARK`
(
    `BOOKMARK_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `IS_LIKE`    BOOLEAN DEFAULT FALSE NOT NULL,
    `IS_BOOKMARK`    BOOLEAN DEFAULT FALSE NOT NULL,
    `ADDED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `SEEKING_MEMBER_POST_ID`    INTEGER NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
 PRIMARY KEY ( `BOOKMARK_ID` )
);


CREATE TABLE `SCHEDULE`
(
    `SCHEDULE_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `START_DATE`    VARCHAR(30) NOT NULL,
    `END_DATE`    VARCHAR(30),
    `TITLE`    VARCHAR(50) NOT NULL,
    `CONTENT`    LONGTEXT NOT NULL,
    `PROGRESS`    FLOAT DEFAULT 0 NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `PROJECT_MEMBER_ID`    INTEGER NOT NULL,
    `PROJECT_ID`    INTEGER NOT NULL,
 PRIMARY KEY ( `SCHEDULE_ID` )
);


CREATE TABLE `POST`
(
    `POSTING_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TITLE`    VARCHAR(50) NOT NULL,
    `CONTENT`    LONGTEXT NOT NULL,
    `POSTED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `HITS`    INTEGER DEFAULT 0 NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
 PRIMARY KEY ( `POSTING_ID` )
);


CREATE TABLE `PROFILE`
(
    `PROFILE_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TILTLE`    VARCHAR(50) NOT NULL,
    `CONTENT`    LONGTEXT NOT NULL,
    `TECH_STACK`    VARCHAR(255),
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
 PRIMARY KEY ( `PROFILE_ID` )
);


CREATE TABLE `COMMENT`
(
    `COMMENT_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `CONTENT`    LONGTEXT NOT NULL,
    `POSTED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
    `COMMENT_CATEGORY`    VARCHAR(20) NOT NULL,
    `POSTING_ID`    INTEGER,
    `SEEKING_MEMBER_POST_ID`    INTEGER,
    `ISSUE_ID`    INTEGER,
 PRIMARY KEY ( `COMMENT_ID` )
);


CREATE TABLE `JOIN_WAITING_MEMBER`
(
    `JOIN_WAITING_MEMBER_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `PROJECT_TEAM_ID`    INTEGER NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `CATEGORY`    VARCHAR(10) NOT NULL,
    `JOIN_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
 PRIMARY KEY ( `JOIN_WAITING_MEMBER_ID` )
);


CREATE TABLE `MEMBER`
(
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `NAME`    VARCHAR(30) NOT NULL,
    `NICKNAME`    VARCHAR(20),
    `PASSWORD`    VARCHAR(20) NOT NULL,
    `EMAIL`    VARCHAR(40),
    `PHONE_NUM`    VARCHAR(11),
    `ADDRESS`    VARCHAR(255),
    `BIRTHDAY`    VARCHAR(30),
    `SIGN_UP_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `IS_WITHDRAW`    BOOLEAN DEFAULT FALSE NOT NULL,
 PRIMARY KEY ( `MEMBER_ID` )
);


CREATE TABLE `SEEKING_MEMBER_POST`
(
    `SEEKING_MEMBER_POST_ID`    INTEGER NOT NULL AUTO_INCREMENT,
    `TITLE`    VARCHAR(50) NOT NULL,
    `SEEKING_MEMBER`    INTEGER NOT NULL,
    `START_DATE`    VARCHAR(30) NOT NULL,
    `END_DATE`    VARCHAR(30),
    `TECH_STACK`    VARCHAR(255),
    `CONTENT`    LONGTEXT NOT NULL,
    `LAST_MODIFIED_DATE`    VARCHAR(30) DEFAULT NOW() NOT NULL,
    `IS_SEEKING`    BOOLEAN DEFAULT FALSE NOT NULL,
    `MEMBER_ID`    VARCHAR(20) NOT NULL,
    `IS_DELETED`    BOOLEAN DEFAULT FALSE NOT NULL,
    `PROJECT_ID`    INTEGER NOT NULL,
 PRIMARY KEY ( `SEEKING_MEMBER_POST_ID` )
);



ALTER TABLE `REPLY`
 ADD CONSTRAINT `REPLY_FK` FOREIGN KEY ( `COMMENT_ID` )
 REFERENCES `COMMENT` (`COMMENT_ID` );

ALTER TABLE `REPLY`
 ADD CONSTRAINT `REPLY_FK1` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `PERSONAL_LINK`
 ADD CONSTRAINT `PERSONAL_LINK_FK` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `PROJECT_MEMBER`
 ADD CONSTRAINT `PROJECT_MEMBER_FK` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );

ALTER TABLE `PROJECT_MEMBER`
 ADD CONSTRAINT `PROJECT_MEMBER_FK1` FOREIGN KEY ( `PROJECT_TEAM_ID` )
 REFERENCES `PROJECT_TEAM` (`PROJECT_TEAM_ID` );



ALTER TABLE `PROJECT`
 ADD CONSTRAINT `PROJECT_FK` FOREIGN KEY ( `PROJECT_TEAM_ID` )
 REFERENCES `PROJECT_TEAM` (`PROJECT_TEAM_ID` );

ALTER TABLE `PROJECT`
 ADD CONSTRAINT `PROJECT_FK1` FOREIGN KEY ( `PROJECT_MEMBER_ID` )
 REFERENCES `PROJECT_MEMBER` (`PROJECT_MEMBER_ID` );



ALTER TABLE `ISSUE`
 ADD CONSTRAINT `ISSUE_FK` FOREIGN KEY ( `PROJECT_MEMBER_ID` )
 REFERENCES `PROJECT_MEMBER` (`PROJECT_MEMBER_ID` );

ALTER TABLE `ISSUE`
 ADD CONSTRAINT `ISSUE_FK1` FOREIGN KEY ( `PROJECT_ID` )
 REFERENCES `PROJECT` (`PROJECT_ID` );



ALTER TABLE `BOOKMARK`
 ADD CONSTRAINT `BOOKMARK_FK` FOREIGN KEY ( `SEEKING_MEMBER_POST_ID` )
 REFERENCES `SEEKING_MEMBER_POST` (`SEEKING_MEMBER_POST_ID` );

ALTER TABLE `BOOKMARK`
 ADD CONSTRAINT `BOOKMARK_FK1` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `SCHEDULE`
 ADD CONSTRAINT `SCHEDULE_FK` FOREIGN KEY ( `PROJECT_MEMBER_ID` )
 REFERENCES `PROJECT_MEMBER` (`PROJECT_MEMBER_ID` );

ALTER TABLE `SCHEDULE`
 ADD CONSTRAINT `SCHEDULE_FK1` FOREIGN KEY ( `PROJECT_ID` )
 REFERENCES `PROJECT` (`PROJECT_ID` );



ALTER TABLE `POST`
 ADD CONSTRAINT `POST_FK` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `PROFILE`
 ADD CONSTRAINT `PROFILE_FK` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `COMMENT`
 ADD CONSTRAINT `COMMENT_FK` FOREIGN KEY ( `POSTING_ID` )
 REFERENCES `POST` (`POSTING_ID` );

ALTER TABLE `COMMENT`
 ADD CONSTRAINT `COMMENT_FK1` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );

ALTER TABLE `COMMENT`
 ADD CONSTRAINT `COMMENT_FK2` FOREIGN KEY ( `SEEKING_MEMBER_POST_ID` )
 REFERENCES `SEEKING_MEMBER_POST` (`SEEKING_MEMBER_POST_ID` );

ALTER TABLE `COMMENT`
 ADD CONSTRAINT `COMMENT_FK3` FOREIGN KEY ( `ISSUE_ID` )
 REFERENCES `ISSUE` (`ISSUE_ID` );



ALTER TABLE `JOIN_WAITING_MEMBER`
 ADD CONSTRAINT `JOIN_WAITING_MEMBER_FK` FOREIGN KEY ( `PROJECT_TEAM_ID` )
 REFERENCES `PROJECT_TEAM` (`PROJECT_TEAM_ID` );

ALTER TABLE `JOIN_WAITING_MEMBER`
 ADD CONSTRAINT `JOIN_WAITING_MEMBER_FK1` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );



ALTER TABLE `SEEKING_MEMBER_POST`
 ADD CONSTRAINT `SEEKING_MEMBER_POST_FK` FOREIGN KEY ( `MEMBER_ID` )
 REFERENCES `MEMBER` (`MEMBER_ID` );
```
</details>



## <p id="8">8. 📒 API 명세서</p>
<a href="#목차">목차로 돌아가기</a>
### <p id="8-1">8-1. USER-SERVICE</p>
<details>
<summary> 1. 닉네임으로 회원검색 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/USER_SERVICE-%20%EB%8B%89%EB%84%A4%EC%9E%84%EC%9C%BC%EB%A1%9C%20%ED%9A%8C%EC%9B%90%EA%B2%80%EC%83%89.jpg"/></p>
</details>
<details>
<summary> 2. 회원 ID로 닉네임 검색 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%9A%8C%EC%9B%90%20id%EB%A1%9C%20%EB%8B%89%EB%84%A4%EC%9E%84%20%EA%B2%80%EC%83%89.jpg"/></p>
</details>
<details>
<summary> 3. 회원 상세보기 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%9A%8C%EC%9B%90%20%EC%83%81%EC%84%B8%EB%B3%B4%EA%B8%B0.jpg"/></p>
</details>
<details>
<summary> 4. 회원 정보 수정 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%9A%8C%EC%9B%90%20%EC%A0%95%EB%B3%B4%20%EC%88%98%EC%A0%95.jpg"/></p>
</details>
<details>
<summary> 5. 회원가입 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85.jpg"/></p>
</details>
<details>
<summary> 6. 회원목록으로 닉네임 검색하기 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%9A%8C%EC%9B%90%EB%AA%A9%EB%A1%9D%EC%9C%BC%EB%A1%9C%20%EB%8B%89%EB%84%A4%EC%9E%84%20%EA%B2%80%EC%83%89%ED%95%98%EA%B8%B0.jpg"/></p>
</details>

### <p id="8-2">8-2. PROJECT</p>
#### <p id="8-2-1">8-2-1. PROJECT - PROJECT</p>
<details>
<summary> 1. 프로젝트 생성 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EC%83%9D%EC%84%B1.PNG"/></p>
</details>
<details>
<summary> 2. 프로젝트 삭제 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EC%82%AD%EC%A0%9C.PNG"/></p>
</details>
<details>
<summary> 3. 프로젝트 수정 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EC%88%98%EC%A0%95.PNG"/></p>
</details>
<details>
<summary> 4. 프로젝트 ID로 프로젝트 조회 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EC%A1%B0%ED%9A%8C(id%20%EA%B8%B0%EC%A4%80).PNG"/></p>
</details>
<details>
<summary> 5. 프로젝트 상태별로 프로젝트 조회 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EC%A1%B0%ED%9A%8C(%EC%83%81%ED%83%9C%20%EA%B8%B0%EC%A4%80).PNG"/></p>
</details>
<details>
<summary> 6. 팀이름을 기준으로 프로젝트 조회 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EC%A1%B0%ED%9A%8C(%ED%8C%80%20%EC%9D%B4%EB%A6%84).PNG"/></p>
</details>
<details>
<summary> 7. 회원 ID로 프로젝트 조회 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EC%A1%B0%ED%9A%8C(%ED%9A%8C%EC%9B%90id).PNG"/></p>
</details>

#### <p id="8-2-2">8-2-2. PROJECT-SCHEDULE</p>
<details>
<summary> 1. 일정 등록 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%9D%BC%EC%A0%95%20%EB%93%B1%EB%A1%9D.PNG"/></p>
</details>
<details>
<summary> 2. 일정 삭제 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%9D%BC%EC%A0%95%20%EC%82%AD%EC%A0%9C.PNG"/></p>
</details>
<details>
<summary> 3. 일정 수정 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%9D%BC%EC%A0%95%20%EC%88%98%EC%A0%95.PNG"/></p>
</details>
<details>
<summary> 4. 프로젝트 ID로 일정 조회 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%9D%BC%EC%A0%95%20%EC%A1%B0%ED%9A%8C(%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8id).PNG"/></p>
</details>
<details>
<summary> 5. 회원 ID로 일정 조회 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%9D%BC%EC%A0%95%20%EC%A1%B0%ED%9A%8C(%ED%9A%8C%EC%9B%90%20id).PNG"/></p>
</details>

#### <p id="8-2-3">8-2-3. PROJECT-ISSUE</p>
<details>
<summary> 1. 이슈 등록 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%9D%B4%EC%8A%88%20%EB%93%B1%EB%A1%9D.jpg"/></p>
</details>
<details>
<summary> 2. 이슈 삭제 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%9D%B4%EC%8A%88%20%EC%82%AD%EC%A0%9C.jpg"/></p>
</details>
<details>
<summary> 3. 이슈 수정 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%9D%B4%EC%8A%88%20%EC%88%98%EC%A0%95.jpg"/></p>
</details>
<details>
<summary> 4. 특정회원이 작성한 이슈 조회 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%8A%B9%EC%A0%95%20%ED%9A%8C%EC%9B%90%EC%9D%B4%20%EC%9E%91%EC%84%B1%ED%95%9C%20%EC%9D%B4%EC%8A%88%20%EC%A1%B0%ED%9A%8C.jpg"/></p>
</details>

### <p id="8-3">8-3. PROJECT-TEAM</p>
<details>
<summary> 1. 프로젝트 팀 등록 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%ED%8C%80%20%EB%93%B1%EB%A1%9D.png"/></p>
</details>

<details>
<summary> 2. 프로젝트 팀 삭제 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%ED%8C%80%20%EC%82%AD%EC%A0%9C.png"/></p>
</details>
<details>
<summary> 3. 프로젝트 팀 조회 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%ED%8C%80%20%EC%A1%B0%ED%9A%8C.png"/></p>
</details>
<details>
<summary> 4. 프로젝트 팀 멤버 제거 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%ED%8C%80%20%EB%A9%A4%EB%B2%84%20%EC%A0%9C%EA%B1%B0.png"/></p>
</details>
<details>
<summary> 5. 프로젝트 팀 팀장 변경 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%ED%8C%80%20%ED%8C%80%EC%9E%A5%EB%B3%80%EA%B2%BD.png"/></p>
</details>
<details>
<summary> 6. 대기열 목록에서 회원 제거 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EB%8C%80%EA%B8%B0%EC%97%B4%20%EB%AA%A9%EB%A1%9D%EC%97%90%EC%84%9C%20%ED%9A%8C%EC%9B%90%20%EC%A0%9C%EA%B1%B0.png"/></p>
</details>
<details>
<summary> 7. 특정 프로젝트의 대기열 목록 조회 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%8A%B9%EC%A0%95%20%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%EC%9D%98%20%EB%8C%80%EA%B8%B0%EC%97%B4%20%EB%AA%A9%EB%A1%9D%20%EC%A1%B0%ED%9A%8C.png"/></p>
</details>
<details>
<summary> 8. 프로젝트 신청 대기열 참가 </summary>
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EC%8B%A0%EC%B2%AD%20%EB%8C%80%EA%B8%B0%EC%97%B4%20%EC%B0%B8%EA%B0%80.png"/></p>
</details>

## <p id="9">9. 📃 단위테스트 결과 보고서</p>
<a href="#목차">목차로 돌아가기</a>

[단위테스트 결과보고서 바로가기](https://docs.google.com/spreadsheets/d/1YxT_lA8VaVXNsjbl9au3YW109yCLpxz5oe4L39z-LwM/edit#gid=1417392135)
<p align="center"><img src="https://github.com/beyond-sw-camp/be04-2nd-OmokNoonE-Omokhub/blob/main/img/%EC%98%A4%EB%AA%A9%EB%88%88%EC%9D%B4%201%EC%B0%A8%20%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EB%AC%B8%EC%84%9C%20-%20%EB%8B%A8%EC%9C%84%20%ED%85%8C%EC%8A%A4%ED%8A%B8%20%EA%B2%B0%EA%B3%BC%20%EB%B3%B4%EA%B3%A0%EC%84%9C%20(1)_1.png"/></p>

## <p id="10">10. 📰 Project Architecture</p>
<a href="#목차">목차로 돌아가기</a>
<p align="center"><img src="https://github.com/OmokNoonE/OmokNoonE/blob/main/img/omoknoone-project-architecture.png"/></p>

## <p id="11">11. 👫 회고</p>
<a href="#목차">목차로 돌아가기</a>
|&nbsp;&nbsp;팀&nbsp;원&nbsp;&nbsp;&nbsp;|회고록|
|:---:|---|
|최종찬|단순하게 기능을 개발하는 일은 익숙했지만, 이번 프로젝트에서는 기능 구현뿐만 아니라 서버 구축, 데이터베이스 통합 관리 등 다양한 측면을 구현했어야 되기에 저에게는 의미 있는 도전이었습니다. RestAPI 방식을 활용하여 서로 다른 IP 간 통신하는 것 또한 처음 시도해 보는 일이었습니다. 그러나, 팀원들과 함께 수업에서 배운 내용을 복습하며 해당 서비스를 구현할 수 있었고, 더 나아가 서로 다른 ip의 MSA 방식까지 구현하는 성과를 이룰 수 있었습니다. 모든 팀원들이 적극적으로 참여하여 프로젝트를 구성해나가는 것이 매우 감동적이었습니다. 우리 팀은 단순한 소통을 넘어서서 팀원 간에 작업물을 공유에 git-flow 방식을 적용하였습니다. git-flow가 익숙지 않아, 헤매기도 하였지만 협업의 다양한 측면에서 많은 점을 배웠습니다. DB, Service 별 서버 구축과 각 IP 간 소통, gateway의 활용 등 다양한 시도를 하였고, 팀 전체가 효과적으로 협업하여 프로젝트를 성공적으로 진행했습니다. 현재 프로젝트가 완성된 것은 아니지만, 이번 발표 내용으로 그치지 않고 추가적인 백엔드 개발과 점검, 리팩토링을 통해 더 나은 결과물을 만들어 나갈 것입니다.|
|이재원|이 프로젝트를 진행하면서 RestAPI 개념이 녹아든 MSA가 어떤 느낌인지를 경험해볼 수 있었습니다. 하지만 저에게 있어서 이번 프로젝트에서 더 커다란 부분은 한 명의 팀원으로서 협업을 할 수 있는 작업 체계 구축을 연습해볼 수 있는 기회를 얻었다는 것입니다. 깃을 활용하여 버전을 관리하고 팀원들과 원활한 소통을 하기 위한 시스템을 구축하면서 어째서 실제 현업에서 작업 컨벤션을 강조하는지 피부로 느낄 수 있었습니다. 또한, 작업물의 양과 시간의 흐름에 따라 제가 작업하지 않은 부분을 이슈로 관리했을 때, 다른 팀원의 상황을 확인하면서 프로젝트의 흐름을 파악하고 변경 사항에 기민하게 반응할 수 있다는 점에서도 전략적인 버전 관리의 필요성을 느끼게 해주었습니다. 또한, PR을 통해 원치 않는 푸시를 막고 PR 리뷰를 통해 팀원과의 소통을 자연스럽게 연결시켜 모두가 새롭게 반영되는 부분을 인지하고 작업을 할 수 있다는 점에서 다시 한 번 깃 버전 관리의 매력을 알 수 있었습니다. 기술적인 부분에서도 배울 점은 많았습니다. 프론트가 없더라도 RestAPI 방식에서는 원하는 결과값을 출력할 수 있는 환경으로 작업이 진행되기 때문에 작업의 확장성을 높여 준다는 원리(iOS, 안드로이드, HTTP 필요에 따라 맞춤 적용이 가능)를 이해할 수 있었고, MSA를 통해 모듈화를 통해 서비스를 분리했을 때, 필요한 정보를 요청을 통해 얻을 수 있고, 자신이 개발 중인 서비스에 좀 더 집중할 수 있다는 부분이 개인적으로 느꼈던 장점 중 하나였습니다. 기존의 MSA가 너무 많은 트래픽을 관리에 필요성에 의해서 나온 개념인 부분을 인지하고 있지만, 실제로 그런 환경을 겪으면서 프로젝트를 해본 것이 아니기에 그런 부분을 이해하지 못하는 부분은 아쉬웠습니다. 기술적인 부분은 미숙하고 배워가야 하는 부분이 많지만, 새로운 팀원들과의 협업과 사용해보지 못한 새로운 기술을 시도해보고 작은 배움을 얻어갈 수 있다는 점에서 이 프로젝트가 의미 있다고 생각됩니다. 마지막으로, 이 프로젝트는 여기서 멈추는 것이 아니라 더 나은 방식으로 발전될 수 있다는 여지를 두고 팀원들과 계속해서 새로운 무언가를 추가해 갈 수 있다는 점이 좋다고 생각됩니다.|
|장민석|이번 프로젝트는 처음 사용하는 기술이 많았기 때문에 저희 팀에게 많은 도전이었습니다.  DDD(Domain-Driven Design) 설계 방식부터 Spring Boot, Spring Security, JPA, MSA(Microservices Architecture)까지 처음 다뤄보는 기술들이었습니다. 이러한 기술들을 익히는 동시에 프로젝트를 병행하는 프로젝트이기 때문에 시간이 매우 제한적이었습니다. 하지만 우리 팀원들은 바쁜 와중에도 모든 회의에 참여하며 열심히 노력했습니다. 이로써 촉박한 시간 속에서도 원하는 기능을 구현할 수 있었습니다. 더불어, 우리 팀원들의 적극적인 참여와 원활한 소통 방식은 1차 프로젝트가 성공적으로 진행되도록 도왔습니다. 서로의 의견을 존중하고 토론하는 과정에서 팀원들 간의 신뢰가 쌓였고, 이는 프로젝트의 효율성과 완성도 향상에 큰 도움이 되었습니다. 물론, 아직 구현하지 못한 기능들이 많이 남아있습니다. 앞으로 더 많은 기능을 개발하고 완성해 나갈 것입니다.|
|조예린|이번 백엔드 프로젝트를 진행하며 기능 개발을 처음 경험하게 되었습니다. 처음에는 기술적인 부분에서 많은 부담을 느꼈지만 조원들의 협력과 지원 덕분에 이를 극복할 수 있었습니다. 우리 조는 이해하고 존중하는 분위기에서 원활한 의사소통을 할 수 있었습니다. 덕분에 서로의 아이디어를 공유하며 각자가 가진 강점을 살려 더 나은 방향으로 나아갈 수 있었습니다. 이 경험을 통해 팀으로 일한다면 어떤 어려움도 극복할 수 있다는 것을 깨달았습니다. 함께 문제를 고민하고 해결한 조원들에게 감사의 말씀을 전하며, 저 자신에게 매우 큰 동기부여가 된 프로젝트 였습니다.|
|지현근|프로젝트를 진행하면서 프로세스의 각 단계를 경험한 것은 정말 좋은 경험이었다고 생각됩니다. 프로젝트 설계부터 데이터베이스 모델링, 그리고 백엔드까지 모든 단계를 경험하면서 어떤 부분이 어떻게 작동하는지에 대한 이해를 깊게 할 수 있었습니다. 특히, 수업에서 배운 이론적인 내용을 프로젝트에 적용하면서 개념을 실제로 활용해보는 과정 덕분에 많이 성장할 수 있는 계기가 되었다고 생각됩니다. 또한, 팀원들과의 성공적인 의사소통과 협업은 프로젝트를 성과있게 진행되도록 할 수 있는 중요한 요소 중 하나라고 생각하고 있었고 이번 프로젝트에 깃허브와 같은 협업 툴을 활용하면서 이를 실제로 체험하며 협업의 중요성을 더욱이 깨닫게 되었습니다. 의사소통을 통해 각자의 역할과 책임을 분명히 하고, 문제가 발생했을 때 적절히 대응하는 방법을 익힐 수 있었습니다. 이번 프로젝트는 제가 성장하는 데 많은 도움이 되었다고 생각합니다. 이어지는 프로젝트에서는 더 많이 공부하고 노력하여 프로젝트 고도화 시에 프로젝트에 많은 기여를 할 수 있도록 하겠습니다.|
